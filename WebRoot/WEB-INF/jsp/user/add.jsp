<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html>
<html>
<head>
<base href="<%=basePath%>">
<meta charset="utf-8">
<title>Add User</title>
</head>
<body>
	<sf:form method="post" modelAttribute="user">
    	username: <sf:input path="name" />
		<br />
    	password: <sf:input path="password" />
		<br />
    	email: <sf:input path="email" />
		<br />
		<input type="submit" value="add user" />
	</sf:form>
</body>
</html>