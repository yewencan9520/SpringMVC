<%--
  Created by IntelliJ IDEA.
  User: yewencandePC
  Date: 2020/7/1
  Time: 20:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>jquery异步请求之ajax</title>
    <script src="js/jquery-3.2.1.min.js"></script>
    <script>
        function fn1() {

            var Json={"id":1,"username":"zhangsan","password":"1111"}
            $.ajax({
                type:"post",
                url:"${pageContext.request.contextPath}/login",
                data:JSON.stringify(Json),
                success:function (data) {
                    console.log(data)
                },
                dataType:"json",
                contentType : "application/json;charset=UTF-8"
            });
        }
    </script>
</head>
<body>
<button onclick="fn1()">ajax请求</button>
<a href="${pageContext.request.contextPath}/login2">login2</a>
</body>
</html>
