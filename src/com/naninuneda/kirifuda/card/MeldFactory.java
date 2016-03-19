package com.naninuneda.kirifuda.card;

public class MeldFactory {

	Meld meld;

	public MeldFactory(Cards cards){
		if(cards.getSize() == 1){
			meld = new Meld(cards, Meld.Type.SINGLE);
		}else if(cards.getSize() == 2){
			if(isGroup(cards)){
				meld= new Meld(cards, Meld.Type.GROUP);
			}else{
				meld = Meld.PASS;
			}
		}else if(cards.getSize() > 2){
			if(isGroup(cards)){
				meld = new Meld(cards, Meld.Type.GROUP);
			}else if(isSequence(cards)){
				meld = new Meld(cards, Meld.Type.SEQUENCE);
			}else{
				meld = Meld.PASS;
			}
		}else{
			meld = Meld.PASS;
		}
	}

	public MeldFactory(Card card){
		Cards cards = new Cards();
		cards.add(card);
		meld = new Meld(cards, Meld.Type.SINGLE);
	}

	public Meld getAllMelds(){
		return meld;
	}

	private boolean isSequence(Cards cards){

		Suit suit = cards.get(0).getSuit();
		for(Card card : cards){
			if(card.getSuit() != suit){
				return false;
			}
		}
		C

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
