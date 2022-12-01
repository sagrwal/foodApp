package com.primesoft.foodtruck.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.primesoft.foodtruck.dao.OrderDAO;
import com.primesoft.foodtruck.entity.Order;
import com.primesoft.foodtruck.service.OrderService;

@RestController
public class OrderController {
	
	private OrderService orderService;

	@Autowired
    private OrderDAO ordDao;
	
	
	
	
	public String addOrders(@ModelAttribute Order order) {
		this.orderService.saveOrder(order);
		return "home";
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
