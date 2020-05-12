<%--
  Created by IntelliJ IDEA.
  User: cliu
  Date: 5/11/2020
  Time: 11:46 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
${param.msg}
<form action="${pageContext.request.contextPath}/user/login/logic" method="post">
    blog-title: <input type="text" name="title"><br>
    blog-author_id: <input type="text" name="authod_id"><br>
    <input type="submit" value="confirm">
</form>
</body>
</html>
