package com.primesoft.foodtruck.dao;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.primesoft.foodtruck.constant.AppConstant;
import com.primesoft.foodtruck.entity.Order;
import com.primesoft.foodtruck.exception.AddOrderException;
import com.primesoft.foodtruck.exception.DeleteOrderException;
import com.primesoft.foodtruck.exception.OrderNotFoundException;
import com.primesoft.foodtruck.props.AppProperties;
import com.primesoft.foodtruck.repo.MenuRepository;
import com.primesoft.foodtruck.repo.OrderRepository;

import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;


@Component
@Service
@Transactional
public class OrderDAOImpl  implements OrderDAO {
	
	Logger logger = LoggerFactory.getLogger(OrderDAOImpl.class);
	private Map<String, String> messages;
	
	@Autowired
    OrderRepository ordrepo;
	
	@Autowired
	MenuRepository menurepo;
	
	/*
	public OrderDAOImpl() {
		super();
		}
	*/
	
	
	public OrderDAOImpl(OrderRepository ordrepo,MenuRepository menrepo,AppProperties prop) {
		
		this.ordrepo = ordrepo;
		this.menurepo= menrepo;
		//this.messages=prop.setMessages();
	}

	 public List<Order> getOrders() throws OrderNotFoundException{
	    	String msg=AppConstant.EMPTY_STR;
			 try{   msg=AppConstant.ORD_FOUND_SUCC;
					logger.error(msg);
				 return ordrepo.findAll();
			 }catch(Exception e) {
				    msg=AppConstant.ORD_FOUND_FAIL;
					logger.error(msg);
				 throw new OrderNotFoundException(e.getMessage() + ": Error in getting all employess");
			 }
			
		}


	@Override
	public Order getOrder(int id)throws EntityNotFoundException {
		String msg=AppConstant.EMPTY_STR;
		try {
			if(ordrepo.existsById(id)) {
				msg=AppConstant.ORD_FOUND_SUCC;
				logger.error(msg);
		        return ordrepo.findById(id);
			}else {
				msg=AppConstant.ORD_FOUND_FAIL;
				logger.error(msg);
				return null;
			}
		}catch(Exception e) {
				msg=AppConstant.ORD_FOUND_FAIL;
				logger.error(msg);
				throw new EntityNotFoundException(e.getLocalizedMessage()+msg);
			}
	}

	@Override
	public Order addOrders(Order ord)throws AddOrderException {
		String msg=AppConstant.EMPTY_STR;
		try {
		ordrepo.save(ord);
		msg=messages.get(AppConstant.ORD_SAVE_SUCC);
    	logger.info(msg);
    	
		return ord;
	}catch(Exception e) {
    	msg=messages.get(AppConstant.ORD_SAVE_FAIL);
    	logger.error(msg);
    	throw new AddOrderException(e.getLocalizedMessage()+msg);
    }
	}
	
	
	
	@Override
	public void deleteById(int id) throws DeleteOrderException{
		String msg=AppConstant.EMPTY_STR;
		try {
			if(ordrepo.existsById(id)) {
				ordrepo.deleteById(id);
				msg=AppConstant.ORD_DELETE_SUCC;
				logger.info(msg);
				
			}else {
				msg=AppConstant.ORD_FOUND_FAIL;
				logger.info(msg);
				
			}
		}catch(Exception e) {
			msg =AppConstant.ORD_DELETE_FAIL;
			logger.error(msg);
			throw new DeleteOrderException (e.getLocalizedMessage()+msg);
			
		}
	}
	
	
	/*
	@Override
	public List<Menu> getMenuIDByName(String name) throws MenuException {
		String msg=AppConstant.EMPTY_STR;
		try {
			
			List<Menu> ids = menurepo.getMenuIDByName(name);
			if (ids != null)
				return ids;
			else
				msg = "Item name is Invalid!";
			logger.info(msg);
			return null;
		} catch (Exception e) {
			logger.error(e.getMessage() + ": Error in getMenuIDByName()");
			throw new MenuException(e.getMessage() + ": Error in getMenuIDByName()");
		}

	}

	

*/
}
