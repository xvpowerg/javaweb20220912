<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Insert title here</title>
</head>
<body>
<c:forEach var="image" items="${imageList}">
		<div>
			<img width="30%" height="30%" src="/myimages/${image}">		
		</div>
</c:forEach>
		
		
</body>
</html>