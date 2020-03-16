package com.balram.springjdbc.advance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAdvance {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/balram/springjdbc/advance/config.xml");

		PersonDao personDao = context.getBean(PersonDaoImpl.class, "personDao");
		
		Person person = personDao.get(10);
		System.out.println(person);
		

//		int add = personDao.add(new Person(10, "ram", "sharma"));
//		System.out.println(add + " record inserted");

	}

}
