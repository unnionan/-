<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <meta http-equiv="Content-Type"content="text/html; charset=ISO-utf-8">
    <title>修改学生信息</title>
<style>
 #a {

    width:100%;
    height:600px;
    text-align:center;
}
body{
background-color:lightblue;
}
</style>
  </head>
  
  <body style = "background:url(image/StudentUpdateInformation.jpg);background-size:100% 100%;background-attachment:fixed">
    <div id="a"><b>
<h1>修改学生信息</h1>
<form action="GetStudentUpdateInformation.do" accept = "get">
Id:&nbsp;&nbsp;<input type="text" name="Id"/>
<br>
学号:&nbsp;&nbsp;<input type="text" name="no"/>
<br>
姓名:&nbsp;&nbsp;<input type="text" name="name"/>
<br>
专业:&nbsp;&nbsp;<input type="text" name="spe"/>
<br>
班级:&nbsp;&nbsp;<input type="text" name="classes"/>
<br>
性别:&nbsp;&nbsp;<input type="text" name="sex"/>
<br>
年龄:&nbsp;&nbsp;<input type="text" name="age"/>
<br>
电话:&nbsp;&nbsp;<input type="text" name="tel"/>
<br>
宿舍:&nbsp;&nbsp;<input type="text" name="drom"/>
<br>
登录名:<input type="text" name="loginid"/>
<br>
<br>
登录密码:<input type="password" name="loginpwd"/>
<br>
状态:&nbsp;&nbsp;<input type="radio" name="state" value="已到校"/>已到校&nbsp;&nbsp;<input type="radio" name="state" value="未到校"/>未到校
<br></b>
<br>
<input type="submit" value="确定"/>&nbsp;&nbsp;&nbsp;
<input type="reset" value="清空"/>
</form>
</div>
  </body>
</html>
