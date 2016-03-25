package com.naninuneda.kirifuda.player;

public class Enemy implements Player{

	Grade grade;
	Integer number, seat,handSize,score;

	public Enemy(Integer number,Grade grade, Integer seat, Integer handSize, Integer score) {
		this.number = number;
		this.grade = grade;
		this.seat = seat;
		this.handSize = handSize;
		this.score = score;
	}

	@Override
	public Integer getNumber() {
		return null;
	}

	@Override
	public Integer getSeat() {
		return seat;
	}

	@Override
	public Integer getHandSize() {
		return handSize;
	}

	@Override
	public Integer getScore() {
		return score;
	}

	@Override
	public Grade getGrade() {
		return grade;
	}

}
