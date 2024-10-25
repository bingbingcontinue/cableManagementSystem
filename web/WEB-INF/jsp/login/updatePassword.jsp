<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
  <title>更新密码</title>
</head>
<body>
<h2>更新密码</h2>
<form action="${pageContext.request.contextPath}/updatePassword" method="post">
  <label for="username">用户名:</label>
  <input type="text" id="username" name="username" required><br><br>

  <label for="oldPassword">旧密码:</label>
  <input type="password" id="oldPassword" name="oldPassword" required><br><br>

  <label for="newPassword">新密码:</label>
  <input type="password" id="newPassword" name="newPassword" required><br><br>

  <input type="submit" value="更新密码">
</form>
</body>
</html>
