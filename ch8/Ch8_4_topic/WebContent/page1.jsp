<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.List" %>    
<%@page import="tw.com.beans.Food" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		List<Food> list = 
		(List<Food>)request.getAttribute("foodList");		
	%>
	<%=list.size() %>
</body>
</html>