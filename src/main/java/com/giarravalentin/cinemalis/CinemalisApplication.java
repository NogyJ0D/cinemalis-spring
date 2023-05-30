package com.giarravalentin.cinemalis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;

@SpringBootApplication(exclude = {MongoAutoConfiguration.class}) // Quitar esto cuando use mongo
public class CinemalisApplication {

	public static void main(String[] args) {
		System.out.println();
		SpringApplication.run(CinemalisApplication.class, args);
	}

}
