package com.primesoft.foodtruck;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;


@SpringBootApplication(scanBasePackages = {"com.primesoft.foodtruck"})
public class FoodtruckApplication {

	public static void main(String[] args) {
		SpringApplication.run(FoodtruckApplication.class, args);
	}

}
