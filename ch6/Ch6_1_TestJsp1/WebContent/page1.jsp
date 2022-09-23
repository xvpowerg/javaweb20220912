<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
	String title = request.getParameter("title");
	String count = request.getParameter("count");
    int countInt = count == null?0:Integer.parseInt(count);
%>
<html>
<head>
<meta charset="UTF-8">
<title><%=title%></title>
</head>
<body>
	
<!--我是HTML註解 -->
	<ol>
		<%
			char c = 'A';
			for(int i = 1; i <= countInt;i++){
		%>
			<li><%=c++%></li>
		<%} %>
	
	</ol>	
	
</body>
</html>