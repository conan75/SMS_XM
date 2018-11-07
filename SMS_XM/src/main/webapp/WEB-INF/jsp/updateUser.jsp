<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"
            + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
<html>
<head>
    <title>修改用户</title>
    <meta name = "viewprot" content="width=device-widh,initial-scale=1.0">
    <!-- 引入BootStrap  -->
    <link href="../../bootstrp/bootstrap.min.css" rel="stylesheet">

    <script type="text/javascript">
        function updateUser() {
            var form = document.forms[0];
            form.action = "<%=basePath %>user/updateUser";
            form.method = "post";
            form.submit();
        }
    </script>
</head>
<body>
    <div class="container">
        <div class="row clearfix">
            <div class = "col-md-12 column">
                <div class="page-header">
                    <h1>
                        <small>基于SSM框架的用户管理系统</small>
                    </h1>
                </div>
            </div>
        </div>

        <div class="row clearfix">
            <div class="col-md-12 column">
                <div class="page-header">
                    <h1>
                        <small>修改用户</small>
                    </h1>
                </div>
            </div>
        </div>

        <form action="" name="userForm">
            <input type="hidden" name="id" value="${user.id}"/>
            用户名称:<input type="text" name="username" value="${user.username}"/>
            用户年龄:<input type="text" name="age" value="${user.age}"/>
            <input type="button" value="提交" onclick="updateUser()"/>
        </form>
    </div>
</body>
</html>
