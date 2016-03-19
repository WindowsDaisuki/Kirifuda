package com.naninuneda.kirifuda.card;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.naninuneda.kirifuda.card.Cards;
import com.naninuneda.kirifuda.card.Rank;
import com.naninuneda.kirifuda.card.Suit;

public final class Card {
	private final Rank _rank;
	private final Suit _suit;
	private static Map<String, Card> _values = new HashMap();

	static {
		for (Rank rank : Rank.values()) {
			for (Suit suit : Suit.values()) {
				Card card = new Card(suit, rank);
				_values.put(suit.toString() + rank.toString(), card);
			}
		}
		_values.put("JOKER", new Card(null, null));
	}

	public Rank getRank() {
		if (this == JOKER) {
			throw new IllegalStateException("JOKERにはランクはありません");
		}
		return this._rank;
	}

	public Suit getSuit() {
		if (this == JOKER) {
			throw new IllegalStateException("JOKERにはスートはありません");
		}
		return this._suit;
	}

	public static final Cards values() {
		return

		Cards.valueOf(new Card[] { S3, S4, S5, S6, S7, S8, S9, S10, SJ, SQ, SK, SA, S2, H3, H4, H5, H6, H7, H8, H9, H10,
				HJ, HQ, HK, HA, H2, C3, C4, C5, C6, C7, C8, C9, C10, CJ, CQ, CK, CA, C2, D3, D4, D5, D6, D7, D8, D9,
				D10, DJ, DQ, DK, DA, D2, JOKER });
	}

	public static final Card S3 = valueOf("S3");
	public static final Card H3 = valueOf("H3");
	public static final Card C3 = valueOf("C3");
	public static final Card D3 = valueOf("D3");
	public static final Card S4 = valueOf("S4");
	public static final Card H4 = valueOf("H4");
	public static final Card C4 = valueOf("C4");
	public static final Card D4 = valueOf("D4");
	public static final Card S5 = valueOf("S5");
	public static final Card H5 = valueOf("H5");
	public static final Card C5 = valueOf("C5");
	public static final Card D5 = valueOf("D5");
	public static final Card S6 = valueOf("S6");
	public static final Card H6 = valueOf("H6");
	public static final Card C6 = valueOf("C6");
	public static final Card D6 = valueOf("D6");
	public static final Card S7 = valueOf("S7");
	public static final Card H7 = valueOf("H7");
	public static final Card C7 = valueOf("C7");
	public static final Card D7 = valueOf("D7");
	public static final Card S8 = valueOf("S8");
	public static final Card H8 = valueOf("H8");
	public static final Card C8 = valueOf("C8");
	public static final Card D8 = valueOf("D8");
	public static final Card S9 = valueOf("S9");
	public static final Card H9 = valueOf("H9");
	public static final Card C9 = valueOf("C9");
	public static final Card D9 = valueOf("D9");
	public static final Card S10 = valueOf("S10");
	public static final Card H10 = valueOf("H10");
	public static final Card C10 = valueOf("C10");
	public static final Card D10 = valueOf("D10");
	public static final Card SJ = valueOf("SJ");
	public static final Card HJ = valueOf("HJ");
	public static final Card CJ = valueOf("CJ");
	public static final Card DJ = valueOf("DJ");
	public static final Card SQ = valueOf("SQ");
	public static final Card HQ = valueOf("HQ");
	public static final Card CQ = valueOf("CQ");
	public static final Card DQ = valueOf("DQ");
	public static final Card SK = valueOf("SK");
	public static final Card HK = valueOf("HK");
	public static final Card CK = valueOf("CK");
	public static final Card DK = valueOf("DK");
	public static final Card SA = valueOf("SA");
	public static final Card HA = valueOf("HA");
	public static final Card CA = valueOf("CA");
	public static final Card DA = valueOf("DA");
	public static final Card S2 = valueOf("S2");
	public static final Card H2 = valueOf("H2");
	public static final Card C2 = valueOf("C2");
	public static final Card D2 = valueOf("D2");
	public static final Card JOKER = valueOf("JOKER");

	private Card(Suit suit, Rank rank) {
		this._suit = suit;
		this._rank = rank;
	}

	public static Card valueOf(Suit suit, Rank rank) {
		return (Card) _values.get(suit.toString() + rank.toString());
	}

	public static Boolean validate(String str) {
		if (str.equals("JOKER")) {
			return Boolean.valueOf(true);
		}
		if (str.length() < 2) {
			return Boolean.valueOf(false);
		}
		char firstChar = str.charAt(0);
		char secondChar = str.charAt(1);
		if ((Suit.validate(firstChar).booleanValue()) && (Rank.validate(secondChar).booleanValue())) {
			return Boolean.valueOf(true);
		}
		return Boolean.valueOf(false);
	}

	public static Card valueOf(String str) {
		if (str.equals("JOKER")) {
			return (Card) _values.get("JOKER");
		}
		char firstChar = str.charAt(0);
		char secondChar = str.charAt(1);
		if (validate(str).booleanValue()) {
			return (Card) _values.get(Suit.valueOf(firstChar).toString() + Rank.valueOf(secondChar).toString());
		}
		throw new IllegalArgumentException("Card.valueOf(String) : Illegal Argument " + str);
	}

	public String toString() {
		if (this == JOKER) {
			return "JOKER";
		}
		return this._suit.toString() + this._rank.toString();
	}

	public int compareTo(Card card) {
		return

		getRank().compareTo(card.getRank()) == 0 ? getSuit().compareTo(card.getSuit())
				: card == JOKER ? -1 : this == JOKER ? 1 : card == JOKER ? 0 : getRank().compareTo(card.getRank());
	}
}
