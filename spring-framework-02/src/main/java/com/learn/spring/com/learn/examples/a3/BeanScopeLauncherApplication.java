package com.learn.spring.com.learn.examples.a3;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.learn.spring.com.learn.spring.game.GameRunner;
import com.learn.spring.com.learn.spring.game.GamingConsole;


@Component
class NormalClass{
	
}

@Component
@Scope(value="prototype")
class ProtoTypeClass{
	
	
}

@Configuration
@ComponentScan
public class BeanScopeLauncherApplication {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (var context = new AnnotationConfigApplicationContext(BeanScopeLauncherApplication.class)) {
			System.out.println(context.getBean(NormalClass.class));
			System.out.println(context.getBean(NormalClass.class));
			System.out.println(context.getBean(NormalClass.class));
			
			System.out.println(context.getBean(ProtoTypeClass.class));
			System.out.println(context.getBean(ProtoTypeClass.class));
			System.out.println(context.getBean(ProtoTypeClass.class));
			
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
