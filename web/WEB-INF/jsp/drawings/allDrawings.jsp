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

    <div class="row clearfix">
        <div class="col-xs-12 column"> <!-- 使用自适应列 -->
            <div class="page-header">
                <h1>
                    <small>图纸信息</small>
                </h1>
            </div>
        </div>

        <div class="row">
            <div class="col-xs-12 col-md-6">
                <a class="btn btn-success" href="${pageContext.request.contextPath}/drawings/toAddDrawings">新增线缆图纸</a>
                <a class="btn btn-info" href="${pageContext.request.contextPath}/drawings/allDrawings">显示全部线缆图纸</a>
            </div>

            <!-- 添加选择列和查询输入框 -->
            <div class="col-xs-12 col-md-6">
                <form class="form-inline" action="${pageContext.request.contextPath}/drawings/queryDrawings" method="post" style="float: right">
                    <span style="color: red;font-weight: bold">${error}</span>

                    <!-- 下拉菜单选择列 -->
                    <select name="queryColumn" class="form-control">
                        <option value="drawingID">图纸编号</option>
                        <option value="drawingVersion">图纸版本</option>
                        <option value="drawingdate">日期</option>
                        <option value="drawingname">图纸名称</option>
                        <option value="createby">作者</option>
                        <option value="filepath">存储路径</option>
                        <option value="filetype">存储类型</option>
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
                    <th>图纸编号</th>
                    <th>图纸版本</th>
                    <th>日期</th>
                    <th>图纸名称</th>
                    <th>作者</th>
                    <th>存储路径</th>
                    <th>存储类型</th>
                    <th>操作</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="drawings" items="${list}">
                    <tr>
                        <td>${drawings.drawingID}</td>
                        <td>${drawings.drawingVersion}</td>
                        <td>${drawings.drawingdate}</td>
                        <td>${drawings.drawingname}</td>
                        <td>${drawings.createby}</td>
                        <td>${drawings.filepath}</td>
                        <td>${drawings.filetype}</td>
                        <td>
                            <a class="btn btn-warning btn-sm" href="${pageContext.request.contextPath}/drawings/toUpdate?drawingID=${drawings.drawingID}">修改</a>
                            &nbsp;   | &nbsp;
                            <a class="btn btn-danger btn-sm" href="${pageContext.request.contextPath}/drawings/deleteDrawings?drawingID=${drawings.drawingID}">删除</a>
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
