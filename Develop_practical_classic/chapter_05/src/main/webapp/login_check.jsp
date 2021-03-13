<%@ page import="java.sql.PreparedStatement" %><%--
  Created by IntelliJ IDEA.
  User: 20550
  Date: 2021/2/24
  Time: 17:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.sql.*" %>
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
%>

<%
    Connection conn = null;
    PreparedStatement pstmt = null;
    ResultSet rst = null;
    boolean flag = false;
    String name = null;
%>

<%
    try {
        Class.forName(DRIVER);
        conn = DriverManager.getConnection(URL, USER, PASSWORD);
        String sql = "SELECT name FROM user WHERE userid=? AND password = ?";
        pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, request.getParameter("id"));
        pstmt.setString(2, request.getParameter("password"));
        rst = pstmt.executeQuery();
        if (rst.next()) {
            name = rst.getString(1);
            flag = true;
        }
    } catch (Exception e) {
        e.printStackTrace();
    } finally {
        try {
            assert rst != null;
            rst.close();
            assert pstmt != null;
            pstmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
%>

<%
    if (flag) { %>
<jsp:forward page="login_success.jsp">
    <jsp:param name="name" value="<%= name%>"/>
</jsp:forward>
<%
    } else {
%>
<jsp:forward page="login_failure.jsp" />
<%
    }
%>

</body>
</html>
