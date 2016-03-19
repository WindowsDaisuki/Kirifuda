package com.naninuneda.kirifuda.event;

public class ReceivePlayerNumberEvent {

	private Integer number;

	public ReceivePlayerNumberEvent(Integer number){
		this.number = number;
	}

	public Integer getNumber(){
		return number;
	}

}
