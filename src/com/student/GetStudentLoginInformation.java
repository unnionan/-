package com.student;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.sql.ResultSet;
import java.io.PrintWriter;
import java.sql.SQLException;
import com.connection.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class GetStudentLoginInformation extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

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
		//注册学生信息的同时，增加体检信息
		response.setContentType("text/html; charset=utf-8");
		String loginid = getString(request.getParameter("Loginid"));
		String loginpwd = getString(request.getParameter("Loginpwd"));
		int id = Integer.parseInt(getString(request.getParameter("Id")));
		StudentSql c = new StudentSql();
		//建立数据库连接
		c.establishConnection();
		ResultSet re = c.Select(id);
		try {
			if(re.next())//该学生存在，确定loginid与loginpwd是否与数据库中的数据一致
			{
				String getloginid = re.getString(10);
				String getloginpwd = re.getString(11);
				if(loginid.equals(getloginid) && loginpwd.equals(getloginpwd))
				{
					response.getWriter().print("<script language = 'javascript'>alert('登陆信息正确')</script>");
					HttpSession session = request.getSession();
					session.setAttribute("nowStudentId",id);
					session.setAttribute("nowStudentLoginid", loginid);
					response.setHeader("refresh","1;StudentButtom.jsp");
				}
				else
				{
					response.getWriter().print("<script language = 'javascript'>alert('登陆信息错误')</script>");
					response.setHeader("refresh","1;StudentLogin.jsp");
				}
			}
			else//该管理员不存在，跳出弹窗提示不存在，后再次进入登陆页面
			{
				response.getWriter().print("<script language = 'javascript'>alert('登陆信息错误')</script>");
				response.setHeader("refresh","1;StudentLogin.jsp");
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//关闭数据库连接
		c.CloseConnection();
	}

}
