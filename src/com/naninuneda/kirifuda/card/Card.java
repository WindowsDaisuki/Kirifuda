package com.naninuneda.kirifuda.card;

public interface Card {

	static final JokerCard Joker = JokerCard.Joker;

	static final NormalCard S3 = NormalCard.S3;
	static final NormalCard S4 = NormalCard.S4;
	static final NormalCard S5 = NormalCard.S5;
	static final NormalCard S6 = NormalCard.S6;
	static final NormalCard S7 = NormalCard.S7;
	static final NormalCard S8 = NormalCard.S8;
	static final NormalCard S9 = NormalCard.S9;
	static final NormalCard S10 = NormalCard.S10;
	static final NormalCard SJ = NormalCard.SJ;
	static final NormalCard SQ = NormalCard.SQ;
	static final NormalCard SK = NormalCard.SK;
	static final NormalCard SA = NormalCard.SA;
	static final NormalCard S2 = NormalCard.S2;

	static final NormalCard H3 = NormalCard.H3;
	static final NormalCard H4 = NormalCard.H4;
	static final NormalCard H5 = NormalCard.H5;
	static final NormalCard H6 = NormalCard.H6;
	static final NormalCard H7 = NormalCard.H7;
	static final NormalCard H8 = NormalCard.H8;
	static final NormalCard H9 = NormalCard.H9;
	static final NormalCard H10 = NormalCard.H10;
	static final NormalCard HJ = NormalCard.HJ;
	static final NormalCard HQ = NormalCard.HQ;
	static final NormalCard HK = NormalCard.HK;
	static final NormalCard HA = NormalCard.HA;
	static final NormalCard H2 = NormalCard.H2;

	static final NormalCard C3 = NormalCard.C3;
	static final NormalCard C4 = NormalCard.C4;
	static final NormalCard C5 = NormalCard.C5;
	static final NormalCard C6 = NormalCard.C6;
	static final NormalCard C7 = NormalCard.C7;
	static final NormalCard C8 = NormalCard.C8;
	static final NormalCard C9 = NormalCard.C9;
	static final NormalCard C10 = NormalCard.C10;
	static final NormalCard CJ = NormalCard.CJ;
	static final NormalCard CQ = NormalCard.CQ;
	static final NormalCard CK = NormalCard.CK;
	static final NormalCard CA = NormalCard.CA;
	static final NormalCard C2 = NormalCard.C2;

	static final NormalCard D3 = NormalCard.D3;
	static final NormalCard D4 = NormalCard.D4;
	static final NormalCard D5 = NormalCard.D5;
	static final NormalCard D6 = NormalCard.D6;
	static final NormalCard D7 = NormalCard.D7;
	static final NormalCard D8 = NormalCard.D8;
	static final NormalCard D9 = NormalCard.D9;
	static final NormalCard D10 = NormalCard.D10;
	static final NormalCard DJ = NormalCard.DJ;
	static final NormalCard DQ = NormalCard.DQ;
	static final NormalCard DK = NormalCard.DK;
	static final NormalCard DA = NormalCard.DA;
	static final NormalCard D2 = NormalCard.D2;

	/** カードがJokerであればtrue，Jokerでなければfalseを返します． **/
	public boolean isJoker();

}
