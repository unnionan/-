package com.user;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.sql.SQLException;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class GetUserRegisterInformation extends HttpServlet {

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

		String name = getString(request.getParameter("name"));
		String sex = getString(request.getParameter("sex"));
		String age = getString(request.getParameter("age"));
		String tel = getString(request.getParameter("tel"));
		String address = getString(request.getParameter("address"));
		//String stuname = getString(request.getParameter("stuname"));//学生学号
		String loginid = getString(request.getParameter("loginid"));
		String loginpwd = getString(request.getParameter("loginpwd"));
		UserSql a = new UserSql();
		//建立数据库连接
		a.establishConnection();
		HttpSession session = request.getSession();
		int Id = Integer.parseInt(new String((session.getAttribute("Id").toString()).getBytes("ISO-8859-1"),"utf-8"));
		a.establishConnection();
		//Id值不重复，执行插入数据库操作
		if(a.update_user(Id, name, sex, age, tel, address, loginid, loginpwd))
		{
			System.out.println("该用户信息已成功插入到数据库中的user表中");
			if(a.update_pay(Id,name))
			{
				System.out.println("该用户的预缴费信息家长姓名已成功修改");
				response.getWriter().print("<script language = 'javascript'>alert('注册用户信息成功')</script>");
			}
			response.setHeader("refresh","1;AllLogin.jsp");
		}
		else
		{
			System.out.println("该用户信息插入到数据库中的user表操作失败");
			response.getWriter().print("<script language = 'javascript'>alert('注册用户信息失败')</script>");
			response.setHeader("refresh","1;UserRegister.jsp");
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
