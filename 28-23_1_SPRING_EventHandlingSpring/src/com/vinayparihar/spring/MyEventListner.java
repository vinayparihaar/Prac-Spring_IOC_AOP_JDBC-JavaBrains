/**
 * 
 */
package com.vinayparihar.spring;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author VinayParihar
 * @date May 10, 2020 @time 3:09:26 PM
 */
@Component
public class MyEventListner implements ApplicationListener<ApplicationEvent> {

	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		System.out.println(event.toString());

	}

}
