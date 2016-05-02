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
		throw new IllegalArgumentException("Grade.valueOf　の引数が不正です．:" + value);
	}

	public Integer toInt(){
		if(this == DAIFUGOU){
			return 0;
		}else if(this == FUGOU){
			return 1;
		}else if(this == HEIMIN){
			return 2;
		}else if(this == HINMIN){
			return 3;
		}else if(this == DAIHINMIN){
			return 4;
		}
		throw new IllegalArgumentException("GradeクラスをIntegerに変換できません．");
	}


}
