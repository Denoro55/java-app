package com.test.view;

import com.test.controller.Game;

public class ConsoleView {

	protected final Game game;

	public ConsoleView(final Game game) {
		this.game = game;
	}

	public void showGameName() {
		System.out.print(game.printGameName());
	}

	public void showPlayersName() {
		System.out.print(game.printGameName());
	}

}