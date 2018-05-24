package edu.mum.aspect;

import java.util.logging.Logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class OrderListenerAspect {
	  
  @Pointcut("target(edu.mum.OrderListner)")
  public void testOrderListner() {}

	  @Before("testOrderListner()")    
	  public void testOrderListnerExecution(JoinPoint joinPoint) throws Throwable {
	
		  Logger log = Logger.getLogger("");
		  log.info("   **********    ORDER LISTNER ASPECT CLASS : " + joinPoint.getSignature().getName() + "    **********");
		  System.out.println("********** --->OrderListnerAspect()  :" + joinPoint.getSignature().getDeclaringTypeName() + "." +
					joinPoint.getSignature().getName()+  " **********");
	  }
	
}