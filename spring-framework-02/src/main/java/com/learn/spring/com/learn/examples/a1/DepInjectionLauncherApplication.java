package com.learn.spring.com.learn.examples.a1;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


@Component
class YourBusinessClass {
	
	//Filed injection
	//@Autowired
	Dependency1 dependency1;
	
	//@Autowired
	Dependency2 dependency2;
	
	public String toString() {
		return "Using "+dependency1+" and "+dependency2;
	}

	public YourBusinessClass(Dependency1 dependency1, Dependency2 dependency2) {
		super();
		this.dependency1 = dependency1;
		this.dependency2 = dependency2;
	}
	
	/* 
	 * Setter injection
	 *
	 */
	/*
	 * @Autowired public void setDependency1(Dependency1 dependency1) {
	 * System.out.println("calling setter injection"); this.dependency1=dependency1;
	 * 
	 * }
	 * 
	 * @Autowired public void setDependency2(Dependency2 dependency2) {
	 * System.out.println("calling setter injection"); this.dependency2=dependency2;
	 * 
	 * }
	 */
	
	/*
	 * Constructor injection
	 */
	
	
	
	
}

@Component
class Dependency1{
	
}

@Component
class Dependency2{
	
}

@Configuration
@ComponentScan
public class DepInjectionLauncherApplication {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (var context = new AnnotationConfigApplicationContext(DepInjectionLauncherApplication.class)) {
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			System.out.println(context.getBean(YourBusinessClass.class));
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
