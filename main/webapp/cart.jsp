<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="dto.Product"%>
<%@ page import="dao.ProductRepository"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>장바구니</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
	<% String cartId = session.getId(); %>
<jsp:include page="menu.jsp" />
	<div class=jumbotron>
		<div class="container">
			<h1 class=display-3>장바구니</h1>
			
		</div>
	</div>

<div class="container">
	<div class="row">
		<table width="100%">
			<tr>
				<td align="left"><a href="./deleteCart.jsp?cartId=<%=cartId%>"
					class="btn btn-secondary" role="button">삭제</a>
				<td align="right"><a
					href="./shippingInfo.jsp?cartId=<%=cartId%>"
					class="btn btn-secondary" role="button">주문하기</a>
		</table>

	</div>
	<div style="padding-top: 50px">
		<table class="table table-hover">
			<tr>
				<th>상품</th>
				<th>가격</th>
				<th>수량</th>
				<th>소계</th>
				<th>비교</th>
			</tr>

			<% 
		int sum = 0 ;
		ArrayList<Product> cartList = 
				(ArrayList<Product>) session.getAttribute("cartlist");
		if(cartList == null)
			cartList = new ArrayList<Product>();
			
			for (int i =0; i <cartList.size(); i++) {
				Product product = cartList.get(i);
				int total = product.getUnitPrice() * product.getQuantity();
				sum = sum+ total;
				
				%>
			<tr>

				<td><%=product.getProductId()%> - <%= product.getPname() %></td>
				<td><%=product.getUnitPrice()%></td>
				<td><%=product.getQuantity()%></td>
				<td><%=total %></td>
				<td><a href="./removeCart.jsp?id=<%=product.getProductId()%>"
					class="badge badge-danger"> 삭제</a></td>
			</tr>
			<%
					}
				%>
			<tr>
				<th></th>
				<th></th>
				<th>총액</th>
				<th><%=sum%></th>
			</tr>
		</table>

		<a href="./welcome.jsp" class="btn btn-info"> 쇼핑계속하기 </a> <a
			href="./products.jsp" class="btn btn-info">상품목록으로 가기</a>


	</div>
	<hr>

	<%@ include file="footer.jsp"%>
</head>
<body>

</body>
</html>