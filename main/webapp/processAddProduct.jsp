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
<% request.setCharacterEncoding("UTF-8");
	String filename = "";
	String realFolder = "C://upload"; //웹 어플리케이션상의 절대경로
	String encType = "utf-8"; //인코딩 타입
	int maxSize = 5 * 1024 *1024; // 최대 업로드될 파일의 크기 5mb
	
	MultipartRequest multi = new MultipartRequest(request, realFolder, maxSize, encType);
	
	String productId = multi.getParameter("productId");
	String name = multi.getParameter("name");
	String unitPrice = multi.getParameter("unitPrice");
	String description = multi.getParameter("description");
	String manufacturer = multi.getParameter("manufacturer");
	String category = multi.getParameter("category");
	String unitsInStock = multi.getParameter("unitsInStock");
	String condition = multi.getParameter("condition");
	
	
	Integer price;
	if(unitPrice.isEmpty())
		price = 0;

		price=Integer.valueOf(unitPrice);
	
	
	Integer stock;
	
	if(unitsInStock.isEmpty())
		
		stock=0;
		else stock = Integer.valueOf(unitsInStock);
	
	Enumeration files = multi.getFileNames();
	String fname = (String) files.nextElement();
	String fileName = multi.getFilesystemName(fname);
	
	PreparedStatement pstmt = null;
	
	String sql = "INSERT INTO product values(?,?,?,?,?,?,?,?,?)";
	pstmt= conn.prepareStatement(sql);
	pstmt.setString(1, productId);
	pstmt.setString(2, name);
	pstmt.setInt(3, price);
	pstmt.setString(4, description);
	pstmt.setString(5, manufacturer);
	pstmt.setString(6, category);
	pstmt.setInt(7, stock);
	pstmt.setString(8, condition);
	pstmt.setString(9, fileName);
	pstmt.executeUpdate();
	
	if(pstmt !=null)
		pstmt.close();
	if(conn !=null)
		pstmt.close();
	
	response.sendRedirect("products.jsp");

%>

</body>
</html>