<%--
  Created by IntelliJ IDEA.
  User: 20550
  Date: 2021/2/24
  Time: 16:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String username = "lilin";
%>
<jsp:forward page="forward_demo02.jsp">
    <jsp:param name="name" value="<%= username%>"/>
    <jsp:param name="info" value="www.lilin"/>
</jsp:forward>
</body>
</html>
