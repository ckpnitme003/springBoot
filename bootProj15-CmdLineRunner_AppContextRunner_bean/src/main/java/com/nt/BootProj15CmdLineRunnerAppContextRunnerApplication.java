package com.nt;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.annotation.Order;

@SpringBootApplication
public class BootProj15CmdLineRunnerAppContextRunnerApplication {

	
	@Bean
//	@Order(1)
	public CommandLineRunner getcmdRunner() {
		CommandLineRunner cmdRun=new CommandLineRunner() {
			
			@Override
			public void run(String... args) throws Exception {
				System.out.println("cmd line runner");
			}
		};
		
		return cmdRun;
	}
	@Bean
//	@Order(10)
	public ApplicationRunner getAppRunner() {
		ApplicationRunner appRun=new ApplicationRunner() {
			
			@Override
			public void run(ApplicationArguments args) throws Exception {
				System.out.println("application runner");
			}
		};
		return appRun;
	}
	public static void main(String[] args) {
		SpringApplication.run(BootProj15CmdLineRunnerAppContextRunnerApplication.class, args);
	}

}
