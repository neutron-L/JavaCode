<%--
  Created by IntelliJ IDEA.
  User: 20550
  Date: 2021/2/25
  Time: 15:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%!
    int count = 0;
%>
<%
    response.setHeader("refresh", "2");
%>
<h3>has visited <%=count++%> times </h3>
</body>
</html>
