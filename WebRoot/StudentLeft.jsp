<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'left.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body style = "background:url(image/StudentLeft.jpg);">
    <br>
    <p>
    <a href="StudentUpdateState.jsp" target="Student">进行报道</a>
    </p>
    <br>
    <p>
    <a href="StudentUpdatePwd.jsp" target="Student">修改登陆密码</a>
    </p>
    <br>
    <p>
    <a href="StudentCreateCard.jsp" target="Student">申请一卡通</a>
    </p>
    <br>
    <p>
    <a href="StudentUpdateInformation.jsp" target="Student">修改学生信息</a>
    </p>
    <br>
    <p>
    <a href="StudentHealcheck.jsp" target="Student">录入体检信息</a>
    </p>
  </body>
</html>
