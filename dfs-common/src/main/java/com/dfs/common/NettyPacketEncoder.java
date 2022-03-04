package com.dfs.common;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;

public class NettyPacketEncoder extends MessageToByteEncoder<NettyPacket> {
    @Override
    protected void encode(ChannelHandlerContext channelHandlerContext, NettyPacket nettyPacket, ByteBuf byteBuf) throws Exception {
        nettyPacket.write(byteBuf);
    }
}
