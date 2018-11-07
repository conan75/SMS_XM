<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% String appPath = request.getContextPath(); %>
<html>
<head>
    <title>班级信息列表</title>
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
                    <th colspan="12">
                        <form class="navbar-left" role="search" action="${path}/clazzInfo/searchByCondition" method="post">
                            <input name="clazzName" type="text" placeholder="班级名称"/>
                            <button class="btn btn-primary btn-sm">查询</button>
                        </form>
                        &nbsp;
<%--                        <form class="navbar-right" role="search" action="${path}/studentInfo/importExcel" enctype="multipart/form-data" method="post">
                            <input name="excelFile" type="file" id="exampleInputFile" />
                            <button class="btn btn-primary btn-sm">导入excel</button>
                        </form>--%>
                        <button type="button" class="btn btn-primary btn-sm" onclick="javascript:window.location.href='${path}/clazzInfo/toAddClazz'">新增</button>
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
                        班级名称
                    </th>
                    <th>
                        是否可用
                    </th>
                    <th>
                        是否删除
                    </th>
                    <th>
                        操作
                    </th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="clazz" items="${pageInfo.list}" varStatus="status">
                <tr>
                    <td>
                        <label><input type="checkbox" value="${clazz.clazzId}"/></label>
                    </td>
                    <td>
                        ${status.index+1}
                    </td>
                    <td>
                        ${clazz.clazzName}
                    </td>
                    <td>
                        <c:if test="${clazz.usableFlag==0}">
                            可用
                        </c:if>
                        <c:if test="${clazz.usableFlag==1}">
                            不可用
                        </c:if>
                    </td>
                    <td>
                        <c:if test="${clazz.deleteFlag==0}">
                            未删除
                        </c:if>
                        <c:if test="${clazz.deleteFlag==1}">
                            已删除
                        </c:if>
                    </td>
                    <td>
                        <button type="button" class="btn btn-primary btn-sm" onclick="javascript:window.location.href='${path}/clazzInfo/toUpdateClazz?id=${clazz.cid}&curPage=${pageInfo.pageNum}'">修改</button>
                        <button type="button" style="background-color: #e83e8c" class="btn btn-primary btn-sm" onclick="javascript:window.location.href='${path}/clazzInfo/del/${clazz.cid}/${pageInfo.pageNum}'">删除</button>
                        <button type="button" class="btn btn-primary btn-sm" onclick="javascript:window.location.href='${path}/clazzInfo/changeFlag/${clazz.cid}/${pageInfo.pageNum}'"><c:if test="${clazz.usableFlag==0}">停用</c:if><c:if test="${clazz.usableFlag==1}">恢复</c:if></button>
                        <form class="navbar-right" role="search" action="${path}/studentInfo/importExcel" enctype="multipart/form-data" method="post">
                            <input name="excelFile" type="file" id="exampleInputFile" />
                            <input type="hidden" name="clazzId" value="${clazz.clazzId}">
                            <input type="hidden" name="clazzName" value="${clazz.clazzName}">
                            <button class="btn btn-primary btn-sm">导入excel</button>
                        </form>
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

                    <li><a href="${pageContext.request.contextPath}/clazzInfo/clazz_list?pn=1">首页</a></li>

                    <!--上一页-->
                    <li>
                        <c:if test="${pageInfo.hasPreviousPage}">
                            <a href="${pageContext.request.contextPath}/clazzInfo/clazz_list?pn=${pageInfo.pageNum-1}" aria-label="Previous">
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
                            <li><a href="${pageContext.request.contextPath}/clazzInfo/clazz_list?pn=${page_num}">${page_num}</a></li>
                        </c:if>
                    </c:forEach>

                    <!--下一页-->
                    <li>
                        <c:if test="${pageInfo.hasNextPage}">
                            <a href="${pageContext.request.contextPath}/clazzInfo/clazz_list?pn=${pageInfo.pageNum+1}"
                               aria-label="Next">
                                <span aria-hidden="true">»</span>
                            </a>
                        </c:if>
                    </li>

                    <li><a href="${pageContext.request.contextPath}/clazzInfo/clazz_list?pn=${pageInfo.pages}">尾页</a></li>
                </ul>
            </nav>
        </div>

    </div>

</div>
</body>
</html>
