/**
 * 
 */
package com.vinayparihar.spring.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
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

	@AfterReturning("args(name)")
	public void stringArgumentethods(String name) {
		System.out.println("After : A method that take string argument has been called.The value is " + name);

	}
	
	@AfterThrowing("args(name)")
	public void exceptionAdvice(String name) {
		System.out.println("After : An Exception has been thrown.");

	}

	@Pointcut("execution(* get*())")
	public void allGetters() {
	}

	@Pointcut("within(com.vinayparihar.spring.aop.model.Circle)")
	public void allCircleMethods() {
	}

}
