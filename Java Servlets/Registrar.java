package com.login;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

@WebServlet("/Registrar")
public class Registrar extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    @Resource(name = "jdbc/user_registration")
    private DataSource dataSource;
    
    private RegisterUtility registerUtility;

    @Override
    public void init() throws ServletException {
        super.init();
        registerUtility = new RegisterUtility(dataSource);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            String name = request.getParameter("name");
            String email = request.getParameter("email");
            String password = request.getParameter("password");
            String gender = request.getParameter("gender");
            String city = request.getParameter("city");
            long mobile = Long.parseLong(request.getParameter("mobile"));

            Register newUser = new Register(name, email, password, gender, city, mobile);
            registerUtility.addRegistration(newUser);

            RequestDispatcher dispatcher = request.getRequestDispatcher("/registration_confirmation.jsp");
            dispatcher.forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
            response.sendRedirect("error.jsp");
        }
    }
}
