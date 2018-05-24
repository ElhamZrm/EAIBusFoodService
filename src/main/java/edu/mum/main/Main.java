package edu.mum.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class Main 
{
	private final static String[] configFilesGatewayDemo = {
			"/META-INF/spring/integration/common.xml",
			"/META-INF/spring/integration/amqp-order-app-context.xml",
			"/META-INF/spring/integration/orderGateway.xml",
		};
    public static void main( String[] args )
    {
    	System.out.println("\n========================================================="
				+ "\n                                                         "
				+ "\n    Welcome to the WAA 545 RouteOrder System!                 "
				+ "\n                                                         "
				+ "\n    For more information please visit:                   "
				+ "\n    REFER to the Slides & your Class NOTES!              "
				+ "\n                                                         "
				+ "\n=========================================================" );
 
 		System.out.println("    Loading Demo...");
    	new ClassPathXmlApplicationContext("/META-INF/spring/integration/common.xml");
    	//context
    }
}
