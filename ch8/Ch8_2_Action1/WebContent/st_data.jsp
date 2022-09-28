<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="title.jsp"/>
	<jsp:useBean id="student" class="tw.com.beans.Student"></jsp:useBean>
	 <jsp:setProperty property="*" name="student"/>
	 <div>name:${student.stName}</div>
	 <div>email:${student.stEmail}</div>
</body>
</html>