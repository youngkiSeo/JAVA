<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
    <%@ page import="java.util.ArrayList"%>
<%@ page import="dto.Product"%>
<%@ page import="dao.ProductRepository"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>배송 정보</title>
</head>
<body>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
	<jsp:include page="menu.jsp" />
	<div class=jumbotron>
		<div class="container">
			<h1 class=display-3>배송 정보</h1>
			
		</div>
	</div>
	<div class="container">
	
	<form action = "./order.jsp?" class = "form-horizontal" method = "post">
	<input type="hidden" name="cartId" value="<%=request.getParameter("cartId")%>">
	
	<div class = "form-group row">
		<label class = "col-sm-2">성명</label>
		<div class = "col-sm-3">
		<input name="name" type="text" class = "form-control">
		</div>
		</div>
		
		<div class = "form-group row">
		<label class = "col-sm-2">배송일</label>
		<div class = "col-sm-3">
		<input name="name" type="text" class = "form-control">(yyyy/mm/dd)
		</div>
		</div>
		
		<div class = "form-group row">
		<label class = "col-sm-2">국가명</label>
		<div class = "col-sm-3">
		<input name="name" type="text" class = "form-control">
		</div>
		</div>
		
		<div class = "form-group row">
		<label class = "col-sm-2">우편번호</label>
		<div class = "col-sm-3">
		<input name="name" type="text" class = "form-control">
		</div>
		</div>
		
		<div class = "form-group row">
		<label class = "col-sm-2">주소</label>
		<div class = "col-sm-3">
		<input name="name" type="text" class = "form-control">
		</div>
		</div>
		<input name= "name" type="submit" value="등록">
		
		</form>
		
		
		<form>
		
		<a href="./welcome.jsp" class="btn btn-info"> 이전 </a> 
		<a href="./order.jsp?id" class="btn btn-secondary">등록</a>
		<a href="./welcome.jsp" class="btn btn-info">취소</a>
		</form>
	
	
	
	
	
			
	</div>
</body>
</html>