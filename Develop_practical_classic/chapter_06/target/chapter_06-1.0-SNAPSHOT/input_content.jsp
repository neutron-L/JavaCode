<%--
  Created by IntelliJ IDEA.
  User: 20550
  Date: 2021/2/25
  Time: 19:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.io.*" %>
<%@ page import="java.util.*" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String name = request.getParameter("filename");
    String content = request.getParameter("filecontent");
    String fileName = application.getRealPath("/")
    + "note" + File.separator + name;
    File file = new File(fileName);
    if (!file.getParentFile().exists()) {
        file.getParentFile().mkdir();
    }
    PrintStream ps = null;
    ps = new PrintStream(new FileOutputStream(file));
    ps.println(content);
    ps.close();
%>
<%
    Scanner scanner = new Scanner(new FileInputStream(file));
    scanner.useDelimiter("\n");
    StringBuffer buf = new StringBuffer();
    while (scanner.hasNext()) {
        buf.append(scanner.next()).append("<br>");
    }
    scanner.close();
%>
<%=buf%>
</body>
</html>
