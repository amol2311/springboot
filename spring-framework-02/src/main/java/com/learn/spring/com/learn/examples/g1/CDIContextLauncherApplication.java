package com.learn.spring.com.learn.examples.g1;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import jakarta.inject.Inject;
import jakarta.inject.Named;


@Named
class BusinessService{
	
	private DataService dataService;
	
	@Inject
	public void setDataService(DataService dataService) {
		this.dataService = dataService;
	}
	
	public DataService getDataService() {
		return dataService;
	}
	
	
}


@Named
class DataService{
	
}


@Configuration
@ComponentScan
public class CDIContextLauncherApplication {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (var context = new AnnotationConfigApplicationContext(CDIContextLauncherApplication.class)) {
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			System.out.println(context.getBean(BusinessService.class).getDataService());
			//context.getBean(BusinessService.class).getDataService();
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
