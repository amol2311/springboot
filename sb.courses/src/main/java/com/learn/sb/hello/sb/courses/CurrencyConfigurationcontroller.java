package com.learn.sb.hello.sb.courses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyConfigurationcontroller {

	@Autowired
	private CurrencyServiceConfiguration currencyService;
	
	@RequestMapping("/currency-config")
	public CurrencyServiceConfiguration getCurrencyConfig() {
		return currencyService;
	}
	
	
}
