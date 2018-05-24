package edu.mum.integration;

import edu.mum.domain.Order;

public interface OrderTransformer {
	public Order routeOrder(Order order);
}
