package com.naninuneda.kirifuda.card;

public enum Rank{

	JOKER_LOWEST, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE, TWO, JOKER_HIGHEST;

	public int toInt() {
		return ordinal() + 2;
	}

	public static Rank valueOf(int value) {
		switch (value) {
		case 2:
			return JOKER_LOWEST;
		case 3:
			return THREE;
		case 4:
			return FOUR;
		case 5:
			return FIVE;
		case 6:
			return SIX;
		case 7:
			return SEVEN;
		case 8:
			return EIGHT;
		case 9:
			return NINE;
		case 10:
			return TEN;
		case 11:
			return JACK;
		case 12:
			return QUEEN;
		case 13:
			return KING;
		case 14:
			return ACE;
		case 15:
			return TWO;
		case 16:
			return JOKER_HIGHEST;
		}
		throw new IllegalArgumentException("Rank.valueOf　の引数が不正です。:" + value);
	}

	public static Boolean validate(int value) {
		if ((2 <= value) && (value <= 16)) {
			return Boolean.valueOf(true);
		}
		return Boolean.valueOf(false);
	}

	public static Boolean validate(char chr) {
		if ((chr != 'J') && (chr != 'Q') && (chr != 'K') && (chr != 'A') && (chr != '-') && (chr != '+')
				&& ((Integer.parseInt(String.valueOf(chr)) < 1) || (Integer.parseInt(String.valueOf(chr)) > 9))) {
			return Boolean.valueOf(false);
		}
		return

		Boolean.valueOf(true);
	}

	public static Rank valueOf(char value) {
		if (validate(value).booleanValue()) {
			switch (value) {
			case 'J':
				return JACK;
			case 'Q':
				return QUEEN;
			case 'K':
				return KING;
			case 'A':
				return ACE;
			case '-':
				return JOKER_LOWEST;
			case '+':
				return JOKER_HIGHEST;
			case '1':
				return TEN;
			}
			return Integer.parseInt(String.valueOf(value)) == 2 ? TWO
					: valueOf(Integer.parseInt(String.valueOf(value)));
		}
		throw new IllegalArgumentException(Rank.class + "に渡す引数が間違っています。 : char chr = " + value);
	}

	public String toString() {
		if ((compareTo(THREE) >= 0) && (compareTo(TEN) <= 0)) {
			return String.valueOf(toInt());
		}
		if (equals(TWO)) {
			return "2";
		}
		if (equals(JOKER_LOWEST)) {
			return "-";
		}
		if (equals(JOKER_HIGHEST)) {
			return "+";
		}
		return String.valueOf(super.toString().charAt(0));
	}

	public Rank higher(int step) {
		return valueOf(toInt() + step);
	}

	public Rank higher() {
		return higher(1);
	}

	public Rank lower(int step) {
		return valueOf(toInt() - step);
	}

	public Rank lower() {
		return lower(1);
	}
}
