<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% String appPath = request.getContextPath(); %>
<html>
<head>
    <title>操作信息提示</title>
    <meta name = "viewport" content = "width=device-width,inital-scale=1.0">
    <!-- 引入BootStrap  -->
    <link href="https://cdn.bootcss.com/twitter-bootstrap/3.0.1/css/bootstrap.min.css" rel="stylesheet">
    <script type="text/javascript" src="../../js/jquery-3.3.1.min.js"></script>
    <script src="https://cdn.bootcss.com/twitter-bootstrap/3.0.1/js/bootstrap.min.js"></script>
    <script>
        setTimeout(function(){ window.location.href="${path}/studentInfo/student_list?pn=1" }, 2000);
    </script>
</head>
<body>
<div class="container">
    <h2>${msg}</h2>
</div>
</body>
</html>
