<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
  <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Demo Shop Nông Sản</title>
    
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
		<jsp:include page="Themes/header-menu.jsp"/>
		<jsp:include page="Themes/mainmenu.jsp"/>
		<jsp:include page="Themes/slider-area.jsp"/>
		<jsp:include page="Themes/proma-arena.jsp"/>
		<jsp:include page="view/productsale.jsp"/>
		<jsp:include page="Themes/footerbottom-arena.jsp"/>
	</div>	
</body>
</html>