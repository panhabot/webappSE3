<%@ page buffer="8kb" autoFlush="true" contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body style="background-color: #ffe434">
  <h1 style="color: azure">Hello world</h1>
    <%
      for (int i = 0; i<5000;i++){
        out.println("Hello......");
//        out.flush();
      }
    %>
  </body>
</html>
