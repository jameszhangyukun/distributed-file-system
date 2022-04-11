package com.zyk.dfs.namenode.editslog;

import com.dfs.common.utils.ByteUtil;
import com.dfs.model.backup.EditLog;
import lombok.extern.slf4j.Slf4j;

import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * 一条editlog
 */
@Slf4j
public class EditLogWrapper {
    private EditLog editLog;

    public EditLogWrapper(int opType, String path) {

    }

    public EditLogWrapper(int opType, String path, Map<String, String> attr) {
        this.editLog = EditLog.newBuilder()
                .setOpType(opType)
                .setPath(path)
                .putAllAttr(attr)
                .build();
    }

    public EditLogWrapper(EditLog editLog) {
        this.editLog = editLog;
    }

    public EditLog getEditLog() {
        return editLog;
    }

    public void setTxId(long txId) {
        this.editLog = this.editLog.toBuilder().setTxId(txId).build();
    }

    public long getTxId() {
        return this.editLog.getTxId();
    }

    public byte[] toByteArray(){
        byte[] body = editLog.toByteArray();
        int bodyLength = body.length;
        byte[] ret = new byte[bodyLength + 4];
        ByteUtil.setInt(ret,4,bodyLength);
        System.arraycopy(body, 0, ret, 4, bodyLength);
        return ret;
    }

    public static List<EditLogWrapper> parseForm(byte[]bytes){
        ByteBuffer byteBuffer = ByteBuffer.wrap(bytes);
        return parseForm(byteBuffer);
    }

    public static List<EditLogWrapper> parseForm(ByteBuffer byteBuffer) {
        List<EditLogWrapper> ret = new LinkedList<>();
        while (byteBuffer.hasRemaining()){
            try {
                int bodyLength = byteBuffer.getInt();
                byte[] body = new byte[bodyLength];
                byteBuffer.get(body);
                EditLog editLog = EditLog.parseFrom(body);
                ret.add(new EditLogWrapper(editLog));
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return ret;
    }
}
