<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
	<h1>${serverTime}</h1>
	<c:forEach var="cw" items="${boardVO}">
		<p>번호 : ${cw.boardId}</p>
		<p>번호 : ${cw.boardTitle}</p>
		<p>번호 : ${cw.boardContents}</p>
		<p>번호 : ${cw.boardRegDtm}</p>
		<br><br><br>
	</c:forEach>
</body>
</html>
