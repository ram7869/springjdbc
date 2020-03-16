package com.balram.springjdbc.advance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component("personDao")
public class PersonDaoImpl implements PersonDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int add(Person person) {
		String sql ="insert into Person values(?,?,?)";
		return jdbcTemplate.update(sql, person.getId(),person.getName(),person.getLastName());
	}

	@Override
	public Person get(int id) {
		String sql ="select * from Person where id=?";
		
		return jdbcTemplate.queryForObject(sql, new PersonRowMapper(), id);
		
		
	}

}
