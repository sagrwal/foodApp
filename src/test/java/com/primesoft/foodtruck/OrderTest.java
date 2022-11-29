package com.primesoft.foodtruck;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import com.primesoft.foodtruck.controller.OrderController;
import com.primesoft.foodtruck.entity.Order;

class OrderTest {
	
	OrderController con=new OrderController();
	

/*	
	@Test
	public void test() {
		OrderController orc= new OrderController();
		
		assertEquals("Rice",orc.getOrder(1).getItem());
		
	}
	*/
	
	
	
	@Test
	void saveOrderTest() {
		
		Order ord= new Order();
		
		 ord.setItem("VegPulao");
		 ord.setQuantity(2.5f);
		 ord.setAdditionalItem("curd");
		 ord.setOffer(8.0f);
		 ord.setDeliveryTime(3);
		 ord.setFilter("7766gg");
		 ord.setCoupon("AHI67");
		 ord.setPrice(70.9f);
		
		
		con.addOrder(ord);
		
		
		Assert.assertEquals("VegPulao",ord.getItem());
		System.out.println("success");
		
		
	}


   
}
