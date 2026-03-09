<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
  </head>
  
  <body style = "background:url(image/AdminLogin.jpg);background-size:100% 100%;background-attachment:fixed">
  <form action = "GetLoginInformation.do" method = "get">
     <table align = "center" valign = "middle" width = "90%" height = "10%" border = "0" cellpadding = "2">
    <tr height = "50" valign = "middle">
       <th width = "66%" colspan = "1">管理员登陆</th>
    </tr>
    <tr algin = "center" height = "50" valign = "middle">
         <td width = "22%" align = "center">Id:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type = "text" name = "Id"></td>
      </tr>
      <tr algin = "center" height = "50" valign = "middle">
         <td width = "22%" align = "center">Loginid:&nbsp;<input type = "text" name = "loginid"></td>
      </tr>
      <tr algin = "center" height = "50" valign = "middle">
         <td width = "22%" align = "center">loginpwd:<input type = "password" name = "loginpwd"></td>
      </tr>
      <tr>
         <td width = "22%" align = "center"><input type = "submit" value = "登陆" ></td>
      </tr>
      <tr>
           <td><label style = "float : right ; color : #858585; margin-right :80px;margin-top:10px;font-size:14px">没有账号<a href = "AdminRegister.jsp">去注册</a></td>
        </tr>
      </table>
  </form>
  </body>
</html>
