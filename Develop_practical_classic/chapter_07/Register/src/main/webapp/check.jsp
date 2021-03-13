<%--
  Created by IntelliJ IDEA.
  User: 20550
  Date: 2021/3/13
  Time: 20:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<jsp:useBean id="reg" scope="request" class="com.example.register.Register"/>
<jsp:setProperty name="reg" property="*"/>
<body>
<%
    if (reg.isValidate()) {
%>
<jsp:forward page="success.jsp"/>
<%
} else { %>
<jsp:forward page="index.jsp"/>
<%

    }
%>
</body>
</html>
