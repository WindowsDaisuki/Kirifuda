package com.naninuneda.kirifuda.event;

import com.naninuneda.kirifuda.ClientInfo;

public class ConnectionEstablishedEvent {

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
	
	public static String getEventName(){
		return "ConnectionEstablishedEvent";
	}

}
