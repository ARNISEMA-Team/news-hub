<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
	<head>
		<spring:url value="/resources/css/main.css" var="mainCss" />
		<spring:url value="/resources/js/main.js" var="mainJs" />

		<link href="${mainCss}" rel="stylesheet" />
		<script src="${mainJs}"></script>
	</head>
	<body>
		<h1>Message : ${message}</h1>
	</body>
</html>