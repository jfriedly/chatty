/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

// Weeeeeee I'm a template!!!
package com.jfriedly.chatty.time;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import java.util.List;

/**
 *
 * @author joel
 */
public class TimeDecoder extends ByteToMessageDecoder {
    @Override
    public void decode(ChannelHandlerContext ctx, ByteBuf in, List<Object> out) {
        if (in.readableBytes() < 4)
            return;

        out.add(new UnixTime(in.readUnsignedInt()));
    }
}
