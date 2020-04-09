<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
    <c:set var="mark" value="93" scope="session"/>
    <c:choose>
      <c:when test="${mark ge 90 and mark le 100}">
        <c:out value="Distinction"/>
      </c:when>
      <c:when test="${mark>70}">
        <c:out value="First Class"/>
      </c:when>
      <c:when test="${mark>50}">
        <c:out value="Second Class"/>
      </c:when>
      <c:otherwise>
        <c:out value="Fail"/>
      </c:otherwise>
    </c:choose>
    <c:url var="url1" value="success.jsp">
      <c:param name="color" value="Red"/>
    </c:url>
    <c:redirect url="${url1}">
      <c:param name="color" value="green"/>
    </c:redirect>
  </body>
</html>


<%--jstl is not working in IJ--%>