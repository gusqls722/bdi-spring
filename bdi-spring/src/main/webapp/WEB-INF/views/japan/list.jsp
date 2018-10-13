<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<!doctype html>
<html>
<head>
	<meta charset="utf-8">
	<title>스프링테스트</title>

</head>
<script>
	var jpGrid;
	window.addEventListener('load',function(){
		jpGrid = new dhtmlXGridObject('divGrid');
		jpGrid.setImagePath('${resPath}/codebase/imgs/}');
		jpGrid.setHeader('jpnum,jpname,jpdesc',null]);
		jpGrid.init();
	})
</script>
<body>
	<div id="divGrid"></div>
</body>
</html>