<%--
  Created by IntelliJ IDEA.
  User: 20550
  Date: 2021/2/25
  Time: 17:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    if (session.getAttribute("name") != null) {
%>
<h3>welcome<%=session.getAttribute("name")%> system <a href="logout.jsp">logout</a></h3>
<%
} else {
%>
<h3>please <a href="login.jsp">login</a></h3>
<%
    }
%>
</body>
</html>
