<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>修改故障维修信息</title>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">

    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>修改故障维修信息</small>
                </h1>
            </div>
        </div>
    </div>

    <form action="${pageContext.request.contextPath}/maintenance/updateMaintenance" method="post">
        <div class="form-group">
            <label>数据库编号</label>
            <input type="text" name="id" class="form-control" value="${QMaintenance.id}" readonly>
        </div>
        <div class="form-group">
            <label>线缆编号</label>
            <input type="text" name="cableID" class="form-control" value="${QMaintenance.cableID}" readonly>
        </div>
        <div class="form-group">
            <label>故障日期</label>
            <input type="datetime-local" name="faultdate" class="form-control" value="${QMaintenance.faultdate}">
        </div>
        <div class="form-group">
            <label>故障描述</label>
            <input type="text" name="faultDescription" class="form-control" value="${QMaintenance.faultDescription}">
        </div>

        <div class="form-group">
            <label>恢复日期</label>
            <input type="datetime-local" name="repairdate" class="form-control" value="${QMaintenance.repairdate}">
        </div>
        <div class="form-group">
            <label>恢复描述</label>
            <input type="text" name="repairDescription" class="form-control" value="${QMaintenance.repairDescription}">
        </div>
        <div class="form-group">
            <label>当前状态</label>
            <select name="status" class="form-control">
                <option value="">请选择状态</option>
                <option value="pending" <c:if test="${QMaintenance.status == 'pending'}">selected</c:if>>待修复</option>
                <option value="in progress" <c:if test="${QMaintenance.status == 'in progress'}">selected</c:if>>
                    修复中
                </option>
                <option value="completed" <c:if test="${QMaintenance.status == 'completed'}">selected</c:if>>已完成
                </option>
                <option value="closed" <c:if test="${QMaintenance.status == 'closed'}">selected</c:if>>已关闭</option>
            </select>
        </div>
        <div class="form-group">
            <label>修复成本</label>
            <input type="number" step="0.01" name="cost" class="form-control" value="${QMaintenance.cost}">
        </div>
        <div class="form-group">
            <label>操作员</label>
            <input type="text" name="operator1" class="form-control" value="${QMaintenance.operator1}">
        </div>
        <div class="form-group">
            <label>操作员</label>
            <input type="text" name="operator2" class="form-control" value="${QMaintenance.operator2}">
        </div>
        <div class="form-group">
            <label>操作员</label>
            <input type="text" name="operator3" class="form-control" value="${QMaintenance.operator3}">
        </div>


        <div class="form-group">
            <input type="submit" class="form-control" value="修改">
        </div>

    </form>


</div>
</body>
</html>
