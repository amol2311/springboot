package com.learn.spring.com.learn.examples.a2;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import com.learn.spring.com.learn.spring.game.GameRunner;
import com.learn.spring.com.learn.spring.game.GamingConsole;


@Component
class A{
	
}

@Component
@Lazy
class B{
	private A a;
	
	public B(A a) {
		//it will not call until we use this bean commented in main method 
		System.out.println("initializing ......");
		this.a = a;
	}
	
	
}

@Configuration
@ComponentScan
public class LazyInitLauncherApplication {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (var context = new AnnotationConfigApplicationContext(LazyInitLauncherApplication.class)) {
			//System.out.println(context.getBean(B.class));
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
