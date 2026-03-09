<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page import = "com.student.StudentSql"%>
<%@ page import = "java.sql.*"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <%
  StudentSql b = new StudentSql();
  b.establishConnection();
  ResultSet result = b.select_allStudent();
   %>
   <meta http-equiv = "Content-Type" content = "text/html;charset = UTF-8">
  <link href = "StyleSheet.css" rel = "stylesheet" type = "text/css"/>

  </head>
  <body style = "background:url(image/StudentAllShow.jpg);background-size:100% 100%;background-attachment:fixed">
    <div class="first-Table-Box">
    <table align = "center" valign = "middle" width = "100%" height = "10%" border = "1" cellpadding = "2" class="table-Box">
    <tr height = "50" valign = "middle" class="table-Tr">
       <th width = "66%" colspan = "12" class="table-Th"><div class="table-title" align = "center">学生信息展示</div></th>
    </tr>
      <tr algin = "center" height = "50" valign = "middle">
         <td width = "8%" align = "center"  class="table-Td"><div class="table-Lisdata"><span class="table-Lisdata-span"><b><font color = "blue">Id</span></div></td>
         <td width = "8%" align = "center"  class="table-Td"><div class="table-Lisdata"><span class="table-Lisdata-span"><b><font color = "blue">no</span></div></td>
         <td width = "8%" align = "center"  class="table-Td"><div class="table-Lisdata"><span class="table-Lisdata-span"><b><font color = "blue">name</span></div></td>
         <td width = "8%" align = "center"  class="table-Td"><div class="table-Lisdata"><span class="table-Lisdata-span"><b><font color = "blue">spe</span></div></td>
         <td width = "8%" align = "center"  class="table-Td"><div class="table-Lisdata"><span class="table-Lisdata-span"><b><font color = "blue">classes</span></div></td>
         <td width = "8%" align = "center"  class="table-Td"><div class="table-Lisdata"><span class="table-Lisdata-span"><b><font color = "blue">sex</span></div></td>
         <td width = "8%" align = "center"  class="table-Td"><div class="table-Lisdata"><span class="table-Lisdata-span"><b><font color = "blue">age</span></div></td>
         <td width = "8%" align = "center"  class="table-Td"><div class="table-Lisdata"><span class="table-Lisdata-span"><b><font color = "blue">tel</span></div></td>
         <td width = "8%" align = "center"  class="table-Td"><div class="table-Lisdata"><span class="table-Lisdata-span"><b><font color = "blue">drom</span></div></td>
         <td width = "8%" align = "center"  class="table-Td"><div class="table-Lisdata"><span class="table-Lisdata-span"><b><font color = "blue">loginid</span></div></td>
         <td width = "8%" align = "center"  class="table-Td"><div class="table-Lisdata"><span class="table-Lisdata-span"><b><font color = "blue">loginpwd</span></div></td>
         <td width = "8%" align = "center"  class="table-Td"><div class="table-Lisdata"><span class="table-Lisdata-span"><b><font color = "blue">state</span></div></td>
      </tr>
      <% 
      int Id = 0;
      String no = null;
      String name = null;
      String spe = null;
      String classes = null;
      String sex = null;
      String age = null;
      String tel = null;
      String drom = null;
	  String loginid = null;
	  String loginpwd = null;
	  String state = null;
        while(result.next())
        {
           Id = result.getInt("Id");
           no = result.getString("no");
           name = result.getString("name");
           spe = result.getString("spe");
           classes = result.getString("classes");
           sex = result.getString("sex");
           age = result.getString("age");
           tel = result.getString("tel");
           drom = result.getString("drom");
		   loginid = result.getString("loginid");
		   loginpwd = result.getString("loginpwd");
		   state = result.getString("state");
		   %>
		   <tr algin = "center" height = "50" valign = "middle">
              <td width = "8%" align = "center" ><b><font color = "blue"><%= Id %></td>
              <td width = "8%" align = "center"><b><font color = "blue"><%= no %></td>
              <td width = "8%" align = "center"><b><font color = "blue"><%= name %></td>
              <td width = "8%" align = "center" ><b><font color = "blue"><%= spe %></td>
              <td width = "8%" align = "center"><b><font color = "blue"><%= classes %></td>
              <td width = "8%" align = "center"><b><font color = "blue"><%= sex %></td>
              <td width = "8%" align = "center" ><b><font color = "blue"><%= age %></td>
              <td width = "8%" align = "center"><b><font color = "blue"><%= tel %></td>
              <td width = "8%" align = "center"><b><font color = "blue"><%= drom %></td>
              <td width = "8%" align = "center" ><b><font color = "blue"><%= loginid %></td>
              <td width = "8%" align = "center"><b><font color = "blue"><%= loginpwd %></td>
              <td width = "8%" align = "center"><b><font color = "blue"><%= state %></td>
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
