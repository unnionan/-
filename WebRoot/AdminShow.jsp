<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page import = "com.admin.AdminSql"%>
<%@ page import = "java.sql.*"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  <%
  AdminSql b = new AdminSql();
  b.establishConnection();
  ResultSet result = b.All_Select();
   %>
   <meta http-equiv = "Content-Type" content = "text/html;charset = UTF-8">
  <link href = "StyleSheet.css" rel = "stylesheet" type = "text/css"/>
  </head>
  <body style = "background:url(image/AdminShow.jpg);background-size:100% 100%;background-attachment:fixed">
  <div class="first-Table-Box">
    <table align = "center" valign = "middle" width = "90%" height = "10%" border = "1" cellpadding = "2" class="table-Box">
    <tr height = "50" valign = "middle" class="table-Tr">
       <th width = "66%" colspan = "3" class="table-Th"><div class="table-title" align = "center"><font color = "white">管理员信息展示</div></th>
    </tr>
      <tr algin = "center" height = "50" valign = "middle">
         <td width = "22%" align = "center"  class="table-Td"><div class="table-Lisdata"><span class="table-Lisdata-span"><b><font color = "white">Id</span></div></td>
         <td width = "22%" align = "center"  class="table-Td"><div class="table-Lisdata"><span class="table-Lisdata-span"><b><font color = "white">loginid</span></div></td>
         <td width = "22%" align = "center"  class="table-Td"><div class="table-Lisdata"><span class="table-Lisdata-span"><b><font color = "white">loginpwd</span></div></td>
      </tr>
      <% 
      int Id = 0;
	  String loginid = null;
	  String loginpwd = null;
        while(result.next())
        {
           Id = result.getInt("Id");
		   loginid = result.getString("loginid");
		   loginpwd = result.getString("loginpwd");
		   %>

		   <tr algin = "center" height = "50" valign = "middle">
              <td width = "22%" align = "center" ><b><font color = "white"><%= Id %></td>
              <td width = "22%" align = "center"><b><font color = "white"><%= loginid %></td>
              <td width = "22%" align = "center"><b><font color = "white"><%= loginpwd %></td>
           </tr>
		   <% 
        }
        b.CloseConnection();
      %>

      <%--
	  <tr algin = "center" height = "50" valign = "middle">
         <td width = "22%" align = "center"><%= Id %></td><td width = "22%" align = "center"><%= loginid %></td><td width = "22%" align = "center"><%= loginpwd %></td>
      </tr>
       --%>
    </table>
    </div>
    
    
    <br>
  </body>
</html>
