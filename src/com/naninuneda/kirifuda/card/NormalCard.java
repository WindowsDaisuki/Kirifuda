package com.naninuneda.kirifuda.card;

import com.naninuneda.kirifuda.card.Rank;
import com.naninuneda.kirifuda.card.Suit;

public enum NormalCard implements Card {

	S3(Rank.THREE,Suit.SPADES),
	S4(Rank.FOUR,Suit.SPADES),
	S5(Rank.FIVE,Suit.SPADES),
	S6(Rank.SIX,Suit.SPADES),
	S7(Rank.SEVEN,Suit.SPADES),
	S8(Rank.EIGHT,Suit.SPADES),
	S9(Rank.NINE,Suit.SPADES),
	S10(Rank.TEN,Suit.SPADES),
	SJ(Rank.JACK,Suit.SPADES),
	SQ(Rank.QUEEN,Suit.SPADES),
	SK(Rank.KING,Suit.SPADES),
	SA(Rank.ACE,Suit.SPADES),
	S2(Rank.TWO,Suit.SPADES),

	H3(Rank.THREE,Suit.HEARTS),
	H4(Rank.FOUR,Suit.HEARTS),
	H5(Rank.FIVE,Suit.HEARTS),
	H6(Rank.SIX,Suit.HEARTS),
	H7(Rank.SEVEN,Suit.HEARTS),
	H8(Rank.EIGHT,Suit.HEARTS),
	H9(Rank.NINE,Suit.HEARTS),
	H10(Rank.TEN,Suit.HEARTS),
	HJ(Rank.JACK,Suit.HEARTS),
	HQ(Rank.QUEEN,Suit.HEARTS),
	HK(Rank.KING,Suit.HEARTS),
	HA(Rank.ACE,Suit.HEARTS),
	H2(Rank.TWO,Suit.HEARTS),

	C3(Rank.THREE,Suit.CLUBS),
	C4(Rank.FOUR,Suit.CLUBS),
	C5(Rank.FIVE,Suit.CLUBS),
	C6(Rank.SIX,Suit.CLUBS),
	C7(Rank.SEVEN,Suit.CLUBS),
	C8(Rank.EIGHT,Suit.CLUBS),
	C9(Rank.NINE,Suit.CLUBS),
	C10(Rank.TEN,Suit.CLUBS),
	CJ(Rank.JACK,Suit.CLUBS),
	CQ(Rank.QUEEN,Suit.CLUBS),
	CK(Rank.KING,Suit.CLUBS),
	CA(Rank.ACE,Suit.CLUBS),
	C2(Rank.TWO,Suit.CLUBS),

	D3(Rank.THREE,Suit.DIAMONDS),
	D4(Rank.FOUR,Suit.DIAMONDS),
	D5(Rank.FIVE,Suit.DIAMONDS),
	D6(Rank.SIX,Suit.DIAMONDS),
	D7(Rank.SEVEN,Suit.DIAMONDS),
	D8(Rank.EIGHT,Suit.DIAMONDS),
	D9(Rank.NINE,Suit.DIAMONDS),
	D10(Rank.TEN,Suit.DIAMONDS),
	DJ(Rank.JACK,Suit.DIAMONDS),
	DQ(Rank.QUEEN,Suit.DIAMONDS),
	DK(Rank.KING,Suit.DIAMONDS),
	DA(Rank.ACE,Suit.DIAMONDS),
	D2(Rank.TWO,Suit.DIAMONDS);

	private final Rank rank;
	private final Suit suit;

	private NormalCard(final Rank rank,final Suit suit){
		this.rank = rank;
		this.suit = suit;
	}

	public Rank getRank() {
		return this.rank;
	}

	public Suit getSuit() {
		return this.suit;
	}

	public String toString() {
		return this.suit.toString() + this.rank.toString();
	}

	@Override
	public boolean isJoker() {
		return false;
	}

}
