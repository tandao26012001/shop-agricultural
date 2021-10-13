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
	<form action="themspServlet" method="get">
		<table border="1">
			<tr>
				<th colspan="2">Thêm sản phẩm mới</th>
			</tr>
			
			<tr>
				<td>ID Product</td>
				<td><input type="text" name="txtproductid"></td>
			</tr>
			
			<tr>
				<td>ID Catalog</td>
				<td><input type="text" name="txtcatalogid"></td>
			</tr>
			
			<tr>
				<td>Product Name</td>
				<td><input type="text" name="txtproductname"></td>
			</tr>
			
			<tr>
				<td>Price</td>
				<td><input type="text" name="txtprice"></td>
			</tr>
			
			<tr>
				<td>Status</td>
				<td><input type="text" name="txtstatus"></td>
			</tr>
			
			<tr>
				<td>Description</td>
				<td><input type="text" name="txtdescription"></td>
			</tr>
			
			<tr>
				<td>Content</td>
				<td><input type="text" name="txtcontent"></td>
			</tr>
			
			<tr>
				<td>Discount</td>
				<td><input type="text" name="txtdiscount"></td>
			</tr>
			
			<tr>
				<td>ImageLink</td>
				<td><input type="text" name="txtimage"></td>
			</tr>
			
			<tr>
				<td>Created</td>
				<td><input type="text" name="txtcreated"></td>
			</tr>
			
			<tr>
				<td> <input type="submit" name="btthem" value="Insert"></td>
				<td><a href="prServlet">Danh sách product</a></td>
			</tr>
		</table>
	</form>
</div>
</body>
</html>