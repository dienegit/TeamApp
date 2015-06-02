<%@ page language="java" pageEncoding="UTF-8" session="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>List User</title>
</head>
<body>
	<a href="add">add</a><br />
	<c:forEach items="${users }" var="um">
    	${um.value.username }    ${um.value.password }    ${um.value.email }<br />

	</c:forEach>
</body>
</html>