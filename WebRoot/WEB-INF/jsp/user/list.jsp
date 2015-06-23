<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
<base href="<%=basePath%>">
<meta charset="utf-8">
<title>List User</title>
</head>
<body>
	<a href="user/add">add</a>
	<br />
	<c:forEach items="${users }" var="um">
		<a href="user/${um.id }">${um.id } ${um.name }</a>
		<br />

	</c:forEach>
</body>
</html>