<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: ZeDongW
  Date: 2019/11/26/0026
  Time: 6:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>首页</title>
</head>
<body>
    <br>获取根元素:<br>
    <s:property value="user.age"></s:property><br>
    <s:property value="user.userName"></s:property>
    <br>获取非根元素:<br>
    <s:property value="#session.session_data"/>
    <s:property value="#request.cn"></s:property>  <br>
    attr获取对象<br>
    <s:property value="#cn"></s:property>
    <s:property value="#attr.request_data"/>
    <s:property value="#attr.application_data"/>
    <br>获取parameter对象<br>
    <s:property value="#parameters.id"></s:property>
    <s:debug></s:debug>
</body>
</html>
