<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>CableManagementSystem:添加生产批次</title>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">

    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>生产信息表:新增批次信息</small>
                </h1>
            </div>
        </div>
    </div>

    <form action="${pageContext.request.contextPath}/manufacture/addManufacture" method="post">

        <div class="form-group">
            <label>生产批次编号</label>
            <input type="text" name="batchnumber" class="form-control" required>
        </div>
        <div class="form-group">
            <label>供应商</label>
            <input type="text" name="supplier" class="form-control" >
        </div>
        <div class="form-group">
            <label>产品型号</label>
            <input type="text" name="productmodel" class="form-control" >
        </div>
        <div class="form-group">
            <label>供货日期</label>
            <input type="date" name="productdate" class="form-control" >
        </div>
        <div class="form-group">
            <label>线缆直径</label>
            <input type="number" name="diameter" class="form-control" >
        </div>
        <div class="form-group">
            <label>直径单位</label>
            <input type="text" name="diameterUnits" class="form-control" >
        </div>
        <div class="form-group">
            <label>线缆芯材</label>
            <input type="text" name="material" class="form-control" >
        </div>
        <div class="form-group">
            <label>绝缘层材质</label>
            <input type="text" name="insulationMaterial" class="form-control" >
        </div>
        <div class="form-group">
            <label>屏蔽层材质</label>
            <input type="text" name="shieldingLayer" class="form-control" >
        </div>
        <div class="form-group">
            <label>质保期长</label>
            <input type="text" name="guaranteeperiod" class="form-control" >
        </div>
        <div class="form-group">
            <label>价格</label>
            <input type="number" name="price" class="form-control" step="0.01" >
        </div>
        <div class="form-group">
            <input type="submit" class="form-control" value="添加">
        </div>

    </form>

</div>
</body>
</html>
