package edu.mum.integration;

import edu.mum.domain.Order;

public class TestService {
	public void serviceMethod(Order param) {
	    System.out.println("This is the order object " + param.getName());
	    //return param;
	}
}
