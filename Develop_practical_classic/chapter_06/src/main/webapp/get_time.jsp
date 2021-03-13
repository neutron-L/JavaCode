<%--
  Created by IntelliJ IDEA.
  User: 20550
  Date: 2021/2/25
  Time: 19:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    long start = session.getCreationTime();
    long end = session.getLastAccessedTime();
    long time = (end - start) / 1000;
    response.setHeader("refresh", "1;URL=get_time.jsp");
%>
<h3><%=time%> seconds</h3>
</body>
</html>
