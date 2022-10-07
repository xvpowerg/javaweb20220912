<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Insert title here</title>
</head>
<body>
	<c:if test="${canShow}">
		<p>看不見我!!</p>
	</c:if>
	<c:choose>
		<c:when test="${action==1}">
				<p>Play</p>
		</c:when>
		<c:when test="${action==2}">
				<p>Stop</p>
		</c:when>
		<c:otherwise>
				<p>Error</p>
		</c:otherwise>	
	</c:choose>
</body>
</html>