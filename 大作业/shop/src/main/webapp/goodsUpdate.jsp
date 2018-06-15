<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>GoodsUpdate</title>
</head>
<body>
<form action="/com.ty.ssm/goods/updateGoods/${goods['id']}">
	编号<input type="text" name="id" value="${goods['id']}">
	商品名称<input type="text" name="name" value="${goods['name']}">
	价格<input type="text" name="price" value="${goods['price']}">
	类别名称<input type="text" name="type" value="${goods['type']}">
	商品库存<input type="text" name="amount" value="${goods['amount']}">
	<input type="submit" value="提交">

</form>
</body>
</html>