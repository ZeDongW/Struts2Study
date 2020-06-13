<%--
  Created by IntelliJ IDEA.
  User: ZeDongW
  Date: 2019/12/17/0017
  Time: 10:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>上传文件</title>
</head>
<body>
    <form action="ud_upload" method="post" enctype="multipart/form-data">
        文件<input type="file" name="recFile"/>
        <input type="submit" value="上传">
    </form>
</body>
</html>
