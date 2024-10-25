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
                    <small>故障维修表</small>
                </h1>
            </div>
        </div>

        <div class="row">
            <div class="col-xs-12 col-md-4"><!-- 使用自适应列 -->
                <%--toAddBook--%>
                <a class="btn btn-success" href="${pageContext.request.contextPath}/maintenance/toAddMaintenance">新增故障维修信息</a>
                <a class="btn btn-info" href="${pageContext.request.contextPath}/maintenance/allMaintenance">显示全部</a>
            </div>

            <div class="col-md-4 column"></div>


            <!-- 添加选择列和查询输入框 -->
            <div class="col-xs-12 col-md-6">
                <form class="form-inline" action="${pageContext.request.contextPath}/maintenance/queryMaintenancebycolumn" method="post" style="float: right">
                    <span style="color: red;font-weight: bold">${error}</span>

                    <!-- 下拉菜单选择列 -->
                    <select name="queryColumn" class="form-control">
                        <option value="cableID">线缆编号</option>
                        <option value="status">线缆状态</option>
                        <option value="faultdate">故障日期</option>
                        <option value="repairdate">恢复日期</option>
                        <option value="cost">恢复成本</option>
                    </select>

                    <!-- 查询输入框 -->
                    <input type="text" name="queryParam" class="form-control" placeholder="请输入查询内容">
                    <input type="submit" value="查询" class="btn btn-primary">
                </form>
            </div>
        </div>


    </div>

    <div class="row clearfix mt-4">
        <div class="col-xs-12 column"> <!-- 使用自适应列 -->
            <table class="table table-hover table-striped">
                <thead>
                <tr>
                    <th>线缆编号</th>
                    <th>线缆状态</th>
                    <th>故障日期</th>
                    <th>故障描述</th>
                    <th>恢复日期</th>
                    <th>恢复描述</th>
                    <th>恢复成本</th>
                    <th>操作员</th>
                    <th>操作员</th>
                    <th>操作员</th>
                    <th>操作</th>
                </tr>
                </thead>
                <%--从数据库中查询出来,从这个list中遍历出来 foreach--%>
                <tbody>
                <c:forEach var="maintenance" items="${list}">
                    <tr>
                        <td>${maintenance.cableID}</td>
                        <td>${maintenance.status}</td>
                        <td>${maintenance.faultdate}</td>
                        <td>${maintenance.faultDescription}</td>
                        <td>${maintenance.repairdate}</td>
                        <td>${maintenance.repairDescription}</td>
                        <td>${maintenance.cost}</td>
                        <td>${maintenance.operator1}</td>
                        <td>${maintenance.operator2}</td>
                        <td>${maintenance.operator3}</td>
                        <td>
                            <a class="btn btn-warning btn-sm" href="${pageContext.request.contextPath}/maintenance/toUpdate?id=${maintenance.id}">修改</a>
                            &nbsp;   | &nbsp;
                            <a class="btn btn-danger btn-sm" href="${pageContext.request.contextPath}/maintenance/deleteMaintenance?id=${maintenance.id}">删除</a>
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