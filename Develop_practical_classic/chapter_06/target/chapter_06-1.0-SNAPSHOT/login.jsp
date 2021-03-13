<%--
  Created by IntelliJ IDEA.
  User: 20550
  Date: 2021/2/25
  Time: 17:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="login.jsp" method="post">
    username: <input type="text" name="name"/>
    password: <input type="password" name="password"/>
    <input type="submit" value="login"/>
    <input type="reset" value="reset"/>
</form>

<%
    String name = request.getParameter("name");
    String password = request.getParameter("password");
    if (!(name == null || "".equals(name)
            || password == null || "".equals(password))) {
        if ("lilin".equals(name) && "131125".equals(password)) {
            response.setHeader("refresh", "2;URL=welcome.jsp");
            session.setAttribute("name", name);
%>
<h3>login successfully</h3>
<h3>if no redirect, please enter <a href="welcome.jsp">here</a></h3>
<%
} else {
%>
<h3>error username or password</h3>
<%
        }
    }
%>
</body>
</html>
