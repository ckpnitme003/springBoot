package com.nt.config;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = "com.nt.repo.icicibank",
						transactionManagerRef = "mysqlTxMgmr",
						entityManagerFactoryRef = "mysqlEMF")
public class MysqldbConfig {
	
	@Bean(name="mysqlDS")
	@ConfigurationProperties(prefix = "mysql.datasource")
	public DataSource createMysqlDs() {
		return DataSourceBuilder.create().build();
	}
	@Bean(name="mysqlEMF")
	public LocalContainerEntityManagerFactoryBean createEntityManager(EntityManagerFactoryBuilder builder) {
		Map<String,Object> props=new HashMap<>();
		props.put("hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect");
		props.put("hibernate.hbm2ddl.auto", "update");
		
		return builder.dataSource(createMysqlDs()).packages("com.nt.entity.icici").properties(props).build();
	}
	
	@Bean(name="mysqlTxMgmr")
	public PlatformTransactionManager createOacleTxMgmr(@Qualifier("mysqlEMF")EntityManagerFactory factory) {
		return new JpaTransactionManager(factory);
	}

}
