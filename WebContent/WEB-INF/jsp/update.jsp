<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<center>
        
   <form action="/springmvc/ttt/update" method="post" >  
          
         姓名:<input type="text" name="name" value="${teachers.name}"><br>

         性别:<input type="radio" name="sex"  value="m"  ${teachers.sex eq 'm'?"checked":"" }  >男&nbsp;
         <input type="radio" name="sex" value="f"  ${teachers.sex eq 'f'?"checked":"" }  >女    <br/>
        学历:<input type="text" name="degree" value="${teachers.degree}"><br>
        更新时间:<input type="date" name="update_date" value="${teachers.update_date }"><br> 
        部门:<select id="oid"> 
        <c:forEach items="${list}"  var="org">
          <option value="${org.id }">${org.oname }</option>
       </c:forEach>
        </select>
        <br> 
        
        <input type="submit" value="提交">
         </form>
      </center>
</body>
</html>