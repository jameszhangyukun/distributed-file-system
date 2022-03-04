package com.dfs.common;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.LengthFieldBasedFrameDecoder;

import java.nio.ByteOrder;

public class NettyPacketDecoder extends LengthFieldBasedFrameDecoder {
    public NettyPacketDecoder(int maxFrameLength){
        super(maxFrameLength,0,3,0,3);
    }
    @Override
    protected Object decode(ChannelHandlerContext ctx, ByteBuf in) throws Exception {
        return super.decode(ctx, in);
    }
}
