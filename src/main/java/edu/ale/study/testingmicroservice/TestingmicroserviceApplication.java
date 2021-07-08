package edu.ale.study.testingmicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class TestingmicroserviceApplication {

	//starting server eureka
	public static void main(String[] args) {
		SpringApplication.run(TestingmicroserviceApplication.class, args);
	}

}
