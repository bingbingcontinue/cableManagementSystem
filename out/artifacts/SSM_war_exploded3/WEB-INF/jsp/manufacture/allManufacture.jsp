<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>CableManagementSystem</title>

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
                    <small>生产信息：显示所有线缆批次</small>
                </h1>
            </div>
        </div>

        <div class="row">
            <div class="col-xs-12 col-md-4"><!-- 使用自适应列 -->
                <%--toAddBook--%>
                <a class="btn btn-success" href="${pageContext.request.contextPath}/manufacture/toAddManufacture">新增线缆批次</a>
                <a class="btn btn-info" href="${pageContext.request.contextPath}/manufacture/allManufacture">显示全部线缆批次</a>
            </div>

            <div class="col-md-4 column"></div>

        </div>


    </div>

    <div class="row clearfix mt-4">
        <div class="col-xs-12 column"> <!-- 使用自适应列 -->
            <table class="table table-hover table-striped">
                <thead>
                <tr>
                    <th>批次编号</th>
                    <th>供应商</th>
                    <th>产品型号</th>
                    <th>生产日期</th>
                    <th>直径</th>
                    <th>直径单位</th>
                    <th>芯材</th>
                    <th>绝缘层材质</th>
                    <th>屏蔽层材质</th>
                    <th>质保期</th>
                    <th>价格</th>
                    <th>操作</th>
                </tr>
                </thead>
                <%--生产从数据库中查询出来,从这个list中遍历出来 foreach--%>
                <tbody>
                <c:forEach var="manufacture" items="${list}">
                    <tr>
                        <td>${manufacture.batchnumber}</td>
                        <td>${manufacture.supplier}</td>
                        <td>${manufacture.productmodel}</td>
                        <td>${manufacture.productdate}</td>
                        <td>${manufacture.diameter}</td>
                        <td>${manufacture.diameterUnits}</td>
                        <td>${manufacture.material}</td>
                        <td>${manufacture.insulationMaterial}</td>
                        <td>${manufacture.shieldingLayer}</td>
                        <td>${manufacture.guaranteeperiod}</td>
                        <td>${manufacture.price}</td>
                        <td>
                            <a class="btn btn-warning btn-sm" href="${pageContext.request.contextPath}/manufacture/toUpdate?batchnumber=${manufacture.batchnumber}">修改</a>
                            &nbsp;   | &nbsp;
                            <a class="btn btn-danger btn-sm" href="${pageContext.request.contextPath}/manufacture/deleteManufacture?batchnumber=${manufacture.batchnumber}">删除</a>
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