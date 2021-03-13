<%--
  Created by IntelliJ IDEA.
  User: 20550
  Date: 2021/2/25
  Time: 11:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.*"%>
<html>
<head>
    <title>Page </title>
</head>
<body>


<%
    pageContext.setAttribute("name", "lilin");
    pageContext.setAttribute("birthday", new Date());
%>

<%
    String username = (String)pageContext.getAttribute("name");
    Date userbirthday = (Date)pageContext.getAttribute("birthday");
%>

<h2>name: <%= username%></h2>
<h2>birthday: <%=userbirthday%></h2>

</body>
</html>
