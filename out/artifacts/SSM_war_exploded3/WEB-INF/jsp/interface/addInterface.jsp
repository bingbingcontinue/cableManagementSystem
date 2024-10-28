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
                    <small>端口列表:新增端口</small>
                </h1>
            </div>
        </div>
    </div>

    <form action="${pageContext.request.contextPath}/interface/addInterface" method="post">

        <div class="form-group">
            <label>端口编号</label>
            <input type="text" name="interfaceID" class="form-control" required>
        </div>
        <div class="form-group">
            <label>端口类型</label>
            <input type="text" name="interfaceTYpe" class="form-control" >
        </div>
        <div class="form-group">
            <label>端口状态</label>
            <select name="status" class="form-control" >
                <option value="">请选择状态</option>
                <option value="normal">正常</option>
                <option value="faulty">故障</option>
                <option value="spare">备用</option>
            </select>
        </div>
        <div class="form-group">
            <label>设备编号</label>
            <input type="text" name="deviceID" class="form-control" >
        </div>
        <div class="form-group">
            <label>端口位置</label>
            <input type="text" name="position" class="form-control" >
        </div>
        <div class="form-group">
            <input type="submit" class="form-control" value="添加">
        </div>

    </form>



</div>
</body>
</html>
