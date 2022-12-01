package com.primesoft.foodtruck;



import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.primesoft.foodtruck.entity.Order;
import com.primesoft.foodtruck.repo.OrderRepository;
import com.primesoft.foodtruck.service.OrderServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest
class OrderTesting {
	
	@Autowired
	private OrderServiceImpl service;
	
	
	@MockBean
	private OrderRepository repo;
	

	

	@Test
	public void getOrderTest() {
		when(repo.findAll()).thenReturn((List<Order>) Stream.of(new Order(5,"VegPulao",2.5f,"curd",8.0f,"7766gg","AHI67",70.9f)));
	
	
	assertEquals(1,service.getOrder().size());
	
	}
	
/*
	@Test
	void saveOrderTest(){
		
		Order ord= new Order();
		
		 ord.setItem("VegPulao");
		 ord.setQuantity(2.5f);
		 ord.setAdditionalItem("curd");
		 ord.setOffer(8.0f);
		 ord.setDeliveryTime(3);
		 ord.setFilter("7766gg");
		 ord.setCoupon("AHI67");
		 ord.setPrice(70.9f);
		
		
	
		
		assertEquals("VegPulao",ord.getItem());
		System.out.println("success");
		
	}
*/
}
