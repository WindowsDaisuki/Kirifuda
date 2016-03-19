package com.naninuneda.kirifuda.card;

public enum Suit {
	SPADES, HEARTS, CLUBS, DIAMONDS;

	public String toString() {
		return String.valueOf(name().charAt(0));
	}

	public static Boolean validate(char chr) {
		if ((chr != 'S') && (chr != 'H') && (chr != 'C') && (chr != 'D')) {
			return Boolean.valueOf(false);
		}
		return Boolean.valueOf(true);
	}

	public static Suit valueOf(char chr) {
		if (validate(chr).booleanValue()) {
			switch (chr) {
			case 'S':
				return SPADES;
			case 'H':
				return HEARTS;
			case 'C':
				return CLUBS;
			case 'D':
				return DIAMONDS;
			}
			throw new IllegalStateException(Suit.class + "のメソッドvalidate(char) が正しく実装されていません．: char chr = " + chr);
		}
		throw new IllegalArgumentException(Suit.class + "に渡す引数が間違っています。 : char chr = " + chr);
	}
}
