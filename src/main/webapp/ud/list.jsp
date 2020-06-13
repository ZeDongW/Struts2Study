<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ZeDongW
  Date: 2019/12/17/0017
  Time: 10:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>下载列表</title>
</head>
<body>
    <table border="1" align="center" width="70%">
        <tr>
            <th>编号</th>
            <th>文件名</th>
            <th>操作</th>
        </tr>
       <c:forEach var="fileName" items="${fileNames}" varStatus="vs">
           <tr>
               <td>${vs.count }</td>
               <td>${fileName }</td>
               <td>
                   <!-- 构建一个url -->
                   <c:url var="url" value="down">
                       <c:param name="downFileName" value="${fileName}"></c:param>
                   </c:url>

                   <a href="${url}">下载</a>
               </td>
           </tr>
       </c:forEach>
    </table>
</body>
</html>
