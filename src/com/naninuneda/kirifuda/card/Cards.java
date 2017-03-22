package com.naninuneda.kirifuda.card;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Cards implements Iterable<Card>{

	protected Set<Card> set;

	protected Cards(){
		set = new TreeSet<Card>();
	}

	public Cards(Cards cards){
		Cards newCards = new Cards();
		for(Card card : cards){
			newCards.add(card);
		}
	}

	private Set<Card> getSet(){
		return set;
	}

	public void add(Card card){
		set.add(card);
	}

	public void add(Cards cards){
		for(Card card : cards){
			set.add(card);
		}
	}

	public boolean contains(Card card){
		return set.contains(card);
	}


	public boolean contains(Cards cards){
		return set.containsAll(cards.getSet());
	}

	public boolean equals(Cards cards){
		if(this.contains(cards) && cards.contains(this)){
			return true;
		}
		return false;
	}

	public int getSize(){
		return set.size();
	}

	public boolean isEmpty(){
		return set.isEmpty();
	}

	@Override
	public Iterator<Card> iterator() {
		return set.iterator();
	}

	public boolean remove(Card card){
		return set.remove(card);
	}

	public boolean remove(Cards cards){
		return set.removeAll(cards.getSet());
	}

	/** スート集合を返します**/
	public Suits getSuits() {
		Suits suits = new Suits();
		for(Card card : set){
			if(!card.isJoker()){
				NormalCard nc = (NormalCard) card;
				suits.add(nc.getSuit());
			}
		}
		return suits;
	}


	/**JokerがCardsに含まれるかどうか．
	 * 含まれる場合true，含まれない場合falseを返します．**/
	public boolean hasJoker() {
		for(Card card : set){
			if(card.equals(Card.Joker)){
				return true;
			}
		}
		return false;
	}
}
