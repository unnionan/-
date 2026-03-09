package com.student;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetStudentUpdateInformation extends HttpServlet {

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
		String no = getString(request.getParameter("no"));
		String name = getString(request.getParameter("name"));
		String spe = getString(request.getParameter("spe"));
		String classes = getString(request.getParameter("classes"));
		String sex = getString(request.getParameter("sex"));
		String age = getString(request.getParameter("age"));
		String tel = getString(request.getParameter("tel"));
		String drom = getString(request.getParameter("drom"));
		String loginid = getString(request.getParameter("loginid"));
		String loginpwd = getString(request.getParameter("loginpwd"));
		String state = getString(request.getParameter("state"));
		StudentSql b = new StudentSql();
		//打开数据库连接
		b.establishConnection();
		if(b.update_Student(Id, no, name, spe, classes, sex, age, tel, drom, loginid,loginpwd,state))
		 {
			 response.getWriter().print("<script language = 'javascript'>alert('修改学生信息成功')</script>");
			 response.setHeader("refresh","1;StudentButtom.jsp");
		 }
		 else{
			 response.getWriter().print("<script language = 'javascript'>alert('修改学生信息失败')</script>");
			 response.setHeader("refresh","1;StudentButtom.jsp");
		 }
		//关闭数据库连接
		b.CloseConnection();
	}

}
