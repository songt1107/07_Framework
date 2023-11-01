<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>   

<!DOCTYPE html>

<html>

<head>

	<meta charset="UTF-8">

	<title>테스트</title>

	<link rel="stylesheet" href="/resources/css/main-style.css">

	<script src="https://kit.fontawesome.com/e5fede6c09.js" crossorigin="anonymous"></script>

</head>

<body>

	<main>

        <h1>회원 정보 조회(아이디 검색)</h1>

		<form action="/selectUser">
		
			<input type="text" name="userId" placeholder="회원 아이디 입력">
			
			<button>조회</button>
		
		</form>

    </main>

</body>

</html>​