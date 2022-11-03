package com.nt.interceptor;

import java.time.LocalDateTime;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;


public class TimeCheckHandlerInterceptor implements HandlerInterceptor {
	
	@Override
	public boolean preHandle(HttpServletRequest req, HttpServletResponse res, Object handler)
			throws Exception {
	
		System.out.println("TimeCheckHandlerInterceptor.preHandle()");
		//first request 
		if(req.getServletPath().equalsIgnoreCase("/"))
			return true;
			
		//second request
		if(req.getServletPath().equalsIgnoreCase("/emp_report"))
			return true;
					
		
		
		//current time
		LocalDateTime ldt=LocalDateTime.now();
		//get current hour
		int hour=ldt.getHour();
		
		//condition check
		if(hour<12 || hour>17) {
			RequestDispatcher rd=req.getRequestDispatcher("/timeout.jsp");
			rd.forward(req, res);
			return false;
		}
		
		
		return true;
	}
	
	//post handler method
	@Override
	public void postHandle(HttpServletRequest req, HttpServletResponse res, Object handler,
			ModelAndView mav) throws Exception {
		if(req.getServletPath().equalsIgnoreCase("/emp_report")) {
			mav.setViewName("view_report");
		}
		
	}
}
