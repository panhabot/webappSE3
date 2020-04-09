<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.students" session="true" isThreadSafe="true" %>
<!DOCTYPE html>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <%
      session.setAttribute("user", "bot");
      Thread.sleep(5000);
      out.println("Hello world");

      students stud = new students();
  %>
  <%= stud.getmsg()%>
  </body>
</html>
