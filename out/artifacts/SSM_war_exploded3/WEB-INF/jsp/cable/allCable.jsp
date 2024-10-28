<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>CableManagementSystem</title>

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

    <div class="row">
        <div class="col-xs-12">
            <div class="page-header">
                <h1>
                    <small>线缆列表 - 显示所有线缆</small>
                </h1>
            </div>
        </div>
    </div>

    <div class="row">
        <div class="col-xs-12 col-md-4">
            <a class="btn btn-success" href="${pageContext.request.contextPath}/cable/toAddCable">新增线缆</a>
            <a class="btn btn-info" href="${pageContext.request.contextPath}/cable/allCable">显示全部线缆</a>
        </div>

        <div class="col-xs-12 col-md-4">
        </div>

        <!-- 添加选择列和查询输入框 -->
        <div class="col-xs-12 col-md-6">
            <form class="form-inline" action="${pageContext.request.contextPath}/cable/queryCablebycolumn" method="post" style="float: right">
                <span style="color: red;font-weight: bold">${error}</span>

                <!-- 下拉菜单选择列 -->
                <select name="queryColumn" class="form-control">
                    <option value="cableID">线缆编号</option>
                    <option value="cablename">线缆名称</option>
                    <option value="systemID">系统编号</option>
                    <option value="subsystemID">子系统编号</option>
                    <option value="status">状态</option>
                    <option value="uploadID">源端口编号</option>
                    <option value="downloadID">目标端口编号</option>
                    <option value="batchnumber">生产批号</option>
                    <option value="drawingID">图纸编号</option>
                    <option value="usage">用途</option>
                    <option value="position">位置</option>
                    <option value="length">长度</option>
                    <option value="ownner">责任人</option>
                    <option value="checkDate">检查日期</option>
                </select>

                <!-- 查询输入框 -->
                <input type="text" name="queryParam" class="form-control" placeholder="请输入查询内容">
                <input type="submit" value="查询" class="btn btn-primary">
            </form>
        </div>
    </div>

    <div class="row clearfix mt-4">
        <div class="col-xs-12">
            <table class="table table-hover table-striped">
                <thead>
                <tr>
                    <th>线缆编号</th>
                    <th>线缆名称</th>
                    <th>系统编号</th>
                    <th>子系统编号</th>
                    <th>状态</th>
                    <th>源端口编号</th>
                    <th>目标端口编号</th>
                    <th>生产批号</th>
                    <th>图纸编号</th>
                    <th>用途</th>
                    <th>位置</th>
                    <th>长度</th>
                    <th>长度单位</th>
                    <th>责任人</th>
                    <th>检查日期</th>
                    <th>描述</th>
                    <th>操作</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="cable" items="${list}">
                    <tr>
                        <td>
                            <a class="btn btn-warning btn-sm" href="${pageContext.request.contextPath}/cable/queryCableTestComplex?cableID=${cable.cableID}">${cable.cableID}</a>
                        </td>
                        <td>${cable.cablename}</td>
                        <td>${cable.systemID}</td>
                        <td>${cable.subsystemID}</td>
                        <td>${cable.status}</td>
                        <td>
                            <a class="btn btn-warning btn-sm" href="${pageContext.request.contextPath}/cable/queryCableIntface?interfaceID=${cable.uploadID}">${cable.uploadID}</a>
                        </td>
                        <td>
                            <a class="btn btn-warning btn-sm" href="${pageContext.request.contextPath}/cable/queryCableIntface?interfaceID=${cable.downloadID}">${cable.downloadID}</a>
                        </td>
                        <td>
                            <a class="btn btn-warning btn-sm" href="${pageContext.request.contextPath}/cable/queryCableManufacture?batchnumber=${cable.batchnumber}">${cable.batchnumber}</a>
                        </td>
                        <td>
                            <a class="btn btn-warning btn-sm" href="${pageContext.request.contextPath}/cable/queryCableDrawing?drawingID=${cable.drawingID}">${cable.drawingID}</a>
                        </td>
                        <td>${cable.usage}</td>
                        <td>${cable.position}</td>
                        <td>${cable.length}</td>
                        <td>${cable.lengthUnits}</td>
                        <td>${cable.ownner}</td>
                        <td>${cable.checkDate}</td>
                        <td>${cable.description}</td>
                        <td>
                            <a class="btn btn-warning btn-sm" href="${pageContext.request.contextPath}/cable/toUpdate?id=${cable.cableID}">修改</a>
                            &nbsp;|&nbsp;
                            <a class="btn btn-danger btn-sm" href="${pageContext.request.contextPath}/cable/deleteCable?id=${cable.cableID}">删除</a>
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
