<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>

  </head>
  
  <body style = "background:url(image/UserRegister.jpg);background-size:100% 100%;background-attachment:fixed">
    <form action="GetUserRegisterInformation.do" accept="get">
    
    <table align = "center" valign = "middle" width = "90%" height = "10%" border = "0" cellpadding = "2">
      <tr height = "50" valign = "middle">
                <th width = "66%" colspan = "1">用户信息注册</th>
           </tr>
      <tr height = "50" valign = "middle">
      <td width = "22%" align = "center">用户真实姓名: &nbsp;&nbsp;<input type="text" name="name" /></td>
      </tr>
      <tr height = "50" valign = "middle">
      <td width = "22%" align = "center">用户性别: &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="sex" /></td>
      </tr>
      <tr height = "50" valign = "middle">
      <td width = "22%" align = "center">用户年龄:&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="age" /><br/></td>
      </tr>
      <tr height = "50" valign = "middle">
      <td width = "22%" align = "center">用户电话: &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="tel" /></td>
      </tr>
      <tr height = "50" valign = "middle">
      <td width = "22%" align = "center">用户住址: &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="address" /></td>
      </tr>
      <tr height = "50" valign = "middle">
      <td width = "22%" align = "center">用户登陆账户名: <input type="text" name="loginid" /></td>
      </tr>
      <tr height = "50" valign = "middle">
      <td width = "22%" align = "center">用户登录密码:&nbsp;&nbsp; <input type="password" name="loginpwd" /></td>
      </tr>
      <tr height = "50" valign = "middle">
      <td width = "22%" align = "center" colspan = "1"><input type = "submit" value = "提交"></td>
      </tr>
      </table>
</form>
  </body>
</html>
