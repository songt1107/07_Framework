<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<<<<<<< HEAD
<meta charset="UTF-8">
<title>로그인 테스트</title>
</head>
	
	<body>
		
		<c:if test="${empty loginMember}">
		
		<form action="login2" method="post">
		
		<label> ID : </label> <input type="text" name="memberId"> <br>
		
		<label> PWD : </label> <input type="password" name="memberPwd"> <br>
		
		<button>로그인</button>
=======

	<meta charset="UTF-8">

	<title>회원 정보 조회</title>

</head>

<body>

	<main>

        <h1>회원 정보 조회(회원 번호 검색)</h1>

		<form action="/selectUser">
		
			<input type="text" name="userNo" placeholder="회원 번호 입력">
			
			<button>조회</button>
>>>>>>> c74b07839f05036bdd7fab7fe482154d429721b5
		
		</form>
		
		</c:if>
		
		<c:if test="${!empty loginMember}">
		
		<h3>${loginMember.memberName} 님 환영합니다.</h3>
		
		</c:if>
		
	</body>

</html>