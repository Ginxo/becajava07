<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Calculadora</title>
</head>
<body>

<form method="post" action="/servletExample/calculadora">

	Introduzca el numero 1 : <input type="text" name="VALOR1">
	<br>
	Introduzca el numero 2 : <input type="text" name="VALOR2">
	<br>
	Resultado : <input type="text" name="RESULTADO" value="<%=request.getAttribute("resultado")%>">
	<input type="submit" value="SUMA">
</form>

</body>
</html>