<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="col-md-12">">
<div class="sidebar-title">Browse Products</div>
<div class="products">
	<c:forEach  items="${dsp }" var="p">
		<div class="col-lg-4">
			<div class="item">
				<img alt="${p.productname }" src="nongsan/image/${p.image }" width="150px" height="150px">
				<div class="info">
					<a href="detail.html?productId=${p.productid}">${p.productname }</a>
				</div>
			</div>					
		</div>
	</c:forEach>
	<div class="clear"></div>
</div>
</div>