package com.nt;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration;
import org.springframework.context.ApplicationContext;

import com.nt.bean.Employee;
import com.nt.controller.MainController;

@SpringBootApplication
public class BootProj03LayeredAppApplication {

	/*		@Autowired
			private Environment env;
			
			@Bean("c3p0ds")
			public ComboPooledDataSource getC3p0ds() throws PropertyVetoException {
				ComboPooledDataSource cds=new ComboPooledDataSource();
				//	cds.setDriverClass("oracle.jdbc.driver.OracleDriver");
					//cds.setJdbcUrl("jdbc:oracle:thin:@localhost:1521:xe");
					//cds.setUser("system");
					//cds.setPassword("ckp");
					cds.setDriverClass(env.getProperty("spring.datasource.driver-class-name"));
					cds.setJdbcUrl(env.getProperty("spring.datasource.url"));
					cds.setUser(env.getProperty("spring.datasource.username"));
					cds.setPassword(env.getProperty("spring.datasource.password "));
					cds.setMinPoolSize(10);
					cds.setMaxPoolSize(100);
					
				
				return cds;
				
			}*/
	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(BootProj03LayeredAppApplication.class, args);

		MainController controller = ctx.getBean("controller", MainController.class);
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
