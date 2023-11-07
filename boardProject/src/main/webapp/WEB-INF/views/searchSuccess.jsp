<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>   
    
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>성공</title>
	
</head>
<body>
	<main>
            
            	<h2>회원정보</h2>

				<table border="1">
				
				<tr>
				
				<th>회원번호</th>
				
				<th>회원아이디</th>
				
				<th>회원이름</th>
				
				<th>회원나이</th>
				
				</tr>
				
				<c:forEach var="user" items="${userList}">
				
				<tr>
				
				<th>${user.userNo}</th>
				
				<th>${user.userId }</th>
				
				<th>${user.userName }</th>
				
				<th>${user.userAge }</th>
				
				</tr>
				
				</c:forEach>
				
				</table>

    </main>
	
	
</body>
</html>