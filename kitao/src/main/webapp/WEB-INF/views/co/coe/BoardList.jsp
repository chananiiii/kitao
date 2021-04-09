<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<link href="<c:url value="/resources/css/common.css"/>" rel="stylesheet"> 
<link href="<c:url value="/resources/css/board.css" />" rel="stylesheet">

<!DOCTYPE html>
<html>
<head>
	<meta charset="EUC-KR">
	<title>Insert title here</title>
</head>
<body>
	<script>

	</script>
	<jsp:include page="/WEB-INF/views/co/coa/header.jsp"/>
	<table class="basic">
		<th> 작성자 </th>
		<th> 제목 </th>
		<th> 등록 일자</th>
	<c:forEach items="${list}" var="boardVO">
		<tr>
			<td>${boardVO.boardId}</td>
			<td>${boardVO.boardTitle}</td>
			<td>${boardVO.boardRegDtm}</td>
		</tr>
	</c:forEach>
	</table>
	<h1 id="heading">test</h1>
	<script type="text/javascript" src="<c:url value="/resources/js/board.js"/>"></script>
	
	<jsp:include page="/WEB-INF/views/co/coa/footer.jsp" />
</body>
</html>