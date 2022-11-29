package com.primesoft.foodtruck;





import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.primesoft.foodtruck.controller.OrderController;


@SpringBootTest
class FoodtruckApplicationTests {

	
	@Test
	public void test() {
		OrderController orc= new OrderController();
		
		assertEquals("Rice",orc.getOrder(1).getItem());
		
	}
	

}
