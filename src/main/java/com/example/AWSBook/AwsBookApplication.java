package com.example.AWSBook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class AwsBookApplication {

	public static void main(String[] args) {
		SpringApplication.run(AwsBookApplication.class, args);
	}

}
