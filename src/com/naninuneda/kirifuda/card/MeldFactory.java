package com.naninuneda.kirifuda.card;

import java.util.ArrayList;
import java.util.LinkedList;

public class MeldFactory {

	Melds melds;

	public MeldFactory(Cards cards){

		melds = new Melds();

		if(cards.getSize() == 1){
			melds.add(new Meld(cards, Meld.Type.SINGLE));
		}else if(cards.getSize() == 2){
			if(isGroup(cards)){
				melds.add(new Meld(cards, Meld.Type.GROUP));
			}else{
				melds.add(Meld.PASS);
			}
		}else if(cards.getSize() > 2){
			if(isGroup(cards)){
				melds.add(new Meld(cards, Meld.Type.GROUP));
			}else if(isSequence(cards)){
				melds.add(new Meld(cards, Meld.Type.SEQUENCE));
			}else{
				melds.add(Meld.PASS);
			}
		}else{
			melds.add(Meld.PASS);
		}
	}

	public MeldFactory(Card card){
		Cards cards = new Cards();
		cards.add(card);
		melds.add(new Meld(cards, Meld.Type.SINGLE));
	}

	public Melds getAllMelds(){
		return melds;
	}

	private boolean isSequence(Cards cards){

		if(cards.getSize() < 3){
			return false;
		}

		if(cards.hasJoker()){
			Cards noJoker = new Cards(cards.asList());
			noJoker.remove(Card.JOKER);

			//同じsuitでなければ連続と判断できない
			Suit suit = noJoker.get(0).getSuit();
			for(Card card : noJoker){
				if(card.getSuit() != suit){
					return false;
				}
			}

			noJoker.sort();





		}else{
			//同じsuitでなければ連続と判断できない
			Suit suit = cards.get(0).getSuit();
			for(Card card : cards){
				if(card.getSuit() != suit){
					return false;
				}
			}

			cards.sort();

			int rank = cards.get(0).getRank().toInt();
			for(int i = 1; i < cards.getSize(); i++){
				if(cards.get(i).getRank().toInt() != rank + 1){
					return false;
				}
			}
			return true;
		}

	}

	private boolean isGroup(Cards cards){
		Rank rank = cards.get(0).getRank();
		for(Card card : cards){
			if(card.getRank() != rank){
				return false;
			}
		}
		return true;
	}

}
