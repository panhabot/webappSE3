<%@ page import="com.Student" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--    <%--%>
<%--        String user = request.getParameter("user");--%>
<%--        String age = request.getParameter("age");--%>

<%--        Student st = new Student();--%>
<%--        st.setName(user);--%>
<%--        st.setAge(age);--%>

<%--        session.setAttribute("st", st);--%>
<%--        request.getRequestDispatcher("Success.jsp").forward(request,response );--%>

<%--    %>--%>
    <jsp:useBean id="st" class="com.Student" scope="session" />
    <jsp:setProperty name="st" property="name" value="${param.user}"/>
    <jsp:setProperty name="st" property="age" value="${param.age}"/>
    <jsp:forward page="Success.jsp"/>
</body>
</html>
