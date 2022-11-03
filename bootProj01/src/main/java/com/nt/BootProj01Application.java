package com.nt;

import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.nt.sbeans.WishMsgGenerator;

@SpringBootApplication
public class BootProj01Application {
	
	@Bean("ldt")
	public LocalDateTime getLDT() {
		return LocalDateTime.now();
	}
	
	/*  public static void main(String[] args) { 
		  
	  ApplicationContext ctx=SpringApplication.run(BootProj01Application.class, args);
	  WishMsgGenerator generator=ctx.getBean("wmg",WishMsgGenerator.class); String
	  result=generator.getMsg("chandan"); 
	  System.out.println(result);
	  
	  }*/
	 

}
