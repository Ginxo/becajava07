<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Inserción</title>
</head>
<body>


<form action="/UserJSP/dispatcher" method="post">
	<br>
	Introduzca un nombre: <input type="text" value="" name="name">
	<br>
	Introduzca un apellido: <input type="text" value="" name="surname">
	<br>
	<input type="submit" value="Dar de Alta">
	
	<input type="hidden"  name="option"  value="1" >
	
</form>

</body>
</html>