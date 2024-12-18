package com.learn.spring.com.learn.examples.a0;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan
public class SimpleSpringContextLauncherApplication {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (var context = new AnnotationConfigApplicationContext(SimpleSpringContextLauncherApplication.class)) {
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
