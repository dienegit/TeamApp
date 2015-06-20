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
<meta charset="UTF-8">
<title>user login</title>
</head>

<body>
	<p>
		<a href="project">all projects</a>
	</p>
	<p>&nbsp;</p>
	<sf:form method="post" modelAttribute="project" action="project/add/">
		<table width="826" height="479" border="1">
			<tr>
				<td width="255" height="203"><p>
						<img src="../../../img/004.png" width="171" height="162" alt="" />
					</p>
					<p>&nbsp;</p></td>
				<td colspan="2"><br> <textarea style="width:100%;"
						rows="7" name="textarea"></textarea></td>
			</tr>
			<tr>
				<td><div align="center">创建者</div></td>
				<td colspan="2"><div align="center">${user.name}</div></td>
			</tr>
			
			<tr>
				<td><div align="center">截止时间</div></td>
				<td colspan="2"><div align="center"></div>
					<div align="center"><sf:input type="date" path="deadLine"></sf:input></div></td>
			</tr>
			<tr>
				<td><div align="center">完成时间</div></td>
				<td colspan="2"><div align="center"></div>
					<div align="center"></div></td>
			</tr>
			<tr>
				<td><div align="center">活动人数</div></td>
				<td colspan="2"><div align="center"></div>
					<div align="center"></div></td>
			</tr>
			<tr>
				<td><div align="center">预算规模</div></td>
				<td colspan="2"><div align="center"></div>
					<div align="center"></div></td>
			</tr>

			<tr>
				<td><div align="center">项目备注</div></td>
				<td colspan="2"><div align="center"></div>
					<div align="center"></div></td>
			</tr>
			<tr>
				<td colspan="3"><button type="reset">reset</button>
					&nbsp;&nbsp;&nbsp;
					<button type="submit">submit</button>
				</td>
			</tr>
		</table>
	</sf:form>
	<p>&nbsp;</p>
</body>
</html>
