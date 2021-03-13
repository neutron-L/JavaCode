<%@ page import="java.sql.*" %><%--
  Created by IntelliJ IDEA.
  User: 20550
  Date: 2021/2/25
  Time: 20:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
    public static String name;
    public static String password;
    public static boolean save;
    public static int time;
    public static String nextPage="welcome.jsp";
    public static int DAY_SECONDS = 24 * 60 * 60;
%>

<%--获取输入的数据--%>
<%
    Connection conn = null;
    PreparedStatement pstmt = null;
    ResultSet rst = null;
    name = request.getParameter("name");
    password = request.getParameter("password");

    assert name != null;
    if (password == null || "".equals(password)) {
        Cookie[] cookies = request.getCookies();
        for (Cookie cookie: cookies) {
            if (name.equals(cookie.getName())) {
                password = cookie.getValue();
                break;
            }
        }
    }

    if (password == null)
        password = "";

    save = request.getParameterValues("save") != null;
    time = Integer.parseInt(request.getParameter("time"));
    if (save) {
        switch (time) {
            case 1:
                time = 1;
                break;
            case 2:
                time = 30;
                break;
            case 3:
                time = 365;
                break;
            case 4:
                time = 0;
                break;
        }
        Cookie cookie = new Cookie(name, password);
        cookie.setMaxAge(time * DAY_SECONDS);
        response.addCookie(cookie);
    }
%>

<%--链接数据库--%>
<%
    try {
        Class.forName(DRIVER);
        conn = DriverManager.getConnection(URL, USER, PASSWORD);
        String sql = "SELECT * FROM member where name= ? AND password= ?;";
        pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, name);
        pstmt.setString(2, password);
        rst = pstmt.executeQuery();
        nextPage = rst.next() ? "welcome.jsp": "fail.jsp";
    } catch (ClassNotFoundException|SQLException e){
        e.printStackTrace();
    }
%>

<jsp:forward page="<%=nextPage%>">
<jsp:param name="name" value="<%=name%>"/>
    <jsp:param name="password" value="<%=password%>"/>
</jsp:forward>
</body>
</html>
