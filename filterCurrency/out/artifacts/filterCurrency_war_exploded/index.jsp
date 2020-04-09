<%--
  Created by IntelliJ IDEA.
  User: mac
  Date: 2/5/20
  Time: 10:15 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
    <form method="post" action="ExchangeServ">
      <input type="text" name="usd">
      <select name="curType">
        <option value="INR">INR</option>
        <option value="KHR">KHR</option>
        <option value="YUAN">YUAN</option>
      </select>
      <input type="submit" value="Convert">
    </form>
  </body>
</html>
