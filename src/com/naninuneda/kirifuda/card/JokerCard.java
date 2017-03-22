package com.naninuneda.kirifuda.card;

public enum JokerCard implements Card {
	Joker;

	@Override
	public boolean isJoker() {
		return true;
	}
}
