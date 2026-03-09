<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

  </head>
  
  <body style = "background:url(image/StudentUpdatePwd.jpg);background-size:100% 100%;background-attachment:fixed">
    <form action = "GetStudentUpdatePwd.do" accept = "get">
      <table align = "center" valign = "middle" width = "25%" height = "50%" border = "0" cellpadding = "2">
           <tr height = "50" valign = "middle">
                <th width = "66%" colspan = "1">学生密码修改</th>	
           </tr>
           
           <tr algin = "center" height = "50" valign = "middle">
                <td width = "22%" align = "center">请输入Id:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type = "text" name = "Id" ></td>
           </tr>
           <tr algin = "center" height = "50" valign = "middle">
                <td width = "22%" align = "center">请输入loginpwd:<input type = "text" name = "loginpwd" ></td>
           </tr>
           <tr  algin = "center" height = "50" valign = "middle">
                <td width = "22%" align = "center"><input type = "submit" value = "确定修改信息" onlick = "regis()"></td>
           </tr>
      </table>
  </form>
  </body>
</html>
