package com.learn.spring.com.learn.examples.c1;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;



@Configuration
@ComponentScan
public class FindMaxContextLauncherApplication {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (var context = new AnnotationConfigApplicationContext(FindMaxContextLauncherApplication.class)) {
			System.out.println("max::"+context.getBean(BusinessCalculationService.class).findMax());
			
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
