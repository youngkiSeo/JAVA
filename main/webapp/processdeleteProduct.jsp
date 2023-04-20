<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.oreilly.servlet.*" %>   
<%@ page import="com.oreilly.servlet.multipart.*" %>
<%@ page import="java.util.*"%>
<%@ page import="java.sql.*"%>
<%@ include file="DB.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	request.setCharacterEncoding("UTF-8");
	

	String productId = request.getParameter("id");
	PreparedStatement pstmt = null;

	String sql = "DELETE FROM product where p_id=?";
	pstmt = conn.prepareStatement(sql);
	pstmt.setString(1, productId);

	pstmt.executeUpdate();
	
	if (pstmt != null)
		pstmt.close();
	if (conn != null)
		pstmt.close();

	response.sendRedirect("products.jsp");
%>

</body>
</html>