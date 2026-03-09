<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
        <title>用户操作系统</title>
        <meta http-equiv = "Content-Type" content = "text/html;charset = UTF-8">
  </head>
  <frameset rows = "90,*">
     <frame src = "UserTop.jsp" scrolling = "no">
     <frameset cols = "230,*">
        <frame src = "UserLeft.jsp" scrolling = "yes">
        <frame src = "UserButton.jsp" name = "UserMain" scrolling = "yes">
     </framset>
  </frameset>
</html>
