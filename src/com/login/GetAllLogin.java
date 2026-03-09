package com.login;

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

import com.admin.AdminSql;
import com.student.StudentSql;
import com.user.UserSql;

public class GetAllLogin extends HttpServlet {

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
		String loginid = getString(request.getParameter("Loginid"));
		String loginpwd = getString(request.getParameter("Loginpwd"));
		String radiobutton = getString(request.getParameter("radiobutton"));
		String s1 = new String("管理员");
		String s2 = new String("用户");
		String s3 = new String("学生");
		if(s1.equals(radiobutton)){//管理员
			AdminSql m = new AdminSql();
			m.establishConnection();
			ResultSet Adminre = m.Select(Id);
			try {
				if(Adminre.next())//该管理员存在，确定loginid与loginpwd是否与数据库中的数据一致
				{
					String getloginid = Adminre.getString(2);
					String getloginpwd = Adminre.getString(3);
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
						response.setHeader("refresh","1;AllLogin.jsp");
					}
				}
				else//该管理员不存在，跳出弹窗提示不存在，后再次进入登陆页面
				{
					response.getWriter().print("<script language = 'javascript'>alert('登陆信息错误')</script>");
					response.setHeader("refresh","1;AllLogin.jsp");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            m.CloseConnection();
		}
		else if(s2.equals(radiobutton)){//用户
			UserSql n = new UserSql();
			n.establishConnection();
			ResultSet Userre = n.Select(Id);
			try {
				if(Userre.next())
				{
					String getloginid = Userre.getString(8);
					String getloginpwd = Userre.getString(9);
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
						response.setHeader("refresh","1;AllLogin.jsp");
					}
				}
				else
				{
					response.getWriter().print("<script language = 'javascript'>alert('登陆信息错误')</script>");
					response.setHeader("refresh","1;AllLogin.jsp");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            n.CloseConnection();
		}
		else if(s3.equals(radiobutton)){//学生
			StudentSql z = new StudentSql();
			z.establishConnection();
			ResultSet Studentre = z.Select(Id);
			try {
				if(Studentre.next())//该学生存在，确定loginid与loginpwd是否与数据库中的数据一致
				{
					String getloginid = Studentre.getString(10);
					String getloginpwd = Studentre.getString(11);
					if(loginid.equals(getloginid) && loginpwd.equals(getloginpwd))
					{
						response.getWriter().print("<script language = 'javascript'>alert('登陆信息正确')</script>");
						HttpSession session = request.getSession();
						session.setAttribute("nowStudentId",Id);
						session.setAttribute("nowStudentLoginid", loginid);
						response.setHeader("refresh","1;StudentOperation.jsp");
					}
					else
					{
						response.getWriter().print("<script language = 'javascript'>alert('登陆信息错误')</script>");
						response.setHeader("refresh","1;AllLogin.jsp");
					}
				}
				else//该管理员不存在，跳出弹窗提示不存在，后再次进入登陆页面
				{
					response.getWriter().print("<script language = 'javascript'>alert('登陆信息错误')</script>");
					response.setHeader("refresh","1;AllLogin.jsp");
					
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            z.CloseConnection();
		}else{
			response.getWriter().print("<script language = 'javascript'>alert('请从管理员、用户、学生中选择您的身份')</script>");
            response.setHeader("refresh","1;AllLogin.jsp");
		}
	}

}
