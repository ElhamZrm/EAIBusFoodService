package edu.mum.integration;

import org.springframework.integration.annotation.Gateway;

import edu.mum.domain.Order;

public interface OrderGateway {
	@Gateway(requestChannel = "processOrder")
	public void process(Order order);
}
