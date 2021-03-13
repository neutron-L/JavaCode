<%@ page import="java.util.Enumeration" %><%--
  Created by IntelliJ IDEA.
  User: 20550
  Date: 2021/2/25
  Time: 19:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    Enumeration enu = application.getAttributeNames();
    while (enu.hasMoreElements()) {
        String name = (String) enu.nextElement();
%>

<h4><%=name%> --> <%=application.getAttribute(name)%></h4>

<%
    }
%>
</body>
</html>
