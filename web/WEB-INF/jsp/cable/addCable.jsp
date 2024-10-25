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
                    <small>线缆列表:新增线缆</small>
                </h1>
            </div>
        </div>
    </div>

    <form action="${pageContext.request.contextPath}/cable/addCable" method="post">
        <div class="form-group">
            <label>线缆编号</label>
            <input type="text" name="cableID" class="form-control" required>
        </div>
        <div class="form-group">
            <label>线缆名称</label>
            <input type="text" name="cablename" class="form-control" >
        </div>
        <div class="form-group">
            <label>系统编号</label>
            <input type="text" name="systemID" class="form-control" >
        </div>
        <div class="form-group">
            <label>子系统编号</label>
            <input type="text" name="subsystemID" class="form-control" >
        </div>
        <div class="form-group">
            <label>线缆状态</label>
            <select name="status" class="form-control" >
                <option value="">请选择状态</option>
                <option value="spare" >备用 (Spare)</option>
                <option value="faulty">故障 (Faulty)</option>
                <option value="normal">正常 (Normal)</option>
            </select>
        </div>
        <div class="form-group">
            <label>线缆用途</label>
            <input type="text" name="usage" class="form-control" >
        </div>
        <div class="form-group">
            <label>源端口编号</label>
            <select name="uploadID" class="form-control">
                <option value="">请选择端口</option>
                <c:forEach var="intface" items="${interList}">
                    <option value="${intface.interfaceID}">${intface.interfaceID}</option>
                </c:forEach>
            </select>
        </div>
        <div class="form-group">
            <label>目标端口编号</label>
            <select name="downloadID" class="form-control">
                <option value="">请选择端口</option>
                <c:forEach var="intface" items="${interList}">
                    <option value="${intface.interfaceID}">${intface.interfaceID}</option>
                </c:forEach>
            </select>
        </div>
        <div class="form-group">
            <label>位置</label>
            <input type="text" name="position" class="form-control" >
        </div>
        <div class="form-group">
            <label>描述</label>
            <input type="text" name="description" class="form-control" >
        </div>
        <div class="form-group">
            <label>生产批号</label>
            <select name="batchnumber" class="form-control">
                <option value="">请选择端口</option>
                <c:forEach var="manu" items="${manuList}">
                    <option value="${manu.batchnumber}">${manu.batchnumber}</option>
                </c:forEach>
            </select>
        </div>
        <div class="form-group">
            <label>图纸编号</label>
            <select name="drawingID" class="form-control">
                <option value="">请选择端口</option>
                <c:forEach var="draw" items="${drawList}">
                    <option value="${draw.drawingID}">${draw.drawingID}</option>
                </c:forEach>
            </select>
        </div>
        <div class="form-group">
            <label>长度</label>
            <input type="text" name="length" class="form-control" >
        </div>
        <div class="form-group">
            <label>长度单位</label>
            <input type="text" name="lengthUnits" class="form-control" >
        </div>
        <div class="form-group">
            <label>所有者</label>
            <input type="text" name="ownner" class="form-control" >
        </div>
        <div class="form-group">
            <label>检查日期</label>
            <input type="date" name="checkDate" class="form-control" >
        </div>
        <div class="form-group">
            <input type="submit" class="form-control" value="添加">
        </div>

    </form>


</div>
</body>
</html>
