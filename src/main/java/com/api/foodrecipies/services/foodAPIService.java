package com.api.foodrecipies.services;

import java.util.List;

import com.api.foodrecipies.exceptions.InvalidFoodItemException;
import com.api.foodrecipies.models.foodItems;

public interface foodAPIService {
	
	
	public abstract foodItems addFoodItem(foodItems f);

	public abstract List<foodItems> getAllFoodItems();

	public abstract List<foodItems> addAllFoodItems(List<foodItems> foodItemList);

	public abstract List<foodItems> getFoodItemsBy3Ingredients(String item1,String item2,String item3) throws InvalidFoodItemException;

	public abstract List<foodItems> getFoodItemsBy2Ingredients(String item1,String item2) throws InvalidFoodItemException;

	public abstract List<foodItems> getFoodItemsBy1Ingredients(String item1) throws InvalidFoodItemException;

	public abstract foodItems updateFoodItem(foodItems foodItem);

	

}
