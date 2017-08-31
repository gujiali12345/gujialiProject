<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="/springmvc/ttt/saveTeachers">
姓名:<input type="text" name="name"><br>
性别:<input type="radio" name="sex" value="m">m
<input type="radio" name="sex" value="f"> f<br>
学历:<input type="text" name="degree"><br>
更新时间:<input type="date" name="update_date"><br>
组织机构:<select name="oid">
<option value="-1">请选择</option>
<c:forEach items="${list}" var="org">
<option value="${org.id }">${org.oname}</option>
</c:forEach>
</select>
<br>
<input type="submit" value="提交">
</form>
</body>
</html>