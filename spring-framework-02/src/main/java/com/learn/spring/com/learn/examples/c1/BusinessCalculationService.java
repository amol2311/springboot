package com.learn.spring.com.learn.examples.c1;

import java.util.Arrays;

import org.springframework.stereotype.Component;

@Component
public class BusinessCalculationService {
	
	DataService dataService;

	public BusinessCalculationService(DataService dataService) {
		super();
		this.dataService = dataService;
	}

	public int findMax() {
		return Arrays.stream(dataService.retrieveData()).max().orElse(0);
	}
	
	

}
