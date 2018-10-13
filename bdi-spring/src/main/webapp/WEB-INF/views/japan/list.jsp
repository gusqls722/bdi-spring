<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"   uri="http://java.sun.com/jsp/jstl/core" %>

<!doctype html>
<html>
<head>
	<meta charset="utf-8">
	<title>스프링테스트</title>
	<style>
		a{
			color:black;
			text-decoration: none;
		}
	</style>
</head>
<body>
<table border="1">
	<thead>
		<tr>
			<th>번호</th>
			<th>이름</th>
			<th>주석</th>
		</tr>	
	</thead>
	<tbody>
		<c:forEach items="${jList}" var="j">
			<tr>
				<td><a href="/japans/${j.jpnum}">${j.jpnum}</a></td>
				<td>${j.jpname}</td>
				<td>${j.jpdesc}</td>
			</tr>
		</c:forEach>
	
	</tbody>
</table>
</body>
</html>