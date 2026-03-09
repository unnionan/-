package com.user;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetUserUpdateInformation extends HttpServlet {

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
		int Id = Integer.parseInt(getString(request.getParameter("Id")));
		String name = getString(request.getParameter("name"));
		String sex = getString(request.getParameter("sex"));
		String age = getString(request.getParameter("age"));
		String tel = getString(request.getParameter("tel"));
		String address = getString(request.getParameter("address"));
		String stuname = getString(request.getParameter("stuname"));
		String loginid = getString(request.getParameter("loginid"));
		String loginpwd = getString(request.getParameter("loginpwd"));
		UserSql f = new UserSql();
		f.establishConnection();
		if(f.update_user(Id, stuname, sex, age, tel, address, loginid, loginpwd))
		{
			response.getWriter().print("<script language = 'javascript'>alert('修改用户信息成功')</script>");
			 response.setHeader("refresh","1;AdminBottom.jsp");
		}
		else
		{
			response.getWriter().print("<script language = 'javascript'>alert('修改用户信息失败')</script>");
			 response.setHeader("refresh","1;AdminBottom.jsp");
		}
		f.CloseConnection();
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
