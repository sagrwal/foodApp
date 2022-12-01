package com.primesoft.foodtruck;

import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;

import com.primesoft.foodtruck.controller.OrderController;
import com.primesoft.foodtruck.dao.OrderDAOImpl;
import com.primesoft.foodtruck.entity.Order;
import com.primesoft.foodtruck.repo.OrderRepository;

@ExtendWith(MockitoExtension.class)
class OrderTest {
	
	 @InjectMocks
	OrderController con=new OrderController();
	
	 @Mock
    OrderDAOImpl ordDao;
	 
	 
	 @Autowired
     OrderRepository ordrepo;
	


	@Test
	public void test() {
		OrderController orc= new OrderController();
		List<Order> Order;
		Order o= ordDao.getOrder(1);
		Order= ordrepo.findAll();
		
		
		
		Assert.assertEquals("Rice",o.getItem());
		
	}
	
	
	
/*	
	@Test
	void saveOrderTest() throws Exception{
		
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

*/
   
}
