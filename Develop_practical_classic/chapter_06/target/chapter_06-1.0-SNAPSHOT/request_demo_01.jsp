<%--
  Created by IntelliJ IDEA.
  User: 20550
  Date: 2021/2/25
  Time: 13:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html" language="java" pageEncoding="GBK" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    request.setCharacterEncoding("GBK");
    String content = request.getParameter("info");
%>
<h2><%=content%></h2>
</body>
</html>
