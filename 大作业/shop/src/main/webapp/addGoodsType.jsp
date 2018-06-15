<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>AddGoodsType</title>
</head>
<body>
<form action="/shop/goods/addGoods">
	编号:<input type="text" name="id">
	商品名称:<input type="text" name="name">
	价格:<input type="text" name="price">
	类别名称:<input type="text" name="type">
	商品库存:<input type="text" name="amount">
	<input type="submit" value="提交">
</form>
</body>
</html>