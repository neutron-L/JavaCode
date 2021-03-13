<%--
  Created by IntelliJ IDEA.
  User: 20550
  Date: 2021/3/13
  Time: 20:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<jsp:useBean id="reg" scope="request" class="com.example.register.Register" />
<body>
username: <jsp:getProperty name="reg" property="name"/>
<br/>
age: <jsp:getProperty name="reg" property="age"/>
<br/>
e-mail: <jsp:getProperty name="reg" property="email"/>
<br/>
</body>
</html>
