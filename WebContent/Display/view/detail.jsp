<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="header-wid-title"> Product detail </div>
<div class="products">
	<c:forEach items="${ctp }" var="p">
		<div class="col-lg-4">
		<img src="nongsan/image/${p.image }" width="250px" height="150px">
		</div>
		<div class="col-8">
			<h2>${p.productname }</h2>
			<p>Price: <b>${p.price }</b></p>
			<p>Status: <b>${p.status }</b></p>
			<p>Description: <b>${p.description }</b></p>
			<p>Content: <b>${p.content }</b></p>
			<p>Discount: <b>${p.discount }</b></p>
			<p>Created: <b>${p.created }</b></p>
			<form method="post" action="index.html">
				<input type="hidden" value="${p.productid}" name="productid"  >
				<input type="number" name="quantity" value="1">
				<button class="btn btn-primary">Add to Cart</button>
			</form>
		</div>
	</c:forEach>
</div>