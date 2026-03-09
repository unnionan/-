<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>

  </head>
  
  <body style = "background:url(image/AdminRegister.jpg);background-size:100% 100%;background-attachment:fixed">
    <form action = "GetRegisterInformation.do" accept = "get">
      <table align = "center" valign = "middle" width = "90%" height = "10%" border = "0" cellpadding = "2">
      <tr height = "50" valign = "middle">
                <th width = "66%" colspan = "1">管理员信息注册</th>
           </tr>
      <tr height = "50" valign = "middle">
      <td width = "22%" align = "center">设置登陆账号：<input type = "text" name = "RegisterLoginid" value = "只能设置为11位数字" min = "11" max = "11" step = "0.5"  oninput = "value=value.replace(/[^\d]/g,'')"></td>
      </tr>
      <tr height = "50" valign = "middle">
      <td width = "22%" align = "center">设置登陆密码：<input type = "password" name = "Registerloginpwd"></td>
      </tr>
      <tr height = "50" valign = "middle">
      <td width = "22%" align = "center" colspan = "1"><input type = "submit" value = "提交"></td>
      </tr>
      </table>
    </form>
  </body>
</html>
