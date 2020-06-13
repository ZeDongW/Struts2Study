<%--
  Created by IntelliJ IDEA.
  User: ZeDongW
  Date: 2019/12/4/0004
  Time: 23:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>数据转换</title>
</head>
<body>
    <form action="data" method="post">
        用户名<input type="text" name="user.userName"/><br/>
        年龄<input type="text" name="user.age"/><br/>
        生日<input type="text" name="user.birthday"/><br/>
        省份<input type="text" name="user.address.province"/><br/>
        城市<input type="text" name="user.address.city"/><br/>
        <input type="submit" value="提交">
    </form>
</body>
</html>
