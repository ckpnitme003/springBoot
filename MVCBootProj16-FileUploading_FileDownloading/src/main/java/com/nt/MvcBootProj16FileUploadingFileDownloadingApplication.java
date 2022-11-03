package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

@SpringBootApplication
public class MvcBootProj16FileUploadingFileDownloadingApplication {
	
	@Bean(name = "multipartResolver")
	public CommonsMultipartResolver createCMResolver() {
		CommonsMultipartResolver resolver=new CommonsMultipartResolver();
		resolver.setMaxUploadSizePerFile(50*1024*1024);//50MB
		resolver.setMaxUploadSize(-1);//-1 mean=>no limit(all together file)
		
		return resolver;
		
	}
	public static void main(String[] args) {
		SpringApplication.run(MvcBootProj16FileUploadingFileDownloadingApplication.class, args);
	}

}
