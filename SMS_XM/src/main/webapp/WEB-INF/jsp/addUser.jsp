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
    <title>新增用户</title>
    <meta name = "viewport" content="width=device-width,initial-scale=1.0">
    <!-- 引入Bootstrap  -->
    <link href="../../bootstrp/bootstrap.min.css" rel="stylesheet">
</head>

<script type="text/javascript">
    function addUser(){
        var form = document.forms[0];
        form.action = "<%=basePath %>user/addUser";
        form.method = "post";
        form.submit();
    }
</script>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    基于SSM框架的管理系统：简单实现增、删、改、查。
                </h1>
            </div>
        </div>
    </div>

    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>新增用户</small>
                </h1>
            </div>
        </div>
    </div>

    <form action="" name="userForm">
        用户名称:<input type="text" name="username"></br></br></br>
        用户年龄:<input type="text" name="age"></br></br></br>
        <input type="button" value="添加" onclick="addUser()">
    </form>

</div>
</body>
</html>
