<%--
  Created by IntelliJ IDEA.
  User: cliu
  Date: 5/10/2020
  Time: 9:57 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h2>hello chenliu</h2>
<form action="${pageContext.request.contextPath}/hello/test4">
    <input type="checkbox" name="cat" value="phoebe"> aaaa<br>
    <input type="checkbox" name="cat" value="duoduo"> duoduo<br>
    <input type="checkbox" name="cat" value="cc"> chenchen<br>
    <input type="submit" value="submit">
</form>

</body>
</html>
