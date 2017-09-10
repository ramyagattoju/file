package com.svk.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class SuccessPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("formName");
		
		ServletConfig conf = getServletConfig();
		String companyName = conf.getInitParameter("company");
		
		ServletContext context = getServletContext();
		String duty = context.getInitParameter("job");
		
		HttpSession sess = request.getSession();
		String id = sess.getId();
		System.out.println("Session ID value :" +id);
		
		out.print("Hi  " +name + " you are now logged in !!!!!" +" and he works for " +companyName + " as a " +duty);
		
		
		
	}

}
