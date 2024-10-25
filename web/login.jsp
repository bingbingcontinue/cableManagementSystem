<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
<h2>登录</h2>
<form action="${pageContext.request.contextPath}/user/login" method="post">
    <label>用户名:</label><input type="text" name="username"/><br/>
    <label>密码:</label><input type="password" name="password"/><br/>
    <input type="submit" value="登录"/>
</form>
<c:if test="${not empty error}">
    <p style="color:red;">${error}</p>
</c:if>
</body>
</html>





<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%--<!DOCTYPE html>--%>
<%--<html>--%>
<%--<head>--%>
<%--    <title>登录页面</title>--%>
<%--</head>--%>
<%--<body>--%>
<%--<h2>用户登录</h2>--%>
<%--<form action="${pageContext.request.contextPath}/login" method="post">--%>
<%--    <label for="username">用户名:</label>--%>
<%--    <input type="text" id="username" name="username" required><br><br>--%>

<%--    <label for="password">密码:</label>--%>
<%--    <input type="password" id="password" name="password" required><br><br>--%>

<%--    <input type="submit" value="登录">--%>
<%--</form>--%>

<%--<h3>还没有账号？ <a href="${pageContext.request.contextPath}/registerfisrt">注册</a></h3>--%>
<%--<h3>忘记密码？ <a href="${pageContext.request.contextPath}/updatePassword">更新密码</a></h3>--%>
<%--</body>--%>
<%--</html>--%>
