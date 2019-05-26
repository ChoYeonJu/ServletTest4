package com.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionTest
 */
@WebServlet("/SessionTest")
public class SessionTest extends HttpServlet {

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
/*		  response.setContentType("text/html"); 
		  PrintWriter out = response.getWriter();
		  out.println("test session attribute<br>");
		  
		  HttpSession httpSession = request.getSession();
		  
		  if(httpSession.isNew()) { 
			  out.print("this is new session"); 
			  }else {
		  }
		  out.println("welcome back"); 
		  }*/
		 
		
		
/*		  response.setContentType("text/html"); 
		  PrintWriter out = response.getWriter();
		  out.println("test sessions<br>");
		  
		  HttpSession session = request.getSession(false);
		  
		  if(session == null) { out.println("no session was available");
		  out.println("making one.."); 
		  session = request.getSession(); 
		  }else {
		  out.println("there was a session!"); 
		  }*/
		 
		
		
/*		  response.setContentType("text/html"); 
		  PrintWriter out = response.getWriter();
		  HttpSession session = request.getSession();
		  
		  out.println("<html><body>");
		  out.println("<a href=\""+
		  response.encodeUrl("/BeerTest.do")+"\">click me </a>");
		  out.println("</body></html>");
		 */
		
		
/*		  response.setContentType("text/html"); 
		  PrintWriter out = response.getWriter();
		  HttpSession session = request.getSession(); 
		  session.setAttribute("foo",
		  "42"); session.setAttribute("bar", 420); 
		  session.invalidate(); String foo =
		  (String)session.getAttribute("foo");
		  out.println("FOO: " + foo);*/
		 
		
/*		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		session.setAttribute("foo", "42");
		session.setMaxInactiveInterval(0);
		String foo = (String)session.getAttribute("foo");
		if(session.isNew()) {
			out.println("this is new session");
		}
		else {
			out.println("welcome back");
		}
		
		out.println("foo : "+ foo);
		
	*/
/*		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		session.setAttribute("foo","42");
		session.setAttribute("bar", "420");
		session.invalidate();  			//세션 무효화
		
		String foo = (String)session.getAttribute("foo");
		
		out.println("foo: " + foo);


	*/
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		session.setAttribute("foo", "42");
		session.setMaxInactiveInterval(0);
		
		if(session.isNew()) {
			out.println("this is a new session");
		}else {
			out.println("welcome back");
		}
		out.println("Foo: " + session.getAttribute("foo"));
	}

}
