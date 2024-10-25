<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Cable展示页面</title>

    <%--BootStrap美化界面 --%>
    <!-- BootStrap 美化界面 -->
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            background-color: #f8f9fa;
        }
        .page-header {
            text-align: center;
            margin-top: 30px;
        }
        .page-header h1 small {
            color: #5a5a5a;
            font-weight: bold;
        }
        .form-inline {
            margin-top: 15px;
        }
        .table th, .table td {
            vertical-align: middle;
            text-align: center;
        }
        .table {
            margin-top: 20px;
            border-radius: 10px;
            overflow: hidden;
            box-shadow: 0 2px 10px rgba(0, 0, 0, 0.1);
        }
        .btn {
            margin: 5px;
        }
    </style>
</head>
<body>

<div class="container-fluid">

    <div class="row clearfix">
        <div class="col-xs-12 column"> <!-- 使用自适应列 -->
            <div class="page-header">
                <h1>
                    <small>测试信息表</small>
                </h1>
            </div>
        </div>

        <div class="row">
            <div class="col-xs-12 col-md-4"><!-- 使用自适应列 -->
                <%--toAddBook--%>
                <a class="btn btn-success" href="${pageContext.request.contextPath}/test/toAddTest">新增测试信息</a>
                <a class="btn btn-info" href="${pageContext.request.contextPath}/test/allTest">显示全部测试信息</a>
            </div>

            <div class="col-md-4 column"></div>

<%--            <div class="col-xs-12 col-md-4">--%>
<%--                <form  class="form-inline" action="${pageContext.request.contextPath}/test/queryTest" method="post" style="float: right">--%>
<%--                    <span style="color: red;font-weight: bold">${error}</span>--%>
<%--                    <input type="text" name="queryCableName" class="form-control" placeholder="请输入要查询的线缆名称">--%>
<%--                    <input type="submit" value="查询" class="btn btn-primary">--%>
<%--                </form>--%>
<%--            </div>--%>
        </div>


    </div>

    <div class="row clearfix mt-4">
        <div class="col-xs-12 column"> <!-- 使用自适应列 -->
            <table class="table table-hover table-striped">
                <thead>
                <tr>
                    <th>线缆编号</th>
                    <th>测试日期</th>
                    <th>测试结果</th>
                    <th>描述</th>
                    <th>操作员</th>
                    <th>操作员</th>
                    <th>操作员</th>
                    <th>操作</th>
                </tr>
                </thead>
                <%--从数据库中查询出来,从这个list中遍历出来 foreach--%>
                <tbody>
                <c:forEach var="test" items="${list}">
                    <tr>
                        <td>${test.cableID}</td>
                        <td>${test.testdate}</td>
                        <td>${test.testresult}</td>
                        <td>${test.description}</td>
                        <td>${test.operator1}</td>
                        <td>${test.operator2}</td>
                        <td>${test.operator3}</td>
                        <td>
                            <a class="btn btn-warning btn-sm" href="${pageContext.request.contextPath}/test/toUpdate?cableID=${test.cableID}">修改</a>
                            &nbsp;   | &nbsp;
                            <a class="btn btn-danger btn-sm" href="${pageContext.request.contextPath}/test/deleteTest?cableID=${test.cableID}">删除</a>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>

    </div>

</div>


</body>
</html>