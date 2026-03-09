<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>

  </head>
  
  <body style = "background:url(image/StudentSingleSelect.jpg);background-size:100% 100%;background-attachment:fixed">
  <br>
  <br>
  <br>
  <form action = "StudentSingleShow.jsp" method = "post">
    <div class="first-Table-Box">
       <table align = "center" valign = "middle" width = "90%" height = "10%" border = "0" cellpadding = "2" class="table-Box">
          <tr height = "50" valign = "middle" class="table-Tr">
             <th width = "66%" colspan = "1" class="table-Th"><div class="table-title" align = "center">请输入你要查找的学生信息</div></th>
          </tr>
          <tr algin = "center" height = "50" valign = "middle">
             <td width = "22%" align = "center"  class="table-Td"><div class="table-Lisdata"><span class="table-Lisdata-span"><b>Id:</b><input type = "text" name = "singleId">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type = "submit" value = "提交" ></span></div></td>
          </tr>
       </table>
    </div>
    </form>
  </body>
</html>
