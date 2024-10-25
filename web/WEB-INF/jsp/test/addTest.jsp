<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>添加测试信息</title>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">

    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>测试信息表:新增测试信息</small>
                </h1>
            </div>
        </div>
    </div>

    <form action="${pageContext.request.contextPath}/test/addTest" method="post">

        <div class="form-group">
            <label>线缆编号</label>
            <select name="cableID" class="form-control" required>
                <option value="">请选择线缆编号</option>
                <c:forEach items="${list}" var="list">
                    <option value="${list.cableID}">${list.cableID}</option>
                </c:forEach>
            </select>
        </div>
        <div class="form-group">
            <label>测试日期</label>
            <input type="date" name="testdate" class="form-control" >
        </div>
        <div class="form-group">
            <label>测试结果</label>
            <select name="testresult" class="form-control">
                <option value="pass">正常</option>
                <option value="fail">异常</option>
            </select>
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
        <div class="form-group">
            <input type="submit" class="form-control" value="添加">
        </div>
    </form>

</div>
</body>
</html>
