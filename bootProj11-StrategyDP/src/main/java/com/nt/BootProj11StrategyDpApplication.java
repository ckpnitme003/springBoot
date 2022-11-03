package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.nt.bean.Flipkart;

@SpringBootApplication
@ImportResource(locations = "applicationContext.xml")
public class BootProj11StrategyDpApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(BootProj11StrategyDpApplication.class, args);
		
		
		Flipkart fk = ctx.getBean("fpkt", Flipkart.class);
		String result = fk.order(new String[] { "shirt", "pant" }, new double[] { 1000.0, 2000.0 });
		System.out.println(result);
	}

}
