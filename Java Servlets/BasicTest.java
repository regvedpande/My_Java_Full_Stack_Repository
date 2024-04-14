package com.myservlets.practice;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.connector.Response;

//public class BasicTest extends GenericServlet{
//
//	@Override
//	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		
//	}
//
//}

//This class is a basic example of a servlet in Java.
//It extends the HttpServlet class to handle HTTP requests.
//After the 4th process Basic class gets invoked and doGet runs
public class BasicTest extends HttpServlet {
	
	// This method is called when a GET request is sent to the servlet.
	// It is responsible for processing the request and sending a response.
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// backend code
		// Print a message to the console inside eclipse  indicating that the doGet method is being executed.
		// But if you want to print it inside Website or server use PrintWriter
		
		PrintWriter out = resp.getWriter();
		out.println("Look i Printed it for you inside the Browser");
		
		
		System.out.println("I am doGet Method");
	}
	
}
//This Servlet does not have configuration details in the web.xml file, (check xml file i have added servlet mapping and url pattern )
//which might result in HTTP errors when handling requests.
//Configuration in the web.xml file specifies URL patterns that this servlet should handle
//and only initialization parameters it may require.
