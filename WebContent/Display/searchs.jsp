<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Search sản phẩm</title>
    
    <!-- Google Fonts -->
    <link href='http://fonts.googleapis.com/css?family=Titillium+Web:400,200,300,700,600' rel='stylesheet' type='text/css'>
    <link href='http://fonts.googleapis.com/css?family=Roboto+Condensed:400,700,300' rel='stylesheet' type='text/css'>
    <link href='http://fonts.googleapis.com/css?family=Raleway:400,100' rel='stylesheet' type='text/css'>
    
    <!-- Bootstrap -->
    <link rel="stylesheet" href="nongsan/css/bootstrap.min.css">
    
    <!-- Font Awesome -->
    <link rel="stylesheet" href="nongsan/css/font-awesome.min.css">
    
    <!-- Custom CSS -->
    <link rel="stylesheet" href="nongsan/css/owl.carousel.css">
    <link rel="stylesheet" href="nongsan/css/style.css">
    <link rel="stylesheet" href="nongsan/css/responsive.css">
</head>
<body>
	<div>
		<jsp:include page="Themes/mainmenu.jsp"/>
			<div class="nav-right">
				<form class="form-search" method="get" action="search.html">
					<input type="text" placeholder="Search..." name="q" >
					<button class="btn btn-primary">Search</button>
				</form>
			</div>
			<div class="clear"></div>
				<div class="page-header">
				<c:if test="${soluong > 0 }">
					<h3 class="footer-wid-title">Có ${soluong} sản phẩm được tìm thấy</h3>
					<c:forEach var="p" items="${search }">
						<div class="col-lg-4">
							<div class="item">
								<img alt="${p.productname }" src="nongsan/image/${p.image }" width="250px" height="250px"> 
								<div class="info">
									<a href="detail.html?productid=${p.productid}">${p.productname }</a>
								</div>
							</div>
						</div>
					</c:forEach>
				</c:if>
				</div>
			<jsp:include page="Themes/footerbottom-arena.jsp"/>
		</div>
</body>
</html>