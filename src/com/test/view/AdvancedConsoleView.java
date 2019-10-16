package com.test.view;

import com.test.controller.Game;

public class AdvancedConsoleView extends ConsoleView {

	public AdvancedConsoleView(final Game game) {
		super(game);
	}

	public void showGameName() {
		System.out.print("***");
		System.out.print(game.printGameName());
		System.out.print("***");
	}

}