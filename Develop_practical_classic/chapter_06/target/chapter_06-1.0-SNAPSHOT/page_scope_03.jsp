<%--
  Created by IntelliJ IDEA.
  User: 20550
  Date: 2021/2/25
  Time: 13:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.*" %>
<html>
<head>
    <title>Page Scope 03</title>
</head>
<body>
<%
    String username = (String)pageContext.getAttribute("name");
    Date userbirthday = (Date)pageContext.getAttribute("birthday");
%>

<h2>name: <%=username%></h2>
<h2>birthday: <%=userbirthday%></h2>
</body>
</html>
