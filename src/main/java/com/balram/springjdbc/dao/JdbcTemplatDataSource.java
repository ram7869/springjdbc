package com.balram.springjdbc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;

@Component
public class JdbcTemplatDataSource {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	
	
	
	@Bean("dataSource")
	public DriverManagerDataSource getDataSourceBean() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:orcb");
		dataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		dataSource.setUsername("system");
		dataSource.setPassword("system");
		return dataSource;
	}
	
	
	

}
