<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Búsqueda</title>
</head>
<body>

<form action="/UserJSP/dispatcher" method="post">

	<input type="hidden"  name="option"  value="2" >
	<br>
	Introduzca un id de usuario: <input type="text" value="" name="id">
	<br>	
	<br>
	Introduzca un nombre de usuario: <input type="text" value="" name="name">
	<br>	
	<input type="submit" value="Buscar">
</form>

</body>
</html>