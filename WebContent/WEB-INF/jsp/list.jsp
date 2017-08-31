<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="">
 <a href="/springmvc/ttt/addTeachers">添加员工</a>
     <a href="/springmvc/ttt/addOrg">添加组织机构</a>
	<table width="800" cellspacing="1" border="1">
	<tr>
	<th>编号</th>
	<th>姓名</th>
	<th>性别</th>
	<th>学历</th>
	<th>更新时间</th>
	<th>组织</th>
	<th>操作</th>
	</tr>
	<c:forEach items="${list }" var="te" varStatus="s">
	<tr>
	<td>${s.index+1}</td>
	<td>${te.name }</td>
	<td>${te.sex }</td>
	<td>${te.degree }</td>
	<td>${te.update_date }</td>
	<td>${te.org.oname}</td>
	<td>
	<a href="/springmvc/ttt/bfupdate/${te.id }">修改</a> |<a href="/springmvc/ttt/delete/${te.id }">删除</a>
	</td>
	</tr>
	</c:forEach>
	</table>
</form>
</body>
</html>