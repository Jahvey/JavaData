package com.wh.spring.ref;

import java.sql.SQLException;
import java.text.DateFormat;
import java.util.Date;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wh.spring.helloworld.User;

public class Main {
	
	public static void main(String[] args) throws SQLException {
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans-auto.xml");
		Action action = ctx.getBean(Action.class);
		
		action.execute();
		
		//���� bean ��������
		Dao dao1 = (Dao) ctx.getBean("dao2");
		Dao dao2 = (Dao) ctx.getBean("dao2");
		
		System.out.println(dao1 == dao2);
		
		//����ʹ���ⲿ�����ļ�
		DataSource dataSource = (DataSource) ctx.getBean("dataSource");
		System.out.println(dataSource.getConnection());
		
		//���� spEL
		User boy = (User) ctx.getBean("boy");
		System.out.println(boy.getUserName() + ":" + boy.getWifeName());
		
//		DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL);
		DateFormat dateFormat = (DateFormat) ctx.getBean("dateFormat");
		System.out.println(dateFormat.format(new Date()));
		
		Date date = (Date) ctx.getBean("datetime");
		System.out.println(date);
		
		User user = (User) ctx.getBean("user");
		System.out.println(user);
		
		ctx.close();
	}
	
}
