package com.learn.spring.com.learn.spring.game.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.learn.spring.com.learn.spring.game.GameRunner;
import com.learn.spring.com.learn.spring.game.GamingConsole;
import com.learn.spring.com.learn.spring.game.MarioGame;
import com.learn.spring.com.learn.spring.game.PacManGame;
import com.learn.spring.com.learn.spring.game.SuperContraGame;

@Configuration
public class GamingConfiguration {
	
	@Bean
	public GamingConsole game(@Qualifier("mario") GamingConsole gameName) {
		return gameName;
	}
	
	@Bean
	public GameRunner gameRunner() {
		return new GameRunner(game(null));
	}

	@Bean
	@Primary
	public GamingConsole gameName() {
		return new PacManGame();
	}
	
	@Bean
	@Qualifier("mario")
	public GamingConsole gameName2() {
		return new MarioGame();
	}
	
	
	@Bean
	@Qualifier("super")
	public GamingConsole gameName3() {
		return new SuperContraGame();
	}
	
	
}
