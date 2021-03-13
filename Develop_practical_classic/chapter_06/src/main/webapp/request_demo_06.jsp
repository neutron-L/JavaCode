<%--
  Created by IntelliJ IDEA.
  User: 20550
  Date: 2021/2/25
  Time: 15:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String method = request.getMethod();
    String ip = request.getRemoteAddr();
    String path = request.getServletPath();
    String contextPath = request.getContextPath();
%>

<h3>method: <%=method%></h3>
<h3>ip: <%=ip%></h3>
<h3>path: <%=path%></h3>
<h3>contextPath: <%=contextPath%></h3>
</body>
</html>
