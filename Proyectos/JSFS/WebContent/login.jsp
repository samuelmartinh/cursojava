<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<f:view>
<h:form id="formularioLogin">
<table aling="center">
<tr>
<td colspan="2" style="font-weight: bold; size: 20px">Ingresa usuario y contraseña</td>
</tr>
<tr>
<td style="font-weight: bold; size: 12px; color: blue;">Usuario : </td>
<td><h:inputText value="#{loginBean.user}"/></td>
</tr>
<tr>
<td style="font-weight: bold; size: 12px; color: blue;">Password : </td>
<td><h:inputSecret value="#{loginBean.password}"/></td>
</tr>
<tr>
<td><input type="button" value="Cancelar"></td>
<td><h:commandButton value="Aceptar" action="#{loginBean.validarLogin}" /></td>
</tr>
</table>
</h:form>
</f:view>
</body>
</html>