<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@page import="com.example.model.bean.UserBean"%>
	<p>You are successfully logged in!</p>
	<%
	UserBean bean = (UserBean) session.getAttribute("user");
	out.print("Welcome, " + bean.getUsername());
	%>
</body>
</html>