<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>GoodsTypeShow</title>
</head>
<body>
<table width="100%" border=1>

	<tr>
		<th>编号</th>
		<th>商品名称</th>
	</tr>
	<c:forEach items=${goodsTypeList} var="goodsType">
	<tr>	
		<td>${goodsType["id_type"] }</td>
		<td>${goodsType["name_type"] }</td>
		<td><a href="/com.ty.ssm/goods/updateType/${goodsType['id_type'] }">修改</a>  <a href="/com.ty.ssm/goodsType/deleteType/${goodsType['id_type'] }">删除</a></td>
	</tr>
	</c:forEach>
</table>
</body>
</html>