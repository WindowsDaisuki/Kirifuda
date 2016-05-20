package com.naninuneda.kirifuda.event;

import com.naninuneda.kirifuda.card.Cards;
import com.naninuneda.kirifuda.net.HandInfo;
import com.naninuneda.kirifuda.player.Player;

public class CardDealtEvent implements Event{

	private HandInfo info;
	private Cards cards;

	public CardDealtEvent(HandInfo info){
		this.info = info;

	}

	public Cards getHand() {
		return info.getHand();
	}

	public Integer getMyExchengeCardSize() {
		return info.getMyExchengeCardSize();
	}

	public Integer getExchengeCardSize() {
		return info.getExchengeCardSize();
	}

	public Player[] getEnemys() {
		return info.getEnemys();
	}

	@Override
	public String getEventName() {
		return this.getClass().getName();
	}

}
