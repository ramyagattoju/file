package com.svk;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


public class ShoppingFilter implements Filter {

	
	@Override
	public void init(FilterConfig arg0) throws ServletException{}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		
		String pcode = request.getParameter("mypasscode");
		
		response.setContentType("text/html");
		
		if(pcode.equals("admin")){
			chain.doFilter(request, response);
		}
		
		if(pcode.equals("seller")){
			RequestDispatcher reqDisp = request.getRequestDispatcher("sellerPath");
			reqDisp.forward(request, response);
		}
		
		if(pcode.equals("customer")){
			RequestDispatcher reqDisp = request.getRequestDispatcher("buyerPath");
			reqDisp.forward(request, response);
		}
		
		else{
			PrintWriter out = response.getWriter();
			out.print("Hey you got the wrong password");
			RequestDispatcher reqDisp = request.getRequestDispatcher("/login.html");
			reqDisp.include(request, response);
			
			
		}
		
		
	}

	@Override
	public void destroy(){}
		
	

}
