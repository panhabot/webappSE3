<%--
  Created by IntelliJ IDEA.
  User: mac
  Date: 3/27/20
  Time: 9:55 AM
  To change this template use File | Settings | File Templates.
--%>
<%@taglib uri="/WEB-INF/my_jdbc_tag.tld" prefix="t" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <t:registerData driver="${param.driver}" url="${param.url}" dbUsrename="${param.dbUsername}" dbPassword="${param.dbPassword}" user="${param.user}" age="${param.age}"></t:registerData>

</body>
</html>
