<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page import = "com.student.StudentSql"%>
<%@ page import = "java.sql.*"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <%
  StudentSql b = new StudentSql();
  b.establishConnection();
  ResultSet result = b.select_allPay();
   %>
   <meta http-equiv = "Content-Type" content = "text/html;charset = UTF-8">
  <link href = "StyleSheet.css" rel = "stylesheet" type = "text/css"/>
  </head>
  
  <body style = "background:url(image/PayAllShow.jpg);background-size:100% 100%;background-attachment:fixed">
    <div class="first-Table-Box">
    <table align = "center" valign = "middle" width = "90%" height = "10%" border = "1" cellpadding = "2" class="table-Box">
    <tr height = "50" valign = "middle" class="table-Tr">
       <th width = "66%" colspan = "5" class="table-Th"><div class="table-title" align = "center">学生缴费信息</div></th>
    </tr>
      <tr algin = "center" height = "50" valign = "middle">
         <td width = "25%" align = "center"  class="table-Td"><div class="table-Lisdata"><span class="table-Lisdata-span"><b><font color = "blue">Id</span></div></td>
         <td width = "25%" align = "center"  class="table-Td"><div class="table-Lisdata"><span class="table-Lisdata-span"><b><font color = "blue">userid</span></div></td>
         <td width = "25%" align = "center"  class="table-Td"><div class="table-Lisdata"><span class="table-Lisdata-span"><b><font color = "blue">stuname</span></div></td>
         <td width = "25%" align = "center"  class="table-Td"><div class="table-Lisdata"><span class="table-Lisdata-span"><b><font color = "blue">paynum</span></div></td>
         <td width = "25%" align = "center"  class="table-Td"><div class="table-Lisdata"><span class="table-Lisdata-span"><b><font color = "blue">state</span></div></td>
      </tr>
      <% 
      int Id = 0;
      String userid = null;
      String stuname = null;
      String paynum = null;
	  String state = null;
        while(result.next())
        {
           Id = result.getInt("Id");
           userid = result.getString("userid");
		   stuname = result.getString("stuname");
		   paynum = result.getString("paynum");
		   state = result.getString("state");
		   %>

		   <tr algin = "center" height = "50" valign = "middle">
              <td width = "25%" align = "center"  class="table-Td"><div class="table-Lisdata"><span class="table-Lisdata-span"><b><font color = "blue"><%= Id %></span></div></td>
              <td width = "25%" align = "center"  class="table-Td"><div class="table-Lisdata"><span class="table-Lisdata-span"><b><font color = "blue"><%= userid %></span></div></td>
              <td width = "25%" align = "center"  class="table-Td"><div class="table-Lisdata"><span class="table-Lisdata-span"><b><font color = "blue"><%= stuname %></span></div></td>
              <td width = "25%" align = "center"  class="table-Td"><div class="table-Lisdata"><span class="table-Lisdata-span"><b><font color = "blue"><%= paynum %></span></div></td>
              <td width = "25%" align = "center"  class="table-Td"><div class="table-Lisdata"><span class="table-Lisdata-span"><b><font color = "blue"><%= state %></span></div></td>
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
