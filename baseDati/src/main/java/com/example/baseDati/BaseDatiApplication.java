package com.example.baseDati;

import jakarta.persistence.Entity;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan(basePackages = "com.example.baseDati.Student")
@EnableJpaRepositories(basePackages = "com.example.baseDati.Student")
@SpringBootApplication
public class BaseDatiApplication {

	public static void main(String[] args) {
		SpringApplication.run(BaseDatiApplication.class, args);
	}

}
