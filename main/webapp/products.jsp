<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="dto.Product"%>
<%@ page import="dao.ProductRepository"%>
<%@ include file = "DB.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
</head>
<% String edit = request.getParameter("edit"); %>
<body>
	<%@ include file="menu.jsp"%>
	<div class="jumbotron">
		<div class="container">
			<h1 class="display-3">상품목록</h1>
		</div>
	</div>

	<div class="container">
		<div class="row" align="center">

	
	<%
	PreparedStatement pstmt = null;
			ResultSet rs = null;
			
			String sql = "select * from product";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()){
	%>


	<div class="col-md-5">

		<div class="col-md-4">
			<img src="./img/<%=rs.getString("p_fileName")%>" style="width: 300px">
			<h3><%=rs.getString("p_name")%></h3>
			<p><%=rs.getString("p_description")%>
			<p><%=rs.getString("p_unitPrice")%>원
			<p>
				<a href="./product.jsp?id=<%=rs.getString("p_id")%>"
					class="btn btn-secondary">상세보기</a>
		</div></div>
		
		<%
		}
		%>
		</div>
		</div>

		<hr>
	</div>
	<%@ include file="footer.jsp"%>

</body>
</html>