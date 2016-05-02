package com.naninuneda.kirifuda.event;

import com.naninuneda.kirifuda.netty.ClientInfo;

public class ConnectionEstablishedEvent implements Event{

	public ClientInfo info;

	public ConnectionEstablishedEvent(){
		ClientInfo info = new ClientInfo(20070, "noname");
		this.info = info;
	}

	public void setVersion(int version){
		info.setVersion(version);
	}

	public void setName(String name){
		info.setName(name);
	}

	public ClientInfo getInfo(){
		return info;
	}

	public String getEventName(){
		return "ConnectionEstablishedEvent";
	}

}
