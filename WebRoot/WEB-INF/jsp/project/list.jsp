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
<meta charset="UTF-8">
<title>project list</title>
</head>

<body>
<p>all projects</p><a href="../logout">Logout</a>
<p>&nbsp;</p>
<c:forEach items="${projects}" var="project">
<table width="200" height="200" border="1" style="float:left; margin-right:20px;">
  <tr>
    <td><a href="id/lists/list.html">${project.name}</a>&nbsp;&nbsp;&nbsp;<a href="id/show.html">&lt;i&gt;</a>  </td>
  </tr>
  <tr>
    <td>${project.progress}</td>
  </tr>
  <tr>
    <td>************--------------</td>
  </tr>
  <tr>
    <td>project calendar</td>
  </tr>
  <tr>
    <td>dead line 05/31/2015</td>
  </tr>
</table>
</c:forEach>

<table width="200" height="200" border="1" style="float:left; margin-right:20px;">
  
  <tr>
    <td> <center><a href="project/add">add</a></center></td>
  </tr>
  
</table>
<p>&nbsp;</p>

<p>&nbsp;</p>
</body>
</html>
