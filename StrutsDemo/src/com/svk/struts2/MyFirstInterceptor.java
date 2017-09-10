package com.svk.struts2;


import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;


public class MyFirstInterceptor extends AbstractInterceptor{

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		
		System.out.println("This is preprocessing block in interceptor_1 ");
		
		System.out.println("***********class :" +invocation.getAction().getClass());
		
		String result = invocation.invoke();
		
		System.out.println("This is postprocessing block in intercepto_1 ");
		
		return result;
	}




}
