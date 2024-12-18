package com.learn.spring.com.learn.examples.h1;

import java.util.Arrays;

import org.springframework.beans.BeansException;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.learn.spring.com.learn.spring.game.GameRunner;

@Component
class TestingBean{
	
}

public class XMLConfigContextLauncherApplication {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (var context = new ClassPathXmlApplicationContext("context-config.xml")) {
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			System.out.println(context.getBean("name"));
			context.getBean(GameRunner.class).run();
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
