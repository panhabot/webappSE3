<%--
  Created by IntelliJ IDEA.
  User: mac
  Date: 2/18/20
  Time: 3:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        Object obj = request.getAttribute("student");
        if (obj == null){
            Student s = (Student)obj;

            out.println();
        }
    %>
</body>
</html>
