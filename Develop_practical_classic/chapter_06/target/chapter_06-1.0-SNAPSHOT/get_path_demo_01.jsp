<%--
  Created by IntelliJ IDEA.
  User: 20550
  Date: 2021/2/25
  Time: 19:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Application</title>
</head>
<body>
<%
    String path = application.getRealPath("/"); //得到当前虚拟目录下对应的真丝路径
%>
<h3>real path: <%=path%></h3>
</body>
</html>
