package com.naninuneda.kirifuda.card;


public class Meld extends Cards{

	private final Meld.Type type;

	public static enum Type {
		SINGLE, GROUP, SEQUENCE;
	}

	protected Meld(Cards cards,Meld.Type type){
		super(cards);
		this.type = type;
	}

	public static final Meld PASS;

	static{
		//PASSは空のCardsインスタンスとする．
		PASS = (Meld) new Cards();
	}

	public Meld.Type getMeldType(){
		return type;
	}

}
