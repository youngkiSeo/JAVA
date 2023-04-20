<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import = "user.UserDao" %>
    <!-- javascrpit를 사용하기 위해 import 함 -->
    <%@ page import = "java.io.PrintWriter" %>
    
    <% request.setCharacterEncoding("UTF-8"); %>
    <jsp:useBean id = "user" class = "user.User" scope = "page"/>
    
    <jsp:setProperty name = "user" property = "userID"/> 
    <jsp:setProperty name = "user" property = "userPassword"/>
    
    <!--login.jsp 페이지에서 받아온 userID를 한명의 사용자를 userID에 넣어줌  -->
    
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

	 String userID = null;
	 //session.setAttribute("userID", user.getUserID());
 
	if(session.getAttribute("userID") != null){
		userID = (String) session.getAttribute("userID");	
	}
	
	if(userID !=null){
		PrintWriter script = response.getWriter();
		script.println("<script>");
		script.println("alert('로그인이 되어있지 않습니다.')");
		script.println("location.href = 'main.jsp'");
		script.println("</script>");
		
	}

	
	UserDao userDao = new UserDao(); //userDao 라는 인스턴트를 만들어줌
		int result = userDao.login(user.getUserID(), user.getUserPassword()); // login.jsp 에서 아이디와 패스워드 값을 받아와서 result 에 저장
		
		if (result == 1) {
			 session.setAttribute("userID", user.getUserID());
			PrintWriter script = response.getWriter();
			script.println("<script>");
			script.println("location.href = 'main.jsp'");
			script.println("</script>");
		} else if (result == 0) {
			PrintWriter script = response.getWriter();
			script .println("<script>");
			script.println("alert('비밀번호가 틀립니다.')");
			script.println("history.back()");
			script.println("</script>");
		} else if (result == -1) {
			PrintWriter script = response.getWriter();
			script.println("<script>");
			script.println("alert('존재하지 않는 아이디입니다.')");
			script.println("history.back()");
			script.println("</script>");
		} else if (result == -2) {
			PrintWriter script = response.getWriter();
			script.println("<script>");
			script.println("alert('데이터베이스 오류가 발생했습니다.')");
			script.println("history.back()");
			script.println("</script>");
		}
		
	%>

</body>
</html>