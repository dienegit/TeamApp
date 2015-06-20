<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!doctype html>
<html>
<head>
<base href="<%=basePath%>">
<meta charset="UTF-8">
<title>user login</title>
</head>

<body>
	<p>user login </p>
<p>&nbsp;</p>
<form method="post">
	<table width="451" height="378" border="1">
	  <tr>
	    <td colspan="3"><div align="center">login
        </div></td>
      </tr>
	  <tr>
	    <td width="132"><div align="center">email</div></td>
	    <td colspan="2"><div align="center"><input type="text" name="email">
	    </div></td>
      </tr>
	  <tr>
	    <td><div align="center">password</div></td>
	    <td colspan="2"><div align="center"><input type="password" name="password"></div></td>
      </tr>
      <tr>
	    <td><div align="center">captchas</div></td>
	    <td colspan="2"><div align="center"></div></td>
      </tr>
	  <tr>
	    <td><div align="center">remember me</div></td>
	    <td colspan="2"><div align="center"><input type="checkbox" /></div></td>
      </tr>
      <tr>
	    
	    <td colspan="3"><div align="center">
        <a href="#">forget password</a>
        <a href="register.html">register</a>
        </div></td>
      </tr>
	  <tr>
	    <td colspan="3"><div align="center"><button type="reset">reset</button> <button type="submit">submit</button></div></td>
      </tr>
</table>
</form>
	<p>&nbsp;</p>
</body>
</html>
