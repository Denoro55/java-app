package com.test;

public class ThreePlayersGame extends TwoPlayersGame {

	private final String player3Name;

	public ThreePlayersGame(String player1Name, String player2Name, String player3Name) {
		super(player1Name, player2Name);
		this.player3Name = player3Name;
	}

	public void printPlayer3() {
		System.out.println(this.player3Name);
	}
}