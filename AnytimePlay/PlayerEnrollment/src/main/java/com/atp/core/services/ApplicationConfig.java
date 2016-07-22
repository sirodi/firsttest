package com.atp.core.services;

import javax.inject.Named;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

import org.glassfish.jersey.server.ResourceConfig;

import org.springframework.web.client.RestTemplate;

@Configuration
public class ApplicationConfig {
	
	@Named
	static class JerseyConfig extends ResourceConfig {
		public JerseyConfig() {
			this.packages("com.atp.core.services.rest");
		}
	}
	
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

}
