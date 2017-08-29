package com.wh.spring.helloworld.properties;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mchange.v2.c3p0.DriverManagerDataSource;
/**
 * 
 result:

14---吴神兵
15---汪泽生
16---朱小狗
17---巫阿平
18---admin
19---李四
20---张三
21---王晓丽
22---赵晓红
23---汪小雨
24---汪明杰
25---谷小志
26---汪芯蕊
27---江梦妍
28---赵强
29---汪鹏
30---Jones
31---胡明
32---王老五
33---赵四
34---王老七
35---许杰
36---汪鹏煊
37---汪天雪
38---汪皓宇
39---汪忆妍
40---李磊
41---wpfsb
42---汪小菲
43---汪狗
44---


 * 
 * 
 * */

public class UserDao {

		DriverManagerDataSource dataSource2;
		DataSource dataSource;
		
	    

	    /**
		 * @return the dataSource
		 */
		public DataSource getDataSource() {
			return dataSource;
		}

		/**
		 * @param dataSource the dataSource to set
		 */
		public void setDataSource(DataSource dataSource) {
			this.dataSource = dataSource;
		}

		public List<User> queryAll() {
	        Connection conn = null;
	        PreparedStatement ppst = null;
	        ResultSet rs = null;
	        try {
	            conn = dataSource.getConnection();
	            ppst = conn.prepareStatement("select * from user");
	            rs = ppst.executeQuery();
	            List<User> list = new ArrayList<>();
	            while (rs.next()) {
	                User user = new User(rs.getInt(1), rs.getString(2),rs.getString(3),//
	                		rs.getInt(4), rs.getString(5),rs.getString(6),//
	                		rs.getString(7), rs.getString(8),rs.getInt(9),//
	                		rs.getInt(10), rs.getString(11),rs.getString(12));
	                list.add(user);
	            }
	            return list;

	        } catch (SQLException e) {
	            e.printStackTrace();
	        } finally {
	            try {
	                rs.close();
	                ppst.close();
	                conn.close();
	            } catch (SQLException e) {
	                e.printStackTrace();
	            }
	        }

	        return null;
	    }

	    public static void main(String[] args) throws SQLException {
	        ApplicationContext context = new ClassPathXmlApplicationContext("bean-properties.xml");

	        UserDao dao = (UserDao) context.getBean("UserDao");

	        List<User> list = dao.queryAll();
	        for (User user : list) {
	            System.out.println(user.getId() + "---" + user.getUsername());
	        }

	    }
	
}
