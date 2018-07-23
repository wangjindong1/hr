<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查看所有部门</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/hr.css">
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.7.2.js"></script>
<script type="text/javascript">
	$(function(){
		$(".delete").click(function(){
			var a = $(this);
			var id = a.parent().parent().children()[0].innerHTML;
			var flag = confirm("您确定要删除id为"+id+"的信息吗?");
			if(flag){
				var url = this.href;
				var args = {};
				$.post(url,args,function(data){
					if(data==="success"){
						var tr = a.parent().parent();
						tr.remove();
					}
				})
			}
			return false;
		})
	})
</script>
<style type="text/css">
	td{
		text-align:center;
	}
</style>
</head>
<body>
	<div class="center">
		<table border="2px" cellpadding="5px" cellspacing="0px" >
			<tr>
				<th>部门编号</th>
				<th>部门名称</th>
				<th>修改部门</th>
				<th>删除部门</th>
			</tr>
			<c:forEach items="${requestScope.departments}" var="department">
				<tr>
					<td>${department.id}</td>
					<td>${department.name}</td>
					<td><a class="update" href="${pageContext.request.contextPath}/manager/deptInput?id=${department.id}">修改</a></td>
					<td><a class="delete" href="${pageContext.request.contextPath}/manager/deleteDeptById?id=${department.id}">删除</a></td>
				</tr>				
			</c:forEach>
		</table>
	</div>
</body>
</html>