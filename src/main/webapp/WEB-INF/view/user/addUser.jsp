<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Create new user</title>
</head>
<body>

	<h1>Add user:</h1>
	<br>
	<form:form method="POST" modelAttribute="user">
	Username: 
	<br>
	<form:input path="userName" />
	<form:errors path="userName" />
	<br>
	Password:
	<br>
	<form:password path="password" />
	<form:errors path="password" />
	<br>
	E-mail:
	<br>
	<form:input path="email"/>
	<form:errors path="email" />
	<br>
	<form:hidden path="enabled" value="true" />
	<br>
	<input type="submit" value="Submit">
	</form:form>

</body>
</html>