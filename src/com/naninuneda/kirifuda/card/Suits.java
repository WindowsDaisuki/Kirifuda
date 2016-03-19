package com.naninuneda.kirifuda.card;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Suits implements Iterable<Suit>{

	private LinkedList<Suit> list;

	public Suits(){
		list = new LinkedList<Suit>();
	}

	public void add(Suit suit){
		list.add(suit);
	}

	public void add(Suits suits){
		list.addAll(suits.asList());
	}

	public List<Suit> asList(){
		return list;
	}

	public boolean contains(Suit suit){
		return list.contains(suit);
	}

	public boolean contains(Suits suits){
		boolean all = true;
		for(Suit suit : suits){
			if(!list.contains(suit)){
				all = false;
				break;
			}
		}
		return all;
	}

	public boolean equals(Suits suits){
		if(this.contains(suits) && suits.contains(this)){
			return true;
		}
		return false;
	}

	public Suit get(int index){
		return list.get(index);
	}

	public boolean isEmpty(){
		return list.isEmpty();
	}

	@Override
	public Iterator<Suit> iterator() {
		return list.iterator();
	}

	public boolean remove(Suit suit){
		return list.remove(suit);
	}

	public boolean remove(Suits suits){
		return list.removeAll(suits.asList());
	}
}
