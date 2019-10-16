package com.test;

import com.test.humans.Human;
import com.test.controller.Game;
import com.test.view.ConsoleView;
import com.test.view.AdvancedConsoleView;

public class Main {

    public static void main(String[] args) {

        Game game = new Game();
        ConsoleView consoleView = new ConsoleView(game);
        AdvancedConsoleView advConsoleView = new AdvancedConsoleView(game);

        startGame(advConsoleView);

    }

    public static void startGame(ConsoleView cv) {
    	cv.showGameName();
        cv.showPlayersName();
    }
}