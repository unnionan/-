package com.student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.connection.JdbcConnect;

public class StudentSql {

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
	//数据库修改函数
	public boolean update_Student(int Id,String no,String name,String spe,String classes,String sex,String age,String tel,String drom,String loginid,String loginpwd,String state){
		String update_sql = "update student set no = '"+no+"' ,name = '"+name+"', spe = '"+spe+"' ,classes = '"+classes+"' ,sex = '"+sex+"',age = '"+age+"', tel = '"+tel+"' ,drom = '"+drom+"' ,loginid = '"+loginid+"', loginpwd = '"+loginpwd+"', state = '"+state+"' where Id = "+Id+";";
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
	//修改学生密码
	public boolean update_StudentPwd(int Id,String loginpwd){
		String update_sql = "update student set loginpwd = '"+loginpwd+"' where Id = "+Id+";";
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
	//修改学生state
	public boolean update_StudentState(int Id){
		String update_sql = "update student set state = '"+"已报道"+"' where Id = "+Id+";";
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
	//数据库单个查找函数，返回结果集
	public ResultSet Select(int id){
		//建立数据库连接
		//establishConnection();
		//单个查询语句
		String Select_sql = "select * from student where Id = "+id+";";
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
		try {
			re = select.executeQuery(Select_sql);
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
	//学生表插入
	public boolean insert_student(int Id,String no,String name,String spe,String classes,String sex,String age,String tel,String drom,String loginid,String loginpwd)
	{
		String insert_student = "insert into student values(?,?,?,?,?,?,?,?,?,?,?,?);";
		PreparedStatement insert = null;
		try {
			insert = connect.prepareStatement(insert_student);
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
			insert.setString(2, no);
			System.out.println("2成功！");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("2失败！");
		}
		try {
			insert.setString(3, name);
			System.out.println("3成功！");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("3失败！");
		}
		try {
			insert.setString(4, spe);
			System.out.println("4成功！");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("4失败！");
		}
		try {
			insert.setString(5, classes);
			System.out.println("5成功！");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("5失败！");
		}
		try {
			insert.setString(6, sex);
			System.out.println("6成功！");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("6失败！");
		}
		try {
			insert.setString(7, age);
			System.out.println("7成功！");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("7失败！");
		}
		try {
			insert.setString(8, tel);
			System.out.println("8成功！");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("8失败！");
		}
		try {
			insert.setString(9, drom);
			System.out.println("9成功！");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("9失败！");
		}
		try {
			insert.setString(10, loginid);
			System.out.println("10成功！");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("10失败！");
		}
		try {
			insert.setString(11, loginpwd);
			System.out.println("11成功！");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("11失败！");
		}
		try {
			insert.setString(12, "未报到");
			System.out.println("12成功！");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("12失败！");
		}
		int i = -1;
		try {
			i = insert.executeUpdate();
			 System.out.println("插入语句执行成功！");
			 return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("插入语句执行失败！");
			return false;
		}
	}
	//插入一卡通信息
	public boolean insert_card(int Id,String stuno,String no)
	{
		String insert_card = "insert into card values(?,?,?,?);";
		PreparedStatement insert = null;
		try {
			insert = connect.prepareStatement(insert_card);
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
			insert.setString(2, stuno);
			System.out.println("2成功！");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("2失败！");
		}
		try {
			insert.setString(3, no);
			System.out.println("3成功！");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("3失败！");
		}
		try {
			insert.setString(4, "0");
			System.out.println("4成功！");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("4失败！");
		}
		int i = -1;
		try {
			i = insert.executeUpdate();
			 System.out.println("插入语句执行成功！");
			 return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("插入语句执行失败！");
			return false;
		}
	}
	//插入宿舍信息
	public boolean insert_drom(int Id,String type,String no)
	{
		String insert_card = "insert into drom values(?,?,?,?,?,?);";
		PreparedStatement insert = null;
		try {
			insert = connect.prepareStatement(insert_card);
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
			insert.setString(2, type);
			System.out.println("2成功！");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("2失败！");
		}
		try {
			insert.setString(3, "1");
			System.out.println("3成功！");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("3失败！");
		}
		try {
			insert.setString(4, "文达");
			System.out.println("4成功！");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("4失败！");
		}
		try {
			insert.setString(5, no);
			System.out.println("5成功！");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("5失败！");
		}
		try {
			insert.setString(6, "住人");
			System.out.println("6成功！");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("6失败！");
		}
		int i = -1;
		try {
			i = insert.executeUpdate();
			 System.out.println("插入语句执行成功！");
			 return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("插入语句执行失败！");
			return false;
		}
	}
	//查找宿舍信息
	public ResultSet Select_drom(String no){
		//建立数据库连接
		//establishConnection();
		//单个查询语句
		String Select_sql = "select * from drom where no = '"+no+"';";
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
		try {
			re = select.executeQuery(Select_sql);
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
	//查找全部宿舍
	public ResultSet select_allDrom()
	{
		//全部查询语句
		String All_Select = "select * from drom";
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
		return rs;
	}
	//更新部分宿舍信息
	public boolean update_drom(String num,String no)
	{
		String update_sql = "update drom set num = '"+num+"' where no = '"+no+"';";
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
	//整体更新宿舍信息
	public boolean update_dromAll(int Id,String type,String num,String building,String no,String comment)
	{
		String update_sql = "update drom set type = '"+type+"',num = '"+num+"',building = '"+building+"',no = '"+no+"',comment = '"+comment+"' where Id = "+Id+";";
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
	//查找一卡通Id
	public ResultSet Select_card(int id){
		//建立数据库连接
		//establishConnection();
		//单个查询语句
		String Select_sql = "select * from card where Id = "+id+";";
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
		try {
			re = select.executeQuery(Select_sql);
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
	//查找体检表Id
	public ResultSet Select_healcheck(int id){
		//建立数据库连接
		//establishConnection();
		//单个查询语句
		String Select_sql = "select * from healcheck where Id = "+id+";";
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
		try {
			re = select.executeQuery(Select_sql);
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
	//体检表插入
	public boolean insert_healcheck(int Id,String stuno)
	{
		String insert_student = "insert into healcheck values(?,?,?,?,?,?,?,?,?);";
		PreparedStatement insert = null;
		try {
			insert = connect.prepareStatement(insert_student);
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
			insert.setString(2, stuno);
			System.out.println("2成功！");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("2失败！");
		}
		try {
			insert.setString(3, "未测量");
			System.out.println("3成功！");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("3失败！");
		}
		try {
			insert.setString(4, "未测量");
			System.out.println("4成功！");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("4失败！");
		}
		try {
			insert.setString(5, "未测量");
			System.out.println("5成功！");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("5失败！");
		}
		try {
			insert.setString(6, "未测量");
			System.out.println("6成功！");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("6失败！");
		}
		try {
			insert.setString(7, "未测量");
			System.out.println("7成功！");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("7失败！");
		}
		try {
			insert.setString(8, "未测量");
			System.out.println("8成功！");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("8失败！");
		}
		try {
			insert.setString(9, "未测量");
			System.out.println("9成功！");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("9失败！");
		}
		int i = -1;
		try {
			i = insert.executeUpdate();
			 System.out.println("插入语句执行成功！");
			 return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("插入语句执行失败！");
			return false;
		}
	}
	//体检表修改
	public boolean update_healcheck(int Id,String stuno,String height,String weight,String vision,String blood,String liver,String comment)
	{
		String update_sql = "update healcheck set stuno = '"+stuno+"',height = '"+height+"',weight = '"+weight+"',vision = '"+vision+"',blood = '"+blood+"',liver = '"+liver+"',comment = '"+comment+"',state = '"+"已测量"+"' where Id = "+Id+";";
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
	public ResultSet select_allStudent()
	{
		//全部查询语句
		String All_Select = "select * from student";
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
		return rs;
	}
	public ResultSet select_allHealcheck()
	{
		//全部查询语句
		String All_Select = "select * from healcheck";
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
		return rs;
	}
	public ResultSet select_allCard()
	{
		//全部查询语句
		String All_Select = "select * from card";
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
		return rs;
	}
	public ResultSet select_allPay()
	{
		//全部查询语句
		String All_Select = "select * from pay;";
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
		return rs;
	}
	//修改一卡通充值金额
	public boolean updateCard_state(int Id,String state)
	{
		String update_sql = "update card set state = '"+state+"' where Id = "+Id+";";
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

