<%@ page language="java" contentType="text/html; charset=UTF8" pageEncoding="UTF8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <c:set var="path" value="${pageContext.request.contextPath}"/>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF8">
    <title>国家信息列表数据</title>
    <script src="${path}/static/jquery-3.1.1.min.js"></script>
</head>
<body>
<table>
    <tr>
        <th colspan="4">国家信息列表</th>
    </tr>
    <tr>
        <th>id</th>
        <th>国家名称</th>
        <th>国家编码</th>
    </tr>
    <c:forEach items="${countryList}" var="country">
        <tr id="dict-${country.id}">
            <td>${country.id}</td>
            <td>${country.countryname}</td>
            <td>${country.countrycode}</td>

        </tr>
    </c:forEach>
</table>

</body>
</html>