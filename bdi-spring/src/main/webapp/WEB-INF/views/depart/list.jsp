<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<!doctype html>
<html>
<head>
	<meta charset="utf-8">
	<title>스프링테스트</title>
<link rel="stylesheet" type="text/css" href="${resPath}/dhtmlx/skins/skyblue/dhtmlx.css">
</head>
<script>
	var diGrid;
	window.addEventListener('load',function(){
		diGrid = new dhtmlXGridObject('divGrid');
		diGrid.setImagePath('${resPath}/dhtmlx/skins/skyblue/imgs/dhxgrid_skyblue/');
		diGrid.setHeader('번호,이름,주석,dicnt');			// 보여지는 말그대로 헤더
		diGrid.setColumnIds('dino,diname,didesc,dicnt');	// 헤더가 겉값이라면 이것은 안에서 사용할 값
		diGrid.setColAlign('center,center,center,center');	// 정렬
		diGrid.setColTypes('ro,ed,ed,ro');				// ro=read only (읽기만 가능)
		diGrid.setColSorting('int,str,str,int');		// int 정렬 str정렬
		diGrid.init();
		au.send({url:'/departs',success:function(res){
			res= JSON.parse(res);
			diGrid.parse(res,'js');
		}})
	})
</script>
<body>
<h2>디파트 리스트입니다</h2>
	<div id="divGrid" style="width:500px; height:350px; background-color:white;"></div>
</body>
</html>