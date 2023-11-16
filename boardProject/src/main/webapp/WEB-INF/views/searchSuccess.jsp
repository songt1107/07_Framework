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
            
            	<h2>학생정보</h2>

				<table border="1">
				
				<tr>
				
				<th>학생번호</th>
				
				<th>학생이름</th>
				
				<th>국어점수</th>
				
				<th>영어점수</th>
				
				<th>수학점수</th>
				
				</tr>
				
				<c:forEach var="student" items="${studentList}">
				
				<tr>
				
				<th>${student.studentNumber}</th>
				
				<th>${student.studentName }</th>
				
				<th>${student.koreanScore}</th>
				
				<th>${student.englishScore}</th>

				<th>${student.mathScore}</th>
				
				</tr>
				
				</c:forEach>
				
				</table>

    </main>
	
	
</body>
</html>