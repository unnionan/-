package com.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.connection.JdbcConnect;

public class UserSql {
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
	public ResultSet Select(int Id){
		//建立数据库连接
		//establishConnection();
		//单个查询语句
		String Select_sql = "select * from user where Id = '"+Id+"'";
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
			i = select.executeUpdate(Select_sql);
			System.out.println("单个查找语句执行成功！");
			//return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("单个查找语句执行失败！");
			//return false;
		}
		//关闭数据库连接
		//CloseConnection();
		return re;
	}
	//查找pay
	public ResultSet Select_pay(int Id){
		//建立数据库连接
		//establishConnection();
		//单个查询语句
		String Select_sql = "select * from pay where Id = '"+Id+"'";
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
			i = select.executeUpdate(Select_sql);
			System.out.println("单个查找语句执行成功！");
			//return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("单个查找语句执行失败！");
			//return false;
		}
		//关闭数据库连接
		//CloseConnection();
		return re;
	}
	//数据库插入函数
	public boolean insert(int Id,String stuname){
		//建立数据库连接
		//establishConnection();
		//单个插入语句
		String insert_sql_user = "insert into user values(?,?,?,?,?,?,?,?,?)";
		PreparedStatement insert_user = null;
		try {
			insert_user = connect.prepareStatement(insert_sql_user);
			System.out.println("插入预加载语句装载成功！");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("插入预加载语句装载失败！");
		}
		try {
			insert_user.setInt(1, Id);
			System.out.println("1成功！");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("1失败！");
		}
		try {
			insert_user.setString(2, "未填写");
			System.out.println("2成功！");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("2成功！");
		}
		try {
			insert_user.setString(3, "未填写");
			System.out.println("3成功！");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("3失败！");
		}
		try {
			insert_user.setString(4, "未填写");
			System.out.println("4成功！");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("4失败！");
		}
		try {
			insert_user.setString(5, "未填写");
			System.out.println("5成功！");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("5失败！");
		}
		try {
			insert_user.setString(6, "未填写");
			System.out.println("6成功！");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("6失败！");
		}
		try {
			insert_user.setString(7, stuname);
			System.out.println("7成功！");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("7失败！");
		}
		try {
			insert_user.setString(8, "未填写");
			System.out.println("8成功！");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("8失败！");
		}
		try {
			insert_user.setString(9, "未填写");
			System.out.println("9成功！");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("9失败！");
		}
		int i = -1;
		try {
			i = insert_user.executeUpdate();
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
	//修改user表
	public boolean update_user(int Id,String name,String sex,String age,String tel,String address,String loginid,String loginpwd)
	{
		String update_sql = "update user set name = '"+name+"' ,sex = '"+sex+"', age = '"+age+"' ,tel = '"+tel+"' ,address = '"+address+"',loginid = '"+loginid+"', loginpwd = '"+loginpwd+"'  where Id = "+Id+";";
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
	//修改user表
	public boolean update_userPwd(int Id,String loginpwd)
	{
		String update_sql = "update user set  loginpwd = '"+loginpwd+"'  where Id = "+Id+";";
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
	//给学生缴费
	public boolean insertPay(int Id,String stuname)
	{
		String insert_sql_pay = "insert into pay values(?,?,?,?,?)";
		PreparedStatement insert_pay = null;
		try {
			insert_pay = connect.prepareStatement(insert_sql_pay);
			System.out.println("插入预加载语句装载成功！");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("插入预加载语句装载失败！");
		}
		try {
			insert_pay.setInt(1, Id);
			System.out.println("1成功！");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("1失败！");
		}
		try {
			insert_pay.setString(2, "未填写");//name = userid家长姓名
			System.out.println("2成功！");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("2成功！");
		}
		try {
			insert_pay.setString(3, stuname);//用户学号
			System.out.println("3成功！");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("3失败！");
		}
		try {
			insert_pay.setString(4, "0");
			System.out.println("4成功！");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("4失败！");
		}
		try {
			insert_pay.setString(5, "未缴费");
			System.out.println("5成功！");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("5失败！");
		}
		int i = -1;
		try {
			i = insert_pay.executeUpdate();
			 System.out.println("插入语句执行成功！");
			 return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("插入语句执行失败！");
			return false;
		}
	}
	//修改pay表的家长姓名name,修改用户表的同时
	public boolean update_pay(int Id,String name)
   {
		String update_sql = "update pay set userid = '"+name+"'  where Id = "+Id+";";
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
	//修改pay表的state
	public boolean update_payNum(int Id,String paynum)
   {
		String update_sql = "update pay set state = '已缴费',paynum = '"+paynum+"'  where Id = "+Id+";";
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
	//数据库全部查找函数，返回结果集
	public ResultSet All_Select() 
	{
		//全部查询语句
		String All_Select = "select * from user";
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
}
