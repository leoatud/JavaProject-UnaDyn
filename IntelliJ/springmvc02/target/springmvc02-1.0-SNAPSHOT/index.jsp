<%@page pageEncoding="UTF-8" %>

<html>
<head>

</head>
<body>
<script src="${pageContext.request.contextPath}/js/jQuery.js"></script>
<script>
    function ajax01() {
        $.ajax({
            type:"post",
            url:"${pageContext.request.contextPath}/json/test3",
            data:'',
            dataType:"json",
            contentType:"application/json",
            success:function (ret) {
                console.log(ret);
            }
        });
    }
</script>
<input type="button" value="ajax" onclick="ajax01();"/>
<h2>Hello World!</h2>
</body>
</html>
