<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<%@taglib prefix="h"  uri="/WEB-INF/tld/customtag.tld"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Insert title here</title>
</head>
<%
	String message = "Hello World";
	pageContext.setAttribute("message", message);

%>
<body>
	
</body>
</html>