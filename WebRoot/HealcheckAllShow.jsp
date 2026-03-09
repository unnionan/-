<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page import = "com.student.StudentSql"%>
<%@ page import = "java.sql.*"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
   <%
  StudentSql b = new StudentSql();
  b.establishConnection();
  ResultSet result = b.select_allHealcheck();
   %>
   <meta http-equiv = "Content-Type" content = "text/html;charset = UTF-8">
  <link href = "StyleSheet.css" rel = "stylesheet" type = "text/css"/>
  
  </head>
  
  <body style = "background:url(image/HealcheckAllShow.jpg);background-size:100% 100%;background-attachment:fixed">
    <div class="first-Table-Box">
    <table align = "center" valign = "middle" width = "90%" height = "10%" border = "1" cellpadding = "2" class="table-Box">
    <tr height = "50" valign = "middle" class="table-Tr">
       <th width = "66%" colspan = "9" class="table-Th"><div class="table-title" align = "center">学生体检信息展示</div></th>
    </tr>
      <tr algin = "center" height = "50" valign = "middle">
         <td width = "10%" align = "center"  class="table-Td"><div class="table-Lisdata"><span class="table-Lisdata-span"><b>Id</span></div></td>
         <td width = "10%" align = "center"  class="table-Td"><div class="table-Lisdata"><span class="table-Lisdata-span"><b>stuno</span></div></td>
         <td width = "10%" align = "center"  class="table-Td"><div class="table-Lisdata"><span class="table-Lisdata-span"><b>height</span></div></td>
         <td width = "10%" align = "center"  class="table-Td"><div class="table-Lisdata"><span class="table-Lisdata-span"><b>weight</span></div></td>
         <td width = "10%" align = "center"  class="table-Td"><div class="table-Lisdata"><span class="table-Lisdata-span"><b>vision</span></div></td>
         <td width = "10%" align = "center"  class="table-Td"><div class="table-Lisdata"><span class="table-Lisdata-span"><b>blood</span></div></td>
         <td width = "10%" align = "center"  class="table-Td"><div class="table-Lisdata"><span class="table-Lisdata-span"><b>liver</span></div></td>
         <td width = "10%" align = "center"  class="table-Td"><div class="table-Lisdata"><span class="table-Lisdata-span"><b>comment</span></div></td>
         <td width = "10%" align = "center"  class="table-Td"><div class="table-Lisdata"><span class="table-Lisdata-span"><b>state</span></div></td>
      </tr>
      <% 
      int Id = 0;
      String stuno = null;
	  String height = null;
	  String weight = null;
	  String vision = null;
	  String blood = null;
	  String liver = null;
	  String comment = null;
	  String state = null;
        while(result.next())
        {
           Id = result.getInt("Id");
		   stuno = result.getString("stuno");
		   height = result.getString("height");
		   weight = result.getString("weight");
		   vision = result.getString("vision");
		   blood = result.getString("blood");
		   liver = result.getString("liver");
		   comment = result.getString("comment");
		   state = result.getString("state");
		   %>

		   <tr algin = "center" height = "50" valign = "middle">
              <td width = "10%" align = "center"  class="table-Td"><div class="table-Lisdata"><span class="table-Lisdata-span"><b><%= Id %></span></div></td>
              <td width = "10%" align = "center"  class="table-Td"><div class="table-Lisdata"><span class="table-Lisdata-span"><b><%= stuno %></span></div></td>
              <td width = "10%" align = "center"  class="table-Td"><div class="table-Lisdata"><span class="table-Lisdata-span"><b><%= height %></span></div></td>
              <td width = "10%" align = "center"  class="table-Td"><div class="table-Lisdata"><span class="table-Lisdata-span"><b><%= weight %></span></div></td>
              <td width = "10%" align = "center"  class="table-Td"><div class="table-Lisdata"><span class="table-Lisdata-span"><b><%= vision %></span></div></td>
              <td width = "10%" align = "center"  class="table-Td"><div class="table-Lisdata"><span class="table-Lisdata-span"><b><%= blood %></span></div></td>
              <td width = "10%" align = "center"  class="table-Td"><div class="table-Lisdata"><span class="table-Lisdata-span"><b><%= liver %></span></div></td>
              <td width = "10%" align = "center"  class="table-Td"><div class="table-Lisdata"><span class="table-Lisdata-span"><b><%= comment %></span></div></td>
              <td width = "10%" align = "center"  class="table-Td"><div class="table-Lisdata"><span class="table-Lisdata-span"><b><%= state %></span></div></td>
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
