<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>修改线缆信息</title>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">

    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>修改线缆</small>
                </h1>
            </div>
        </div>
    </div>

    <form action="${pageContext.request.contextPath}/cable/updateCable" method="post">

        <div class="form-group">
            <label>线缆编号</label>
            <input type="text" name="cableID" value="${QCables.cableID}" readonly>
        </div>
        <div class="form-group">
            <label>线缆名称</label>
            <input type="text" name="cablename" class="form-control" value="${QCables.cablename}">
        </div>
        <div class="form-group">
            <label>系统编号</label>
            <input type="text" name="systemID" class="form-control" value="${QCables.systemID}">
        </div>
        <div class="form-group">
            <label>子系统编号</label>
            <input type="text" name="subsystemID" class="form-control" value="${QCables.subsystemID}">
        </div>
        <div class="form-group">
            <label>线缆状态</label>
            <select name="status" class="form-control">
                <option value="">请选择状态</option>
                <option value="spare" ${QCables.status == 'spare' ? 'selected' : ''}>备用 (Spare)</option>
                <option value="faulty" ${QCables.status == 'faulty' ? 'selected' : ''}>故障 (Faulty)</option>
                <option value="normal" ${QCables.status == 'normal' ? 'selected' : ''}>正常 (Normal)</option>
            </select>
        </div>

        <div class="form-group">
            <label>线缆用途</label>
            <input type="text" name="usage" class="form-control" value="${QCables.usage}" >
        </div>
        <div class="form-group">
            <label>源端口编号</label>
            <input type="text" name="uploadID" class="form-control" value="${QCables.uploadID}">
        </div>
        <div class="form-group">
            <label>目的端口编号</label>
            <input type="text" name="downloadID" class="form-control" value="${QCables.downloadID}">
        </div>
        <div class="form-group">
            <label>位置</label>
            <input type="text" name="position" class="form-control" value="${QCables.position}">
        </div>
        <div class="form-group">
            <label>描述</label>
            <input type="text" name="description" class="form-control" value="${QCables.description}">
        </div>
        <div class="form-group">
            <label>批号</label>
            <input type="text" name="batchnumber" class="form-control" value="${QCables.batchnumber}">
        </div>
        <div class="form-group">
            <label>图纸编号</label>
            <input type="text" name="drawingID" class="form-control" value="${QCables.drawingID}">
        </div>
        <div class="form-group">
            <label>长度</label>
            <input type="text" name="length" class="form-control" value="${QCables.length}">
        </div>
        <div class="form-group">
            <label>长度单位</label>
            <input type="text" name="lengthUnits" class="form-control" value="${QCables.lengthUnits}">
        </div>
        <div class="form-group">
            <label>所有者</label>
            <input type="text" name="ownner" class="form-control" value="${QCables.ownner}">
        </div>
        <div class="form-group">
            <label>检查日期</label>
            <input type="date" name="checkDate" class="form-control" value="${QCables.checkDate}">
        </div>

        <div class="form-group">
            <input type="submit" class="form-control" value="修改">
        </div>

    </form>



</div>
</body>
</html>
