package com.mdr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class MadereraPrediosApplication {

	
	
	public static void main(String[] args) {
		SpringApplication.run(MadereraPrediosApplication.class, args);
	}

}
