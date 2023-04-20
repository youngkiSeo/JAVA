<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    <%@ page import = "user.UserDao" %>
    <%@ page import = "java.io.PrintWriter" %>    
    <% request.setCharacterEncoding("UTF-8"); %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width", initial-scale"="1">
<link rel="stylesheet" href="css/bootstrap.css">
<title>로그인Action페이지</title>
</head>
<body>

	<%
	session.invalidate(); //session 빼앗아서 로그아웃 시키기

	%>
	<script>
		location.href = "main.jsp"; 
	</script>

</body>
</html>