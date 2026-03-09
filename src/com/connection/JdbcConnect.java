package com.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConnect {
	String user = "root";
	String pwd = "LYJ23330612";
	String url = "jdbc:mysql://localhost:3306/design";
	String driver = "com.mysql.jdbc.Driver";
	
	Connection con = null;
	
	public Connection myConnect(){
		try {
			Class.forName(driver);
			System.out.println("驱动加载成功！");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("驱动加载失败！");
		}
		try {
			con = DriverManager.getConnection(url,user,pwd);
			System.out.println("数据库连接成功！");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//System.out.println("数据库连接失败！");
		}
		return con;
	}
}
