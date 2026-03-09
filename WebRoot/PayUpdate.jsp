<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>

  </head>
  
  <body style = "background:url(image/PayUpdate.jpg);background-size:100% 100%;background-attachment:fixed">
    <form action = "GetStudentLoginInformation.do" method = "get">
     <table align = "center" valign = "middle" width = "90%" height = "10%" border = "0" cellpadding = "2">
    <tr height = "50" valign = "middle">
       <th width = "66%" colspan = "1">缴费信息登记</th>
    </tr>
    <tr algin = "center" height = "50" valign = "middle">
         <td width = "22%" align = "center">Id:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type = "text" name = "Id"></td>
      </tr>
      <tr algin = "center" height = "50" valign = "middle">
         <td width = "22%" align = "center">登录账号：<input type = "text" name = "Loginid"></td>
      </tr>
      <tr algin = "center" height = "50" valign = "middle">
         <td width = "22%" align = "center">登录密码：<input type = "password" name = "Loginpwd"></td>
      </tr>
      <tr>
         <td width = "22%" align = "center"><input type = "submit" value = "登录" ></td>
      </tr>
      </table>
  </form>
  </body>
</html>
