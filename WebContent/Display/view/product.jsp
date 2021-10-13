<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="page-header">
<div class="product">
	<c:forEach  items="${dsp }" var="p">
	
	<div class="col-lg-4">
			<div class="item">
			<img alt="${p.productname }" src="nongsan/image/${p.image }" width="350px" height="350px"> 
				<div class="info">
					<a href="detail.html?productId=${p.productid}">${p.productname }</a>
				</div>
			</div>
			</div>
	</c:forEach>
</div>
</div>
<ul class="pagination">
	<c:forEach begin="1" end="${tongSoTrang }"  var="trang">
		<li class="page-item">
			<a class="page-link" href="product.html?trang=${trang }">${trang }</a>
		</li>
	</c:forEach>
</ul>