package com.nt.configurer;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.nt.interceptor.BrowserCheckHandlerInterceptor;
import com.nt.interceptor.TimeCheckHandlerInterceptor;

@Component
public class MyWebMvcConfigurer implements WebMvcConfigurer {
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		
		System.out.println("MyWebMvcConfigurer.addInterceptors()");
		registry.addInterceptor(new TimeCheckHandlerInterceptor());
		registry.addInterceptor(new BrowserCheckHandlerInterceptor());
	}
}
