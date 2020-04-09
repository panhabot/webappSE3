<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page language="java" import="com.students" session="true" isThreadSafe="true" %>
<%@ page import="java.util.Date" %>
<!DOCTYPE html>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <%
      session.setAttribute("user", "bot");
      Thread.sleep(5000);
      out.println(getServletInfo());
      students stud = new students();
      Date date = new Date();
  %>
  <%= stud.getmsg()%>
  <%= date%>
  </body>
</html>
