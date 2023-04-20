<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
    <%@ page import="java.util.ArrayList"%>
<%@ page import="dto.Product"%>
<%@ page import="dao.ProductRepository"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품등록</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
	
	
</head>
<body>
<jsp:include page="menu.jsp" />
	<div class=jumbotron>
		<div class="container">
			<h1 class=display-3>상품등록</h1>
			
		</div>
	</div>
	
	<div class="container">
	<form name = "newProduct" action="./processAddProduct.jsp" class = "form-horizon" method="post" enctype="multipart/form-data">
		<div class = "form-group row">
		<label class = "col-sm-2">상품코드</label>
		<div class = "col-sm-3">
		<input name="productId" type="text" class = "form-control">
		</div>
		</div>
		
		<div class = "form-group row">
		<label class = "col-sm-2">상품명</label>
		<div class = "col-sm-3">
		<input name="name" type="text" class = "form-control">
		</div>
		</div>
		
		<div class = "form-group row">
		<label class = "col-sm-2">가격</label>
		<div class = "col-sm-3">
		<input name="unitPrice" type="text" class = "form-control">
		</div>
		</div>
		
		<div class = "form-group row">
		<label class = "col-sm-2">상세정보</label>
		<div class = "col-sm-3">
		<input name="description" type="text" class = "form-control" cols="50" rows="2">
		</div>
		</div>
		
		<div class = "form-group row">
		<label class = "col-sm-2">제조사</label>
		<div class = "col-sm-3">
		<input name="manufacturer" type="text" class = "form-control" >
		</div>
		</div>
		
		<div class = "form-group row">
		<label class = "col-sm-2">분류</label>
		<div class = "col-sm-3">
		<input name="category" type="text" class = "form-control">
		</div>
		</div>
		
		<div class = "form-group row">
		<label class = "col-sm-2">재고수</label>
		<div class = "col-sm-3">
		<input name="unitsInStock" type="text" class = "form-control">
		</div>
		</div>
		
		<div class = "form-group row">
		<label class = "col-sm-2">상태</label>
		<div class = "col-sm-3">
		<input name="condition" type="radio" value = "new">신규제품
		<input name="condition" type="radio" value = "old">중고제품
		<input name="condition" type="radio" value="refurbished">재생제품
		</div>
		</div>
		
		<div class = "form-group row">
		<label class = "col-sm-2">이미지</label>
		<div class = "col-sm-3">
		<input name="fileName" type="file" class = "form-control">
		</div>
		</div>
		
		<input  type="submit" value="등록">	
	</form>
	<hr>
	<%@ include file="footer.jsp"%>

</body>
</html>