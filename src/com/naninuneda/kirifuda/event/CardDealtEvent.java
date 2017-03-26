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

	/** 配られたカード集合を返します．貧民と大貧民には、カード交換を行なう前の情報であり，一方、富豪と大富豪には、貧民と大貧民から強いカードを奪ったあとの情報であることに十分注意してください ． **/
	public Cards getIncompleteHand() {
		return info.getHand();
	}

	/** あなたが交換できるカード枚数を通知します．
	 * 2~1は自分の好きなカードを交換することができます．
	 * 0は交換できません．
	 * -2~-1はカードが強制的に交換されることを意味します． **/
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
