<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.Date"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>welcome</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">

</head>
<body>
	<%@ include file="menu.jsp"%>
	
	<% %>
	
	<%
	String greeting = " Dior에 오신걸 환영합니다";
	String tagline = " 쇼핑몰입니다.";
	
	%>

	<div class="jumbotron">
		<div class="container">
		
			<h1 class="display-3" align="center" >
				<%=greeting%> 
				
			</h1>
			<h5 align="right">
			<%
				Date day = new java.util.Date();
				String am_pm;
				int hour = day.getHours();
				int minute = day.getMinutes();
				int second = day.getSeconds();
				if(hour/12 == 0 ){
					am_pm = "AM";
				} else {
					am_pm = "PM";
					hour = hour-12;
				}
				
				String CT=hour+":"+minute+":"+second+" : "+am_pm;
				out.println("현재시간: "+CT+"\n");
				%>
				</h5>
			
			
		</div>
	</div>
	<main role="main">
	<img src="img/bag3.jpg" width="1900" height="1000" >


		<div class="container">
		
			<div class="text-center">
			
				<h3>
					<%=tagline%>  </h3>
					
	</div>
	<hr>
	</div>
	</main>
<%@ include file = "footer.jsp" %>
</body>
</html>