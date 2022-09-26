<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<%@page  import="tw.com.beans.Item" %>
<%@page  import="tw.com.beans.User" %>
<%@page import="java.util.List" %>
<%@page import="java.util.Map" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Insert title here</title>
</head>
<body>
	<H1>Page1</H1>
	 <%
	 	Item item = (Item)request.getAttribute("item1");
		User user = (User)session.getAttribute("user1");
		List<User> userList =  (List<User>)session.getAttribute("userList");
		Map<String,User> userMap = 
				(Map<String,User>)session.getAttribute("userMap");
	 %> 
	 <p>name:<%=item.getName() %></p>
	 <p>price:<%=item.getPrice() %></p>
	 
	 <p>name:<%=user.getName() %></p>
	 <p>Age:<%=user.getAge()%></p>
	 
	 <%for(User u : userList) {%>
	 	<p>name:<%=u.getName() %></p>
	 	<p>age:<%=u.getAge() %></p>
	 <%} %>
	 
	 <%=userMap.get("user1").getName() %>
</body>
</html>