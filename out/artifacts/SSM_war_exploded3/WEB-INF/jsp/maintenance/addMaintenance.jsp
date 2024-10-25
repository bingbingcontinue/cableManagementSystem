<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>添加线缆</title>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">

    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>故障维修列表:新增故障维修信息</small>
                </h1>
            </div>
        </div>
    </div>

    <form action="${pageContext.request.contextPath}/maintenance/addMaintenance" method="post">
<%--        <div class="form-group">--%>
<%--            <label>数据库编号</label>--%>
<%--            <input type="hidden" name="id" class="form-control" required>--%>
<%--        </div>--%>
        <div class="form-group">
            <label>线缆编号</label>
            <select name="cableID" class="form-control" required>
                <option value="">请选择线缆编号</option>
                <c:forEach var="cable" items="${cableList}">
                    <option value="${cable.cableID}">${cable.cableID}</option>
                </c:forEach>
            </select>
        </div>
        <div class="form-group">
            <label>故障日期</label>
            <input type="datetime-local" name="faultdate" class="form-control" required>
        </div>
        <div class="form-group">
            <label>故障描述</label>
            <input type="text" name="faultDescription" class="form-control" >
        </div>

        <div class="form-group">
            <label>恢复日期</label>
            <input type="datetime-local" name="repairdate" class="form-control" required>
        </div>
        <div class="form-group">
            <label>恢复描述</label>
            <input type="text" name="repairDescription" class="form-control" >
        </div>
        <div class="form-group">
            <label>当前状态</label>
            <select name="status" class="form-control" required>
                <option value="">请选择状态</option>
                <option value="pending">待修复</option>
                <option value="in progress">修复中</option>
                <option value="completed">已完成</option>
                <option value="closed">已关闭</option>
            </select>
        </div>
        <div class="form-group">
            <label>修复成本</label>
            <input type="text" name="cost" class="form-control" >
        </div>
        <div class="form-group">
            <label>操作员</label>
            <input type="text" name="operator1" class="form-control" >
        </div>
        <div class="form-group">
            <label>操作员</label>
            <input type="text" name="operator2" class="form-control" >
        </div>
        <div class="form-group">
            <label>操作员</label>
            <input type="text" name="operator3" class="form-control" >
        </div>
        <button type="submit" class="btn btn-default">提交</button>

    </form>


</div>
</body>
</html>
