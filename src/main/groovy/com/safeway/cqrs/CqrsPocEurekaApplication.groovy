package com.safeway.cqrs

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@EnableEurekaServer
@SpringBootApplication
class CqrsPocEurekaApplication {

	static void main(String[] args) {
		SpringApplication.run CqrsPocEurekaApplication, args
	}
}
