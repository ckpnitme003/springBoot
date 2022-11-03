package com.nt;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;

import com.nt.bean.Employee;
import com.nt.controller.MainController;

@SpringBootApplication
public class BootProj03LayeredAppApplication {

	
	public static void main(String[] args) {
		
		ApplicationContext ctx = SpringApplication.run(BootProj03LayeredAppApplication.class, args);

		MainController controller = ctx.getBean("controller", MainController.class);
		Environment env=ctx.getEnvironment();
		System.out.println(Arrays.toString(env.getActiveProfiles()));
		try {
			List<Employee> li = controller.getList("developer", "manager", "clerk");
			System.out.println("==================");
			li.stream().forEach(p -> System.out.println(p));
			System.out.println("==================");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
