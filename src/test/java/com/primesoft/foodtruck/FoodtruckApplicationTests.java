package com.primesoft.foodtruck;





import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.List;
import java.util.stream.Stream;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.primesoft.foodtruck.controller.OrderController;
import com.primesoft.foodtruck.entity.Order;
import com.primesoft.foodtruck.repo.OrderRepository;
import com.primesoft.foodtruck.service.OrderServiceImpl;


@SpringBootTest
class FoodtruckApplicationTests {
	
	@Autowired
	private OrderServiceImpl service;
	
	
	@MockBean
	private OrderRepository repo;
	

	@Test
	public void getOrderTest() {
		when(repo.findAll()).thenReturn((List<Order>) Stream.of(new Order(5,"VegPulao",2.5f,"curd",8.0f,"7766gg","AHI67",70.9f)));
	
	
	assertEquals(1,service.getOrder().size());
	
	}

}
