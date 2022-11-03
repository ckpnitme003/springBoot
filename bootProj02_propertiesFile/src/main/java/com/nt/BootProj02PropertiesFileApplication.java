package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.nt.sbeans.Vehicle;

@SpringBootApplication
@ImportResource("com/nt/cfgs/applicationContext.xml")
public class BootProj02PropertiesFileApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(BootProj02PropertiesFileApplication.class, args);
		Vehicle v=ctx.getBean("vehicle",Vehicle.class);
		
			v.journy("cku", "tata");
			
			
			((ConfigurableApplicationContext) ctx).close();

	}

}
