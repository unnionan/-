package com.admin;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class UpdateAdminInformation extends HttpServlet {

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
		 String UpdateLoginid = getString(request.getParameter("NewLoginid"));//要修改的账户名
		 String UpdateOldLoginpwd = getString(request.getParameter("OldLoginpwd"));//要修改的旧密码
		 String UpdateNewLoginpwd = getString(request.getParameter("NewLoginpwd"));//要修改的新密码
		 ServletRequest session = null;
		 int Id = Integer.parseInt(getString(request.getParameter("NId")));
		 AdminSql d = new AdminSql();
		 //建立数据库连接
		 d.establishConnection();
		 ResultSet re = d.Select(Id);
		 try {
			if(re.next())
			 {
				String pwd = re.getString(3);
				if(pwd.equals(UpdateOldLoginpwd))
				{
					if(d.update(UpdateLoginid, UpdateNewLoginpwd, Id))
					 {
						 response.getWriter().print("<script language = 'javascript'>alert('修改管理员信息成功')</script>");
						 response.setHeader("refresh","1;AdminButton.jsp");
					 }
					 else{
						 response.getWriter().print("<script language = 'javascript'>alert('修改管理员信息失败')</script>");
						 response.setHeader("refresh","1;AdminButton.jsp");
					 }
				}
				else
				{
					response.getWriter().print("<script language = 'javascript'>alert('旧密码输入错误')</script>");
					 response.setHeader("refresh","1;AdminButton.jsp");
				}
			 }
			else
			{
				response.getWriter().print("<script language = 'javascript'>alert('该Id不存在')</script>");
				 response.setHeader("refresh","1;AdminButton.jsp");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 //关闭数据库连接
		 d.CloseConnection();
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
