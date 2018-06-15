<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
</head>
<body>
<h1>系统登录</h1>
<center>
<form action="" method ="post" name="form">
<br>用户名：<input type="text" name="username">
<br>密码：<input type="password" name="password">
<br><input type="submit" name="submit" value="登录">
<input type="reset" name="reset" value="取消">
</form>
</center>
<%String name = request.getParameter("user");
String password = request.getParameter("password");

if(name.equals("admin")&&(password.equals("password"))){
	response.sendRedirect("main.jsp");
}else{
	
	response.sendRedirect("login.jsp");
}%>
</body>
</html>