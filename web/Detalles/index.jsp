<%@page import="Producto.Producto"%>
<%@include file="../Top.jsp" %>

<%  //Instanciamos el producto que asignaremos con el atributo traido del servlet
    Producto p = new Producto();
    p = (Producto) request.getAttribute("Producto");
%>

<center>
    <form method="get" action="./Carrito">
        <h2><%=p.getProducto()%></h2>
        <img width="250px" height="180px" src="<%=p.getImg()%>">
        <h2><%=p.getDescripcion()%></h2>
        <h2>$<%=p.getPrecio()%></h2>
        <input type="number" name="cantidad" value="1">
        <input type="hidden" name="idP" value="<%=p.getIdProducto()%>">
        <!--El usuario debe de estar Logueado para poder añadir Productos al Carrito-->
        <%if (session.getAttribute("Usuario") == null) {%>
        <p>Para Agregar Productos al Carrito debes de iniciar Sesion o Crear una Cuenta</p>
        <a href="./Login/">Haz Click Aqui para hacerlo</a>
           <!--Y si tiene cuenta puede Agregar-->
        <%} else {%>
        <button type="submit">Agregar al Carrito</button>
        <%}%>
    </form>



</center>
<br/>
<a href="javascript:window.history.go(-1)">Regresar</a>




<%@include file="../Down.jsp" %>
