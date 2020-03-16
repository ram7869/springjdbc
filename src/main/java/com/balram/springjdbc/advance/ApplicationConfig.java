package com.balram.springjdbc.advance;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;

@Component
public class ApplicationConfig {

	
	@Bean("dataSource")
	public DriverManagerDataSource getDataSourceBean() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:orcb");
		dataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		dataSource.setUsername("system");
		dataSource.setPassword("system");
		return dataSource;
	}
	
	@Bean("jdbcTemplate")
	public JdbcTemplate jdbcTemplate(DataSource dataSource){
		
		JdbcTemplate JdbcTemplate =new JdbcTemplate(dataSource);
		return JdbcTemplate;
		
	}
	
}
