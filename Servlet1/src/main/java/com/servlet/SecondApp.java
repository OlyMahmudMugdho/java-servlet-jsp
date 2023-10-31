package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class SecondApp extends GenericServlet {

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter writer = arg1.getWriter();
		arg1.setContentType("text/html");
		writer.println("This is a generic servlet");
		System.out.println("Generic Servlet running");
	}

}
