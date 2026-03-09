<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  </head>
  
  <body style = "background:url(image/AdminNow.jpg);background-size:100% 100%;background-attachment:fixed">
    <%
       //session.setAttribute("nowId",123);
	   //session.setAttribute("nowLoginid", 4556);
        String nowId = new String((session.getAttribute("nowId").toString()).getBytes("ISO-8859-1"),"utf-8");
        String nowLoginid =(String)session.getAttribute("nowLoginid");
        %>
        <br>
        <br>
        <h1><center><font color = "white">当前管理员Id:&nbsp;&nbsp;&nbsp;&nbsp;<%=nowId %><font color = "white">
        <br>
        <br>
        <br>
        <br><font color = "white">当前管理员名称：<%=nowLoginid %><font color = "white">
  </body>
</html>
