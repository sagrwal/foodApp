package com.primesoft.foodtruck.dao;

import java.awt.Menu;
import java.util.List;

import com.primesoft.foodtruck.entity.Order;

public interface OrderDAO {
	
	public List<Order> getOrders();

	public Order getOrder(int id);
	
	public Order addOrders(Order ord);
	
	public void deleteById(int id);

	//List<Menu> getMenuIDByName(String name);
	
	

}
