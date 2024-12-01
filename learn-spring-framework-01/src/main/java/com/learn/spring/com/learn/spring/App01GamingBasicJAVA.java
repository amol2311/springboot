package com.learn.spring.com.learn.spring;

import com.learn.spring.com.learn.spring.game.GameRunner;
import com.learn.spring.com.learn.spring.game.MarioGame;
import com.learn.spring.com.learn.spring.game.PacManGame;
import com.learn.spring.com.learn.spring.game.SuperContraGame;

public class App01GamingBasicJAVA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		var marioGame =  new SuperContraGame();
		var gameRunner =  new GameRunner(marioGame);
		var pacManGame = new PacManGame();
		var pacmanRunner =  new GameRunner(pacManGame);
		pacmanRunner.run();

	}

}
