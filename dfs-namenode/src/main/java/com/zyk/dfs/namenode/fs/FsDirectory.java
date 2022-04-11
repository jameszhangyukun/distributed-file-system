package com.zyk.dfs.namenode.fs;

import com.dfs.common.Constants;
import com.dfs.common.enums.NodeType;
import com.dfs.model.backup.INode;
import com.dfs.model.namenode.Metadata;
import com.zyk.dfs.backup.fs.FsImage;
import lombok.extern.slf4j.Slf4j;
import com.dfs.common.utils.StringUtils;

import java.util.*;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * 负责管理内存中的文件目录树组件
 */
@Slf4j
public class FsDirectory {
    private Node root;

    private final ReentrantReadWriteLock lock = new ReentrantReadWriteLock(true);

    public FsDirectory() {
        this.root = new Node("/", NodeType.DIRECTORY.getValue());
    }

    /**
     * 创建文件目录
     *
     * @param path 文件目录
     */
    public void mkdir(String path, Map<String, String> attr) {
        try {
            lock.writeLock().lock();
            String[] paths = StringUtils.split(path, '/');
            Node current = root;
            for (String p : paths) {
                if ("".equals(p)) continue;
                current = findDirectory(current, p);
            }
            current.putAllAttr(attr);
        } finally {
            lock.writeLock().unlock();
        }
    }

    /**
     * 创建文件
     *
     * @param filename 文件名
     * @return 是否创建成功
     */
    public boolean createFile(String filename, Map<String, String> attr) {
        try {
            lock.writeLock().lock();
            String[] paths = StringUtils.split(filename, '/');
            String fileNode = paths[paths.length - 1];
            Node fileParentNode = getFileParent(paths);
            if (fileParentNode.getChildren(fileNode) != null) {
                log.warn("文件已存在，创建失败 : {}", filename);
                return false;
            } else {
                fileParentNode.addChildren(new Node(fileNode, NodeType.FILE.getValue()));
                return true;
            }
        } finally {
            lock.writeLock().unlock();
        }
    }

    /**
     * 删除文件
     *
     * @param filename 文件名
     */
    public Node delete(String filename) {

        lock.writeLock().lock();
        try {
            String[] paths = StringUtils.split(filename, '/');
            String name = paths[paths.length - 1];
            Node current = getFileParent(paths);
            Node childrenNode;
            if ("".equals(name)) {
                childrenNode = current;
            } else {
                childrenNode = current.getChildren(name);
            }
            if (childrenNode == null) {
                log.warn("文件不存在, 删除失败：[filename={}]", filename);
                return null;
            }
            if (childrenNode.getType() == NodeType.DIRECTORY.getValue()) {
                if (!childrenNode.getChildren().isEmpty()) {
                    log.warn("文件夹存在子文件，删除失败：[filename={}]", filename);
                    return null;
                }
            }
            Node remove = current.getChildren().remove(name);

            // 删除文件夹
            Node parent = remove.getParent();
            Node child = remove;
            while (parent != null) {
                if (child.getChildren().isEmpty()) {
                    child.setParent(null);
                    parent.getChildren().remove(child.getPath());
                }
                child = parent;
                parent = parent.getParent();
            }
            return Node.deepCopy(remove, Integer.MAX_VALUE);
        } finally {
            lock.writeLock().unlock();
        }

    }

    private Node getFileParent(String[] paths) {
        Node current = root;
        for (int i = 0; i < paths.length - 1; i++) {
            String p = paths[i];
            if ("".equals(p)) {
                continue;
            }
            current = findDirectory(current, p);
        }
        return current;
    }

    private Node findDirectory(Node current, String p) {
        Node children = current.getChildren(p);
        if (children == null) {
            children = new Node(p, NodeType.DIRECTORY.getValue());
            current.addChildren(children);

        }
        current = children;
        return current;
    }

    /**
     * 根据内存目录树生成FsImage
     *
     * @return FsImage
     */
    public FsImage getFsImage() {
        try {
            lock.readLock().lock();
            INode iNode = Node.toINode(root);
            return new FsImage(0L, iNode);
        } finally {
            lock.readLock().unlock();
        }
    }

    /**
     * 根据FsImage初始化文件目录树
     *
     * @param fsImage FsImage
     */
    public void applyFsImage(FsImage fsImage) {
        try {
            lock.writeLock().lock();
            this.root = Node.parseINode(fsImage.getINode(), "");
        } finally {
            lock.writeLock().unlock();
        }
    }

    /**
     * 查看目录文件
     *
     * @param parent 目录路径
     */
    public Node listFiles(String parent, int level) {
        return Node.deepCopy(unsafeListFiles(parent), level);
    }

    /**
     * 查看某个目录文件
     *
     * @param parent 目录路径
     */
    public Node listFiles(String parent) {
        return listFiles(parent, Integer.MAX_VALUE);
    }

    /**
     * 查看某个目录文件
     *
     * @param parent 文件路径
     */
    public Node unsafeListFiles(String parent) {
        if (root.getPath().equals(parent)) {
            return root;
        }
        lock.readLock().lock();
        try {
            String[] paths = StringUtils.split(parent, '/');
            String name = paths[paths.length - 1];
            Node current = getFileParent(paths);
            return current.getChildren(name);
        } finally {
            lock.readLock().unlock();
        }
    }

    /**
     * <pre>
     *     假设存在文件：
     *
     *     /aaa/bbb/c1.png
     *     /aaa/bbb/c2.png
     *     /bbb/ccc/c3.png
     *
     * 传入：/aaa，则返回：[/bbb/c1.png, /bbb/c2.png]
     *
     * </pre>
     * <p>
     * 返回文件名
     */
    public List<String> findAllFiles(String path) {
        Node node = listFiles(path);
        if (node == null) {
            return new ArrayList<>();
        }
        return findAllFiles(node);
    }

    private List<String> findAllFiles(Node node) {
        List<String> ret = new ArrayList<>();
        if (node.isFile()) {
            ret.add(node.getFullPath());
        } else {
            for (String key : node.getChildren().keySet()) {
                Node child = node.getChildren().get(key);
                ret.addAll(findAllFiles(child));
            }
        }
        return ret;
    }

    public Set<Metadata> findAllFileBySlot(int slot) {
        return findAllFilesBySlot(root, slot);
    }

    /**
     * @param node
     * @param slot
     * @return
     */
    public Set<Metadata> findAllFilesBySlot(Node node, int slot) {
        Set<Metadata> ret = new HashSet<>();
        if (node.isFile()) {
            String fullPath = node.getFullPath();
            int slotIndex = StringUtils.hash(fullPath, Constants.SLOTS_COUNT);
            if (slotIndex == slot) {
                ret.add(Metadata.newBuilder()
                        .setFilename(fullPath)
                        .setType(NodeType.FILE.getValue())
                        .putAllAttr(node.getAttr())
                        .build());
            }
        } else {
            for (String key : node.getChildren().keySet()) {
                Node child = node.getChildren().get(key);
                ret.addAll(findAllFilesBySlot(child, slot));
            }
        }
        return ret;
    }
}


