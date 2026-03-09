package com.student;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.user.UserSql;


public class GetStudentRegisterInformation extends HttpServlet {

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	//变换字符编码格式的函数
	String getString(String s) throws UnsupportedEncodingException{
		return new String(s.getBytes("ISO-8859-1"),"utf-8");
	}
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html; charset=utf-8");
		StudentSql a = new StudentSql();
		//建立数据库连接
		a.establishConnection();
		//接收数据
		//int loginid = Integer.parseInt(getString(request.getParameter("loginid")));
		String no= getString(request.getParameter("no"));
		String name= getString(request.getParameter("name"));
		String spe= getString(request.getParameter("spe"));
		String classes= getString(request.getParameter("classes"));
		String sex= getString(request.getParameter("sex"));
		String age= getString(request.getParameter("age"));
		String tel= getString(request.getParameter("tel"));
		String drom= getString(request.getParameter("drom"));
		String loginid= getString(request.getParameter("loginid"));
		String loginpwd= getString(request.getParameter("loginpwd"));
		int Id = 0;
		Random r = new Random();
		while(true)
		{
			//生成随机数
			Id = r.nextInt(99999999);
			//Id作为主键，保证数据库中没有重复的，先查找，确定数据库中没有该Id，执行插入操作
			ResultSet sdf = a.Select(Id);
				try {
					if((a.Select(Id)).next())//说明该Id存在
					{
						continue;
					}
					else//说明该Id不存在
					{
						break;
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

		}
		a.CloseConnection();
		a.establishConnection();
		//Id值不重复，执行插入数据库操作
		if(a.insert_student(Id,no,name,spe,classes,sex,age,tel,drom,loginid,loginpwd))
		{
			System.out.println("该学生信息已成功插入到数据库中的student表中");
			response.getWriter().print("<script language = 'javascript'>alert('注册学生信息成功')</script>");
			if(a.insert_healcheck(Id, no))
			{
				System.out.println("该学生体检信息已成功插入到数据库中的healcheck表中");
			}
			UserSql b = new UserSql();
			b.establishConnection();
			if(b.insert(Id, no))
			{
				System.out.println("该学生的家长预填写信息已成功插入到数据库中的user表中");
			}
			if(b.insertPay(Id, no))
			{
				System.out.println("该用户的预缴费信息已成功插入到数据库中的pay表中");
			}
			
			//先查找宿舍信息，确定宿舍是否存在。存在，则增加人数，不存在，则增加宿舍
			ResultSet re_drom = a.Select_drom(drom);
			try {
				if(re_drom.next())//宿舍存在
				{
					String num = re_drom.getString(3);
					int n = (Integer.parseInt(num))+1;
					String new_num = Integer.toString(n);
					//更新宿舍
					if(a.update_drom(new_num, drom))
					{
						System.out.println("宿舍增加人数成功");
					}
				}
				else//宿舍不存在，增加宿舍
				{
					int drom_id = r.nextInt(999);
					if(a.insert_drom(drom_id, sex, drom))
					{
						System.out.println("成功插入新宿舍");
					}
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			b.CloseConnection();
			HttpSession session = request.getSession();
			session.setAttribute("Id", Id);
			response.setHeader("refresh","1;UserRegister.jsp");
		}
		else
		{
			System.out.println("该管理员信息插入到数据库中的student表操作失败");
			response.getWriter().print("<script language = 'javascript'>alert('注册学生信息失败')</script>");
			HttpSession session = request.getSession();
			response.setHeader("refresh","1;StudentRegister.jsp");
		}
		a.CloseConnection();
	}

}