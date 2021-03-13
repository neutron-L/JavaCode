<%--
  Created by IntelliJ IDEA.
  User: 20550
  Date: 2021/2/24
  Time: 16:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--<jsp:scriptlet>--%>
<%
    String username = "lilin";
    %>
<h1>dynamic parameters</h1>
<jsp:include page="receive_param.jsp">
    <jsp:param name="name" value="<%= username%>" />
    <jsp:param name="info" value="www.lilin.cn" />
</jsp:include>
</body>
</html>
