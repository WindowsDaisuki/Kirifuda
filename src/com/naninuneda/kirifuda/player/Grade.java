package com.naninuneda.kirifuda.player;

public enum Grade {

	DAIHINMIN,HINMIN,HEIMIN,FUGOU,DAIFUGOU;

	//階級を返します．0が大富豪，4が大貧民です
	public static Grade valueOf(int value) {
		switch (value) {
		case 0:
			return DAIFUGOU;
		case 1:
			return FUGOU;
		case 2:
			return HEIMIN;
		case 3:
			return HINMIN;
		case 4:
			return DAIHINMIN;
		}
		throw new IllegalArgumentException("Grade.valueOf　の引数が不正です。:" + value);
	}

	public static Integer toInt(Grade grade){
		switch (grade) {
		case DAIFUGOU:
			return 0;
		case FUGOU:
			return 1;
		case HEIMIN:
			return 2;
		case HINMIN:
			return 3;
		case DAIHINMIN:
			return 4;
		}
		throw new IllegalArgumentException("Grade.toInt　の引数が不正です。:" + grade);
	}


}
