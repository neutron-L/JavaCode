<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: 20550
  Date: 2021/2/25
  Time: 13:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Request Scope 01</title>
</head>
<body>
<%
    request.setAttribute("name", "lilin");
    request.setAttribute("birthday", new Date());
%>
<%--<jsp:forward page="request_scope_02.jsp" />--%>
<a href="request_scope_02.jsp">request 02</a>
</body>
</html>
