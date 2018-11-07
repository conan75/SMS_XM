<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% String appPath = request.getContextPath(); %>
<html>
<head>
    <title>学生信息列表</title>
    <meta name = "viewport" content = "width=device-width,inital-scale=1.0">
    <!-- 引入BootStrap  -->
    <link href="https://cdn.bootcss.com/twitter-bootstrap/3.0.1/css/bootstrap.min.css" rel="stylesheet">
    <script type="text/javascript" src="../../js/jquery-3.3.1.min.js"></script>
    <script src="https://cdn.bootcss.com/twitter-bootstrap/3.0.1/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">

            <table class="table table-bordered table-hover">
                <thead>
                <tr>
                    <th colspan="11">
                        <form class="navbar-left" role="search" action="${path}/studentInfo/searchByCondition" method="post">
                            <input name="studentName" type="text" placeholder="学生姓名"/>
                            <button class="btn btn-primary btn-sm">查询</button>
                        </form>
                        &nbsp;
                        <%--<form class="navbar-right" role="search" action="${path}/studentInfo/importExcel" enctype="multipart/form-data" method="post">--%>
                            <%--<input name="excelFile" type="file" id="exampleInputFile" />--%>
                            <%--<button class="btn btn-primary btn-sm">导入excel</button>--%>
                        <%--</form>--%>
                        <button type="button" class="btn btn-primary btn-sm" onclick="javascript:window.location.href='${path}/studentInfo/toAddStudent'">新增</button>
                        <button type="button" class="btn btn-primary btn-sm" onclick="javascript:window.location.href='${path}/clazzInfo/clazz_list'">班级列表</button>
                    </th>
                </tr>
                <tr>
                    <th>
                        <label><input type="checkbox" /></label>
                    </th>
                    <th>
                        序号
                    </th>
                    <th>
                        学生姓名
                    </th>
                    <th>
                        学号
                    </th>
                    <th>
                        性别
                    </th>
                    <th>
                        年龄
                    </th>
                    <th>
                        所属班级
                    </th>
                    <th>
                        学员状态
                    </th>
                    <%--<th>--%>
                        <%--手机号--%>
                    <%--</th>--%>
                    <th>
                        毕业学校
                    </th>
                    <th>
                        是否可用
                    </th>
                    <th>
                        操作
                    </th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="student" items="${pageInfo.list}" varStatus="status">
                <tr>
                    <td>
                        <label><input type="checkbox" value="${student.sid}"/></label>
                    </td>
                    <td>
                        ${status.index+1}
                    </td>
                    <td>
                        ${student.studentName}
                    </td>
                    <td>
                        ${student.studentNo}
                    </td>
                    <td>
                        <c:if test="${student.sex==0}">
                            男
                        </c:if>
                        <c:if test="${student.sex==1}">
                            女
                        </c:if>
                    </td>
                    <td>
                        ${student.age}
                    </td>
                    <td>
                        ${student.tbClassName}
                    </td>
                    <td>
                        <c:if test="${student.stats==0}">
                            新生
                        </c:if>
                        <c:if test="${student.stats==1}">
                            升级
                        </c:if>
                    </td>
                    <%--<th>--%>
                        <%--${student.mobileNo}--%>
                    <%--</th>--%>
                    <td>
                        ${student.graduateSchool}
                    </td>
                    <td>
                        <c:if test="${student.usableFlag==0}">
                            可用
                        </c:if>
                        <c:if test="${student.usableFlag==1}">
                            不可用
                        </c:if>
                    </td>
                    <td>
                        <button type="button" class="btn btn-primary btn-sm" onclick="javascript:window.location.href='${path}/studentInfo/toUpdateStudent?id=${student.sid}&curPage=${pageInfo.pageNum}'">修改</button>
                        <button type="button" style="background-color: #e83e8c" class="btn btn-primary btn-sm" onclick="javascript:window.location.href='${path}/studentInfo/del/${student.sid}/${pageInfo.pageNum}'">删除</button>
                        <button type="button" class="btn btn-primary btn-sm" onclick="javascript:window.location.href='${path}/studentInfo/changeFlag/${student.sid}/${pageInfo.pageNum}'"><c:if test="${student.usableFlag==0}">停用</c:if><c:if test="${student.usableFlag==1}">恢复</c:if></button>
                    </td>
                </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
    <!--显示分页信息-->
    <div class="row">
        <!--文字信息-->
        <div class="col-md-6">
            当前第 ${pageInfo.pageNum} 页.总共 ${pageInfo.pages} 页.一共 ${pageInfo.total} 条记录
        </div>

        <!--点击分页-->
        <div class="col-md-6">
            <nav aria-label="Page navigation">
                <ul class="pagination">

                    <li><a href="${pageContext.request.contextPath}/studentInfo/student_list?pn=1">首页</a></li>

                    <!--上一页-->
                    <li>
                        <c:if test="${pageInfo.hasPreviousPage}">
                            <a href="${pageContext.request.contextPath}/studentInfo/student_list?pn=${pageInfo.pageNum-1}" aria-label="Previous">
                                <span aria-hidden="true">«</span>
                            </a>
                        </c:if>
                    </li>

                    <!--循环遍历连续显示的页面，若是当前页就高亮显示，并且没有链接-->
                    <c:forEach items="${pageInfo.navigatepageNums}" var="page_num">
                        <c:if test="${page_num == pageInfo.pageNum}">
                            <li class="active"><a href="#">${page_num}</a></li>
                        </c:if>
                        <c:if test="${page_num != pageInfo.pageNum}">
                            <li><a href="${pageContext.request.contextPath}/studentInfo/student_list?pn=${page_num}">${page_num}</a></li>
                        </c:if>
                    </c:forEach>

                    <!--下一页-->
                    <li>
                        <c:if test="${pageInfo.hasNextPage}">
                            <a href="${pageContext.request.contextPath}/studentInfo/student_list?pn=${pageInfo.pageNum+1}"
                               aria-label="Next">
                                <span aria-hidden="true">»</span>
                            </a>
                        </c:if>
                    </li>

                    <li><a href="${pageContext.request.contextPath}/studentInfo/student_list?pn=${pageInfo.pages}">尾页</a></li>
                </ul>
            </nav>
        </div>

    </div>

</div>
</body>
</html>
