package com.naninuneda.kirifuda.card;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Melds implements Iterable<Meld>{

	private LinkedList<Meld> list;

	protected Melds(){
		list = new LinkedList<Meld>();
	}

	public void add(Meld meld){
		list.add(meld);
	}

	public void add(Melds melds){
		list.addAll(melds.asList());
	}

	public List<Meld> asList(){
		return list;
	}

	public boolean contains(Meld meld){
		return list.contains(meld);
	}

	public boolean contains(Melds melds){
		boolean all = true;
		for(Meld meld : melds){
			if(!list.contains(meld)){
				all = false;
				break;
			}
		}
		return all;
	}

	public boolean equals(Melds melds){
		if(this.contains(melds) && melds.contains(this)){
			return true;
		}
		return false;
	}

	public Meld get(int index){
		return list.get(index);
	}

	public boolean isEmpty(){
		return list.isEmpty();
	}

	@Override
	public Iterator<Meld> iterator() {
		return list.iterator();
	}

	public boolean remove(Meld meld){
		return list.remove(meld);
	}

	public boolean remove(Melds melds){
		return list.removeAll(melds.asList());
	}

}
