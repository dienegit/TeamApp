<%@ page language="java" pageEncoding="UTF-8" session="false"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Add User</title>
</head>
<body>
    <sf:form method="post" modelAttribute="user">
    	username: <sf:input path="username"/><sf:errors path="username" /><br />
    	password: <sf:input path="password"/><sf:errors path="password" /><br />
    	email: <sf:input path="email"/><sf:errors path="email" /><br />
    	<input type="submit" value="add user" />
    </sf:form>
</body>
</html>