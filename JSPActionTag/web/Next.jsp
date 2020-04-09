<%@ page import="java.rmi.StubNotFoundException" %>
<%@ page import="stu.Student" %><%--
  Created by IntelliJ IDEA.
  User: mac
  Date: 3/4/20
  Time: 9:45 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--    <jsp:forward page="Success.jsp">--%>
<%--        <jsp:param name="user" value="${param.user}"/>--%>
<%--    </jsp:forward>--%>
<%--    <jsp:include page="Success.jsp">--%>
<%--        <jsp:param name="user" value="${param.user}"/>--%>
<%--    </jsp:include>--%>
<%--    <%= "Next.jsp"%>--%>

<%
    Student stud = new Student();
    stud.setName(request.getParameter("user"));
    session.setAttribute("stud", stud);
%>

<jsp:useBean class="stu.Student" id="stud" scope="session">

</jsp:useBean>
<jsp:setProperty name="stud" property="user" value="${param.user}"/>

</body>
</html>
