<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% String appPath = request.getContextPath(); %>
<html>
<head>
    <title>新增学生信息</title>
    <meta name = "viewport" content = "width=device-width,inital-scale=1.0">
    <!-- 引入BootStrap  -->
    <link href="https://cdn.bootcss.com/twitter-bootstrap/3.0.1/css/bootstrap.min.css" rel="stylesheet">
    <script type="text/javascript" src="../../js/jquery-3.3.1.min.js"></script>
    <script src="https://cdn.bootcss.com/twitter-bootstrap/3.0.1/js/bootstrap.min.js"></script>
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

    <form action="${path}/studentInfo/addStudent" method="post">
        <table class="table table-bordered table-hover">
            <tr>
                <td>学生姓名:</td>
                <td><input type="text" name="studentName"/></td>
            </tr>
            <tr>
                <td>学生ID:</td>
                <td><input type="text" name="studentId"/></td>
            </tr>
            <tr>
                <td>所在班级:</td>
                <td>
                    <select name="tbClassId" >
                        <option>--请选择--</option>
                        <c:forEach items="${clazzList}" var="clazz">
                            <option value="${clazz.cid}">${clazz.clazzName}</option>
                        </c:forEach>
                    </select>
                </td>
            </tr>
            <tr>
                <td>性别:</td>
                <td>
                    <select name="sex" >
                        <option>--请选择--</option>
                        <option value="0">男</option>
                        <option value="1">女</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td>年龄:</td>
                <td><input type="text" name="age"/></td>
            </tr>
            <tr>
                <td>学号:</td>
                <td><input type="text" name="studentNo"/></td>
            </tr>
            <tr>
                <td>学员状态:</td>
                <td>
                    <select name="stats" >
                        <option>--请选择--</option>
                        <option value="0">新生</option>
                        <option value="1">升级</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td>身份证号码:</td>
                <td><input type="text" name="idcardNo" /></td>
            </tr>
            <tr>
                <td>手机号:</td>
                <td><input type="text" name="mobileNo"/></td>
            </tr>
            <tr>
                <td>开班日期:</td>
                <td><input type="date" name="classOpenDate"/></td>
            </tr>
            <tr>
                <td>预计毕业日期:</td>
                <td><input type="date" name="normalGraduateDate"/></td>
            </tr>
            <tr>
                <td>实际毕业日期:</td>
                <td><input type="date" name="actualGraduateDate"/></td>
            </tr>
            <tr>
                <td>身份证地址:</td>
                <td><input type="text" name="idcardAddress"/></td>
            </tr>
            <tr>
                <td>实际居住地:</td>
                <td><input type="text" name="actualAdderss"/></td>
            </tr>
            <tr>
                <td>家庭联系电话:</td>
                <td><input type="text" name="familyPhone"/></td>
            </tr>
            <tr>
                <td>QQ号:</td>
                <td><input type="text" name="qq"/></td>
            </tr>
            <tr>
                <td>学历:</td>
                <td><input type="text" name="education"/></td>
            </tr>
            <tr>
                <td>毕业学校:</td>
                <td><input type="text" name="graduateSchool"/></td>
            </tr>
            <tr>
                <td>专业:</td>
                <td><input type="text" name="major"/></td>
            </tr>
            <tr>
                <td>毕业时间:</td>
                <td><input type="date" name="graduateDate"/></td>
            </tr>

            <tr>
                <td colspan="2">
                    <button class="btn btn-primary btn-sm">新增</button>
                </td>
            </tr>

        </table>
    </form>
</div>
</body>
</html>
