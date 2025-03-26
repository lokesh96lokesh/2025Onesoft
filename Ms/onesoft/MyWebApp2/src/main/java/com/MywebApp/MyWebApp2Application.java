package com.MywebApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class MyWebApp2Application {

	public static void main(String[] args) {
		SpringApplication.run(MyWebApp2Application.class, args);
	}
	
	@Bean
	public RestTemplate rest() {
		return new RestTemplate();
	}


}
