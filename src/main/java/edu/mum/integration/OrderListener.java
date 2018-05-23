package edu.mum.integration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import edu.mum.domain.Order;

public class OrderListener {
	@Autowired 
	private ApplicationContext context;
	
	OrderGateway orderGateway;
	
	public void listen(Order order) {
		orderGateway = (OrderGateway) context.getBean("order");
		orderGateway.process(order);
	}
}
