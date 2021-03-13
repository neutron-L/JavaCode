<%--
  Created by IntelliJ IDEA.
  User: 20550
  Date: 2021/2/26
  Time: 17:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.sql.*" %>
<%@ page import="java.text.SimpleDateFormat" %>
<html>
<head>
    <title>Title</title>
</head>
<body>


<%!
    public static String DRIVER = "com.mysql.jdbc.Driver";
    public static String SCHEMA = "javaee";
    public static String URL = "jdbc:mysql://localhost:3306/" + SCHEMA + "?serverTimezone=GMT%2B8";
    public static String USER = "root";
    public static String PASSWORD = "131125fei";
    public static String insertSql = "INSERT INTO emp VALUES(?, ?, ?, ?, ?);";
    public static String findSql = "SELECT * FROM emp WHERE empno = ?;";
    public static String dropSql = "DELETE FROM emp WHERE empno = ?;";


    public static Connection conn = null;
    public static PreparedStatement pstmt = null;
    public static ResultSet rst = null;

    public static int empno;
    public static String ename;
    public static String job;
    public static Date hiredate;
    public static int sal;
    public static int operator;
%>

<%!
    public static String insert() throws SQLException {
        pstmt = conn.prepareStatement(findSql);
        pstmt.setInt(1, empno);
        rst = pstmt.executeQuery();
        if (rst.next()) {
            return "insert failed";
        } else {
            pstmt = conn.prepareStatement(insertSql);
            pstmt.setInt(1, empno);
            pstmt.setString(2, ename);
            pstmt.setString(3, job);
            pstmt.setDate(4, hiredate);
            pstmt.setInt(5, sal);
            pstmt.executeUpdate();
            return "insert success";
        }
    }
%>



<%!
    public static String drop() throws SQLException {
        {
            pstmt = conn.prepareStatement(findSql);
            pstmt.setInt(1, empno);
            rst = pstmt.executeQuery();
            if (!rst.next()) {
                return "drop failed";
            } else {
                pstmt = conn.prepareStatement(dropSql);
                pstmt.setInt(1, empno);
                pstmt.executeUpdate();
                return "drop success";
            }
        }
    }
%>

<%
    empno = Integer.parseInt(request.getParameter("empno"));
    ename = request.getParameter("ename");
    job = request.getParameter("job");
    if (request.getParameter("hiredate") != null && !"".equals(request.getParameter("sal")))
        hiredate = Date.valueOf(request.getParameter("hiredate"));
    if (request.getParameter("sal") != null && !"".equals(request.getParameter("sal")))
        sal = Integer.parseInt(request.getParameter("sal"));
    operator = Integer.parseInt(request.getParameter("operator"));
%>
<%--连接数据库--%>
<%
    try {

        Class.forName(DRIVER);
        conn = DriverManager.getConnection(URL, USER, PASSWORD);
        switch (operator) {
            case 1: {
%>
<h3><%=insert()%>
</h3>

<%
            }
            break;
            case 2:
                break;
            case 3:
                break;
            case 4:
            {
                %>
<%=drop()%>
<%
            }
                break;
        }
    } catch (SQLException | ClassNotFoundException e) {
        e.printStackTrace();
    }
%>

</body>
</html>
