package com.learn.spring.com.learn.spring.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PacManGame implements GamingConsole{

	
	public void up() {
		// TODO Auto-generated method stub
		System.out.println("UP");
	}


	public void down() {
		// TODO Auto-generated method stub
		System.out.println("DOWN");
	}

	public void left() {
		// TODO Auto-generated method stub
		System.out.println("LEFT");
	}

	
	public void right() {
		// TODO Auto-generated method stub
		System.out.println("RIGHT");
	}

}
