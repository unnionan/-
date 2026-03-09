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

public class GetStudentCreateCard extends HttpServlet {

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
		String no = getString(request.getParameter("id"));//学生的id
		String stuno = getString(request.getParameter("no"));//学生学号stuno
		StudentSql c = new StudentSql();
		//建立数据库连接
		c.establishConnection();
		int Id = 0;
		Random r = new Random();
		while(true)
		{
			//生成随机数
			Id = r.nextInt(99999999);
			//Id作为主键，保证数据库中没有重复的，先查找，确定数据库中没有该Id，执行插入操作
			ResultSet sdf = c.Select_card(Id);
				try {
					if((sdf.next()))//说明该Id存在
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
		//关闭数据库连接
		c.CloseConnection();
		c.establishConnection();
		//Id值不重复，执行插入数据库操作
		if(c.insert_card(Id,stuno,no))
		{
			System.out.println("该管理员信息已成功插入到数据库中的card表中");
			response.getWriter().print("<script language = 'javascript'>alert('注册学生一卡通信息成功')</script>");
			HttpSession session = request.getSession();
			response.setHeader("refresh","1;StudentButtom.jsp");
		}
		else
		{
			System.out.println("该管理员信息插入到数据库中的card表操作失败");
			response.getWriter().print("<script language = 'javascript'>alert('注册学生一卡通信息失败')</script>");
			HttpSession session = request.getSession();
			response.setHeader("refresh","1;StudentButtom.jsp");
		}
		c.CloseConnection();
	}

}