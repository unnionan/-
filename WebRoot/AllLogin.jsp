<%@ page language="java" contentType="text/html;charset=utf-8"  pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD
HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type"
content="text/html; charset=ISO-utf-8">
<title>登录</title>
<style>
 #a {

    text-align:center;
}
</style>
</head>
<body style = "background:url(image/AllLogin.jpg);background-size:100% 100%;background-attachment:fixed">
<div id="a">
<br>
<br>
<br>

<h1>新生报到管理系统</h1>
<form action="GetAllLogin.do" accept="get">
<b>Id:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="Id"/>
<br>
登录账号：<input type = "text" name = "Loginid">
<br>
密码:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="password"name="Loginpwd"/>
<br>
<input type="radio" name="radiobutton" value="学生"/>学生&nbsp;&nbsp;&nbsp;
<input type="radio" name="radiobutton" value="用户"/>用户&nbsp;&nbsp;&nbsp;
<input type="radio" name="radiobutton" value="管理员"/>管理员
<br><br/></b>
<input type="submit" value="登录"/>&nbsp;&nbsp;&nbsp;
<input type="reset" value="清空"/>
</form>
</div>
</body>
</html>

