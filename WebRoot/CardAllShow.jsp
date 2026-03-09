<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page import = "com.student.StudentSql"%>
<%@ page import = "java.sql.*"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  <%
  StudentSql b = new StudentSql();
  b.establishConnection();
  ResultSet result = b.select_allCard();
   %>
   <meta http-equiv = "Content-Type" content = "text/html;charset = UTF-8">
  <link href = "StyleSheet.css" rel = "stylesheet" type = "text/css"/>
  
  </head>
  
  <body style = "background:url(image/CardAllShow.jpg);background-size:100% 100%;background-attachment:fixed">
    <div class="first-Table-Box">
    <table align = "center" valign = "middle" width = "90%" height = "10%" border = "1" cellpadding = "2" class="table-Box">
    <tr height = "50" valign = "middle" class="table-Tr">
       <th width = "66%" colspan = "4" class="table-Th"><div class="table-title" align = "center"><b>学生体检信息展示</div></th>
    </tr>
      <tr algin = "center" height = "50" valign = "middle">
         <td width = "25%" align = "center"  class="table-Td"><div class="table-Lisdata"><span class="table-Lisdata-span"><b><font color = "white">Id</span></div></td>
         <td width = "25%" align = "center"  class="table-Td"><div class="table-Lisdata"><span class="table-Lisdata-span"><b><font color = "white">stuno</span></div></td>
         <td width = "25%" align = "center"  class="table-Td"><div class="table-Lisdata"><span class="table-Lisdata-span"><b><font color = "white">no</span></div></td>
         <td width = "25%" align = "center"  class="table-Td"><div class="table-Lisdata"><span class="table-Lisdata-span"><b><font color = "white">state</span></div></td>
      </tr>
      <% 
      int Id = 0;
      String stuno = null;
	  String no = null;
	  String state = null;
        while(result.next())
        {
           Id = result.getInt("Id");
		   stuno = result.getString("stuno");
		   no = result.getString("no");
		   state = result.getString("state");
		   %>

		   <tr algin = "center" height = "50" valign = "middle">
              <td width = "25%" align = "center"  class="table-Td"><div class="table-Lisdata"><span class="table-Lisdata-span"><b><font color = "white"><%= Id %></span></div></td>
              <td width = "25%" align = "center"  class="table-Td"><div class="table-Lisdata"><span class="table-Lisdata-span"><b><font color = "white"><%= stuno %></span></div></td>
              <td width = "25%" align = "center"  class="table-Td"><div class="table-Lisdata"><span class="table-Lisdata-span"><b><font color = "white"><%= no %></span></div></td>
              <td width = "25%" align = "center"  class="table-Td"><div class="table-Lisdata"><span class="table-Lisdata-span"><b><font color = "white"><%= state %></span></div></td>
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
