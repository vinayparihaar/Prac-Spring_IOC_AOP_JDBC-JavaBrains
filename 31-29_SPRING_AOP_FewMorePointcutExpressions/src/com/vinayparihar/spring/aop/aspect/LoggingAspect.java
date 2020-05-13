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

	/* @Before("execution(public String get*())") */
	/* @Before("execution(public * get*())") */
	/* @Before("execution(* get*(*))") */
	/* @Before("execution(* get*(..))") */
	/* @Before("execution(* com.vinayparihar.spring.aop.model.*.get*())") */

	@Before("allGetters() && allCircleMethods() ")
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
	
	/* @Pointcut("execution(* * com.vinayparihar.spring.aop.model.Circle.*(..))") */
	/* or */
	/* @Pointcut("within(com.vinayparihar.spring.aop.model.Circle") */
	/* @Pointcut("within(com.vinayparihar.spring.aop.model.*") */
	//all the Classes within the root package or all the classes Classes with in the subpackage
	// .. Represents ZERO or more
	/* @Pointcut("within(com.vinayparihar.spring.aop.model..*") */
	@Pointcut("within(com.vinayparihar.spring.aop.model.Circle)")
	public void allCircleMethods() {}

}
