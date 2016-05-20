package com.naninuneda.kirifuda.net;

import com.naninuneda.kirifuda.card.Cards;
import com.naninuneda.kirifuda.player.Enemy;
import com.naninuneda.kirifuda.player.Player;

public class HandInfo {

	private final Cards hand;
	private final Integer myExchengeCardSize,exchengeCardSize;
	private final boolean isMyTurn,isRenew,isReverse,isRock;
	private final int turnPlayer;
	private final Player[] enemys;

	public HandInfo(Cards hand, int myExchengeCardSize, int exchengeCardSize, boolean isMyTurn, boolean isRenew,
			boolean isReverse, boolean isRock, int turnPlayer, Enemy[] enemys) {
		super();
		this.hand = hand;
		this.myExchengeCardSize = myExchengeCardSize;
		this.exchengeCardSize = exchengeCardSize;
		this.isMyTurn = isMyTurn;
		this.isRenew = isRenew;
		this.isReverse = isReverse;
		this.isRock = isRock;
		this.turnPlayer = turnPlayer;
		this.enemys = enemys;
	}

	public Cards getHand() {
		return hand;
	}

	public Integer getMyExchengeCardSize() {
		return myExchengeCardSize;
	}

	public Integer getExchengeCardSize() {
		return exchengeCardSize;
	}

	public boolean isMyTurn() {
		return isMyTurn;
	}

	public boolean isRenew() {
		return isRenew;
	}

	public boolean isReverse() {
		return isReverse;
	}

	public boolean isRock() {
		return isRock;
	}

	public Integer getTurnPlayer() {
		return turnPlayer;
	}

	public Player[] getEnemys() {
		return enemys;
	}



}
