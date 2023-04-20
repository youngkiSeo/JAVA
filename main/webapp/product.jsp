<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="dto.Product"%>
<%@ page import="dao.ProductRepository"%>
<%@ include file = "DB.jsp" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function addToCart(){
		if(confirm("상품을 장바구니에 추가하시겠습니까?")){
			document.addForm.submit();
		}else {
			document.addForm.reset();
		}
	}
</script>

</head>


<body>


	<jsp:include page="menu.jsp" />
	<div class=jumbotron>
		<div class="container">
			<h1 class=display-3>상품 정보</h1>
		</div>
	</div>
	<%String id = request.getParameter("id");
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	String sql = "select * from product where p_id = ?";
	pstmt = conn.prepareStatement(sql);
	pstmt.setString(1, id);
	rs = pstmt.executeQuery();
	while (rs.next()) {

	%>

	<div class="container"></div>
	<div class="row">
		<div class="col-md-5">

			<img src="./img/<%=rs.getString("p_fileName")%>" style="width: 300px"><br><br>
			<div class="col-md-6">
				
				<p>
					<b>상품 코드 :</b> <span class="badge badge-danger"> <%=rs.getString("p_id")%></span>
				<p>
					<b>제조사 :</b><%=rs.getString("manufacturer")%>
				<p>
					<b>분류 :</b><%=rs.getString("p_category")%>
				<p>
					<b>재고 수 :</b><%=rs.getString("p_unitsInStock")%>
					개
				<h4>
					가격:<%=rs.getString("p_unitPrice")%>원
				</h4>


				<form name="addForm" method="Post"
					action="./addCart.jsp?id=<%=rs.getString("p_id")%>>">
					<a href="#" class="btn btn-info" onclick="addToCart()"> 상품 주문 </a>
					<a href="./cart.jsp?" class="btn btn-secondary" role="button">장바구니
					</a> <a href="./products.jsp" class="btn btn-secondary"> 상품목록</a>
				</form>
				
				<%
				}
				%>


			</div>

		</div>
	</div>

</body>
</html>