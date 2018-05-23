package edu.mum.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class Main 
{
	private final static String[] configFilesGatewayDemo = {
			"/META-INF/spring/integration/common.xml",
	 		"/META-INF/spring/integration/orderGateway.xml",
			"/META-INF/spring/integration/amqp-order-app-context.xml",
		};
    public static void main( String[] args )
    {
    		new ClassPathXmlApplicationContext(configFilesGatewayDemo, Main.class);
    }
}
