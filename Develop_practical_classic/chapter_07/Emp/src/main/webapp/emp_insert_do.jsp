<%@ page import="com.example.Emp.DAOFactory" %>
<%@ page import="java.text.SimpleDateFormat" %><%--
  Created by IntelliJ IDEA.
  User: 20550
  Date: 2021/3/14
  Time: 10:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Insert</title>
</head>
<jsp:useBean id="emp" scope="request" class="com.example.Emp.Emp"/>
<jsp:setProperty name="emp" property="empno"/>
<jsp:setProperty name="emp" property="ename"/>
<jsp:setProperty name="emp" property="job"/>
<jsp:setProperty name="emp" property="sal"/>
<body>
<%
    try {
        emp.setHiredate(new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("hiredate")));
        if (DAOFactory.getIEmpDAOInstance().doCreate(emp)) {
%>
<h3>Successfully</h3>
<%
} else {
%>
<h3>Error</h3>
<%
        }
    } catch(Exception e){
        e.printStackTrace();
        }
%>
</body>
</html>
