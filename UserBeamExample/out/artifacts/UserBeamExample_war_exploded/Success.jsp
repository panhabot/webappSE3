<%@ page import="com.Student" %><%--
  Created by IntelliJ IDEA.
  User: mac
  Date: 3/6/20
  Time: 9:49 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--    <%--%>
<%--        Student st = (Student)session.getAttribute("st");--%>
<%--        out.println(st.getName());--%>
<%--        out.println(st.getAge());--%>
<%--    %>--%>
${sessionScope.st.name}
${sessionScope.st.age}
</body>
</html>
