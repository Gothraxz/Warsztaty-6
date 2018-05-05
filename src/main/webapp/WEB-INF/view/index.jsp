<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Tweeter 0.1a</title>
</head>
<body>

	<div align="right"> <a href="to do"><button>Login</button></a> </div>

	<h3>What's new...</h3>
	
	<table style="border: 1px solid black; text-align: center" >
		<tr>
			<th>User:</th>
			<th>Created:</th>
			<th>Tweet:</th>
			<th>Action:</th>
		</tr>
	
		<c:forEach items = "${tweetItems}" var = "user">
			<tr>
				<td>
				<c:out value = "${tweet.user.username}"/>
				</td>
				<td>
				<c:out value = "${tweet.created}"/>
				</td>
				<td>
				<c:out value = "${tweet.text}"/>
				</td>
				<td>
				<a href="to do"><button>Send message</button></a>   <a href="to do"><button>Comment</button></a>
				</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>