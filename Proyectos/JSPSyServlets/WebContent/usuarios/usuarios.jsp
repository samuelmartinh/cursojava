<%@page import="java.util.List"%>
<%@page import="com.javarevolutions.jsps.servlets.vo.VOLogin"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script>
function guardar(){
	var forma = document.getElementById("formaUsuario");
	forma.action = "adminUsuarios.servlet";
	var accion = document.getElementById("accion");
	accion.value = "guardar";
	forma.submit();
} 

function actualizar(){
	var forma = document.getElementById("formaUsuario");
	forma.action = "adminUsuarios.servlet";
	var accion = document.getElementById("accion");
	accion.value = "actualizar";
	forma.submit();
} 

function borrar(){
	var forma = document.getElementById("formaUsuario");
	forma.action = "adminUsuarios.servlet";
	var accion = document.getElementById("accion");
	accion.value = "borrar";
	forma.submit();
} 

function carga(){
	var control = document.getElementById("usuario");
	control.focus();
}
</script>
</head>
<body onload="carga()">
<form action="" method="POST" id="formaUsuario">
<center>
<input type="hidden" name="accion" id="accion"/>

<p>Bienvenido al sistema de JSPS y Servlets : <%= ((VOLogin)session.getAttribute("usuarioLogueado")).getNombre() %></p>

<table aling="center">

<tr>
<td style="font-weight: bold; size: 12px; color: blue;">Usuario : </td>
<td><input type="text" name="usuario" id="usuario"></td>
</tr>
<tr>
<td style="font-weight: bold; size: 12px; color: blue;">Password : </td>
<td><input type="password" name="password" id="password"></td>
</tr>
<tr>
<td style="font-weight: bold; size: 12px; color: blue;">Nombre(s) : </td>
<td><input type="text" name="nombre" id="nombre"></td>
</tr>
<tr>
<td style="font-weight: bold; size: 12px; color: blue;">Edad : </td>
<td><input type="text" name="edad" id="edad"></td>
</tr>
<tr>
<td colspan="2">
<input type="button" value="Guardar" onclick="guardar()">
<input type="button" value="Actualizar" onclick="actualizar()">
<input type="button" value="Eliminar" onclick="borrar()"></td>
</tr>
</table>
<table border="1">
<tr>
<th>Usuario</th><th>Nombre(s)</th><th>Edad</th>
</tr>
<%
List<VOLogin> lista = (List<VOLogin>)session.getAttribute("listaUsuario");
for(VOLogin obj : lista){
%>
	<tr>
		<td><%= obj.getUsuario() %></td>
		<td><%= obj.getNombre() %></td>
		<td><%= obj.getEdad() %></td>
	</tr>
<%
}
%>
</table>
</form>
</center>
</body>
</html>