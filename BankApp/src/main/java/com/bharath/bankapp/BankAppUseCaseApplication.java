package com.bharath.bankapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class BankAppUseCaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankAppUseCaseApplication.class, args);
	}

}
