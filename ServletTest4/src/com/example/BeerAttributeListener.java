package com.example;

import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

public class BeerAttributeListener implements HttpSessionAttributeListener{

	@Override
	public void attributeAdded(HttpSessionBindingEvent event) {
		// TODO Auto-generated method stub
		String name = event.getName();
		Object value = event.getValue();
		
		System.out.println("Attribute added : " + name + ": " + value);
	}

	@Override
	public void attributeRemoved(HttpSessionBindingEvent event) {
		// TODO Auto-generated method stub
		String name = event.getName();
		Object value = event.getValue();
		System.out.println("Attribute removed: "+ name + ": "+value);
		
	}

	@Override
	public void attributeReplaced(HttpSessionBindingEvent event) {
		// TODO Auto-generated method stub
		
		String name = event.getName();
		Object value = event.getValue();
		System.out.println("Attribute replaced: " + name + ": "+value);
		
	}

}
