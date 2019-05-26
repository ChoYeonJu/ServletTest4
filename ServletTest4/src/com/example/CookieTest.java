package com.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CookieTest
 */
@WebServlet("/CookieTest")
public class CookieTest extends HttpServlet {


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		response.setContentType("text/html");
		
		String name = request.getParameter("username");
		
		Cookie cookie = new Cookie("username", name);
		
		cookie.setMaxAge(30*60);	//30분동안 클라이언트에 살아있음
		
		response.addCookie(cookie);	//쿠키추가
		
		RequestDispatcher view = request.getRequestDispatcher("cookieresult.jsp");
		view.forward(request, response);
	
	
	
		

		
	}

}
