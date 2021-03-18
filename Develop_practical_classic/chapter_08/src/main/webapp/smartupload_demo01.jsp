<%--
  Created by IntelliJ IDEA.
  User: 20550
  Date: 2021/3/18
  Time: 15:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.jspsmart.upload.SmartUpload" %>
<%@ page import="com.jspsmart.upload.SmartUploadException" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    SmartUpload smart = new SmartUpload();
    smart.initialize(pageContext);
    smart.upload();
    try {
        smart.save("D:\\algorithm\\JavaCode\\Develop_practical_classic\\chapter_08\\upload");
    } catch (SmartUploadException e) {
        e.printStackTrace();
    }
%>
</body>
</html>
