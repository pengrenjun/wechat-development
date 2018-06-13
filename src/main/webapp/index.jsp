<%@ page import="java.util.Date" %>
<%@ page language="java" contentType="text/html; charset=UTF8" pageEncoding="UTF8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <c:set var="path" value="${pageContext.request.contextPath}"/>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF8">
    <title>微信开发测试系统</title>
</head>
<body>
<p>
    微信开发测试系统!
</p>
<p>

</p>
<input type="button" onclick="showCountryList()" value="国家列表">
<p>

</p>
</body>



<script >

    function showCountryList() {

        location.href = '${path}/country/countryList';
    }


</script>
</html>