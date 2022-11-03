package com.nt.interceptor;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;

public class BrowserCheckHandlerInterceptor implements HandlerInterceptor {
	
	@Override
	public boolean preHandle(HttpServletRequest req, HttpServletResponse res, Object handler)
			throws Exception {
		
		
		System.out.println("BrowserCheckHandlerInterceptor.preHandle()");
		String browserDetails=req.getHeader("user-agent");
		if(browserDetails.toLowerCase().contains("chrome")) {
			RequestDispatcher rd=req.getRequestDispatcher("/browserout.jsp");
			rd.forward(req, res);
			return false;
		}
		
		
			
		
		return true;
	}
}
