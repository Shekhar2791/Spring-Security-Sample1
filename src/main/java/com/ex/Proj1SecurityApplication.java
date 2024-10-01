package com.ex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
@EntityScan("com.ex.entity")
public class Proj1SecurityApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(Proj1SecurityApplication.class, args);
	}

}
