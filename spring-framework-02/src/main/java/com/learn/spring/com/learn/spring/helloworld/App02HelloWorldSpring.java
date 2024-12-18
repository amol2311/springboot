package com.learn.spring.com.learn.spring.helloworld;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App02HelloWorldSpring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Launch Spring context
		
		try (var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)) {
			//Configure things that spring manage
			System.out.println(context.getBean("name"));
			
			System.out.println(context.getBean("age"));
			
			System.out.println(context.getBean("person"));
			
			System.out.println(context.getBean("address2"));
			
			System.out.println(context.getBean("person2MethodCall"));

			//person3Parameters
			System.out.println(context.getBean("person3Parameters"));
			
			//org.springframework.beans.factory.NoSuchBeanDefinitionException:
			System.out.println(context.getBean(Address.class));
			System.out.println("all beans below::::");
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
