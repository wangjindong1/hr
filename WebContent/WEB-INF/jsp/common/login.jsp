<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录页面</title>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/hr.css">
</head>
<body>
	<div class="center">
	    <form action="${pageContext.request.contextPath}/user/login" method="post">
		        用户名：<input type="text" name="name" required="required"/>
		        <br><br>
		        密&emsp;码：<input type="password" name="password" required="required"/>
		        <br><br>
		        &emsp;&emsp;&emsp;&emsp;&emsp;
		        <input type="submit" value="登陆">
	    </form>
	</div>
</body>
</html>