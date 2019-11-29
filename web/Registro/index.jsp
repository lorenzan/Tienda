<%-- 
    Document   : index
    Created on : 24-nov-2019, 12:01:41
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link rel="stylesheet" href="../css/loginStyle.css">
        <title>Registro</title>
    </head>
    <body>
        <div class="login-box">
        <h1>Registrarse</h1>
        <form action="../Registrarse" method="POST" >
            <label>Nombre de Usuario:</label>
            <input type="text" name="txtName" required>
            <br>
            <br>
            <label>Numero de Telefono:</label>
            <input type="text" name="txtNumber" required>
            <br>
            <br>
            <label>Correo Electronico:</label>
            <input type="text" name="txtEmail" required>
            <br>
            <br>
            <label>Password:</label>
            <input type="password" name="txtPass" required>
            <br>
            <br>
            <button type="submit">Registrarse</button>
        </form>
        <a href="../Login/">Ya tienes cuenta? Inicia Sesion</a>
        <br>
        <br>
        <a href="../index.jsp">Ir al Inicio</a>
        </div>
    </body>
</html>
