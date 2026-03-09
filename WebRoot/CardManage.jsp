<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  </head>
  
  <body style = "background:url(image/CardManage.jpg);background-size:100% 100%;background-attachment:fixed">
    <form action = "GetCardCharge.do" accept = "get">
      <table align = "center" valign = "middle" width = "90%" height = "10%" border = "0" cellpadding = "2">
      <tr height = "50" valign = "middle">
                <th width = "66%" colspan = "1">一卡通充值</th>
           </tr>
           <tr height = "50" valign = "middle">
      <td width = "22%" align = "center"><b>请输入卡号:</b><input type = "text" name = "CardId"></td>
      </tr>
      <tr height = "50" valign = "middle">
      <td width = "22%" align = "center"><b>请输入金额:</b><input type = "text" name = "charge"  min = "11" max = "11" step = "0.5"  oninput = "value=value.replace(/[^\d]/g,'')"></td>
      </tr>
      <tr height = "50" valign = "middle">
      <td width = "22%" align = "center" colspan = "1"><input type = "submit" value = "提交"></td>
      </tr>
      </table>
    </form>
  </body>
</html>
