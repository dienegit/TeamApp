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
<style>
.error {
	color: #ff0000;
}

.errorblock {
	color: #000;
	background-color: #ffEEEE;
	border: 3px solid #ff0000;
	padding: 8px;
	margin: 16px;
}
</style>
</head>
<body>
	<sf:form method="post" modelAttribute="user">
    	username: <sf:input path="name" />
		<sf:errors path="name" cssClass="error" />
		<br />
    	password: <sf:input path="password" />
		<sf:errors path="password" cssClass="error" />
		<br />
    	email: <sf:input path="email" />
		<sf:errors path="email" cssClass="error" />
		<br />
		phone: <sf:input path="phoneNo" />
		<br />
		<input type="submit" value="add user" />
	</sf:form>
</body>
</html>