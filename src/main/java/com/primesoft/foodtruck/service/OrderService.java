package com.primesoft.foodtruck.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.primesoft.foodtruck.entity.Order;

@Service
public interface OrderService {

	
	public boolean saveOrder(Order ord);
	
	public List<Order> getOrder();
}
