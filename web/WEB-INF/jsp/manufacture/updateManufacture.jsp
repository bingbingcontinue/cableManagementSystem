<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>修改测试信息</title>
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

    <form action="${pageContext.request.contextPath}/manufacture/updateManufacture" method="post">

        <div class="form-group">
            <label>生产批号</label>
            <input type="text" name="batchnumber" value="${QManufacture.batchnumber}" readonly>
        </div>
        <div class="form-group">
            <label>供应商</label>
            <input type="text" name="supplier" class="form-control" value="${QManufacture.supplier}" >
        </div>
        <div class="form-group">
            <label>产品型号</label>
            <input type="text" name="productmodel" class="form-control" value="${QManufacture.productmodel}">
        </div>
        <div class="form-group">
            <label>供货日期</label>
            <input type="date" name="productdate" class="form-control" value="${QManufacture.productdate}">
        </div>
        <div class="form-group">
            <label>线缆直径</label>
            <input type="number" step="0.01" name="diameter" class="form-control" value="${QManufacture.diameter}">
        </div>
        <div class="form-group">
            <label>直径单位</label>
            <input type="number" name="diameterUnits" class="form-control" value="${QManufacture.diameterUnits}">
        </div>
        <div class="form-group">
            <label>线缆芯材</label>
            <input type="text" name="material" class="form-control" value="${QManufacture.material}">
        </div>
        <div class="form-group">
            <label>绝缘层材质</label>
            <input type="text" name="insulationMaterial" class="form-control" value="${QManufacture.insulationMaterial}">
        </div>
        <div class="form-group">
            <label>屏蔽层材质</label>
            <input type="text" name="shieldingLayer" class="form-control" value="${QManufacture.shieldingLayer}">
        </div>
        <div class="form-group">
            <label>质保期长</label>
            <input type="text" name="guaranteeperiod" class="form-control" value="${QManufacture.guaranteeperiod}">
        </div>
        <div class="form-group">
            <label>价格</label>
            <input type="number" name="price" step="0.01" class="form-control" step="0.01" value="${QManufacture.price}">
        </div>


        <div class="form-group">
            <input type="submit" class="form-control" value="修改">
        </div>

    </form>



</div>
</body>
</html>
