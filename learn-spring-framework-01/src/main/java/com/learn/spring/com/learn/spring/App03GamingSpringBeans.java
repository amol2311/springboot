package com.learn.spring.com.learn.spring;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.learn.spring.com.learn.spring.game.GameRunner;
import com.learn.spring.com.learn.spring.game.GamingConsole;
import com.learn.spring.com.learn.spring.game.MarioGame;
import com.learn.spring.com.learn.spring.game.PacManGame;
import com.learn.spring.com.learn.spring.game.SuperContraGame;
import com.learn.spring.com.learn.spring.game.config.GamingConfiguration;

public class App03GamingSpringBeans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)) {
			context.getBean(GamingConsole.class).up();
			context.getBean(GameRunner.class).run();
			
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
