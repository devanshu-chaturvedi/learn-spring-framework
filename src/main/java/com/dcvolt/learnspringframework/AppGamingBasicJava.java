package com.dcvolt.learnspringframework;

import com.dcvolt.learnspringframework.game.GameRunner;
import com.dcvolt.learnspringframework.game.MarioGame;
import com.dcvolt.learnspringframework.game.PacmanGame;
import com.dcvolt.learnspringframework.game.SuperContraGame;

public class AppGamingBasicJava {

	public static void main(String[] args) {
//		var game = new MarioGame();
//		var game = new SuperContraGame();
		var game = new PacmanGame();
		var gameRunner = new GameRunner(game);
		gameRunner.run();
	}

}
