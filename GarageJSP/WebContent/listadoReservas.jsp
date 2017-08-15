<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@page import="java.util.*" %>
<%@page import="com.everis.alicante.becajava.domain.*" %>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>GARAGE MANAGMENT APP</title>
</head>
<body>
	
	LISTA DE RESERVAS </br>
	 
	<%	List<Booking> reservas = (List) request.getAttribute("reservas");
	
	 	out.println("<br/>");
		for(Booking reserva: reservas){
	    	out.println(reserva + "<br/>");
	    }
    
     %>

	<table border="true">
	  <% out.println("<br/>");
	 	
		out.print("<tr>");
		for(Booking reserva: reservas){
		
	    	out.println("<td>"+reserva  + "</td>");
	    }
		out.print("</tr>");
		
		%>
	</table>
	
	<!-- Ahora con taglibs --> 
	
	</br>
	</br>
	
	<div>
	
	<c:forEach items="${reservas}" var="plaza">
	
		<c:out value="${reservas}"></c:out>
		</br>
	
	</c:forEach>
	
	</div>
	
</body>
</html>