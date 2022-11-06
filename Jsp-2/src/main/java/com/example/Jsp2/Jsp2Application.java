package com.example.Jsp2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import repo.EmpRepository;

@SpringBootApplication
@EnableJpaRepositories
public class Jsp2Application {

	public static void main(String[] args) {
		SpringApplication.run(Jsp2Application.class, args);
	}
	
}
