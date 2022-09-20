package com.contact;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
public class ContactDetailsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContactDetailsApplication.class, args);
	}

}
