<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
  <title>注册页面</title>
</head>
<body>
<h2>用户注册</h2>
<form action="${pageContext.request.contextPath}/register" method="post">
  <label for="username">用户名:</label>
  <input type="text" id="username" name="username" required><br><br>

  <label for="password">密码:</label>
  <input type="password" id="password" name="password" required><br><br>

  <input type="submit" value="注册">
</form>
</body>
</html>
