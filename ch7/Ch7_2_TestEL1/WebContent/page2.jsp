<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>      
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Insert title here</title>
</head>
<body>
<%
String title = "我的頁面";
pageContext.setAttribute("title", title);
%>
<!-- EL順序 page Request Session Context -->
	<h1>Page2 EL</h1>
	<p>Item</p>
	<p>name:${item1.name}</p>
	<p>price:${item1.price}</p>
	
    <p>User</p>
    <p>name:${user1.name}</p>
    <p>age:${user1.age}</p>		
	<c:forEach var="myUser" items="${userList}">
		<p>name:${myUser.name}</p>
		<p>age:${myUser.age}</p>
	</c:forEach>
	
	<p>${userMap.user1.name }</p>
	<p>${userMap["@XXX user3"].name }</p>
	
	<h2>${title}</h2>
</body>
</html>