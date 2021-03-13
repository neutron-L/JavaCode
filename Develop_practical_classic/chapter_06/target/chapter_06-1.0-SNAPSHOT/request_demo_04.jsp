<%@ page import="java.util.Enumeration" %><%--
  Created by IntelliJ IDEA.
  User: 20550
  Date: 2021/2/25
  Time: 14:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<center>
    <table border="1">
        <tr>
            <td>Name</td>
            <td>Content</td>
        </tr>
        <%
            Enumeration enu = request.getParameterNames();
            while (enu.hasMoreElements()) {
                String paramName = (String) enu.nextElement();
        %>
        <tr>
            <td>
                <%=paramName%>;
            </td>
            <td>
                <%
                    if (paramName.startsWith("**")) {
                        String[] paramValue = request.getParameterValues(paramName);
                        for (String s : paramValue) {
                %>

                <%=s%>
                <%

                    }
                } else {
                    String paramValue = request.getParameter(paramName);
                %>

                <%=paramValue%>
                <%
                    }
                %>

            </td>
        </tr>

        <%
            }
        %>
    </table>
</center>
</body>
</html>
