package com.wh.spring.helloworld.properties;



import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mysql.jdbc.Connection;




public class Mainx {
	
	
	
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("bean-properties.xml");
		DataSource dataSource=(DataSource) ctx.getBean("dataSource");
		System.out.println(dataSource.getClass().getName());
		System.out.println(dataSource.getClass().getSimpleName());
		try {
			Connection connection=(Connection) dataSource.getConnection();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
