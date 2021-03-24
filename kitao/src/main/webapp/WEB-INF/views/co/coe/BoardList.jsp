<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<c:forEach items="${list}" var="boardVO">
		<h1>${boardVO.id}</h1>
		<h1>${boardVO.contents}</h1>
	</c:forEach>
	<h1> ssdd </h1>
</body>
</html>