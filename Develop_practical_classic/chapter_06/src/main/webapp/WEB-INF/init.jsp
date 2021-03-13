<%--
  Created by IntelliJ IDEA.
  User: 20550
  Date: 2021/2/25
  Time: 20:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String driver = config.getInitParameter("driver");
    String url = config.getInitParameter("url");
%>
<h3>Driver: <%=driver%></h3>
<h3>url: <%=url%></h3>
</body>
</html>
