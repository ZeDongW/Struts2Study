<%--
  Created by IntelliJ IDEA.
  User: ZeDongW
  Date: 2019/12/4/0004
  Time: 23:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>信息页面</title>
</head>
<body>
    用户名：${user.userName}<br>
    年龄：${user.age}<br>
    生日：${user.birthday}<br>
    省份：${user.address.province}<br>
    城市：${user.address.city}<br>
</body>
</html>
