package com.api.foodrecipies.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.foodrecipies.dao.foodAPIDao;
import com.api.foodrecipies.exceptions.InvalidFoodItemException;
import com.api.foodrecipies.models.foodItems;

@Service
public class foodAPIServiceImpl implements foodAPIService {
	
	@Autowired
	foodAPIDao fd;

	@Override
	public foodItems addFoodItem(foodItems f) {
		
	  return fd.save(f);
		
	}

	@Override
	public List<foodItems> getAllFoodItems() {
		return fd.findAll();
	}

	@Override
	public List<foodItems> addAllFoodItems(List<foodItems> foodItemList) {
		fd.saveAll(foodItemList);
		return foodItemList;
	}

	

	@Override
	public List<foodItems> getFoodItemsBy1Ingredients(String item1)throws InvalidFoodItemException {
		List<foodItems> reqList = fd.getFoodItemsBy1Ingredients(item1);
		if(reqList==null || reqList.isEmpty())
			throw new InvalidFoodItemException("Oops! Looks like we dont have anything for you");
		
		else
		return reqList ;
	}

	@Override
	public List<foodItems> getFoodItemsBy2Ingredients(String item1,String item2) throws InvalidFoodItemException {
		List<foodItems> reqList = fd.getFoodItemsBy2Ingredients(item1,item2);
		if(reqList==null || reqList.isEmpty())
			throw new InvalidFoodItemException("Oops! Looks like we dont have anything for you");
		
		else
		return reqList ;
	}

	@Override
	public List<foodItems> getFoodItemsBy3Ingredients(String item1,String item2 ,String item3) throws InvalidFoodItemException {
		List<foodItems> reqList = fd.getFoodItemsBy3Ingredients(item1,item2,item3);
		if(reqList==null || reqList.isEmpty())
			throw new InvalidFoodItemException("Oops! Looks like we dont have anything for you");
		
		else
		return reqList ;
	}

	@Override
	public foodItems updateFoodItem(foodItems foodItem) {
		// TODO Auto-generated method stub
		return null;
	}

}
