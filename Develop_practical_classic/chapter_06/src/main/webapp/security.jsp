<%--
  Created by IntelliJ IDEA.
  User: 20550
  Date: 2021/2/25
  Time: 14:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    if (request.isUserInRole("admin")) {
        %>
<h2>Welcome</h2>
<%
    } else {
%>
<h2>Sorry</h2>
<%
    }
%>
</body>
</html>
