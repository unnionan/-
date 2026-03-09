package com.student;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class GetStudentHealcheck extends HttpServlet {

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
		String stuno = getString(request.getParameter("stuno"));
		String height = getString(request.getParameter("height"));
		String weight = getString(request.getParameter("weight"));
		String vision = getString(request.getParameter("vision"));
		String blood = getString(request.getParameter("blood"));
		String liver = getString(request.getParameter("liver"));
		String comment = getString(request.getParameter("comment"));
		StudentSql d = new StudentSql();
		d.establishConnection();
		int Id = Integer.parseInt(getString(request.getParameter("Id")));
		/*
		Random r = new Random();
		while(true)
		{
			//生成随机数
			Id = r.nextInt(99999999);
			//Id作为主键，保证数据库中没有重复的，先查找，确定数据库中没有该Id，执行插入操作
			ResultSet sdf = d.Select_healcheck(Id);
				try {
					if(sdf.next())//说明该Id存在
					{
						continue;
					}
					else//说明该Id不存在
					{
						break;
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

		}
		d.CloseConnection();
		d.establishConnection();
		*/
		//Id值不重复，执行插入数据库操作
		if(d.update_healcheck(Id,stuno,height,weight,vision,blood,liver,comment))
		{
			System.out.println("该学生信息已成功插入到数据库中的healcheck表中");
			response.getWriter().print("<script language = 'javascript'>alert('填写学生体检信息成功')</script>");
			HttpSession session = request.getSession();
			response.setHeader("refresh","1;StudentButtom.jsp");
		}
		else
		{
			System.out.println("该学生信息插入到数据库中的healcheck表操作失败");
			response.getWriter().print("<script language = 'javascript'>alert('填写学生体检信息失败')</script>");
			HttpSession session = request.getSession();
			response.setHeader("refresh","1;StudentButtom.jsp");
		}
		d.CloseConnection();
	}

}
