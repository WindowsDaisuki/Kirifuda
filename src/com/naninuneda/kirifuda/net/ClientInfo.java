package com.naninuneda.kirifuda.net;

public class ClientInfo {

	private int version;
	private String name;


	public ClientInfo(int version,String name){
		this.version = version;
		if(!name.matches("[0-9a-zA-Z]+")){
			System.out.println("クライアント名が半角英数字ではありません．");
			this.name = "nameless";
		}else if(name.length() > 9){
			System.out.println("クライアント名が9字以上です．短縮されます．");
			this.name = name.substring(0, 9);
		}else{
			this.name = name;
		}
	}

	public int getVersion() {
		return version;
	}

	public String getName() {
		return name;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public void setName(String name){
		if(!name.matches("[0-9a-zA-Z]+")){
			System.out.println("クライアント名が半角英数字ではありません．");
			this.name = "nameless";
		}else if(name.length() > 9){
			System.out.println("クライアント名は9字以上です．短縮されます．");
			this.name = name.substring(0, 9);
		}else{
			this.name = name;
		}
	}

	public int[][] toArray(){
		int[][] table = new int[8][15];
		table[0][0] = version;
		for(int i = 0; i < 15; i++){
			table[1][i] = name.charAt(i);
		}
		return table;
	}


}
