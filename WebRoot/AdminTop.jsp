<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title></title>
    <meta http-equiv = "Content-Type" content = "text/html;charset = UTF-8">
  </head>
  
  <body style = "background:url(image/AdminTop.jpg);">
    <center>
       <h1>管理员操作系统</h1>
       <%
       //session.setAttribute("nowId",123);
	   //session.setAttribute("nowLoginid", 4556);
        String nowId = new String((session.getAttribute("nowId").toString()).getBytes("ISO-8859-1"),"utf-8");
        String nowLoginid =(String)session.getAttribute("nowLoginid");
        %>
    </center>
    <h6 align = "right"><a href = "AdminNow.jsp" target = "main">当前管理员&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href = "AdminUpdate.jsp" target = "main">管理员信息修改</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href = "AllLogin.jsp" target = "AllLogin.jsp">退出登录</a></h6>
  </body>
</html>
