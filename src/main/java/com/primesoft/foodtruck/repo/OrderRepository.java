package com.primesoft.foodtruck.repo;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.primesoft.foodtruck.entity.Order;

@Repository
public interface OrderRepository  extends JpaRepository<Order,Integer> {
	
	Order findById(int id);


	@Override
	default <S extends Order> S save(S entity) {
		
		return null;
	}


	

	
	
	

}
