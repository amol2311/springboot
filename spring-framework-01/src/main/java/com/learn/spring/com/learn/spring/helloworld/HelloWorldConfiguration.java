package com.learn.spring.com.learn.spring.helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


record Person (String name, int age, Address address) { };

record Address ( String addressLine, String city) {};

@Configuration
public class HelloWorldConfiguration {
	
	@Bean
	public String name() {
		return "Test";
	}
	@Bean
	public int age() {
		return 15;
	}

	@Bean
	public Person person() {
		return new Person("abc",23,new Address("test 1 dr","DFW"));
	}
	
	//method call
	@Bean
	public Person person2MethodCall() {
		return new Person(name(),age(),address());
	}
	
	//Parameters
	@Bean
	public Person person3Parameters(String name,  int age, Address address3) { // name , age, address2
		return new Person(name,age,address3);
	}
	
	@Bean(name="address2")
	public Address address() {
		return new Address("test dr", "Dallas");
	}
	
	@Bean(name="address3")
	@Primary
	public Address address3() {
		return new Address("test dr3", "Dallas3");
	}
}
