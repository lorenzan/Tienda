
<%@page import="Usuario.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/principal.css">

        <title>Tienda</title>
        <% ///Seteamos nuestra variable de sesion asignadosela a un objeto usuario
            Usuario user = (Usuario) session.getAttribute("Usuario");
            ///Con esta variable nos aseguramos que el puerto no tendra consecuencias en nuestro proyecto
            int port = request.getServerPort();
        %>
    </head>
    <body>
        <%--Navbar--%>
        <!--<h1>Tienda</h1>-->
        <header>
            <a href="http://localhost:<%=port%>/Tienda">
                <div class="contenedor" id="uno">
                    <img class="icon2" src="icon/LOGOnop.png">
                    <p class="texto">Inicio</p>
                </div></a>
            <a href="#"><div class="contenedor" id="dos">
                    <img class="icon" src="icon/preguntasF.png">
                    <p class="texto">Preguntas</p>
                </div></a>
            <a href="#"><div class="contenedor" id="tres">
                    <img class="icon" src="icon/contacto.png">
                    <p class="texto">Contacto</p>
                </div></a>
            <a href="http://localhost:<%=port%>/Tienda/Carrito/">
                <div class="contenedor" id="cuatro">
                    <img class="icon" src="icon/carrito.png">
                    <p class="texto">Carrito</p>
                </div></a>
                <%--Validamos si existe una sesion--%>
                <%if (session.getAttribute("Usuario") == null) {%>
            <a style="float: right; margin-right: 0px " href="http://localhost:<%=port%>/Tienda/Login/">
                <div class="contenedor" id="cinco">
                    <img class="icon" src="icon/iniciar.png">
                    <p class="texto">Iniciar Sesion</p></div></a>
            <a style="float: right; margin-right: 0px " href="http://localhost:<%=port%>/Tienda/Registro/" >
                <div class="contenedor" id="seis">
                    <img class="icon" src="icon/icon3.png">
                    <p class="texto">Registrarse</p></div></a>
                    <%} else {%>
                    <%--Si existe---%>
            <a style="float: right; margin-right: 0px " href="http://localhost:<%=port%>/Tienda/CerrarSesion">
                <div class="contenedor" id="siete">
                    <img class="icon" src="icon/icon3.png">
                    <p class="texto">Cerrar Sesion</p></div></a>
            <a style="float: right; margin-right: 0px " href="#">
                <div class="contenedor" id="ocho">
                    <img class="icon" src="icon/icon3.png">
                    <p class="texto"><%=user.getNombre()%></p></div></a>

            <%}%>
        </header>
        <br/>
        <br/>