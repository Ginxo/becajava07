<%@ page import="com.everis.alicante.becajava.domain.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User info</title>
</head>
<body>

Información de mi usuario: 

<c:out value="${user.name}"></c:out>
<c:out value="${user.surname}"></c:out>
<c:out value="${reserva.bookingdate}"></c:out>

</body>
</html>