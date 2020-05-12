<%--
  Created by IntelliJ IDEA.
  User: cliu
  Date: 5/12/2020
  Time: 10:33 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Upload</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/upload/test2" method="post" enctype="multipart/form-data">
    <input type="text" name="username"><br>
    <input type="file" name="file"><br>
    <input type="submit" name="confirm">
</form>
</body>
</html>
