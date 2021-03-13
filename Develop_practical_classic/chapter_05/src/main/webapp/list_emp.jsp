<%--
  Created by IntelliJ IDEA.
  User: 20550
  Date: 2021/2/24
  Time: 15:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.sql.*"%>
<html>
<head>
    <title>List emp</title>
</head>
<body>

<%!
    public static String DRIVER = "com.mysql.jdbc.Driver";
    public static String SCHEMA = "javaee";
    public static String URL="jdbc:mysql://localhost:3306/" + SCHEMA + "?serverTimezone=GMT%2B8";
    public static String USER = "root";
    public static String PASSWORD="131125fei";
    public static int PAGE_ITEMS = 5;
    public static int lastPage = 0;
    public static int rows=0;
%>

<%
    Connection conn = null;
    PreparedStatement pstmt = null;
    ResultSet rst = null;
    int curPage = 1;
%>

<%
    try {
        Class.forName(DRIVER);
        conn = DriverManager.getConnection(URL, USER, PASSWORD);
        String sql = "SELECT empno, ename, job, sal, hiredate FROM emp";
        pstmt = conn.prepareStatement(sql,ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
        rst = pstmt.executeQuery();
        if (request.getParameter("curPage") != null)
            curPage = Integer.parseInt(request.getParameter("curPage"));
        assert rst != null;
        rst.last();
        rows = rst.getRow();
        lastPage = rows % PAGE_ITEMS != 0 ? rows / PAGE_ITEMS + 1: rows / PAGE_ITEMS;
        rst.absolute((curPage-1)*PAGE_ITEMS+1);
        int count = 0;
%>

<center>
    <table border="1" width="80%">
        <tr>
            <td>number</td>
            <td>name</td>
            <td>job</td>
            <td>salary</td>
            <td>date</td>
        </tr>

        <%
            do {
                if (count >= PAGE_ITEMS) break;
                count++;
                int empno = rst.getInt(1);
                String ename = rst.getString(2);
                String job = rst.getString(3);
                float sal = rst.getFloat(4);
                java.util.Date date = rst.getDate(5);
                %>
        <tr>
            <td><%= empno%></td>
            <td><%= ename%></td>
            <td><%= job%></td>
            <td><%= sal%></td>
            <td><%= date%></td>
        </tr>
        <%
            } while (rst.next());
        %>

    </table>
</center>

<%
    } catch (Exception e) {
        e.printStackTrace();
        System.out.println("=====================================================" + rows);
    } finally {
        try {
            assert pstmt != null;
            pstmt.close();
            assert rst != null;
            rst.close();
            conn.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
%>

<ul>1
    <button><a href="list_emp.jsp?curPage=<%=1%>">Home</a></button>
    <button><a href="list_emp.jsp?curPage=<%=curPage-1%>">Prev</a></button>
    <button><a href="list_emp.jsp?curPage=<%=curPage+1%>">Next</a></button>
    <button><a href="list_emp.jsp?curPage=<%=lastPage%>">Last</a></button>
</ul>

</body>
</html>
