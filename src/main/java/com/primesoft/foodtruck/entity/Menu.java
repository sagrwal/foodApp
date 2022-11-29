package com.primesoft.foodtruck.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



@Entity
@Table(name="menu",schema="food_truck")
public class Menu implements Serializable {
	
	
	private static final long serialVersionUID = 1L;  
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="truckname")
	private String foodTruckName;
	
	@Column(name="item")
	private String items;
	
	@Column(name="price")
	private float price;
	
	@Column(name="offer")
	private float offer;
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	
	public String getFoodTruckName() {
		return foodTruckName;
	}
	public void setFoodTruckName(String foodTruckName) {
		this.foodTruckName = foodTruckName;
	}
	public String getItems() {
		return items;
	}
	public void setItems(String items) {
		this.items = items;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public float getOffer() {
		return offer;
	}
	public void setOffer(float offer) {
		this.offer = offer;
	}
	public int getId() {
		return id;
	}
	@Override
	public String toString() {
		return "Menu [id=" + id + ", foodTruckName=" + foodTruckName + ", iteams=" + items + ", price=" + price
				+ ", offer=" + offer + "]";
	}
	
	
	
	
	

}
