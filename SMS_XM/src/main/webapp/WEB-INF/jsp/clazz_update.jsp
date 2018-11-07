<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% String appPath = request.getContextPath(); %>
<html>
<head>
    <title>更新班级信息</title>
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
                    <small>修改班级信息</small>
                </h1>
            </div>
        </div>
    </div>

    <form action="${path}/clazzInfo/updateClazz" method="post">
        <table class="table table-bordered table-hover">
        <input type="hidden" name="cid" value="${clazz.cid}"/>
        <input type="hidden" name="clazzId" value="${clazz.clazzId}"/>
        <input type="hidden" name="sourceId" value="${clazz.sourceId}"/>
        <input type="hidden" name="curPage" value="${curPage}"/>
            <tr>
                <td>班级名称:</td>
                <td>
                    <input name="clazzName" value="${clazz.clazzName}" id="clazzName"/>
                    <select id="schoolArea" name="schoolArea" >
                        <option>--校区--</option>
                        <option value="北京">北京</option>
                        <option value="上海">上海</option>
                        <option value="广州">广州</option>
                        <option value="厦门">厦门</option>
                    </select>
                    <select id="subject" name="subject" >
                        <option>--学科--</option>
                        <option value="JAVAEE">JAVAEE</option>
                        <option value="PYTHON">PYTHON</option>
                        <option value="PHP">PHP</option>
                        <option value="大数据">大数据</option>
                        <option value="区块链">区块链</option>
                        <option value="运维与测试">运维与测试</option>
                    </select>
                    <select id="clazzNature" name="clazzNature" >
                        <option>--班级性质--</option>
                        <option value="基础">基础</option>
                        <option value="就业">就业</option>
                    </select>
                    <select id="clazzNo" name="clazzNo" >
                        <option>--班号--</option>
                        <option value="一班">一班</option>
                        <option value="二班">二班</option>
                        <option value="三班">三班</option>
                        <option value="四班">四班</option>
                        <option value="五班">五班</option>
                        <option value="六班">六班</option>
                    </select>
                </td>
            </tr>
                <td>是否可用:</td>
                <td>
                    <select name="usableFlag" >
                        <option>--请选择--</option>
                        <option <c:if test="${clazz.usableFlag==0}">selected</c:if> value="0">可用</option>
                        <option <c:if test="${clazz.usableFlag==1}">selected</c:if> value="1">不可用</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td>是否删除:</td>
                <td>
                    <select name="deleteFlag" >
                        <option>--请选择--</option>
                        <option <c:if test="${clazz.deleteFlag==0}">selected</c:if> value="0">未删除</option>
                        <option <c:if test="${clazz.deleteFlag==1}">selected</c:if> value="1">已删除</option>
                    </select>
                </td>
            </tr>

            <tr>
                <td colspan="2">
                    <button class="btn btn-primary btn-sm" onclick="GenerateClazzName()">更新</button>
                </td>
            </tr>

        </table>
    </form>
</div>
<script>
    function GenerateClazzName() {
        $("#clazzName").val($("#schoolArea").val()+$("#subject").val()+$("#clazzNature").val()+$("#clazzNo").val());
    }
</script>
</body>
</html>
