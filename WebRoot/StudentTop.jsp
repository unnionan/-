<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>

  </head>
   
  <body style = "background:url(image/StudentLeft.jpg);">
    <center>
       <h1>学生操作系统</h1>
       <%
       //session.setAttribute("nowId",123);
	   //session.setAttribute("nowLoginid", 4556);
        String nowId = new String((session.getAttribute("nowStudentId").toString()).getBytes("ISO-8859-1"),"utf-8");
        String nowLoginid =(String)session.getAttribute("nowStudentLoginid");
        %>
    </center>
       <h6 align = "right"><a href = "AllLogin.jsp" target = "AllLogin.jsp">退出登录</a></h6>
  </body>
</html>
