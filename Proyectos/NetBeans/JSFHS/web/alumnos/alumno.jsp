<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Insert title here</title>
    </head>
    <body>
        <f:view>
            <h:form>

                Welcome :  <h:outputLabel value="#{loginBean.nombre }" />

                <table aling="center">

                    <tr>
                        <td style="font-weight: bold; size: 12px; color: blue;">Matricula
                            :</td>
                        <td><h:inputText value="#{alumnoBean.matricula}" /></td>
                    </tr>
                    <tr>
                        <td style="font-weight: bold; size: 12px; color: blue;">Nombre(s)
                            :</td>
                        <td><h:inputText value="#{alumnoBean.nombre}" /></td>
                    </tr>
                    <tr>
                        <td style="font-weight: bold; size: 12px; color: blue;">Apellido Paterno
                            :</td>
                        <td><h:inputText value="#{alumnoBean.app}" /></td>
                    </tr>
                    <tr>
                        <td style="font-weight: bold; size: 12px; color: blue;">Apellido Materno
                            :</td>
                        <td><h:inputText value="#{alumnoBean.apm}" /></td>
                    </tr>
                    <tr>
                        <td style="font-weight: bold; size: 12px; color: blue;">Sexo
                            :</td>
                        <td>
                            <h:selectOneMenu id="sexos" value="#{alumnoBean.sexo}">
                                <f:selectItem itemLabel="Masculino" itemValue="H"></f:selectItem>
                                <f:selectItem itemLabel="Femenino" itemValue="F"></f:selectItem>
                            </h:selectOneMenu>
                        </td>
                    </tr>
                    <tr>
                        <td style="font-weight: bold; size: 12px; color: blue;">Edad :
                        </td>
                        <td><h:inputText value="#{alumnoBean.edad}" /></td>
                    </tr>
                    <tr>
                        <td style="font-weight: bold; size: 12px; color: blue;">Usuario :
                        </td>
                        <td><h:inputText value="#{alumnoBean.usuario}" /></td>
                    </tr>
                    <tr>
                        <td colspan="2"><h:commandButton value="Guardar"
                                         action="#{alumnoBean.insert }" /> <h:commandButton
                                         value="Actualizar" action="#{alumnoBean.update }" /> <h:commandButton
                                         value="Eliminar" action="#{alumnoBean.delete }" /></td>
                    </tr>
                </table>

                <h:dataTable id="tablaAlumnos" value="#{alumnoBean.lista}"
                             var="obj">

                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="Matricula"></h:outputText>
                        </f:facet>
                        <h:outputText value="#{obj.matricula}"></h:outputText>
                    </h:column>

                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="Nombre completo"></h:outputText>
                        </f:facet>
                        <h:outputText value="#{obj.nombre}"/><h:outputText value="#{obj.app}"/><h:outputText value="#{obj.apm}"/>
                    </h:column>

                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="Edad"></h:outputText>
                        </f:facet>
                        <h:outputText value="#{obj.edad}"></h:outputText>
                    </h:column>

                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="Sexo"></h:outputText>
                        </f:facet>
                        <h:outputText value="#{obj.sexo}"></h:outputText>
                    </h:column>

                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="Usuario"></h:outputText>
                        </f:facet>
                        <h:outputText value="#{obj.usuario}"></h:outputText>
                    </h:column>

                </h:dataTable>

            </h:form>
        </f:view>
    </body>
</html>