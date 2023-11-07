<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>   

<!DOCTYPE html>

<html>

<head>

	<meta charset="UTF-8">

	<title>회원 정보 조회</title>

</head>

<body>

	<main>

        <h1>회원 정보 조회(회원 번호 검색)</h1>

		<form action="/selectUser">
		
			<input type="text" name="userNo" placeholder="회원 번호 입력">
			
			<button>조회</button>
		
		</form>

    </main>

</body>

</html>​