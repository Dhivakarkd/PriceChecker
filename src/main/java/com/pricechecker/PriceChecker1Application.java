package com.pricechecker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@SpringBootApplication
public class PriceChecker1Application {

	public static void main(String[] args) {
		SpringApplication.run(PriceChecker1Application.class, args);
	}
	

}
