package com.naninuneda.kirifuda.card;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Melds implements Iterable<Meld>{

	private Set<Meld> set;

	protected Melds(){
		set = new TreeSet<Meld>();
	}

	private Set<Meld> getSet(){
		return set;
	}

	public void add(Meld meld){
		set.add(meld);
	}

	public void add(Melds melds){
		set.addAll(melds.getSet());
	}

	public boolean contains(Meld meld){
		return set.contains(meld);
	}

	public boolean contains(Melds melds){
		return set.contains(melds.getSet());
	}

	public boolean equals(Melds melds){
		if(this.contains(melds) && melds.contains(this)){
			return true;
		}
		return false;
	}

	public boolean isEmpty(){
		return set.isEmpty();
	}

	@Override
	public Iterator<Meld> iterator() {
		return set.iterator();
	}

	public boolean remove(Meld meld){
		return set.remove(meld);
	}

	public boolean remove(Melds melds){
		return set.removeAll(melds.getSet());
	}

}
