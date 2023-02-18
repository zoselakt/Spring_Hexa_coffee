package com.cafeApp.coffeineOrder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CoffeineOrderApplication {

	public static void main(String[] args) {
		Coffee coffee= new Coffee("연습");
		System.out.println(coffee.getName());
	}
}
