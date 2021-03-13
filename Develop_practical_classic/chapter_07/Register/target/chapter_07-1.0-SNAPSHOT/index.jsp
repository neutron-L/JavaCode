<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<jsp:useBean id="reg" scope="request" class="com.example.chapter_07.Register" />
<body>
<form action="check.jsp" method="post">
    username: <input type="text" name="name" value="<jsp:getProperty name="reg" property="name"/>" />
    <%=reg.getErrorMsg("errname")%><br/>
    age: <input type="text" name="age" value="<jsp:getProperty name="reg" property="age"/>" />
    <%= reg.getErrorMsg("errage")%>
    <br/>
    E-mail: <input type="text" name="email" value="<jsp:getProperty name="reg" property="email"/>" />
    <%= reg.getErrorMsg("erremail")%>
    <br/>
    <input type="submit" value="Register"><input type="reset" value="Reset" />
</form>
</body>
</html>