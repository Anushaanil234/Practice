package com.springboot.learnspringboot;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix="currency-service")
@Component
public class CurrencyServiceconfiguration {

	private String url;
	private String username;
	private String key;
	
	public void setUrl(String url) {
		this.url = url;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public void setKey(String key) {
		this.key = key;
	}
	
	
	
	
}
