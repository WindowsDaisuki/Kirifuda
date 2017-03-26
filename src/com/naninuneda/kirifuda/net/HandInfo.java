package com.naninuneda.kirifuda.net;

import com.naninuneda.kirifuda.card.Card;
import com.naninuneda.kirifuda.card.Cards;
import com.naninuneda.kirifuda.card.JokerCard;
import com.naninuneda.kirifuda.player.Player;

public class HandInfo {

	private final Cards hand;
	private final Integer myExchengeCardSize,exchengeCardSize;
	private final boolean isMyTurn,isRenew,isReverse,isRock;
	private final int turnPlayer;
	private final Player[] enemys;

	public HandInfo(int[][] table) {
		Cards cards = new Cards();
		for(int i = 0; i <= 3; i++){
			for(int j = 1; j <= 13; j++){
				if(table[i][j] == 1){
					String name = "";

					if(i == 0){
						name = "S";
					}else if(i == 1){
						name = "H";
					}else if(i == 2){
						name = "D";
					}else if(i == 3){
						name = "C";
					}

					if(j <= 8){
						name.concat(j+2 + "");
					}else if (j == 9){
						name.concat("J");
					}else if (j == 10){
						name.concat("Q");
					}else if (j == 11){
						name.concat("K");
					}else if (j == 12){
						name.concat("A");
					}else if (j == 13){
						name.concat("2");
					}
					Card card = Card.convert(name);
					cards.add(card);
				}
			}
		}
		if(table[1][4] == 1){
			cards.add(JokerCard.Joker);
		}
		this.hand = cards;

		this.myExchengeCardSize = table[0][5];
		this.exchengeCardSize = exchengeCardSize;
		if(table[2][5]==1){
			this.isMyTurn = true;
		}else{
			this.isMyTurn = false;
		}
		this.isRenew = isRenew;
		this.isReverse = isReverse;
		if(table[7][5]==1){
			this.isRock = true;
		}else{
			this.isRock = false;
		}
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
