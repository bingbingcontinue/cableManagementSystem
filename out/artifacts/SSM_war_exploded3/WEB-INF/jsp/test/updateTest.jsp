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

    <form action="${pageContext.request.contextPath}/test/updateTest" method="post">

        <div class="form-group">
            <label>线缆编号</label>
            <input type="text" name="cableID" class="form-control" value="${QTest.cableID}" readonly>
        </div>
        <div class="form-group">
            <label>测试日期</label>
            <input type="date" name="testdate" class="form-control" value="${QTest.testdate}">
        </div>
        <div class="form-group">
            <label>测试结果</label>
            <select name="testresult" class="form-control">
                <option value="">请选择状态</option>
                <option value="pass" ${QTest.testresult == 'pass' ? 'selected' : ''}>通过 (pass)</option>
                <option value="fail" ${QTest.testresult == 'fail' ? 'selected' : ''}>失败 (fail)</option>
            </select>
        </div>
        <div class="form-group">
            <label>操作员</label>
            <input type="text" name="operator1" class="form-control" value="${QTest.operator1}">
        </div>

        <div class="form-group">
            <label>操作员</label>
            <input type="text" name="operator2" class="form-control" value="${QTest.operator2}">
        </div>
        <div class="form-group">
            <label>操作员</label>
            <input type="text" name="operator3" class="form-control" value="${QTest.operator3}">
        </div>

        <div class="form-group">
            <input type="submit" class="form-control" value="修改">
        </div>

    </form>



</div>
</body>
</html>
