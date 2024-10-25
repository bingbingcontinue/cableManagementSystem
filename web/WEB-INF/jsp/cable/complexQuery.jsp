<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>线缆信息展示</title>
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

<div class="container">
    <h1 class="text-center">线缆测试、维护和安装信息</h1>

    <!-- 测试信息表 -->
    <h2>测试信息</h2>
    <table class="table table-hover table-striped">
        <thead>
        <tr>
            <th>线缆编号</th>
            <th>测试日期</th>
            <th>测试结果</th>
            <th>描述</th>
            <th>操作员1</th>
            <th>操作员2</th>
            <th>操作员3</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="test" items="${cabletest}">
            <tr>
                <td>${test.cableID}</td>
                <td>${test.testdate}</td>
                <td>${test.testresult}</td>
                <td>${test.description}</td>
                <td>${test.operator1}</td>
                <td>${test.operator2}</td>
                <td>${test.operator3}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>

    <!-- 维护信息表 -->
    <h2>维护信息</h2>
    <table class="table table-hover table-striped">
        <thead>
        <tr>
            <th>ID</th>
            <th>线缆编号</th>
            <th>故障日期</th>
            <th>故障描述</th>
            <th>修复日期</th>
            <th>修复描述</th>
            <th>操作员1</th>
            <th>操作员2</th>
            <th>操作员3</th>
            <th>状态</th>
            <th>成本</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="maintenance" items="${cablemaintenance}">
            <tr>
                <td>${maintenance.id}</td>
                <td>${maintenance.cableID}</td>
                <td>${maintenance.faultdate}</td>
                <td>${maintenance.faultDescription}</td>
                <td>${maintenance.repairdate}</td>
                <td>${maintenance.repairDescription}</td>
                <td>${maintenance.operator1}</td>
                <td>${maintenance.operator2}</td>
                <td>${maintenance.operator3}</td>
                <td>${maintenance.status}</td>
                <td>${maintenance.cost}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>

    <!-- 安装信息表 -->
    <h2>安装信息</h2>
    <table class="table table-hover table-striped">
        <thead>
        <tr>
            <th>线缆编号</th>
            <th>安装日期</th>
            <th>操作员1</th>
            <th>操作员2</th>
            <th>操作员3</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="installation" items="${cableinstallation}">
            <tr>
                <td>${installation.cableID}</td>
                <td>${installation.installationDate}</td>
                <td>${installation.operator1}</td>
                <td>${installation.operator2}</td>
                <td>${installation.operator3}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>

</div>

</body>
</html>
