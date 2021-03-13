<%--
  Created by IntelliJ IDEA.
  User: 20550
  Date: 2021/2/25
  Time: 22:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Sorry <%=request.getParameter("name")%>, you are not member, or
your password <%=request.getParameter("password")%> is wrong</h2>

</body>
</html>
