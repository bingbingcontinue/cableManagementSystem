<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>修改图纸</title>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">

    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>修改图纸</small>
                </h1>
            </div>
        </div>
    </div>

    <form action="${pageContext.request.contextPath}/drawings/updateDrawings" method="post">

        <div class="form-group">
            <label>图纸编号</label>
            <input type="text" name="drawingID" class="form-control" value="${QDrawings.drawingID}" readonly>
        </div>
        <div class="form-group">
            <label>图纸版本</label>
            <input type="text" name="drawingVersion" class="form-control" value="${QDrawings.drawingVersion}">
        </div>
        <div class="form-group">
            <label>日期</label>
            <input type="date" name="drawingdate" class="form-control" value="${QDrawings.drawingdate}">
        </div>
        <div class="form-group">
            <label>图纸名称</label>
            <input type="text" name="drawingname" class="form-control" value="${QDrawings.drawingname}">
        </div>
        <div class="form-group">
            <label>作者</label>
            <input type="text" name="createby" class="form-control" value="${QDrawings.createby}">
        </div>
        <div class="form-group">
            <label>存储路径</label>
            <input type="text" name="filepath" class="form-control" value="${QDrawings.filepath}">
        </div>
        <div class="form-group">
            <label>存储类型</label>
            <input type="text" name="filetype" class="form-control" value="${QDrawings.filetype}">
        </div>


        <div class="form-group">
            <input type="submit" class="form-control" value="修改">
        </div>

    </form>



</div>
</body>
</html>
