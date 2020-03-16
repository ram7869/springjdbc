package com.balram.springjdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDaoImpl implements EmployeeDao{
	
	
	public JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int insert(Employee e) {
		// TODO Auto-generated method stub
		String sql = "insert into employee values(?,?,?)";
		int update = jdbcTemplate.update(sql, e.getId(), e.getName(), e.getSalary());
		return update;
	}

	

}
