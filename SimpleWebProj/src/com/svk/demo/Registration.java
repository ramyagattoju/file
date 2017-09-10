package com.svk.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class Registration extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	public void init(ServletConfig sc) throws ServletException{
		super.init(sc);
		System.out.println("Inside Init Method....");
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		String name = request.getParameter("formName");
		
		String password = request.getParameter("mypasscode");
		
		System.out.println(" Password is :" +password);
		
		PrintWriter out = response.getWriter();
		
		
		/********************DEMO******************************/
	
    	ServletConfig conf = getServletConfig();
		String companyName = conf.getInitParameter("company");
		
		System.out.println(" Company Name is :" +companyName);
		
		/*******************DEMO*******************************/
		
		
		ServletContext context = getServletContext();
		String duty = context.getInitParameter("job");
		
		System.out.println("Job is :" +duty);
		
		
		HttpSession sess = request.getSession();
		String id = sess.getId();
		System.out.println("Session ID value :" +id);
		
		if(name.equals("praveen")){
			RequestDispatcher reqDisp = request.getRequestDispatcher("welcomeServletPath");
			reqDisp.forward(request, response);
		}
		else{
			out.print("Invalid Name/Password");
			RequestDispatcher rd = request.getRequestDispatcher("/register.html");
			rd.include(request, response);
			
		}
		
		
	}
	

}
