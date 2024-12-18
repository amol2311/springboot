package com.learn.spring.com.learn.spring.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
	
	GamingConsole game ; 

	public GameRunner(@Qualifier("SuperContraGame") GamingConsole game) {
		// TODO Auto-generated constructor stub
		this.game = game;
	}

	public void run() {
		// TODO Auto-generated method stub
		
		System.out.println("running game :"+game);
		game.up();
		game.down();
		game.left();
		game.right();
	}
	
	

}
