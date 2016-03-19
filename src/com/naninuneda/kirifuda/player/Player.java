package com.naninuneda.kirifuda.player;

import com.naninuneda.kirifuda.card.Grade;

public interface Player {

	public Grade getGrade();

	public Integer getNumber();

	public Integer getSeat();

	public Integer getHandSize();

	public Integer getScore();

}
