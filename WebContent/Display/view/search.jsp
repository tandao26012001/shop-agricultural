<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div class="form-search">
		<c:if test="${soluong > 0 }">
			<h3>Có ${soluong} sản phẩm được tìm thấy</h3>
			<c:forEach var="p" items="${search }">
				<div class="col-lg-4">
					<div class="item">
						<img alt="${p.productname }" src="nongsan/image/${p.image }" width="250px" height="250px"> 
						<div class="info">
							<a href="detail.html?productId=${p.productid}">${p.productname }</a>
						</div>
					</div>
				</div>
			</c:forEach>
		</c:if>
</div>
		<div class="clear">
		</div>