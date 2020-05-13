/**
 * 
 */
package com.vinayparihar.spring.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @author VinayParihar
 * @time 10:44:21 PM @date May 10, 2020
 */
@Aspect
public class LoggingAspect {

	@Before("allGetters()")
	public void loggingAdvice() {
		System.out.println("Advice run : Get method called.");
	}

	@Before("allGetters()")
	public void secondloggingAdvice() {
		System.out.println("Second Advice run : Get method called.");
	}

	@Pointcut("execution(* get*())")
	public void allGetters() {
	}

}
