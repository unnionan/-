<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
//GetRegisterInformation.do
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>

  </head>
  
  <body style = "background:url(image/StudentRegister.png);background-size:100% 100%;background-attachment:fixed">
    <form action = "GetStudentRegisterInformation.do" accept = "get">
     <table align = "center" valign = "middle" width = "90%" height = "10%" border = "0" cellpadding = "2">
    <tr height = "50" valign = "middle">
       <th width = "66%" colspan = "1"><b><font color = "white">学生注册</th>
    </tr>
    <tr algin = "center" height = "50" valign = "middle">
         <td width = "22%" align = "center"><b><font color = "blue">设置no学号:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type = "text" name = "no"step = "0.5"  oninput = "value=value.replace(/[^\d]/g,'')"></td>
      </tr>
      <tr algin = "center" height = "50" valign = "middle">
         <td width = "22%" align = "center"><b><font color = "blue">设置name姓名:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type = "text" name = "name"></td>
      </tr>
      <tr algin = "center" height = "50" valign = "middle">
         <td width = "22%" align = "center"><b><font color = "blue">设置spe系别:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type = "text" name = "spe"></td>
      </tr>
      <tr algin = "center" height = "50" valign = "middle">
         <td width = "22%" align = "center"><b><font color = "blue">设置classes班级:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type = "text" name = "classes"></td>
      </tr>
      <tr algin = "center" height = "50" valign = "middle">
         <td width = "22%" align = "center"><b><font color = "blue">设置sex性别:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type = "text" name = "sex"></td>
      </tr>
      <tr algin = "center" height = "50" valign = "middle">
         <td width = "22%" align = "center"><b><font color = "blue">设置age年龄:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type = "text" name = "age"></td>
      </tr>
      <tr algin = "center" height = "50" valign = "middle">
         <td width = "22%" align = "center"><b><font color = "blue">设置tel电话号码:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type = "text" name = "tel"></td>
      </tr>
      <tr algin = "center" height = "50" valign = "middle">
         <td width = "22%" align = "center"><b><font color = "blue">设置drom宿舍:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type = "text" name = "drom"></td>
      </tr>
      <tr algin = "center" height = "50" valign = "middle">
         <td width = "22%" align = "center"><b><font color = "blue">设置loginid登录名:&nbsp;&nbsp;&nbsp;<input type = "text" name = "loginid"></td>
      </tr>
      <tr algin = "center" height = "50" valign = "middle">
         <td width = "22%" align = "center"><b><font color = "blue">设置loginpwd登陆密码:<input type = "text" name = "loginpwd"></td>
      </tr>
      <tr>
         <td width = "22%" align = "center"><input type = "submit" value = "提交" ></td>
      </tr>
      </table>
  </form>
  </body>
</html>
