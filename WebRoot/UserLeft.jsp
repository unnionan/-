<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>

  </head>
  
  <body style = "background:url(image/UserLeft.jpg);">
    <br>
    <p>
    <a href="UserUpdateInformation.jsp" target="UserMain">修改用户信息</a>
    </p>
    <br>
    <p>
    <a href="UserUpdatePwd.jsp" target="UserMain">修改用户密码</a>
    </p>
    <br>
    <p>
    <a href="PayUpdateState.jsp" target="UserMain">缴费信息登记</a>
    </p>
    <br>
  </body>
</html>
