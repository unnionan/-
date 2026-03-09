<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
   <script type = "text/javascript">
   function regis()
   {
       var newid = document.getElementById(NewLoginid).value;
       var oldpwd = document.getElementById(OldLoginpwd).value;
       var newpwd = document.getElementById(NewLoginpwd).value;
       if(odlpwd != newpwd) return false;
       document.update.submit();
   }
   </script>
  </head>
  
  <body style = "background:url(image/AdminUpdate.jpg);background-size:100% 100%;background-attachment:fixed">
  <form action = "UpdateAdminInformation.do" accept = "get" name = "update">
      <table align = "center" valign = "middle" width = "25%" height = "50%" border = "0" cellpadding = "2">
           <tr height = "50" valign = "middle">
                <th width = "66%" colspan = "1"><b><font color = "white">管理员信息修改</th>	
           </tr>
           <tr algin = "center" height = "50" valign = "middle">
                <td width = "22%" align = "center"><b><font color = "white">请输入Id:<input type = "text" name = "NId" ></td>
           </tr>
           <tr algin = "center" height = "50" valign = "middle">
                <td width = "22%" align = "center"><b><font color = "white">请输入新用户名:<input type = "text" name = "NewLoginid" ></td>
           </tr>
           <tr algin = "left" height = "50" valign = "middle">
                <td width = "22%" align = "center"><b><font color = "white">请输入旧密码:&nbsp;&nbsp;&nbsp;&nbsp;<input type = "text" name = "OldLoginpwd"></td>
           </tr>
           <tr algin = "center" height = "50" valign = "middle">
                <td width = "22%" align = "center"><b><font color = "white">请输入新密码:&nbsp;&nbsp;&nbsp;&nbsp;<input type = "text" name = "NewLoginpwd"></td>
           </tr>
           <tr  algin = "center" height = "50" valign = "middle">
                <td width = "22%" align = "center"><input type = "submit" value = "确定修改信息" ></td>
           </tr>
      </table>
      <% 
      String nowId = new String((session.getAttribute("nowId").toString()).getBytes("ISO-8859-1"),"utf-8");
        String nowLoginid = new String((session.getAttribute("nowLoginid").toString()).getBytes("ISO-8859-1"),"utf-8");
        //request.setAttribute("nowId",nowId);
      %>
  </form>
  </body>
</html>
