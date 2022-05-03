package com.example.paybackcoupons;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "controller")
@ComponentScan(basePackages = "service")
@EnableJpaRepositories(basePackages="repositories")
@EntityScan("data")   

public class PaybackCouponsApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaybackCouponsApplication.class, args);
	}

}
