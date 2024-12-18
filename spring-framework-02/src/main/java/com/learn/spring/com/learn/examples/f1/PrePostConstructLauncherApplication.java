package com.learn.spring.com.learn.examples.f1;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.learn.spring.com.learn.spring.game.GameRunner;
import com.learn.spring.com.learn.spring.game.GamingConsole;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
class SomeClass{
	
	private SomeDependency someDependency;
	
	public SomeClass(SomeDependency someDependency) {
		super();
		this.someDependency = someDependency;
		System.out.println("in construction injection.....");
	}
	
	@PostConstruct
	public void init() {
		someDependency.getReady();
	}
	
	@PreDestroy
	public void cleanup() {
		someDependency.clean();
		
	}
	
}

@Component
class SomeDependency{

	
	public void getReady() {
		// TODO Auto-generated method stub
		System.out.println("calling PostConstructor.....");
	}

	public void clean() {
		// TODO Auto-generated method stub
		System.out.println("calling PreDestroy.....");
	}
	
	
	
}

@Configuration
@ComponentScan
public class PrePostConstructLauncherApplication {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (var context = new AnnotationConfigApplicationContext(PrePostConstructLauncherApplication.class)) {
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
