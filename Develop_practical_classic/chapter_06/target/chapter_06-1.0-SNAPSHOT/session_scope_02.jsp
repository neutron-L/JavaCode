<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: 20550
  Date: 2021/2/25
  Time: 13:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String username = (String)session.getAttribute("name");
    Date userbirthday = (Date)session.getAttribute("birthday");
%>

<h2>name: <%=username%></h2>
<h2>birthday: <%=userbirthday%></h2>
</body>
</html>
