package com.naninuneda.kirifuda.card;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Cards implements Iterable<Card>{

	protected LinkedList<Card> list;

	protected Cards(){
		list = new LinkedList<Card>();
	}

	public void add(Card card){
		list.add(card);
	}

	public void add(Cards cards){
		list.addAll(cards.asList());
	}

	public List<Card> asList(){
		return list;
	}

	public boolean contains(Card card){
		return list.contains(card);
	}

	public boolean contains(Cards cards){
		boolean all = true;
		for(Card card : cards){
			if(!list.contains(card)){
				all = false;
				break;
			}
		}
		return all;
	}

	public boolean equals(Cards cards){
		if(this.contains(cards) && cards.contains(this)){
			return true;
		}
		return false;
	}

	public Card get(int index){
		return list.get(index);
	}

	public int getSize(){
		return list.size();
	}

	public boolean isEmpty(){
		return list.isEmpty();
	}

	@Override
	public Iterator<Card> iterator() {
		return list.iterator();
	}

	public boolean remove(Card card){
		return list.remove(card);
	}

	public boolean remove(Cards cards){
		return list.removeAll(cards.asList());
	}

	public static Cards valueOf(Card[] cards) {
		Cards newCards = new Cards();
		for(Card card : cards){
			newCards.add(card);
		}
		return newCards;
	}

	public Suits getSuits() {
		Suits suits = new Suits();
		for(Card card : list){
			suits.add(card.getSuit());
		}
		return suits;
	}

}
