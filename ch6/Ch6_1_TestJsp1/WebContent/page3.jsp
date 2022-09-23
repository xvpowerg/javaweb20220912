<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<%@page import="java.util.ArrayList" %>
<%@page import="java.util.HashSet" %>    
<%@page import="tw.com.beans.Item" %> 
<%@page import="tw.com.beans.Product" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Page3</title>
</head>
<body>
	<ol>
	<%
			String appValue = 
				(String)application.
				getAttribute("appValue");
	ArrayList<Item> list =(ArrayList) session.getAttribute("itemList");
		for(Item it : list){
	%>
		<li><%=it.getId()%>:<%=it.getName()%> </li>
	
	<%} %>
	</ol>
	
	<%
	HashSet<Product> set = (HashSet)application.
		getAttribute("pSet");
	for (Product pr : set){
	%>
		<p><%=pr.getPrice()+":"+pr.getName()%></p>
	<%} %>
	<h1>Page3</h1>
	reqAttr:<%=request.getAttribute("reqAtte")%>
	appValue:<%=appValue%>
</body>
</html>