<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>

  </head>
  <body style = "background:url(image/PayUpdateState.png);background-size:100% 100%;background-attachment:fixed">
    <form action = "GetPayState.do" accept = "get">
      <table align = "center" valign = "middle" width = "90%" height = "10%" border = "0" cellpadding = "2">
      <tr height = "50" valign = "middle">
                <th width = "66%" colspan = "1"><b><font color = "white">确认学生缴费信息</font></th>
           </tr>
      <tr height = "50" valign = "middle">
      <td width = "22%" align = "center"><b><font color = "white">请输入Id:</font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type = "text" name = "getPayId"  step = "0.5"  oninput = "value=value.replace(/[^\d]/g,'')"></td>
      </tr>
      <tr height = "50" valign = "middle">
      <td width = "22%" align = "center"><b><font color = "white">请输入缴费金额:</font><input type = "text" name = "getPayNum" step = "0.5"  oninput = "value=value.replace(/[^\d]/g,'')"></td>
      </tr>
      <tr height = "50" valign = "middle">
      <td width = "22%" align = "center" colspan = "1"><input type = "submit" value = "提交"></td>
      </tr>
      </table>
    </form>
  </body>
</html>
