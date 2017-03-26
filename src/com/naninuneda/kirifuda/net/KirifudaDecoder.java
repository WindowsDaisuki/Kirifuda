package com.naninuneda.kirifuda.net;

import java.util.List;

import com.naninuneda.kirifuda.Kirifuda;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;



public class KirifudaDecoder extends ByteToMessageDecoder{

	@Override
	protected void decode(ChannelHandlerContext ctx, ByteBuf buffer, List<Object> arg2) throws Exception {

		int[][] table = new int[8][15];

		for (int i = 0; i < 8; ++i) {
			for (int j = 0; j < 15; ++j) {
				table[i][j] = buffer.readInt();
			}
		}

		if(Kirifuda.phase == 1){

		}else if(Kirifuda.phase == 2){

		}

		UserInfo info = new UserInfo(id, name, age);
		out.add(info); // (4)
	}

}
