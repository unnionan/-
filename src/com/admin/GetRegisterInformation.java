package com.admin;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.connection.JdbcConnect;

public class GetRegisterInformation extends HttpServlet {

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws UnsupportedEncodingException 
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	
	//变换字符编码格式的函数
	String getString(String s) throws UnsupportedEncodingException{
		return new String(s.getBytes("ISO-8859-1"),"utf-8");
	}
	
	//servlet函数
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		AdminSql a = new AdminSql();
		//建立数据库连接
		a.establishConnection();
		//接收数据
		//int loginid = Integer.parseInt(getString(request.getParameter("loginid")));
		String loginid = getString(request.getParameter("RegisterLoginid"));
		String loginpwd = getString(request.getParameter("Registerloginpwd"));
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
		if(a.insert(Id,loginid,loginpwd))
		{
			System.out.println("该管理员信息已成功插入到数据库中的admin表中");
			response.getWriter().print("<script language = 'javascript'>alert('注册管理员信息成功')</script>");
			HttpSession session = request.getSession();
			response.setHeader("refresh","1;AdminBottom.jsp");
		}
		else
		{
			System.out.println("该管理员信息插入到数据库中的admin表操作失败");
			response.getWriter().print("<script language = 'javascript'>alert('注册管理员信息失败')</script>");
			HttpSession session = request.getSession();
			response.setHeader("refresh","1;AdminBottom.jsp");
		}
		//关闭数据库连接
		a.CloseConnection();
		/*
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out
				.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out.println("<HTML>");
		out.println("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");
		out.println("  <BODY>");
		out.print("    This is ");
		out.print(this.getClass());
		out.println(", using the GET method");
		out.println("  </BODY>");
		out.println("</HTML>");
		out.flush();
		out.close();
		*/
	}

}
