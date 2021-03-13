<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: 20550
  Date: 2021/2/25
  Time: 13:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    pageContext.setAttribute("name", "lyf", PageContext.REQUEST_SCOPE);
    pageContext.setAttribute("birthday", new Date(), PageContext.REQUEST_SCOPE);
%>
<jsp:forward page="request_scope_02.jsp" />
</body>
</html>
