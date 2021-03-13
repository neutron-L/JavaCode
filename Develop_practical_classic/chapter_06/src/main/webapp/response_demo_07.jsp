<%--
  Created by IntelliJ IDEA.
  User: 20550
  Date: 2021/2/25
  Time: 15:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>

    </title>
</head>
<body>
<%
    Cookie[] c = request.getCookies();
    for (Cookie cookie : c) {
%>
<h3><%=cookie.getName()%>--><%=cookie.getValue()%>
</h3>
<%
    }
%>
</body>
</html>
