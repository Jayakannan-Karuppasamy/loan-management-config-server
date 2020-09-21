package com.scb.loan.managment.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class LoanManagementConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoanManagementConfigServerApplication.class, args);
	}

}
