<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page import = "com.student.StudentSql"%>
<%@ page import = "java.sql.*"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  <% 
    StudentSql f = new StudentSql();
    f.establishConnection();
    ResultSet re = f.select_allDrom();
    int Id = 0;
    String type = null;
    String num = null;
    String building = null;
    String no = null;
    String comment = null;
    %>
    
    
  </head>
  <body style = "background:url(image/DromAllShow.jpg);background-size:100% 100%;background-attachment:fixed">
    <div class="first-Table-Box">
      <table align = "center" valign = "middle" width = "90%" height = "10%" border = "1" cellpadding = "2" class="table-Box">
          <tr height = "50" valign = "middle" class="table-Tr">
             <th width = "66%" colspan = "6" class="table-Th"><div class="table-title" align = "center"><b><font color = "blue">宿舍信息展示</div></th>
          </tr>
          <tr algin = "center" height = "50" valign = "middle">
             <td width = "16%" align = "center"  class="table-Td"><div class="table-Lisdata"><span class="table-Lisdata-span"><b><font color = "blue">Id</span></div></td>
             <td width = "16%" align = "center"  class="table-Td"><div class="table-Lisdata"><span class="table-Lisdata-span"><b><font color = "blue">type</span></div></td>
             <td width = "16%" align = "center"  class="table-Td"><div class="table-Lisdata"><span class="table-Lisdata-span"><b><font color = "blue">num</span></div></td>
             <td width = "16%" align = "center"  class="table-Td"><div class="table-Lisdata"><span class="table-Lisdata-span"><b><font color = "blue">building</span></div></td>
             <td width = "16%" align = "center"  class="table-Td"><div class="table-Lisdata"><span class="table-Lisdata-span"><b><font color = "blue">no</span></div></td>
             <td width = "16%" align = "center"  class="table-Td"><div class="table-Lisdata"><span class="table-Lisdata-span"><b><font color = "blue">comment</span></div></td>
          </tr>
          <% 
          while(re.next())
    {
       Id = re.getInt(1);
       type = re.getString(2);
       num = re.getString(3);
       building = re.getString(4);
       no = re.getString(5);
       comment = re.getString(6);
          %>
          
          <tr algin = "center" height = "50" valign = "middle">
             <td width = "16%" align = "center"  class="table-Td"><div class="table-Lisdata"><span class="table-Lisdata-span"><b><font color = "blue"><%= Id%></span></div></td>
             <td width = "16%" align = "center"  class="table-Td"><div class="table-Lisdata"><span class="table-Lisdata-span"><b><font color = "blue"><%= type%></span></div></td>
             <td width = "16%" align = "center"  class="table-Td"><div class="table-Lisdata"><span class="table-Lisdata-span"><b><font color = "blue"><%= num%></span></div></td>
             <td width = "16%" align = "center"  class="table-Td"><div class="table-Lisdata"><span class="table-Lisdata-span"><b><font color = "blue"><%= building%></span></div></td>
             <td width = "16%" align = "center"  class="table-Td"><div class="table-Lisdata"><span class="table-Lisdata-span"><b><font color = "blue"><%= no%></span></div></td>
             <td width = "16%" align = "center"  class="table-Td"><div class="table-Lisdata"><span class="table-Lisdata-span"><b><font color = "blue"><%= comment%></span></div></td>
          </tr>
          <% 
          }
    f.CloseConnection();
    %>
      </table>
    </div>
  </body>
</html>
