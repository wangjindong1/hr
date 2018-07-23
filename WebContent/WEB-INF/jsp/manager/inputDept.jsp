<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>部门提交页面</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/hr.css">
</head>
<body>
	<div class="center">
		<form action="${pageContext.request.contextPath}/manager/insertDept" method="post">
			<c:if test="${requestScope.department != null}">
				<input type="hidden" value="${requestScope.department.id}" name="id">
			</c:if>
			请添加部门：
			<c:if test="${requestScope.department != null}">
				<input type="text" name="name" required="required" value="${requestScope.department.name}">
			</c:if>
			<c:if test="${requestScope.department == null}">
				<input type="text" name="name" required="required" value="${requestScope.department.name}">
			</c:if>
			<br><br>
			<input type="submit" value="提交">
		</form>
	</div>
</body>
</html>