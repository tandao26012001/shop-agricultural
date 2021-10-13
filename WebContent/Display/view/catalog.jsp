<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="category">
			<div class="item">
				<c:forEach items="${dssub }" var="j">
						<li><a href="browser.html?categoryId=${j.catalogid}">${j.catalogname}</a></li>
				</c:forEach>
			</div>
</div>