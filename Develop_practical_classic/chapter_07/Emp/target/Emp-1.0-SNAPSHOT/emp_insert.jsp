<%--
  Created by IntelliJ IDEA.
  User: 20550
  Date: 2021/3/14
  Time: 10:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Insert</title>
</head>
<jsp:useBean id="emp" scope="request" class="com.example.Emp.Emp" />
<body>
<form action="emp_insert_do.jsp" method="post">
    empno: <input type="text" name="empno" value="<jsp:getProperty name="emp" property="empno"/>" />
    ename: <input type="text" name="ename" value="<jsp:getProperty name="emp" property="ename"/>" />
    job: <input type="text" name="job" value="<jsp:getProperty name="emp" property="job"/>"/>
    hiredate: <input type="date" name="hiredate" value="<jsp:getProperty name="emp" property="hiredate"/>"/>
    salary: <input type="text" name="sal" value="<jsp:getProperty name="emp" property="sal"/>"/>
    <input type="submit" value="Register" />
    <input type="reset" value="Reset" />
</form>
</body>
</html>
