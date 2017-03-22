package com.naninuneda.kirifuda.net;

import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;

public class KirifudaEncoder extends MessageToByteEncoder<ClientInfo> {

	@Override
	protected void encode(ChannelHandlerContext ctx, ClientInfo info, ByteBuf buffer) throws Exception {



	}

}
