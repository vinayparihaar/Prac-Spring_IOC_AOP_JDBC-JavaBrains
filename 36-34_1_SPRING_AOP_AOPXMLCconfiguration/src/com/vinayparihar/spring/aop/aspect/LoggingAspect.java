/**
 * 
 */
package com.vinayparihar.spring.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @author VinayParihar
 * @time 10:44:21 PM @date May 10, 2020
 */
/* @Aspect */
public class LoggingAspect {

	/* @Around("allGetters()") */
	public Object myAroundAdvice(ProceedingJoinPoint proceedingJoinPoint) {
		Object returnValue = null;
		try {
			System.out.println("Before Advice.");
			returnValue = proceedingJoinPoint.proceed();
			System.out.println("After Advice Returning.");
		} catch (Throwable throwable) {
			System.out.println("After Advice Throwing.");
		}
		System.out.println("After Advice Finally.");
		return returnValue;
	}

	/*
	 * @Pointcut("execution(* get*())") public void allGetters() { }
	 */

}
