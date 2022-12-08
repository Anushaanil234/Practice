package com.springboot.learnspringboot;



import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyConfigurationController {

	private CurrencyServiceconfiguration configuration;
	
	@RequestMapping("/currency-configuration")
	public CurrencyServiceconfiguration retrieveAllcourses(){
		return  configuration;
		
}
}