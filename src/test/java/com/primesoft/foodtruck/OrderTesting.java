package com.primesoft.foodtruck;



import org.junit.Assert;
import org.junit.Assert.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.primesoft.foodtruck.entity.Order;
import com.primesoft.foodtruck.service.OrderServiceImpl;

class OrderTesting {
	
	//@Autowired
     OrderServiceImpl ser;

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
		
		
		ser.saveOrder(ord);
		
		
		Assert.assertEquals("VegPulao",ord.getItem());
		System.out.println("success");
		
		
	}
/*	
	@Test
	public void getOrderTest() {
		
		Order ord= new Order();
		
		
		ord= ser.find(1);
		
		Assert.assertTrue("Rice",true);
	}
*/
}
