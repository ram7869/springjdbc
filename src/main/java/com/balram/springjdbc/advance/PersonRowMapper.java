package com.balram.springjdbc.advance;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class PersonRowMapper implements RowMapper<Person>{

	@Override
	public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Person p = new Person();
		p.setId(rs.getInt(1));
		p.setName(rs.getString(2));
		p.setLastName(rs.getString(3));
		
		return p;
	}

}
