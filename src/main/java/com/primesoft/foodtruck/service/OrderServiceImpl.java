package com.primesoft.foodtruck.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.primesoft.foodtruck.entity.Order;
import com.primesoft.foodtruck.repo.OrderRepository;

import jakarta.transaction.Transactional;

@Service
public abstract class OrderServiceImpl  implements OrderService {

	
 
  private OrderRepository ordrepo;
   
  @Autowired
  @Qualifier("orderRepository")
  public void setOrderRepository(OrderRepository orderRepository) {
	  this.ordrepo=orderRepository;
  }
	
	
	@Transactional
	public boolean saveOrder(Order ord) {
		
		  Order saved= ordrepo.save(ord);
	         
		
		return saved.getId() != 0;
	}
	
	
	public Order find(int id) {
		
		 return ordrepo.findById(id);
		
	}


	public List<Order> getOrder() {
		
		List<Order> ord=ordrepo.findAll();
		
		System.out.println("Getting data from DB:" + ord);
		return ord;
	}


	


	
	

}