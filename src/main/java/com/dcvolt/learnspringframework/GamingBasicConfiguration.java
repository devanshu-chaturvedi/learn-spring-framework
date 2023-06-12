package com.dcvolt.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.dcvolt.learnspringframework.game.GameRunner;
import com.dcvolt.learnspringframework.game.GamingConsole;
import com.dcvolt.learnspringframework.game.PacmanGame;

@Configuration
public class GamingBasicConfiguration {
	
	@Bean 
	public GamingConsole game(){
		return new PacmanGame();
	}
	
	@Bean
	public GameRunner gameRunner(GamingConsole game) {
		return new GameRunner(game);
	}
}
