<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  <meta http-equiv="Content-Type"
content="text/html; charset=ISO-utf-8">
<title>一卡通申请页面</title>
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
  
  <body style = "background:url(image/StudentCreateCard.jpg);background-size:100% 100%;background-attachment:fixed">
  <br>
  <br>
  <br>
  <br>
  <br>
  <br>
    <div id="a">
<h1>申请一卡通</h1>
<form action="GetStudentCreateCard.do" method = "get">
<b>新生Id:&nbsp;&nbsp;&nbsp;<input type="text" name="id"/>
<br>
新生学号:</b>&nbsp;<input type="text" name="no"/>
<br>
<input type="submit" value="申请"/>&nbsp;&nbsp;&nbsp;
<input type="reset" value="清空"/>
</form>
</div>
  </body>
</html>
