package com.sathapana.application;

import com.sathapana.application.model.Restaurant;
import com.sathapana.application.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	private RestaurantService restaurantService;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		this.save();
	}


	private void save(){
		for (int i = 0 ; i < 100 ;  i++){
			Restaurant restaurant = new Restaurant();
			restaurant.setName("name"+i);
			restaurant.setNameEn("nameEn"+i);
			restaurant.setDes("des"+i);
			restaurant.setDesEn("desEn"+i);
			System.out.print("run .... "+i+" .....");
			restaurantService.insert(restaurant);
		}
	}



}
