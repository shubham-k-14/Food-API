package com.api.foodrecipies.models;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="food_items")
public class foodItems {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private String ingredients;
	private String diet;
	private String prep_time;
	private String cook_time;
	private String flavor_profile;
	private String course;
	private String state;
	private String region;
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIngredients() {
		return ingredients;
	}
	public void setIngredients(String ingredients) {
		this.ingredients = ingredients;
	}
	public String getDiet() {
		return diet;
	}
	public void setDiet(String diet) {
		this.diet = diet;
	}
	public String getPrep_time() {
		return prep_time;
	}
	public void setPrep_time(String prep_time) {
		this.prep_time = prep_time;
	}
	public String getCook_time() {
		return cook_time;
	}
	public void setCook_time(String cook_time) {
		this.cook_time = cook_time;
	}
	public String getFlavor_profile() {
		return flavor_profile;
	}
	public void setFlavor_profile(String flavor_profile) {
		this.flavor_profile = flavor_profile;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	@Override
	public String toString() {
		return "foodItems [name=" + name + ", ingredients=" + ingredients + ", diet=" + diet + ", prep_time="
				+ prep_time + ", cook_time=" + cook_time + ", flavor_profile=" + flavor_profile + ", course=" + course
				+ ", state=" + state + ", region=" + region + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
