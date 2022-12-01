package com.primesoft.foodtruck.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="orders",schema="food_truck")
public class Order implements Serializable {
	
private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
	
	@Column(name="item")
	private String item;
	
	@Column(name="quantity")
	private float quantity;
	
	@Column(name="additeam")
	private String additionalIteam;
	
	@Column(name="offer")
	private float offer;
	
	@Column(name="deliverytime")
	private int deliveryTime;
	
	@Column(name="filter")
	private String filter;
	
	@Column(name="coupon")
	private String coupon;
	
	@Column(name="price")
	private float price;
	
	
	
	public Order() {
		
	}
	public Order(int id,String item, float quantity, String additionalIteam, float offer, String filter,
			String coupon, float price) {
		this.id=id;
		this.item = item;
		this.quantity = quantity;
		this.additionalIteam = additionalIteam;
		this.offer = offer;
		//this.deliveryTime = deliveryTime;
		this.filter = filter;
		this.coupon = coupon;
		this.price = price;
	}
	

	public int getId() {
		return  id;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public float getQuantity() {
		return quantity;
	}
	public void setQuantity(float quantity) {
		this.quantity = quantity;
	}
	public String getAdditionalItem() {
		return additionalIteam;
	}
	public void setAdditionalItem(String additionalIteam) {
		this.additionalIteam = additionalIteam;
	}
	public float getOffer() {
		return offer;
	}
	public void setOffer(float offer) {
		this.offer = offer;
	}
	public int getDeliveryTime() {
		return deliveryTime;
	}
	public void setDeliveryTime(int deliveryTime) {
		this.deliveryTime = deliveryTime;
	}
	public String getFilter() {
		return filter;
	}
	public void setFilter(String filter) {
		this.filter = filter;
	}
	public String getCoupon() {
		return coupon;
	}
	public void setCoupon(String coupon) {
		this.coupon = coupon;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", item=" + item + ", quantity=" + quantity + ", additionalIteam="
				+ additionalIteam + ", offer=" + offer + ", deliveryTime=" + deliveryTime + ", filter=" + filter
				+ ", coupon=" + coupon + ", price=" + price + "]";
	}
	
	
	

}
