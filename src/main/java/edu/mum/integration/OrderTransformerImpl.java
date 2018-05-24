package edu.mum.integration;

import org.springframework.integration.annotation.Transformer;

import edu.mum.domain.Order;

public class OrderTransformerImpl implements OrderTransformer{
	@Transformer(inputChannel="processOrder", outputChannel="outputProcess")
	public Order routeOrder(Order order) {
		System.out.println("We are in the order class");
		return order;
	}
}
