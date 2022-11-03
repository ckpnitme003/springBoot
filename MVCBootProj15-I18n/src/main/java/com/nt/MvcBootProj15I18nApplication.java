package com.nt;

import java.util.Locale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

@SpringBootApplication
public class MvcBootProj15I18nApplication {

	//for activating I18n
	@Bean("localeResolver")//fixed bean id
	public SessionLocaleResolver createSessionLocalResolver() {
		SessionLocaleResolver resolver=new SessionLocaleResolver();
		resolver.setDefaultLocale(new Locale("en", "US"));;
		return resolver;
	}
	
	@Bean("lci")
	public LocaleChangeInterceptor createLCInterceptor() {
		LocaleChangeInterceptor interceptor=new LocaleChangeInterceptor();
		interceptor.setParamName("lang");
		
		return interceptor;
	}
	public static void main(String[] args) {
		SpringApplication.run(MvcBootProj15I18nApplication.class, args);
	}

}
