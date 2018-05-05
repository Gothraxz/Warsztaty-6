<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
</head>
<body>

	<h2>Login</h2>

	<form:form method="POST" modelAttribute="User">
	Username: 
	<br>
	<form:input path="username" />
	<form:errors path="username" />
	<br>
	Password:
	<form:input path="password" />
	<form:errors path="password" />
	<br>
	<br>
	<input type="submit" value="Login">
	</form:form>

</body>
</html>