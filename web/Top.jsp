<%-- 
    Document   : index
    Created on : 24-nov-2019, 11:52:16
    Author     : César
--%>

<%@page import="Usuario.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tienda</title>
        <% ///Seteamos nuestra variable de sesion asignadosela a un objeto usuario
            Usuario user = (Usuario) session.getAttribute("Usuario");
            ///Con esta variable nos aseguramos que el puerto no tendra consecuencias 
                ///en nuestro proyecto
            int port = request.getServerPort();
        %>
    </head>
    <body>
        <%--Navbar--%>
        <h1>Tienda</h1>
        <a href="http://localhost:<%=port%>/Tienda">Inicio</a>
        <a href="#">Preguntas Frecuentes</a>
        <a href="#">Contacto</a>
        <a href="http://localhost:<%=port%>/Tienda/Carrito/">Carrito de Compras</a>
        <%--Validamos si existe una sesion--%>
        <%if (session.getAttribute("Usuario") == null) {%>
        <a style="float: right; margin-right: 10px " href="http://localhost:<%=port%>/Tienda/Login/">Iniciar Sesion</a>
        <a style="float: right; margin-right: 10px " href="http://localhost:<%=port%>/Tienda/Registro/" >Registrarse</a>
        <%} else {%>
        <%--Si existe---%>
        <a style="float: right; margin-right: 10px " href="http://localhost:<%=port%>/Tienda/CerrarSesion">Cerrar Sesion</a>
        <a style="float: right; margin-right: 10px " href="#"><%=user.getNombre()%></a>

        <%}%>
        <hr/>
        <br/>
        <br/>

