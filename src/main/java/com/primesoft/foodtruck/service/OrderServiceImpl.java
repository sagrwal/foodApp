package com.primesoft.foodtruck.service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;

import com.primesoft.foodtruck.entity.Order;
import com.primesoft.foodtruck.repo.OrderRepository;

public abstract class OrderServiceImpl  implements OrderRepository {

	
 // @Autowired
  OrderRepository ordrepo;
	
	
	

	
	public OrderServiceImpl() {
	
}


	public OrderServiceImpl(OrderRepository ordrepo) {
	
	this.ordrepo = ordrepo;
}


	@Override
	public boolean saveOrder(Order ord) {
		
		  Order saved= ordrepo.save(ord);
	         
		
		return saved.getId() != 0;
	}
	
	
	public Order find(int id) {
		
		 return ordrepo.findById(id);
		
	}

}