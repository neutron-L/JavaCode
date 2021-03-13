<%--
  Created by IntelliJ IDEA.
  User: 20550
  Date: 2021/2/25
  Time: 15:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    Cookie c1 = new Cookie("name", "lilin");
    Cookie c2 = new Cookie("password", "131125");
    c1.setMaxAge(60);
    c2.setMaxAge(60);
    response.addCookie(c1);
    response.addCookie(c2);
%>
</body>
</html>
