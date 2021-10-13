<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div class="maincontent-area">
	<div class="container">
		<div class="col-md-12">
		<h2 class="font">Latest Products New</h2>
			<c:forEach  items="${dsPrice }" var="p">
				<div class="col-lg-4">
					<div class="item">
					<img alt="${p.productname }" src="nongsan/image/${p.image }" width="150px" height="150px"> 
						<div class="info">
							<a href="index.html?productId=${p.productid}">${p.productname }</a>
						</div>
					</div>
				</div>
			</c:forEach>
		</div>
	</div>
</div>
</body>
