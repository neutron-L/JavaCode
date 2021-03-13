<%--
  Created by IntelliJ IDEA.
  User: 20550
  Date: 2021/2/25
  Time: 17:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    response.setHeader("refresh", "2;URL=login.jsp");
    session.invalidate();
%>
<h3>you have logout the system</h3>
<h3><a href="login.jsp">Login</a></h3>
</body>
</html>
