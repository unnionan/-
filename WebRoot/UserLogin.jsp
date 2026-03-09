<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    

  </head>
  
  <body style = "background:url(image/UserLogin.png);background-size:100% 100%;background-attachment:fixed">
  <form action="GetUserLoginInformation.do" accept="get">
       <table align = "center" valign = "middle" width = "90%" height = "10%" border = "0" cellpadding = "2">
    <tr height = "50" valign = "middle">
       <th width = "66%" colspan = "1"><b>用户登陆</b></th>
    </tr>
    <tr algin = "center" height = "50" valign = "middle">
         <td width = "22%" align = "center"><b>Id:</b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type = "text" name = "Id"></td>
      </tr>
      <tr algin = "center" height = "50" valign = "middle">
         <td width = "22%" align = "center"><b>用户名:</b> <input type="text" name="loginid" /></td>
      </tr>
      <tr algin = "center" height = "50" valign = "middle">
         <td width = "22%" align = "center"><b>密码 :</b>&nbsp;<input type="password" name="loginpwd" /></td>
      </tr>
      <tr>
         <td width = "22%" align = "center"><input type = "submit" value = "登陆" ></td>
      </tr>
      </table>
   </form>
  </body>
</html>
