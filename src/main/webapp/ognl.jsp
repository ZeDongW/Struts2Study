<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: ZeDongW
  Date: 2020/2/4/0004
  Time: 13:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ognl表达式</title>
    <style type="text/css">
        .odd{
            background-color: aquamarine;
        }
        .even{
            background-color: pink;
        }
    </style>
</head>

<body>
    <table align="center" width="80%" border="1">
        <thead>
            <tr>
                <td>编号</td>
                <td>姓名</td>
            </tr>
        </thead>
        <tbody>
            <s:iterator var="user" value="#request.list" status="st">
                <tr class=<s:property value="#st.even?'even':'odd'"/> >
                    <td><s:property value="#user.age"/> </td>
                    <td><s:property value="#user.userName"/> </td>
                </tr>
            </s:iterator>
        </tbody>
    </table>
    <hr>
    <table align="center" width="80%" border="1">
        <thead>
        <tr>
            <td>编号</td>
            <td>姓名</td>
        </tr>
        </thead>
        <tbody>
        <s:iterator var="en" value="#request.map" status="st">
            <tr class=<s:property value="#st.even?'even':'odd'"/> >
                <td><s:property value="#en.key"/> %{#en.key}</td>
                <td><s:property value="#en.value.userName"/> </td>
            </tr>
        </s:iterator>
        </tbody>
    </table>
    <hr>
    <s:iterator var="list1" value="{'a', 'b', '2', '中国'}">
        <s:property value="#list1"></s:property>
    </s:iterator>
    <hr>
    <s:iterator var="map1" value="#{'a':'1', 'b':'2'}" >
        <s:property value="#map1.key"/>
        <s:property value="#map1.value"/><br/>
    </s:iterator>
</body>
<%--<body>
<br/>一、. list迭代</br>
<table border="1">
    <tr>
        <td>编号</td>
        <td>名称</td>
    </tr>
    <s:iterator var="user" value="#request.list" status="st">
        <tr class=<s:property value="#st.even?'even':'odd'"/> >
            <td><s:property value="#user.age"/></td>
            <td><s:property value="#user.name"/></td>
        </tr>
    </s:iterator>
</table>

<br/>二、迭代map</br>
<table border="1">
    <tr>
        <td>编号</td>
        <td>名称</td>
    </tr>
    <s:iterator var="en" value="#request.map" status="st">
        <tr>
            <td><s:property value="#en.key"/></td>
            <td><s:property value="#en.value.name"/></td>
        </tr>
    </s:iterator>
</table>


<!-- Ognl表达式可以取值，也可以动态构建集合 -->
</body>--%>
</html>
