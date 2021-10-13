<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Danh sách sản phẩm</title>
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round">
<link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>

<body>
<%
	String username=(String)session.getAttribute("name");
	if(session!=null){
		out.print("chao ban "+username);
	}
%>
<a href="logout.jsp">LogOut</a>
<form action="themsp.jsp" method="get">
		<input type="submit" value="them" name="btnthem">
	</form>
<div id="main" align="center">
	<h2>THÔNG TIN SẢN PHẨM</h2>
	
<form action="xoanhieuServlet" method="get">
	<table border="1">
	<thead>
		<th><input type="submit" name="btchonxoa" value="chon xoa"></th>
		<th>Id product</th>
		<th>id catalog</th>
		<th>product name</th>
		<th>Price</th>
		<th>Status</th>
		<th>Description</th>
		<th>Content</th>
		<th>Discount</th>
		<th>ImageLink</th>
		<th>Created</th>
		<th>Delete</th>
		<th>Sửa</th>
	</thead>
		
		<c:forEach items="${arr }" var="p">
			<tr align="center">
			<td><input type="checkbox" name="chonxoa" id="chonxoa" value="${p.productid }"></td>
				<td>${p.productid }</td>
				<td>${p.catalogid }</td>
				<td>${p.productname }</td>
				<td>${p.price }</td>
				<td>${p.status }</td>
				<td>${p.description }</td>
				<td>${p.content }</td>
				<td>${p.discount }</td>
				<td><img alt="" src="nongsan/image/${p.image } " width="90px" height="90px"></td>
				<td>${p.created }</td>
				<td>
				    <a href="xoaspServlet?productid=${p.productid }" class="delete" title="Delete" data-toggle="tooltip"><i class="material-icons">&#xE5C9;</i></a>	
                 </td> 
                <td>
					<a href="suaspServlet?productid=${p.productid }" class="settings" title="Settings" data-toggle="tooltip"><i class="material-icons">&#xE8B8;</i></a>
				</td>
				
			</tr>
		</c:forEach>
	</table>
</form>
</div>

</body>
</html>