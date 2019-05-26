package com.example;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class BeerSessionCounter implements HttpSessionListener{
	
	static private int activeSessions;
	
	public static int getActiveSessions() {
		return activeSessions;
	}

	@Override
	public void sessionCreated(HttpSessionEvent se) {
		// TODO Auto-generated method stub
		activeSessions++;
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		// TODO Auto-generated method stub
		activeSessions++;
	}

}
