package com.learn.spring.com.learn.spring;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.learn.spring.com.learn.spring.game.GameRunner;
import com.learn.spring.com.learn.spring.game.GamingConsole;



@Configuration
@ComponentScan("com.learn.spring.com.learn.spring.game")
public class GamingAppLauncherApplication {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (var context = new AnnotationConfigApplicationContext(GamingAppLauncherApplication.class)) {
			context.getBean(GamingConsole.class).up();
			context.getBean(GameRunner.class).run();
			
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
