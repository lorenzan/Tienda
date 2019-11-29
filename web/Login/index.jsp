

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="../css/loginStyle.css">
        <title>Login</title>
    </head>
    <body>
        <div class="login-box">
            <h1>Iniciar Sesion</h1>
            <form method="post" action="../Validar">
                <label>Usuario:</label>
                <input type="text" placeholder="Introduzca su correo" name="User" required>
                <br>
                <br>
                <label>Contraseña:</label> 
                <input type="password" placeholder="Introduzca su contraseña" name="Pass" required>
                <br>
                <br>
                <button type="submit">Iniciar Sesion</button>    
                <br>
                <br>
            </form>

            <a href="../Registro/">Primera vez? Haz Click aqui para registrarte</a>
            <br>
            <br>
            <a href="../index.jsp">Ir al Inicio</a>
        </div>
    </body>
</html>
