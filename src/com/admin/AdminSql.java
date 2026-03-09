 package com.admin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.connection.JdbcConnect;

public class AdminSql {

	Connection connect = null;
	//建立数据库连接函数
	public void establishConnection()
	{
		//导入数据库连接类
		JdbcConnect con = new JdbcConnect();
		//建立数据库连接
		connect = con.myConnect();
	}
	//关闭数据库连接函数
	public void CloseConnection()
	{
		try {
			connect.close();
			System.out.println("数据库连接关闭成功！");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("数据库连接关闭失败！");
		}
	}
	//数据库单个查找函数，返回结果集
	public ResultSet Select(int Id){
		//建立数据库连接
		//establishConnection();
		//单个查询语句
		String Select_sql = "select * from admin where Id = "+Id+";";
		//
		Statement select = null;
		try {
			select = connect.createStatement();
			System.out.println("单个查找语句装载成功！");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("单个查找语句装载失败！");
		}
		ResultSet re = null;
		int i = -1;
		try {
			re = select.executeQuery(Select_sql);
			//i = select.executeUpdate(Select_sql);
			System.out.println("单个查找语句执行成功！");
			//return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("单个查找语句执行失败！");
			e.printStackTrace();
			//return false;
		}
		//关闭数据库连接
		//CloseConnection();
		return re;
	}
	//数据库插入函数
	public boolean insert(int Id,String loginid,String loginpwd){
		//建立数据库连接
		//establishConnection();
		//单个插入语句
		String insert_sql = "insert into admin values(?,?,?)";
		PreparedStatement insert = null;
		try {
			insert = connect.prepareStatement(insert_sql);
			System.out.println("插入预加载语句装载成功！");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("插入预加载语句装载失败！");
		}
		try {
			insert.setInt(1, Id);
			System.out.println("1成功！");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("1失败！");
		}
		try {
			insert.setString(2, loginid);
			System.out.println("2成功！");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("2成功！");
		}
		try {
			insert.setString(3, loginpwd);
			System.out.println("3成功！");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("3失败！");
		}
		int i = -1;
		try {
			i = insert.executeUpdate();
			 System.out.println("插入语句执行成功！");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("插入语句执行失败！");
		}
		//关闭数据库连接
		//CloseConnection();
		if(i == 1) return true;
		else return false;
	}
	//数据库全部查找函数，返回结果集
	public ResultSet All_Select() 
	{
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
		return rs;
	}
	//数据库修改函数
	public boolean update(String newLoginid,String newLoginpwd,int id){
		String update_sql = "update admin set loginid = '"+newLoginid+"' ,loginpwd = '"+newLoginpwd+"' where Id = "+id+";";
		Statement update = null;
		try {
			update = connect.createStatement();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		int i = -1;
		try {
			i = update.executeUpdate(update_sql);
			System.out.println("修改语句执行成功！");
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("修改语句执行失败！");
			e.printStackTrace();
			return false;
		}
	}
}
