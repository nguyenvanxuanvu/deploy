package com.example.pay2park;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;



@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class Pay2parkApplication {

	public static void main(String[] args) {
		SpringApplication.run(Pay2parkApplication.class, args);
	}

}
