<%@ page import="com.example.Emp.Emp" %>
<%@ page import="java.util.List" %>
<%@ page import="com.example.Emp.DAOFactory" %>
<%@ page import="java.util.ArrayList" %>
<%--
  Created by IntelliJ IDEA.
  User: 20550
  Date: 2021/3/14
  Time: 11:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List</title>
</head>
<body>
<%
    List<Emp> all = new ArrayList<>();
    try {
        all = DAOFactory.getIEmpDAOInstance().findAll(request.getParameter("keyWord"));
    } catch (Exception e) {
        e.printStackTrace();
    }
%>
<form method="post" action="emp_list.jsp">
    Key Word: <input type="text" name="keyWord"/>
    <input type="submit" value="Search"/>
</form>
<table border="1" width="80%">
    <tr>
        <th>Number</th>
        <th>Name</th>
        <th>Job</th>
        <th>Salary</th>
        <th>Hire date</th>
    </tr>

    <%
        for (Emp emp : all) {
    %>
    <tr>
        <td><%=emp.getEmpno()%>
        </td>
        <td><%=emp.getEname()%>
        </td>
        <td><%=emp.getJob()%></td>
        <td><%=emp.getSal()%></td>
        <td><%=emp.getHiredate()%></td>
    </tr>
    <%
        }
    %>

</table>
</body>
</html>

