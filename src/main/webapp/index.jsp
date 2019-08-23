<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
					  "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Main Page</title>
</head>
<body>
<center>
	<h1>게시판 프로그램</h1>
	<h1>123</h1>
	<hr>
		<c:forEach items="${boardList }" var="board">	
			${board.seq }
		</c:forEach>
	<hr>		
		<c:forEach var="option" items="${conditonMap }" >
			${option.key }
		</c:forEach>
	<hr>
	<hr>
		<a href="login.do">로그인</a><br><br><br>
		<a href="getBoardList.do">글 목록 바로가기</a>
	<hr>
</center>

</body>
</html>