package com.api.foodrecipies.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;

import com.api.foodrecipies.exceptions.InvalidFoodItemException;
import com.api.foodrecipies.models.foodItems;
import com.api.foodrecipies.services.foodAPIService;


@RestController
@RequestMapping("food")
public class foodAPIController {
	
	@Autowired
	foodAPIService fs;	
	
	
@PostMapping(value="/add-food-item")	
public ResponseEntity<foodItems> addFoodItem(@RequestBody foodItems foodItem) {
	foodItem = fs.addFoodItem(foodItem);
			ResponseEntity<foodItems> rc= new ResponseEntity<>(foodItem,HttpStatus.OK);
			return rc;
		
		}


@GetMapping(value="get-all-food-items")
public ResponseEntity getAllFoodItems(){		
	System.out.println("inside controller");
	List <foodItems> foodItems = fs.getAllFoodItems();
	ResponseEntity<List<foodItems>>  rc= new ResponseEntity<List<foodItems>>(foodItems,HttpStatus.OK);
	return rc;
}
	

			
			@PutMapping("update-food-item")
			public ResponseEntity updateFoodItem(@RequestBody foodItems foodItem) {
					foodItem = fs.updateFoodItem(foodItem);
					ResponseEntity<foodItems> rc= new ResponseEntity<foodItems>(foodItem,HttpStatus.OK);
					return rc;	
			}
			
			
			
			@PostMapping(value="/add-all-food-item")	
			public ResponseEntity<List<foodItems>> addAllFoodItem(@RequestBody List<foodItems> foodItemList) {
				foodItemList = fs.addAllFoodItems(foodItemList);
				ResponseEntity<List<foodItems>>  rc= new ResponseEntity<List<foodItems>>(foodItemList,HttpStatus.OK);
				return rc;				
			}
			

			
			@GetMapping(value="get-food-items-by-3-ingredients/{item1}/{item2}/{item3}")
			public ResponseEntity getFoodItemsBy3Ingredients(@PathVariable("item1") String item1,@PathVariable("item2") String item2,@PathVariable("item3") String item3){		
				try {
					List <foodItems> foodItems = fs.getFoodItemsBy3Ingredients(item1,item2,item3);
					ResponseEntity<List<foodItems>>  rc= new ResponseEntity<List<foodItems>>(foodItems,HttpStatus.OK);
					return rc;
					}
					
					catch (InvalidFoodItemException e) {
						ResponseEntity<String> rs= new ResponseEntity<String>(e.getMessage(),HttpStatus.NOT_FOUND);
						return rs;
					}
			}

			
			@GetMapping(value="get-food-items-by-2-ingredients/{item1}/{item2}")
			public ResponseEntity getFoodItemsBy2Ingredients(@PathVariable("item1") String item1,@PathVariable("item2") String item2){		
				try {
					List <foodItems> foodItems = fs.getFoodItemsBy2Ingredients(item1,item2);
					ResponseEntity<List<foodItems>>  rc= new ResponseEntity<List<foodItems>>(foodItems,HttpStatus.OK);
					return rc;
					}
					
					catch (InvalidFoodItemException e) {
						ResponseEntity<String> rs= new ResponseEntity<String>(e.getMessage(),HttpStatus.NOT_FOUND);
						return rs;
					}
			}

			
			
			@GetMapping(value="get-food-items-by-1-ingredients/{item1}")
			public ResponseEntity getFoodItemsBy1Ingredients(@PathVariable("item1") String item1){	
				try {
				List <foodItems> foodItems = fs.getFoodItemsBy1Ingredients(item1);
				ResponseEntity<List<foodItems>>  rc= new ResponseEntity<List<foodItems>>(foodItems,HttpStatus.OK);
				return rc;
				}
				
				catch (InvalidFoodItemException e) {
					ResponseEntity<String> rs= new ResponseEntity<String>(e.getMessage(),HttpStatus.NOT_FOUND);
					return rs;
				}
				
				
			}
			
			

	

		
}












		
	
	
	
	
	
	

