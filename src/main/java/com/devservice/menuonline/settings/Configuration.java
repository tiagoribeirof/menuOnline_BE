package com.devservice.menuonline.settings;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {
		"com.devservice.menuonline"	
})
public class Configuration {

	public static void main(String[] args) {
		SpringApplication.run(Configuration.class, args);
	}

}
