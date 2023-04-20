<%@ page language="java" pageEncoding="UTF-8"%>
    <%@page import= "java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%

Connection conn = null;

String driver = "com.mysql.jdbc.Driver";
String user = "root";
String pass = "1111";
String dbURL = "jdbc:mysql://localhost:3306/webbmarkdb?severTimezone=Asia/Seoul";

	try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
	}catch (ClassNotFoundException e) {
		System.out.println("MYSQL 드라이버 검색 오류");
		e.printStackTrace();
		return;
	}
	try {
		conn = DriverManager.getConnection(dbURL, user, pass);
		System.out.println("MYSQL 연결 성공");
	} catch (SQLException e) {
		System.out.println("MYSQL 연결 객체 생성 실패" + e);
		System.exit(0);
	}	
	
	%>
	
	

