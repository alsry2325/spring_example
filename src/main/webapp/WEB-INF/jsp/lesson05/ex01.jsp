<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>1.변수 정의하기 (c:set)</h2>

	<c:set var="number1">100</c:set>
	<c:set var="number2" value="200"/>
	number1: ${number1}<br>
	number2: ${number2}<br>
	number1+number2 : ${number1 + number2}
	
	<h2>2.변수 출력하기 (c:set)</h2>
	number1:<c:out value="${number1}"></c:out><br>
	<c:out value="hellow world!!"></c:out><br>
	<%--글자그대로 출력 --%>
	<c:out value="<script>alert('얼럿창 띄우기') </script>"></c:out><br>
	<c:out value="<script>alert('얼럿창 띄우기')</script>" escapeXml="true"/><br>
	<%--스크립트  출력 --%>
	<%-- <c:out value="<script>alert('얼럿창 띄우기') </script>" escescapeXml="false"></c:out><br> --%>
	
	<h2>3.조건문 (c:if)</h2>
	<c:if test="${number1 >50}"/>
	number1은 50보다 크다.<br>
	<c:if test="${number1 == 100}"/>
	number1은 100이다<br>
	<c:if test="${number1 eq 100}"/>
	number1은 100이다.<br>
	
 	
</body>
</html>