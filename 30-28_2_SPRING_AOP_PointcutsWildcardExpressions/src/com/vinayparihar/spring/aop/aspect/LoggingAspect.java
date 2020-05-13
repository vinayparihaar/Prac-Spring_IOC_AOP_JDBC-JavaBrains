/**
 * 
 */
package com.vinayparihar.spring.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @author VinayParihar
 * @time 10:44:21 PM @date May 10, 2020
 */
@Aspect
public class LoggingAspect {
	
	
	/*@Before("execution(public String com.vinayparihar.spring.aop.model.Circle.getName())")*/
	/* @Before("execution(* get*(*))") */
	/* @Before("execution(* get*(..))") */
	/* @Before("execution(* com.vinayparihar.spring.aop.model.*.get*())") */
	
	 @Before("execution(* get*())") 
	public void loggingAdvice() {
		System.out.println("Advice run : Get method called.");
	}

}
