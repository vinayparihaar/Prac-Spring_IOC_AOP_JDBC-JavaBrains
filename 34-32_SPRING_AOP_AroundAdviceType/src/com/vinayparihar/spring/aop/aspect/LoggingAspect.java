/**
 * 
 */
package com.vinayparihar.spring.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @author VinayParihar
 * @time 10:44:21 PM @date May 10, 2020
 */
@Aspect
public class LoggingAspect {

	@Before("allCircleMethods()")
	public void loggingAdvice(JoinPoint joinPoint) {

	}

	@AfterReturning(pointcut = "args(name)", returning = "returnString")
	public void stringArgumentethods(String name, Object returnString) {
		System.out.println("After : A method that take string argument has been called.The value is " + name
				+ " The output value is " + returnString);

	}

	@AfterThrowing(pointcut = "args(name)", throwing = "exception")
	public void exceptionAdvice(String name, Exception exception) {
		System.out.println("After : An Exception has been thrown." + exception);
	}

	@Around("allGetters()")
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

	@Pointcut("execution(* get*())")
	public void allGetters() {
	}

	@Pointcut("within(com.vinayparihar.spring.aop.model.Circle)")
	public void allCircleMethods() {
	}

}
