package com.naninuneda.kirifuda.card;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Cards implements Iterable<Card>{

	protected Set<Card> set;

	public Cards(){
		set = new TreeSet<Card>();
	}

	public Cards(Cards cards){
		Cards newCards = new Cards();
		for(Card card : cards){
			newCards.add(card);
		}
	}

	/** Setを返します． **/
	private Set<Card> getSet(){
		return set;
	}

	/** 引数で指定されたカードを追加します．同じカードの重複は無視されます． **/
	public void add(Card card){
		set.add(card);
	}

	/** 引数で指定されたカード集合を追加します．同じカードの重複は無視されます． **/
	public void add(Cards cards){
		for(Card card : cards){
			set.add(card);
		}
	}

	/** 引数で指定されたカードを含むかどうかをbooleanで返します． **/
	public boolean contains(Card card){
		return set.contains(card);
	}

	/** 引数で指定されたカード集合のすべてのカードを含むかどうかをbooleanで返します． **/
	public boolean contains(Cards cards){
		return set.containsAll(cards.getSet());
	}

	/** カード集合同士の内容が全く同じであるかどうかをbooleanで返します． **/
	public boolean equals(Cards cards){
		if(this.contains(cards) && cards.contains(this)){
			return true;
		}
		return false;
	}

	/** カード集合の要素の数を返します．カードは重複していないことに注意してください． **/
	public int getSize(){
		return set.size();
	}

	/** カード集合が空であるかどうかをbooleanで返します． **/
	public boolean isEmpty(){
		return set.isEmpty();
	}

	/** Iteratorを返します． **/
	@Override
	public Iterator<Card> iterator() {
		return set.iterator();
	}

	/** 引数で指定されたカードを削除します．引数で指定されたカードが存在しない場合，無視します． **/
	public boolean remove(Card card){
		return set.remove(card);
	}

	/** 引数で指定されたカード集合のすべてのカードを削除します．引数で指定されたカード集合のカードが存在しない場合，無視します． **/
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
