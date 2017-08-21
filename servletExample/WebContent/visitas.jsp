
<% 
	int conSesion = 0;
	int conAplicacion = 0;

	if (session.getAttribute("contadorUno") != null)
		conSesion = (Integer)session.getAttribute("contadorUno");

	if (application.getAttribute("contadorDos") != null)
		conAplicacion = (Integer)application.getAttribute("contadorDos");
	
%>

<html>

<body>

<h1>Ejemplo de Ambitos y contadores</h1>

<hr />

<table border="0">
	<tr>
		<td>Numero de peticiones por sesion: <%=conSesion%></td>
	</tr>
	<tr>
		<td>Numero de peticiones por aplicacion: <%=conAplicacion%></td>
	</tr>
</table>

<form action="contador" method="POST">
	<input type="submit" value="Generar Peticion" />
</form>

</body>
</html>