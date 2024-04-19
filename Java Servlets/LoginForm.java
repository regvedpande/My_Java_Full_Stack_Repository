package com.myservlets.practice;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/myLogin")
public class LoginForm extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("name1");
		String password = request.getParameter("pass");
		
		
		if (name.equals("regved") && password.equals("pande")) {
			System.out.println("Success");
		} else {
			System.out.println("Error");
		}
		
	}
	
}
