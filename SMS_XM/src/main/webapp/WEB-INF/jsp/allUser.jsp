<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% String appPath = request.getContextPath(); %>
<html>
<head>
    <title>用户列表</title>
    <meta name = "viewport" content = "width=device-width,inital-scale=1.0">
    <!-- 引入BootStrap  -->
    <link href="../../bootstrp/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container">
        <div class="row clearfix">
            <div class="col-md-12 column">
                <div class="page-header">
                    <h1>
                        基于SSM框架的管理系统:实现简单的增删改查功能
                    </h1>
                </div>
            </div>
        </div>
    </div>

    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>用户列表</small>
                </h1>
            </div>
        </div>
    </div>

    <div class="row">
        <div class="col-md-4 column">
            <a class="btn btn-primary" href="${path}/user/toAddUser">新增</a>
        </div>
    </div>

    <div class="row clearfix">
        <div class="col-md-12 column">
            <table class="table table-hover table-striped">
                <thread>
                    <tr>
                        <th>用户编号</th>
                        <th>用户姓名</th>
                        <th>用户年龄</th>
                        <th>操作</th>
                    </tr>
                </thread>
                <tbody>
                <c:forEach var="user" items="${requestScope.get('list')}" varStatus="status">
                    <tr>
                        <td>${user.id}</td>
                        <td>${user.username}</td>
                        <td>${user.age}</td>
                        <td>
                            <a href="${path}/user/toUpdateUser?id=${user.id}">更改</a>
                            <a href="<%=appPath%>/user/del/${user.id}">删除</a>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</body>
</html>
