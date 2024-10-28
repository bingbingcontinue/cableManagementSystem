<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>修改安装信息</title>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">

    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>修改安装信息</small>
                </h1>
            </div>
        </div>
    </div>

    <form action="${pageContext.request.contextPath}/install/updateInstall" method="post">
        <div class="form-group">
            <label>线缆编号</label>
            <input type="text" name="cableID" class="form-control" value="${QInstalls.cableID}" readonly>
        </div>

        <div class="form-group">
            <label>安装日期</label>
            <input type="date" name="installationDate" class="form-control" value="${QInstalls.installationDate}" >
        </div>
        <div class="form-group">
            <label>操作员</label>
            <input type="text" name="operator1" class="form-control" value="${QInstalls.operator1}" >
        </div>
        <div class="form-group">
            <label>操作员</label>
            <input type="text" name="operator2" class="form-control" value="${QInstalls.operator2}" >
        </div>
        <div class="form-group">
            <label>操作员</label>
            <input type="text" name="operator3" class="form-control" value="${QInstalls.operator3}" >
        </div>

        <div class="form-group">
            <input type="submit" class="form-control" value="修改">
        </div>

    </form>



</div>
</body>
</html>
