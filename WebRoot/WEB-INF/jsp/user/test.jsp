<%@ page language="java" pageEncoding="UTF-8" session="false" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Add User</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script type="text/javascript">
$(document).ready(function() {
	$('#testquery').click(function(){
	
		queryTest();
	});
	$('#getButton').click(function(){
	
		getTest();
	});
});


function queryTest() {
	//var url = "http://localhost:8081/TeamApp/user/testquery.json";
	var myData = '{\"id\":1}';
	$.ajax({
		type: 'POST',
		contentType: 'application/json',
		url: 'http://localhost:8081/TeamApp/user/testquery/',
		processData : false,
		dataType : 'json',
		data: myData, 
		success: function(item) {
			$("#display").html("");
			
            $("#display").append(
                    "<div>" + item.id + "</div>" + 
                    "<div>" + item.name    + "</div>" +
                    "<div>" + item.email + "</div><hr/>");
        	
		},
		error : function(){
			alert('error');
		}
	});
}

function getTest() {
	$.ajax({
		type: 'GET',
		contentType: 'application/json',
		url: 'http://localhost:8081/TeamApp/user/test.json',
		dataType : 'json', 
		success: function(data) {
			$("#display").html("");
			$.each(data, function(i, item) {
            $("#display").append(
                    "<div>" + item.id + "</div>" + 
                    "<div>" + item.name    + "</div>" +
                    "<div>" + item.email + "</div><hr/>");
        	});
		},
		error : function(){
			alert('error');
		}
	});
}
</script>
</head>
<body>
    <sf:form method="post" modelAttribute="user" action="../testquery/">
    	username: <sf:input path="name"/><br />
    	password: <sf:input path="password"/><br />
    	email: <sf:input path="email"/><br />
    	<input type="submit" value="add user" />
    </sf:form>
    
    <button id="testquery" type="button">post</button>
    
    <button id="getButton" type="button">get</button>
    
    <div id="display">s</div>
</body>
</html>