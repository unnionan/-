<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>

  </head>
  
  <body style = "background:url(image/DromUpdate.jpg);background-size:100% 100%;background-attachment:fixed">
    <form action = "GetDromUpdate.do" accept = "get" name = "update">
      <table align = "center" valign = "middle" width = "25%" height = "50%" border = "0" cellpadding = "2">
           <tr height = "50" valign = "middle">
                <th width = "66%" colspan = "1"><b>宿舍信息修改</th>	
           </tr>
           
           <tr algin = "center" height = "50" valign = "middle">
                <td width = "22%" align = "center"><b><font color = "white">请输入Id:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type = "text" name = "DromId"></td>
           </tr>
           <tr algin = "left" height = "50" valign = "middle">
                <td width = "22%" align = "center"><b><font color = "white">请输入type:&nbsp;&nbsp;&nbsp;&nbsp;<input type = "text" name = "type"></td>
           </tr>
           <tr algin = "center" height = "50" valign = "middle">
                <td width = "22%" align = "center"><b><font color = "white">请输入num:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type = "text" name = "num"></td>
           </tr>
           <tr algin = "center" height = "50" valign = "middle">
                <td width = "22%" align = "center"><b><font color = "white">请输入building:<input type = "text" name = "building"></td>
           </tr>
           <tr algin = "left" height = "50" valign = "middle">
                <td width = "22%" align = "center"><b><font color = "white">请输入no:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type = "text" name = "no" ></td>
           </tr>
           <tr algin = "center" height = "50" valign = "middle">
                <td width = "22%" align = "center"><b><font color = "white">请输入comment:<input type = "text" name = "comment" ></td>
           </tr>
           <tr  algin = "center" height = "50" valign = "middle">
                <td width = "22%" align = "center"><input type = "submit" value = "确定修改信息" ></td>
           </tr>
      </table>
  </form>
  </body>
</html>
