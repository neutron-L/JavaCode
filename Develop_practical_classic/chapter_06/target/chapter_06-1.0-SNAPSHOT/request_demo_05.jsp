<%--
  Created by IntelliJ IDEA.
  User: 20550
  Date: 2021/2/25
  Time: 14:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.*" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    Enumeration enu = request.getHeaderNames();
    while (enu.hasMoreElements()) {
        String headerName = (String) enu.nextElement();
        String headerValue = request.getHeader(headerName);
%>
<h5><%=headerName%> --><%=headerValue%>
</h5>
<%
    }
%>
</body>
</html>
