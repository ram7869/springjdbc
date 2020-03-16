package com.balram.springjdbc.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/balram/springjdbc/dao/config.xml");
		EmployeeDao bean = context.getBean(EmployeeDaoImpl.class,"employeeDao");
		int insert = bean.insert(new Employee(11,"jairam",80000));
		System.out.println(insert+" record inserted");

	}

}
