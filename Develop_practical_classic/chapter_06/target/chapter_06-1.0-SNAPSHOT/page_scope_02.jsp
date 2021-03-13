<%--
  Created by IntelliJ IDEA.
  User: 20550
  Date: 2021/2/25
  Time: 13:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.*" %>
<html>
<head>
    <title>Page Scope 02</title>
</head>
<body>
<%
    pageContext.setAttribute("name", "lihua");
    pageContext.setAttribute("birthday", new Date());
%>
<jsp:forward page="page_scope_03.jsp" />
</body>
</html>
