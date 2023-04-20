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
</script>

</head>


<body>

	<jsp:include page="menu.jsp" />
	
	<div class=jumbotron>
		<div class="container">
			<h1 class=display-3>상품 정보</h1>
		</div>
	</div>
	<%
	String id = request.getParameter("id");
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	String sql = "select * from product where p_id = ?";
	pstmt = conn.prepareStatement(sql);
	pstmt.setString(1, id);
	rs = pstmt.executeQuery();
	while (rs.next()) {
	%>

	
		<div class="container">
		<form name = "newProduct" action="./processupdateProduct.jsp" class = "form-horizon" method="post" enctype="multipart/form-data">
		<img src="./img/<%=rs.getString("p_fileName")%>" style="width: 300px"><br><br>
		
		<div class = "form-group row">
		<label class = "col-sm-2">상품코드</label>
		<div class = "col-sm-3">
		<input name="productId" type="text" class = "form-control"  value = "<%=rs.getString("p_id")%>">
		</div>
		</div>
		
		<div class = "form-group row">
		<label class = "col-sm-2">상품명</label>
		<div class = "col-sm-3">
		<input name="name" type="text" class = "form-control" value = "<%=rs.getString("p_name")%>">
		</div>
		</div>
		
		<div class = "form-group row">
		<label class = "col-sm-2">가격</label>
		<div class = "col-sm-3">
		<input name="unitPrice" type="text" class = "form-control" value = "<%=rs.getString("p_unitPrice")%>">
		</div>
		</div>
		
		<div class = "form-group row">
		<label class = "col-sm-2">상세정보</label>
		<div class = "col-sm-3">
		<input name="description" type="text" class = "form-control" value = "<%=rs.getString("p_description")%>">
		</div>
		</div>
		
		<div class = "form-group row">
		<label class = "col-sm-2">제조사</label>
		<div class = "col-sm-3">
		<input name="manufacturer" type="text" class = "form-control" value = "<%=rs.getString("manufacturer")%>">
		</div>
		</div>
		
		<div class = "form-group row">
		<label class = "col-sm-2">분류</label>
		<div class = "col-sm-3">
		<input name="category" type="text" class = "form-control" value = "<%=rs.getString("p_category")%>">
		</div>
		</div>
		
		<div class = "form-group row">
		<label class = "col-sm-2">재고수</label>
		<div class = "col-sm-3">
		<input name="unitsInStock" type="text" class = "form-control" value = "<%=rs.getString("p_unitsInStock")%>">
		</div>
		</div>
		
		<div class = "form-group row">
		<label class = "col-sm-2">상태</label>
		<div class = "col-sm-3">
		
		
		<input name="condition" type="radio" value = "new" >신규제품
		<input name="condition" type="radio" value = "old">중고제품
		<input name="condition" type="radio" value="refurbished">재생제품
		
		
		</div>
		</div>
		
		<div class = "form-group row">
		<label class = "col-sm-2">이미지</label>
		<div class = "col-sm-3">
		<input name="fileName" type="file" class = "form-control" value = "p_filename">
		</div>
		</div>
		
		<input  type="submit" value="수정하기">
		</form>
				
				<%
				}
				%>


			</div>

		</div>
	</div>

</body>
</html>