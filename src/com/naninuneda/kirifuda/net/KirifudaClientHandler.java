package com.naninuneda.kirifuda.net;

import com.naninuneda.kirifuda.Kirifuda;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.buffer.ByteBuf;

public class KirifudaClientHandler extends ChannelInboundHandlerAdapter {

	@Override
	public void channelActive(ChannelHandlerContext ctx) throws Exception {
		System.out.println("[" + Kirifuda.NAME + "] server connected !");
		ClientInfo info = new ClientInfo(Kirifuda.PROTO,Kirifuda.NAME);
		System.out.println("[" + Kirifuda.NAME + "] send client infomation !");
		ctx.writeAndFlush(info.toArray());
		Kirifuda.phase = 1;
	}

	@Override
	public void channelRead(ChannelHandlerContext ctx,Object msg) throws Exception {
        if(Kirifuda.phase == 1){
        	int num = ((ByteBuf) msg).readInt();
        	System.out.println("[" + Kirifuda.NAME + "] your palyer number is "+ num + "!");
        	Kirifuda.phase = 2;
        }else if(Kirifuda.phase == 2){
        	int[][] table = new int[8][15];
        	ByteBuf buffer = (ByteBuf) msg;
    		for (int i = 0; i < 8; ++i) {
    			for (int j = 0; j < 15; ++j) {
    				table[i][j] = buffer.readInt();
    			}
    		}
    		Kirifuda.phase = 3;
        }
    }


}
