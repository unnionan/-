<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>

  </head>
  
  <body style = "background:url(image/WelcomePage.jpg);background-size:100% 100%;background-attachment:fixed">
  <br>
  <br>
  <br>
  <br>
  <hr>
  <h1><b><center>欢迎使用新生管理系统</center></b></h1>
  <br>
  <hr>
    <a href = "StudentRegister.jsp" ><h1><b><center>点击进入</center></b></h1></a>
    <%--进行学生注册，注册同时注册了体检表，家长用户表，后跳到用户修改页面，修改同时注册缴费表 --%>
  </body>
</html>
