package com.naninuneda.kirifuda.card;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Suits implements Iterable<Suit>{

	private Set<Suit> set;

	public Suits(){
		set = new TreeSet<Suit>();
	}

	public boolean add(Suit suit){
		return set.add(suit);
	}

	private Set<Suit> getSet(){
		return set;
	}

	/** 指定された引数のスートを含む場合trueを返します **/
	public boolean contains(Suit suit){
		return set.contains(suit);
	}

	/** 指定された引数のスートのすべてを含む場合trueを返します **/
	public boolean contains(Suits suits){
		return set.containsAll(suits.getSet());
	}

	/** スート集合のスートが完全に同じであった場合trueを返します．完全に同じでない場合falseを返します． **/
	public boolean equals(Suits suits){
		if(this.contains(suits) && suits.contains(this)){
			return true;
		}
		return false;
	}

	/** スート集合の中身が空である場合trueを返します．から出ない場合falseを返します． **/
	public boolean isEmpty(){
		return set.isEmpty();
	}

	@Override
	public Iterator<Suit> iterator() {
		return set.iterator();
	}

	public boolean remove(Suit suit){
		return set.remove(suit);
	}

	public void remove(Suits suits){
		for(Suit suit : suits){
			set.remove(suit);
		}
	}

}
