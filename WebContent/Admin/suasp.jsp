<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Thêm sản phẩm mới</title>
</head>
<body>
	<div id="main" align="center">
	<form action="suaspServlet" method="post">
		<table border="1">
			<tr>
				<th colspan="2">Sửa sản phẩm mới</th>
			</tr>
			
			<tr>
				<td>ID Product</td>
				<td><input type="text" name="txtproductid" value="${p.productid }"></td>
			</tr>
			
			<tr>
				<td>ID Catalog</td>
				<td><input type="text" name="txtcatalogid" value="${p.catalogid }"></td>
			</tr>
			
			<tr>
				<td>Product Name</td>
				<td><input type="text" name="txtproductname" value="${p.productname }"></td>
			</tr>
			
			<tr>
				<td>Price</td>
				<td><input type="text" name="txtprice" value="${p.price }"></td>
			</tr>
			
			<tr>
				<td>Status</td>
				<td><input type="text" name="txtstatus" value="${p.status }"></td>
			</tr>
			
			<tr>
				<td>Description</td>
				<td><input type="text" name="txtdescription" value="${p.description }"></td>
			</tr>
			
			<tr>
				<td>Content</td>
				<td><input type="text" name="txtcontent" value="${p.content }"></td>
			</tr>
			
			<tr>
				<td>Discount</td>
				<td><input type="text" name="txtdiscount" value="${p.discount }"></td>
			</tr>
			
			<tr>
				<td>ImageLink</td>
				<td><input type="text" name="txtimage" value="${p.image }"></td>
			</tr>
			
			<tr>
				<td>Created</td>
				<td><input type="text" name="txtcreated" value="${p.created }"></td>
			</tr>
			
			<tr>
				<td> <input type="submit" name="btnsua" value="insert"></td>
				<td><a href="prServlet">Danh sách product</a></td>
			</tr>
		</table>
	</form>
</div>
</body>
</html>