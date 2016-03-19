package com.naninuneda.kirifuda.card;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Cards implements Iterable<Card>{

	protected ArrayList<Card> list;

	protected Cards(){
		list = new ArrayList<Card>();
	}

	public Cards(Card[] cards){
		Cards newCards = new Cards();
		for(Card card : cards){
			newCards.add(card);
		}
	}

	public Cards(List<Card> cards){
		Cards newCards = new Cards();
		for(Card card : cards){
			newCards.add(card);
		}
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

	public Suits getSuits() {
		Suits suits = new Suits();
		for(Card card : list){
			suits.add(card.getSuit());
		}
		return suits;
	}

	public boolean hasJoker() {
		for(Card card : list){
			if(card.equals(Card.JOKER)){
				return true;
			}
		}
		return false;
	}

	public void sort() {
		ArrayList<Card> sorted = new ArrayList<Card>(list);
		//降順にソートします．ジョーカーが入っている場合，一番最後に配置されます．※バブルソート要改善
		if(hasJoker()){
			sorted.remove(Card.JOKER);
		}
		for(int i = 0; i < sorted.size() - 1; i++){
			for(int j = 0; j < sorted.size() - 1; j++){
				if(sorted.get(j + 1).getRank().toInt() <= sorted.get(j).getRank().toInt()){
					Card small = sorted.get(j + 1);
					Card big = sorted.get(j);
					sorted.set(j + 1, big);
					sorted.set(j, small);
				}
			}
		}
		if(hasJoker()){
			sorted.add(Card.JOKER);
		}

		list = sorted;
	}

}
