<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
<%
    Cookie[] cookies = request.getCookies();
    for (Cookie cookie : cookies) {
//        if ("nurse".equals(cookie.getName())) {
%>
<%=cookie.getValue()%>
<%
        }
%>
<a href="hello-servlet">Hello Servlet</a>
</body>
</html>