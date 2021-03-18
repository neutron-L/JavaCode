<%@ page import="com.jspsmart.upload.SmartUpload" %><%--
  Created by IntelliJ IDEA.
  User: 20550
  Date: 2021/3/18
  Time: 16:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    SmartUpload smart = new SmartUpload();
    smart.initialize(pageContext);
    smart.upload();
    String name = smart.getRequest().getParameter("name");
    smart.save("upload");
%>

<h2>
    Name: <%=name%>
</h2>

<h2>
    request cannot get: <%=request.getParameter("name")%>
</h2>

</body>
</html>
