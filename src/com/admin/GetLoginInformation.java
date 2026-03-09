package com.admin;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.mail.Session;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class GetLoginInformation extends HttpServlet {

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
		int Id = Integer.parseInt((request.getParameter("Id")));
		String loginid = getString(request.getParameter("loginid"));
		String loginpwd = getString(request.getParameter("loginpwd"));
		AdminSql c = new AdminSql();
		//建立数据库连接
		c.establishConnection();
		ResultSet re = c.Select(Id);
		try {
			if(re.next())//该管理员存在，确定loginid与loginpwd是否与数据库中的数据一致
			{
				String getloginid = re.getString(2);
				String getloginpwd = re.getString(3);
				if(loginid.equals(getloginid) && loginpwd.equals(getloginpwd))
				{
					response.getWriter().print("<script language = 'javascript'>alert('登陆信息正确')</script>");
					HttpSession session = request.getSession();
					session.setAttribute("nowId",Id);
					session.setAttribute("nowLoginid", loginid);
					response.setHeader("refresh","1;AdminOperation.jsp");
				}
				else
				{
					response.getWriter().print("<script language = 'javascript'>alert('登陆信息错误')</script>");
					response.setHeader("refresh","1;AdminLogin.jsp");
				}
			}
			else//该管理员不存在，跳出弹窗提示不存在，后再次进入登陆页面
			{
				response.getWriter().print("<script language = 'javascript'>alert('登陆信息错误')</script>");
				response.setHeader("refresh","1;AdminLogin.jsp");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//关闭数据库连接
		c.CloseConnection();
	}

}
