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
		<p>��ȣ : ${cw.boardId}</p>
		<p>��ȣ : ${cw.boardTitle}</p>
		<p>��ȣ : ${cw.boardContents}</p>
		<p>��ȣ : ${cw.boardRegDtm}</p>
		<br><br><br>
	</c:forEach>
</body>
</html>
