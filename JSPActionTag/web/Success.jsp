<%--
  Created by IntelliJ IDEA.
  User: mac
  Date: 3/4/20
  Time: 9:46 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        String user = request.getParameter("user");
        out.println("Welcome " + user);
    %>
</body>
</html>
