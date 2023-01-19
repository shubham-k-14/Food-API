package com.api.foodrecipies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
//(exclude = {DataSourceAutoConfiguration.class})
public class FoodRecipesApplication {

	public static void main(String[] args) {
		SpringApplication.run(FoodRecipesApplication.class, args);
		System.out.println("food api starting");
				
	}

}
