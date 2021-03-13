<%--
  Created by IntelliJ IDEA.
  User: 20550
  Date: 2021/2/25
  Time: 13:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.*"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    session.setAttribute("name", "lilin");
    session.setAttribute("birthday", new Date());
%>

<a href="session_scope_02.jsp">session 02</a>
</body>
</html>
