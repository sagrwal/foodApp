package com.primesoft.foodtruck.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.primesoft.foodtruck.dao.OrderDAOImpl;
import com.primesoft.foodtruck.entity.Order;

@RestController
public class OrderController {
	
	

	@Autowired
	private OrderDAOImpl ordDao;
	
	
	
	public OrderController() {
		super();
		
	}




	public OrderController(OrderDAOImpl ord) {
		
		this.ordDao = ord;
	}
	
	
	
	
	@GetMapping("/o")
	public List<Order> retriveAllOrders(){
		return ordDao.getOrders();
		
	}
	
	@GetMapping("/ord/{id}")
	public Order getOrder(@PathVariable int id){
		 return ordDao.getOrder(id);
		 
		
	}
	
	@PostMapping("/ords")
	public Order addOrder(@RequestBody Order or) {
		return ordDao.addOrders(or);
	}
	
	@DeleteMapping("/order/{id}")
	public void deleteOrder(@PathVariable int id) {
	     ordDao.deleteById(id);
	}
	
	

}
