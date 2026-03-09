<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  </head>
  
  <body style = "background:url(image/UserNow.jpg);background-size:100% 100%;background-attachment:fixed">
    <%
       //session.setAttribute("nowId",123);
	   //session.setAttribute("nowLoginid", 4556);
        String nowId = new String((session.getAttribute("nowUserId").toString()).getBytes("ISO-8859-1"),"utf-8");
        String nowLoginid =(String)session.getAttribute("nowUserLoginid");
        %>
        <br>
        <br>
        <br>
        <h1><center>当前用户Id:&nbsp;&nbsp;&nbsp;&nbsp;<%=nowId %>
        <br>
        <br>
        <br>
        <br>当前用户名称：<%=nowLoginid %>
  </body>
</html>
