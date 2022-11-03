package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;

import com.nt.sbeans.Company;

@SpringBootApplication
@PropertySource("app.properties")
public class BootProj05ConfigurationPropertiesApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(BootProj05ConfigurationPropertiesApplication.class, args);
		
		Company c=ctx.getBean("comp",Company.class);
		
		System.out.println(c);
	}

}
