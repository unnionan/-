package com.admin;

import java.math.BigInteger;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;

import sun.applet.Main;

import com.connection.JdbcConnect;

public class test {

	/**
	 * @param args
	 * @throws SQLException 
	 */
	public static void main(String[] args) {
		//导入数据库连接类
		JdbcConnect con = new JdbcConnect();
		//建立数据库连接
		Connection connect;
		connect = con.myConnect();
	}
	public static void demo2(String[] args) {
		ResultSet rs = demo1();
		try {
			while(rs.next())
			{
				System.out.println("123");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
public static ResultSet demo1() {
	BigInteger i = BigInteger.valueOf(Integer.valueOf("2022110341"));
	System.out.println(i);
	//导入数据库连接类
	JdbcConnect con = new JdbcConnect();
	//建立数据库连接
	Connection connect;
	connect = con.myConnect();
	//全部查询语句
	String All_Select = "select * from admin";
	Statement select_all = null;
	try {
		select_all = connect.createStatement();
		System.out.println("全部查找语句装载成功！");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		System.out.println("全部查找语句装载失败！");
	}
	ResultSet rs = null;
	try {
		rs = select_all.executeQuery(All_Select);
		System.out.println("全部查找语句运行成功！");
	} catch (SQLException e1) {
		// TODO Auto-generated catch block
		System.out.println("全部查找语句运行失败！");
	}
	/*
	int Id = 0;
	String loginid = null;
	String loginpwd = null;
	while(rs.next())
	{
	   Id = rs.getInt("Id");
	   loginid = rs.getString("loginid");
	   loginpwd = rs.getString("loginpwd");
	}
	*/
	/*
	try {
		while(rs.next())
		{
			System.out.println("123");
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	*/
	try {
		connect.close();
		System.out.println("数据库连接关闭成功！");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		System.out.println("数据库连接关闭失败！");
	}
	ResultSet ee = rs;
	return ee;
}
	public static void demo(String[] args){
		// TODO Auto-generated method stub
		Random r = new Random();
		int Id = r.nextInt(99999999);
		System.out.println(Id);
		//导入数据库连接类
		JdbcConnect con = new JdbcConnect();
		//建立数据库连接
		Connection connect;
		connect = con.myConnect();
		try {
			connect.close();
			System.out.println("数据库连接关闭成功！");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("数据库连接关闭失败！");
		}
	}
}
