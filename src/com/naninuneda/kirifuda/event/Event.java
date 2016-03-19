package com.naninuneda.kirifuda.event;

public abstract class Event {

	public abstract String getEventName();

	public abstract HandlerList getHandlers();

}
