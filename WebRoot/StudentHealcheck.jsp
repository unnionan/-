<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  </head>
  
  <body style = "background:url(image/StudentHealcheck.jpg);background-size:100% 100%;background-attachment:fixed">
    <form action = "GetStudentHealcheck.do" method = "get">
     <table align = "center" valign = "middle" width = "90%" height = "10%" border = "0" cellpadding = "2">
    <tr height = "50" valign = "middle">
       <th width = "66%" colspan = "1">填写学生体检信息</th>
    </tr>
      <tr algin = "center" height = "50" valign = "middle">
         <td width = "22%" align = "center"><b>Id:&nbsp;&nbsp;<input type = "text" name = "Id"></td>
      </tr>
      <tr algin = "center" height = "50" valign = "middle">
         <td width = "22%" align = "center"><b>stuno:&nbsp;&nbsp;<input type = "text" name = "stuno"></td>
      </tr>
      <tr algin = "center" height = "50" valign = "middle">
         <td width = "22%" align = "center"><b>height:&nbsp;<input type = "text" name = "height"></td>
      </tr>
      <tr algin = "center" height = "50" valign = "middle">
         <td width = "22%" align = "center"><b>weight:&nbsp;<input type = "text" name = "weight"></td>
      </tr>
      <tr algin = "center" height = "50" valign = "middle">
         <td width = "22%" align = "center"><b>vision:&nbsp;<input type = "text" name = "vision"></td>
      </tr>
      <tr algin = "center" height = "50" valign = "middle">
         <td width = "22%" align = "center"><b>blood:&nbsp;&nbsp;<input type = "text" name = "blood"></td>
      </tr>
      <tr algin = "center" height = "50" valign = "middle">
         <td width = "22%" align = "center"><b>liver:&nbsp;&nbsp;<input type = "text" name = "liver"></td>
      </tr>
      <tr algin = "center" height = "50" valign = "middle">
         <td width = "22%" align = "center"><b>comment:<input type = "text" name = "comment"></td>
      </tr>
      <tr>
         <td width = "22%" align = "center"><input type = "submit" value = "登录" ></td>
      </tr>
      </table>
  </form>
  </body>
</html>
