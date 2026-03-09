package com.user;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetPayState extends HttpServlet {

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
		int Id = Integer.parseInt(getString(request.getParameter("getPayId")));
		String paynum = getString(request.getParameter("getPayNum"));
		UserSql d = new UserSql();
		d.establishConnection();
		try {
			if(d.Select_pay(Id).next())
			{
				if(d.update_payNum(Id, paynum))
				{
					response.getWriter().print("<script language = 'javascript'>alert('缴费成功')</script>");
					 response.setHeader("refresh","1;StudentButtom.jsp");
				}
				else
				{
					response.getWriter().print("<script language = 'javascript'>alert('缴费失败')</script>");
					 response.setHeader("refresh","1;StudentButtom.jsp");
				}
			}
			else
			{
				response.getWriter().print("<script language = 'javascript'>alert('Id不存在')</script>");
				 response.setHeader("refresh","1;StudentButtom.jsp");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		d.CloseConnection();
	}
}
