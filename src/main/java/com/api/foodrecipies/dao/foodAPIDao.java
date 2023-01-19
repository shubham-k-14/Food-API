package com.api.foodrecipies.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.api.foodrecipies.models.foodItems;


@Repository
public interface foodAPIDao extends JpaRepository<foodItems, Long> {
	
	@Query(value="select * from food_items f WHERE f.ingredients LIKE %:item1%",nativeQuery = true)
	public List<foodItems> getFoodItemsBy1Ingredients(@Param("item1") String item1);
	
	@Query(value="select  * from food_items f WHERE f.ingredients LIKE %:item1% AND f.ingredients LIKE %:item2%",nativeQuery = true)
	public List<foodItems> getFoodItemsBy2Ingredients(@Param("item1") String item1 ,@Param("item2") String item2);
	
	@Query(value="select * from food_items f WHERE f.ingredients LIKE %:item1% AND f.ingredients LIKE %:item2% AND f.ingredients LIKE %:item3%",nativeQuery = true)
	public List<foodItems> getFoodItemsBy3Ingredients(@Param("item1") String item1 ,@Param("item2") String item2 ,@Param("item3") String item3);
	
	
	
	

}
