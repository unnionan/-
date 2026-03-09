package com.user;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class GetUserLoginInformation extends HttpServlet {

	//变换字符编码格式的函数
	String getString(String s) throws UnsupportedEncodingException{
		return new String(s.getBytes("ISO-8859-1"),"utf-8");
	}
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html; charset=utf-8");
		int Id = Integer.parseInt(getString(request.getParameter("Id")));
		String loginid = getString(request.getParameter("loginid"));
		String loginpwd = getString(request.getParameter("loginpwd"));
		UserSql c = new UserSql();
		c.establishConnection();
		ResultSet re = c.Select(Id);
		try {
			if(re.next())
			{
				String getloginid = re.getString(8);
				String getloginpwd = re.getString(9);
				if(loginid.equals(getloginid) && loginpwd.equals(getloginpwd))
				{
					response.getWriter().print("<script language = 'javascript'>alert('登陆信息正确')</script>");
					HttpSession session = request.getSession();
					session.setAttribute("nowUserId",Id);
					session.setAttribute("nowUserLoginid", loginid);
					response.setHeader("refresh","1;UserOperation.jsp");
				}
				else
				{
					response.getWriter().print("<script language = 'javascript'>alert('登陆信息错误')</script>");
					response.setHeader("refresh","1;UserLogin.jsp");
				}
			}
			else
			{
				response.getWriter().print("<script language = 'javascript'>alert('登陆信息错误')</script>");
				response.setHeader("refresh","1;UserLogin.jsp");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		c.CloseConnection();
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
