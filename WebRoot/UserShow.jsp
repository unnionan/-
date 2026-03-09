<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page import = "com.user.UserSql"%>
<%@ page import = "java.sql.*"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  <%
  UserSql b = new UserSql();
  b.establishConnection();
  ResultSet result = b.All_Select();
   %>
  </head>
  <body style = "background:url(image/UserShow.jpg);background-size:100% 100%;background-attachment:fixed">
    <table align = "center" valign = "middle" width = "99%" height = "10%" border = "1" cellpadding = "9">
    <tr height = "50" valign = "middle">
       <th width = "66%" colspan = "9">用户信息展示</th>
    </tr>
      <tr algin = "center" height = "50" valign = "middle">
         <td width = "11%" align = "center">Id</td><td width = "11%" align = "center">name</td><td width = "11%" align = "center">sex</td>
         <td width = "11%" align = "center">age</td><td width = "11%" align = "center">tel</td><td width = "11%" align = "center">address</td>
         <td width = "11%" align = "center">stuname</td><td width = "11%" align = "center">loginid</td><td width = "11%" align = "center">loginpwd</td>
      </tr>
      <% 
      int Id = 0;
      String name = null;
	  String sex = null;
	  String age = null;
	  String tel = null;
	  String address = null;
	  String stuname = null;
	  String loginid = null;
	  String loginpwd = null;
        while(result.next())
        {
           Id = result.getInt("Id");
           name = result.getString("name");
		   sex = result.getString("sex");
		   age = result.getString("age");
		   tel = result.getString("tel");
		   address = result.getString("address");
		   stuname = result.getString("stuname");
		   loginid = result.getString("loginid");
		   loginpwd = result.getString("loginpwd");
		   %>

		   <tr algin = "center" height = "50" valign = "middle">
              <td width = "11%" align = "center"><%= Id %></td><td width = "11%" align = "center"><%= name %></td><td width = "11%" align = "center"><%= sex %></td>
              <td width = "11%" align = "center"><%= age %></td><td width = "11%" align = "center"><%= tel %></td><td width = "11%" align = "center"><%= address %></td>
              <td width = "11%" align = "center"><%= stuname %></td><td width = "11%" align = "center"><%= loginid %></td><td width = "11%" align = "center"><%= loginpwd %></td>
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
  </body>
</html>
