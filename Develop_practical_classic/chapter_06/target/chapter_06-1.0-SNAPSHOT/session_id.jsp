<%--
  Created by IntelliJ IDEA.
  User: 20550
  Date: 2021/2/25
  Time: 15:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String id = session.getId();
%>
<h3>SESSION ID: <%= id%></h3>
<h3>SESSION ID length: <%=id.length()%></h3>
</body>
</html>
