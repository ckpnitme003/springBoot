package com.nt.test;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;

import com.nt.BootProj01Application;
import com.nt.sbeans.WishMsgGenerator;

public class Test {
	public static void main(String[] args) { 
		  
		  ApplicationContext ctx=SpringApplication.run(BootProj01Application.class, args);
		  WishMsgGenerator generator=ctx.getBean("wmg",WishMsgGenerator.class); String
		  result=generator.getMsg("chandan"); 
		  System.out.println(result);
		  
		  }
}
