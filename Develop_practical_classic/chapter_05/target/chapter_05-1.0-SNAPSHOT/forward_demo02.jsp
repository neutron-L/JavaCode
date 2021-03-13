<%--
  Created by IntelliJ IDEA.
  User: 20550
  Date: 2021/2/24
  Time: 16:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>this is forward page</h1>
<h2>param 1: <%= request.getParameter("name")%></h2>
<h2>param 2: <%= request.getParameter("info")%></h2>
</body>
</html>
