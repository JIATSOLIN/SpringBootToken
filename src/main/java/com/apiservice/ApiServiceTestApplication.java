package com.apiservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class ApiServiceTestApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(ApiServiceTestApplication.class, args);
	}
	
	 @Override
	 protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	        return application.sources(ApiServiceTestApplication.class);
	 }
}
