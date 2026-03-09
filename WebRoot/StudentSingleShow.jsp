<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page import = "com.student.StudentSql"%>
<%@ page import = "java.sql.*"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
<% 
   int Id = Integer.parseInt(new String(request.getParameter("singleId").getBytes("ISO-8859-1"),"utf-8"));
   StudentSql y = new StudentSql();
   y.establishConnection();
   ResultSet re = y.Select(Id);
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
   if(re.next())
   {
      no = re.getString(2);
      name = re.getString(3);
      spe = re.getString(4);
      classes = re.getString(5);
      sex = re.getString(6);
      age = re.getString(7);
      tel = re.getString(8);
      drom = re.getString(9);
      loginid = re.getString(10);
      loginpwd = re.getString(11);
      %>
       </head>
  
  <body style = "background:url(image/StudentSingleShow.jpg);background-size:100% 100%;background-attachment:fixed">
  <br>
  <br>
  <br>
  <br>
  <div class="first-Table-Box">
     <table align = "center" valign = "middle" width = "90%" height = "10%" border = "1" cellpadding = "2" class="table-Box">
        <tr height = "50" valign = "middle" class="table-Tr">
           <th width = "66%" colspan = "11" class="table-Th"><div class="table-title" align = "center"><b><font color = "blue">学生信息展示</div></th>
        </tr>
        <tr algin = "center" height = "50" valign = "middle">
           <td width = "9%" align = "center"  class="table-Td"><div class="table-Lisdata"><span class="table-Lisdata-span"><b><font color = "blue">Id</span></div></td>
           <td width = "9%" align = "center"  class="table-Td"><div class="table-Lisdata"><span class="table-Lisdata-span"><b><font color = "blue">no</span></div></td>
           <td width = "9%" align = "center"  class="table-Td"><div class="table-Lisdata"><span class="table-Lisdata-span"><b><font color = "blue">name</span></div></td>
           <td width = "9%" align = "center"  class="table-Td"><div class="table-Lisdata"><span class="table-Lisdata-span"><b><font color = "blue">spe</span></div></td>
           <td width = "9%" align = "center"  class="table-Td"><div class="table-Lisdata"><span class="table-Lisdata-span"><b><font color = "blue">classes</span></div></td>
           <td width = "9%" align = "center"  class="table-Td"><div class="table-Lisdata"><span class="table-Lisdata-span"><b><font color = "blue">sex</span></div></td>
           <td width = "9%" align = "center"  class="table-Td"><div class="table-Lisdata"><span class="table-Lisdata-span"><b><font color = "blue">age</span></div></td>
           <td width = "9%" align = "center"  class="table-Td"><div class="table-Lisdata"><span class="table-Lisdata-span"><b><font color = "blue">tel</span></div></td>
           <td width = "9%" align = "center"  class="table-Td"><div class="table-Lisdata"><span class="table-Lisdata-span"><b><font color = "blue">drom</span></div></td>
           <td width = "9%" align = "center"  class="table-Td"><div class="table-Lisdata"><span class="table-Lisdata-span"><b><font color = "blue">loginid</span></div></td>
           <td width = "9%" align = "center"  class="table-Td"><div class="table-Lisdata"><span class="table-Lisdata-span"><b><font color = "blue">loginpwd</span></div></td>
        </tr>
        <tr algin = "center" height = "50" valign = "middle">
           <td width = "9%" align = "center"  class="table-Td"><div class="table-Lisdata"><span class="table-Lisdata-span"><b><font color = "blue"><%= Id%></Id></span></div></td>
           <td width = "9%" align = "center"  class="table-Td"><div class="table-Lisdata"><span class="table-Lisdata-span"><b><font color = "blue"><%= no%></span></div></td>
           <td width = "9%" align = "center"  class="table-Td"><div class="table-Lisdata"><span class="table-Lisdata-span"><b><font color = "blue"><%= name%></span></div></td>
           <td width = "9%" align = "center"  class="table-Td"><div class="table-Lisdata"><span class="table-Lisdata-span"><b><font color = "blue"><%= spe%></span></div></td>
           <td width = "9%" align = "center"  class="table-Td"><div class="table-Lisdata"><span class="table-Lisdata-span"><b><font color = "blue"><%= classes%></span></div></td>
           <td width = "9%" align = "center"  class="table-Td"><div class="table-Lisdata"><span class="table-Lisdata-span"><b><font color = "blue"><%= sex%></span></div></td>
           <td width = "9%" align = "center"  class="table-Td"><div class="table-Lisdata"><span class="table-Lisdata-span"><b><font color = "blue"><%= age%></span></div></td>
           <td width = "9%" align = "center"  class="table-Td"><div class="table-Lisdata"><span class="table-Lisdata-span"><b><font color = "blue"><%= tel%></span></div></td>
           <td width = "9%" align = "center"  class="table-Td"><div class="table-Lisdata"><span class="table-Lisdata-span"><b><font color = "blue"><%= drom%></span></div></td>
           <td width = "9%" align = "center"  class="table-Td"><div class="table-Lisdata"><span class="table-Lisdata-span"><b><font color = "blue"><%= loginid%></span></div></td>
           <td width = "9%" align = "center"  class="table-Td"><div class="table-Lisdata"><span class="table-Lisdata-span"><b><font color = "blue"><%= loginpwd%></span></div></td>
        </tr>
     </table>
  </div>
  </body>
</html>
  
      <% 
   }
   else
   {
     response.getWriter().print("<script language = 'javascript'>alert('该Id不存在')</script>");
	 response.setHeader("refresh","1;AdminBottom.jsp");
   }
    y.CloseConnection();
   %>
