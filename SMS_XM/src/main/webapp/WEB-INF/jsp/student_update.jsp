<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% String appPath = request.getContextPath(); %>
<html>
<head>
    <title>更新学生信息</title>
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
                    <small>修改学生信息</small>
                </h1>
            </div>
        </div>
    </div>

    <form action="${path}/studentInfo/updateStudent" method="post">
        <table class="table table-bordered table-hover">
        <input type="hidden" name="sid" value="${student.sid}"/>
        <input type="hidden" name="studentId" value="${student.studentId}"/>
        <input type="hidden" name="tbClassId" value="${student.tbClassId}"/>
        <input type="hidden" name="curPage" value="${curPage}"/>
            <tr>
                <td>学生姓名:</td>
                <td><input type="text" name="studentName" value="${student.studentName}"/></td>
            </tr>
            <tr>
                <td>所在班级:</td>
                <td>
                    <select name="tbClassName" >
                        <option>--请选择--</option>
                        <option <c:if test="${student.tbClassName=='javaEE基础一班'}">selected</c:if>>javaEE基础一班</option>
                        <option <c:if test="${student.tbClassName=='javaEE基础二班'}">selected</c:if>>javaEE基础二班</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td>性别:</td>
                <td>
                    <select name="sex" >
                        <option>--请选择--</option>
                        <option <c:if test="${student.sex==0}">selected</c:if> value="0">男</option>
                        <option <c:if test="${student.sex==1}">selected</c:if> value="1">女</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td>年龄:</td>
                <td><input type="text" name="age" value="${student.age}"/></td>
            </tr>
            <tr>
                <td>学号:</td>
                <td><input type="text" name="studentNo" value="${student.studentNo}"/></td>
            </tr>
            <tr>
                <td>学员状态:</td>
                <td>
                    <select name="stats" >
                        <option>--请选择--</option>
                        <option <c:if test="${student.stats==0}">selected</c:if> value="0">新生</option>
                        <option <c:if test="${student.stats==1}">selected</c:if> value="1">升级</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td>身份证号码:</td>
                <td><input type="text" name="idcardNo" value="${student.idcardNo}"/></td>
            </tr>
            <tr>
                <td>手机号:</td>
                <td><input type="text" name="mobileNo" value="${student.mobileNo}"/></td>
            </tr>
            <tr>
                <td>开班日期:</td>
                <td><input type="date" name="classOpenDate" value="${student.classOpenDate}"/></td>
            </tr>
            <tr>
                <td>预计毕业日期:</td>
                <td><input type="date" name="normalGraduateDate" value="${student.normalGraduateDate}"/></td>
            </tr>
            <tr>
                <td>实际毕业日期:</td>
                <td><input type="date" name="actualGraduateDate" value="${student.actualGraduateDate}"/></td>
            </tr>
            <tr>
                <td>身份证地址:</td>
                <td><input type="text" name="idcardAddress" value="${student.idcardAddress}"/></td>
            </tr>
            <tr>
                <td>实际居住地:</td>
                <td><input type="text" name="actualAdderss" value="${student.actualAdderss}"/></td>
            </tr>
            <tr>
                <td>家庭联系电话:</td>
                <td><input type="text" name="familyPhone" value="${student.familyPhone}"/></td>
            </tr>
            <tr>
                <td>QQ号:</td>
                <td><input type="text" name="qq" value="${student.qq}"/></td>
            </tr>
            <tr>
                <td>学历:</td>
                <td><input type="text" name="education" value="${student.education}"/></td>
            </tr>
            <tr>
                <td>毕业学校:</td>
                <td><input type="text" name="graduateSchool" value="${student.graduateSchool}"/></td>
            </tr>
            <tr>
                <td>专业:</td>
                <td><input type="text" name="major" value="${student.major}"/></td>
            </tr>
            <tr>
                <td>毕业时间:</td>
                <td><input type="date" name="graduateDate" value="${student.graduateDate}"/></td>
            </tr>
            <tr>
                <td>是否可用:</td>
                <td>
                    <select name="usableFlag" >
                        <option>--请选择--</option>
                        <option <c:if test="${student.usableFlag==0}">selected</c:if> value="0">可用</option>
                        <option <c:if test="${student.usableFlag==1}">selected</c:if> value="1">不可用</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td>是否删除:</td>
                <td>
                    <select name="deleteFlag" >
                        <option>--请选择--</option>
                        <option <c:if test="${student.deleteFlag==0}">selected</c:if> value="0">未删除</option>
                        <option <c:if test="${student.deleteFlag==1}">selected</c:if> value="1">已删除</option>
                    </select>
                </td>
            </tr>

            <tr>
                <td colspan="2">
                    <button class="btn btn-primary btn-sm">更新</button>
                </td>
            </tr>

        </table>
    </form>
</div>
</body>
</html>
