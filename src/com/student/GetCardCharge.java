package com.student;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class GetCardCharge extends HttpServlet {

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
		int Id = Integer.parseInt(getString(request.getParameter("CardId")));
		String state = getString(request.getParameter("charge"));
		StudentSql e = new StudentSql();
		e.establishConnection();
		ResultSet re = e.Select_card(Id);
		try {
			if(re.next())
			{
				if(e.updateCard_state(Id, state))
				{
					response.getWriter().print("<script language = 'javascript'>alert('充值成功')</script>");
					response.setHeader("refresh","1;AdminBottom.jsp");
				}
				else
				{
					response.getWriter().print("<script language = 'javascript'>alert('充值失败')</script>");
					response.setHeader("refresh","1;AdminBottom.jsp");
				}
			}
			else
			{
				response.getWriter().print("<script language = 'javascript'>alert('该卡号不存在')</script>");
				response.setHeader("refresh","1;AdminBottom.jsp");
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		e.CloseConnection();
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
