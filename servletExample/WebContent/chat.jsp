<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CHAT</title>
</head>
<body>

<form action="/servletExample/chat" method="get">

<% 
	ArrayList mensajes= (ArrayList)getServletContext().getAttribute("mensajes");
	
	if(mensajes!=null){

		for(int i=0;i<mensajes.size();i++){
			
			response.getWriter().write(mensajes.get(i).toString());
			
		}
	}
%>

</br>
</br>
</br>


	Mensaje : <input type="text" value="" name="mensaje" size="50"> <input type="submit" value="Enviar" />

</form>


</body>
</html>