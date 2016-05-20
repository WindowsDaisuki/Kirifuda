package com.naninuneda.kirifuda.net;

import com.naninuneda.kirifuda.card.Meld;

public class PlaceInfo {

	private final Meld lastmeld;

	public PlaceInfo(Meld lastmeld) {
		this.lastmeld = lastmeld;
	}

	public Meld getLastmeld() {
		return lastmeld;
	}

}
