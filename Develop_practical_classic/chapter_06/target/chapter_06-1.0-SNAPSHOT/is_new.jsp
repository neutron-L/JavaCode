<%--
  Created by IntelliJ IDEA.
  User: 20550
  Date: 2021/2/25
  Time: 17:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    if (session.isNew()) {
        %>
<h3>welcome new customer</h3>
<%
    } else {
        %>
<h3>you are old customer</h3>
<%
    }
%>
</body>
</html>
