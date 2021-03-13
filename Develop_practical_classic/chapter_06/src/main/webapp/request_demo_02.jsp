<%--
  Created by IntelliJ IDEA.
  User: 20550
  Date: 2021/2/25
  Time: 13:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<%
    String id = request.getParameter("id");
    String name = request.getParameter("name");
    String[] inst = request.getParameterValues("inst");
%>
<h3>number: <%=id%></h3>
<h3>name: <%=name%></h3>
<%
    if (inst != null) {
%>
<h3>
    interest:
    <%
        for (String s : inst) {
    %>
    <%= s%>
    <%
        }
    %>
</h3>
<%
    }
%>
</body>
</html>
