package com.dcvolt.learnspringframework;

import com.dcvolt.learnspringframework.game.GameRunner;
import com.dcvolt.learnspringframework.game.MarioGame;
import com.dcvolt.learnspringframework.game.PacmanGame;
import com.dcvolt.learnspringframework.game.SuperContraGame;

public class App01GamingBasicJava {

	public static void main(String[] args) {
//		var game = new MarioGame();
//		var game = new SuperContraGame();
		//1. Object Creation
		var game = new PacmanGame();
		
		//2. Object Creation + Wiring of Dependency
		//Game is a dependency of the GameRunner class
		var gameRunner = new GameRunner(game);
		
		gameRunner.run();

	}

}
