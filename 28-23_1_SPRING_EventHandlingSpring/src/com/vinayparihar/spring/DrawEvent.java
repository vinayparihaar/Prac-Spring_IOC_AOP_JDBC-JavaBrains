/**
 * 
 */
package com.vinayparihar.spring;

import org.springframework.context.ApplicationEvent;

/**
 * @author VinayParihar
 * @date May 10, 2020 @time 3:16:56 PM
 */
public class DrawEvent extends ApplicationEvent {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5316812939982299572L;

	/**
	 * @param source
	 */
	public DrawEvent(Object source) {
		super(source);
	}

	@Override
	public String toString() {
		return "Draw Event Occured";
	}

}
