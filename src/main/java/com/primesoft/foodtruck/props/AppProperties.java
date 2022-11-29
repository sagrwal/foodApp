package com.primesoft.foodtruck.props;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

@Data
@EnableConfigurationProperties
@ConfigurationProperties(prefix ="plan-api")
@Configuration
public class AppProperties {
	
	private Map<String, String> messages = new HashMap();

	public Map<String, String> getMessages() {
		
		System.out.println("In App"+messages+"hapy");
		return messages;
	}

	public void setMessages(Map<String, String> messages) {
		this.messages = messages;
		System.out.println("In App"+messages+"hapy");
	}

}
