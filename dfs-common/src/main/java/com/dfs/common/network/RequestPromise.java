package com.dfs.common.network;

import com.dfs.common.NettyPacket;
import com.dfs.common.enums.PacketType;
import com.dfs.common.exception.RequestTimeoutException;
import lombok.extern.slf4j.Slf4j;

/**
 * 同步获取结果
 */
@Slf4j
public class RequestPromise {
    private NettyPacket request;
    private NettyPacket response;
    private final long startTime;
    private boolean timeout;
    private volatile boolean receiveResponseCompleted = false;

    public RequestPromise(NettyPacket request) {
        this.request = request;
        this.startTime = System.currentTimeMillis();
    }

    public NettyPacket getResult() throws RequestTimeoutException {
        waitForResult();
        return response;
    }

    /**
     * 结果返回
     *
     * @param nettyPacket nettyPacket
     */
    public void setResult(NettyPacket nettyPacket) {
        synchronized (this) {
            if (nettyPacket.isSupportChunked()) {
                if (nettyPacket.getBody().length == 0) {
                    this.receiveResponseCompleted = true;
                    notifyAll();
                } else {
                    if (this.response == null) {
                        this.response = nettyPacket;
                    } else {
                        this.response.mergeChunkedBody(nettyPacket);
                    }
                }
            } else {
                this.response = nettyPacket;
                this.receiveResponseCompleted = true;
                notifyAll();
            }
        }
    }

    protected void waitForResult() throws RequestTimeoutException {
        synchronized (this) {
            try {
                while (!receiveResponseCompleted && !timeout) {
                    wait(10);
                }
                if (timeout) {
                    if (log.isDebugEnabled()) {
                        log.debug("同步请求超时了：[cost={} s, request={}, sequence={}]", (System.currentTimeMillis() - startTime) / 1000.0D,
                                PacketType.getEnum(request.getPacketType()).getDescription(), request.getSequence());
                    }
                    throw new RequestTimeoutException("请求超时: " +
                            PacketType.getEnum(request.getPacketType()).getDescription());
                } else {
                    if (log.isDebugEnabled()) {
                        log.debug("同步请求成功了：[cost={} s, request={}, sequence={}, isSupportChunked={}, isChunkFinish={}]",
                                (System.currentTimeMillis() - startTime) / 1000.0D,
                                PacketType.getEnum(response.getPacketType()).getDescription(),
                                response.getSequence(), response.isSupportChunked(), !response.isSupportChunked()
                                        || response.getBody().length == 0);
                    }
                }
            } catch (InterruptedException e) {
                log.info("NettyPackageWrapper#waitForResult is interrupt !");
            }
        }
    }

    /**
     * 判断是否超时
     *
     * @param timeout 超时
     * @return 结果
     */
    public boolean isTimeout(long timeout) {
        if (this.timeout) {
            return true;
        }
        long now = System.currentTimeMillis();
        long timeoutInMs = request.getTimeoutInMs();
        if (timeoutInMs < 0) {
            return false;
        }
        if (timeoutInMs > 0) {
            return startTime + timeoutInMs < now;
        } else {
            return startTime + timeout < now;
        }
    }

    public void markTimeout() {
        if (this.timeout) {
            return;
        }
        timeout = true;
        synchronized (this) {
            notifyAll();
        }

    }
}
