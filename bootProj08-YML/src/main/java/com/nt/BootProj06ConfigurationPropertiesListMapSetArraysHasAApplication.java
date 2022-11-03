package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.sbeans.Employee;

@SpringBootApplication
public class BootProj06ConfigurationPropertiesListMapSetArraysHasAApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(BootProj06ConfigurationPropertiesListMapSetArraysHasAApplication.class, args);
		Employee e=ctx.getBean("emp",Employee.class);
		System.out.println(e);
	}

}
