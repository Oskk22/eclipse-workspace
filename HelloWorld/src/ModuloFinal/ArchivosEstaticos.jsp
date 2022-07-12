<context:component-scan base-package="com.ejemplo"/>
<mvc:resources mapping="/resources/**" location="/resources/"></mvc:resources>
<mvc:annotation-driven/>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<script src="${pageContext.request.contextPath}/resources/js/main.js"></script>
		<title>Hola</title>
	</head>
	<body>
	Hola Mundo!
	</body>
</html>