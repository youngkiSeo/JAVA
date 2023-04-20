<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    <%@ page import = "user.UserDao" %>
    <!-- javascrpit를 사용하기 위해 import 함 -->
    <%@ page import = "java.io.PrintWriter" %>
    
    <% request.setCharacterEncoding("UTF-8"); %>
    <jsp:useBean id = "user" class = "user.User" scope = "page"/>
    <jsp:setProperty name = "user" property = "userID"/> 
    <jsp:setProperty name = "user" property = "userPassword"/>
    <jsp:setProperty name = "user" property = "userName"/>
    <jsp:setProperty name = "user" property = "userGender"/>
    <jsp:setProperty name = "user" property = "userEmail"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width", initial-scale"="1">
<link rel="stylesheet" href="css/bootstrap.css">
<title>join Action페이지</title>
</head>
<body>

	<%
	String userID = null;
	
	if(session.getAttribute("userID") != null){
		userID = (String) session.getAttribute("useID");
		System.out.print(userID);
	}
	if(userID !=null){
		PrintWriter script = response.getWriter();
		script.println("<script>");
		script.println("alert('이미 로그인 되어 있습니다.')");
		script.println("location.href = 'main.jsp'");
		script.println("</script>");
		
	}
	
	if (user.getUserID() == null || user.getUserPassword() == null || user.getUserEmail() == null
			|| user.getUserGender() == null || user.getUserName() == null) {
		PrintWriter script = response.getWriter();
		script.println("<script>");
		script.println("alert('입력된 값이 없습니다.')");
		script.println("history.back()");
		script.println("</script>");
	}else {
		UserDao userDao = new UserDao();
		int result = userDao.join(user);
		if(result == -1){
			PrintWriter script = response.getWriter();
			script.println("<script>");
			script.println("alert('이미 존재하는 아이디 입니다.')");
			script.println("</script>");
			
		}else {
			session.setAttribute("userID",user.getUserID()); 
			PrintWriter script = response.getWriter();
			script.println("<script>");
			script.println("location.href = 'main.jsp'");
			script.println("</script>");	
		}
	}

	%>

</body>
</html>