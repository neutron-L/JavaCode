<%--
  Created by IntelliJ IDEA.
  User: 20550
  Date: 2021/2/25
  Time: 20:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    int buffer = out.getBufferSize();
    int available = out.getRemaining();
    int use = buffer - available;
%>
<h3>buffer size:<%=buffer%></h3>
<h3>available: <%=available%></h3>
<h3>use: <%=use%></h3>
</body>
</html>
