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
<title>add project</title>
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
	<p>
		<a href="project">all projects</a>
	</p>
	<p>&nbsp;</p>
	<sf:form method="post" modelAttribute="project">
		<sf:errors path="*" cssClass="errorblock" element="div" />
		<table width="826" height="479" border="1">
			<tr>
				<td width="255" height="203"><p>
						<img src="style/img/004.png" width="171" height="162" alt="" />
					</p>
					<p>&nbsp;</p></td>
				<td colspan="2">项目名称：<br>
				<sf:input path="name" value="default project" /><br> <br>介绍：<br>
					<sf:textarea path="description" rows="7" style="width:100%;" /></td>
			</tr>
			<tr>
				<td><div align="center">创建者</div></td>
				<td colspan="2"><div align="center">${project.founder.name}</div></td>
			</tr>
			<tr>
				<td><div align="center">起始时间</div></td>
				<td colspan="2"><div align="center"></div>
					<div align="center">
						<sf:input type="date" path="startTime" />
					</div></td>
			</tr>
			<tr>
				<td><div align="center">截止时间</div></td>
				<td colspan="2"><div align="center"></div>
					<div align="center">
						<sf:input type="date" path="deadLine" />
					</div></td>
			</tr>
			<tr>
				<td><div align="center">活动人数</div></td>
				<td colspan="2"><div align="center"></div>
					<div align="center">
						<sf:input path="maxParticipant" />
					</div></td>
			</tr>
			<tr>
				<td><div align="center">预算规模</div></td>
				<td colspan="2"><div align="center"></div>
					<div align="center">
						<sf:input path="maxBudget" />
					</div></td>
			</tr>

			<tr>
				<td><div align="center">项目备注</div></td>
				<td colspan="2"><div align="center"></div>
					<div align="center">
						<sf:input path="comment" />
					</div></td>
			</tr>
			<tr>
				<td colspan="3"><button type="reset">reset</button>
					&nbsp;&nbsp;&nbsp; <input type="submit" value="submit" /></td>
			</tr>
		</table>
	</sf:form>
	<p>&nbsp;</p>
</body>
</html>
