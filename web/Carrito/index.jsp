<%@page import="Producto.Producto"%>
<%@page import="Producto.ProductoDAO"%>
<%@page import="Articulo.Articulo"%>
<%@page import="java.util.ArrayList"%>
<%@include file="../Top.jsp" %>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       <link rel="stylesheet" href="../css/filtro.css">
    </head>
<%
    ///Instanciamos nuestra variable de sesion
    HttpSession sesion = request.getSession(true);
    ///Y le asignamos el Atributo que traemos desde nuestro Servlet
    ArrayList<Articulo> Articulos = sesion.getAttribute("carrito") == null ? null : (ArrayList) sesion.getAttribute("carrito");

%>




<%///Instanciamos nuestro DAO que este sera el que nos provea el metodo para buscar un producto individualmente
    ProductoDAO dao = new ProductoDAO();
    double total = 0;
    ///Verificamos si nuestra lista trae algo
    if (Articulos != null) {
        ///Recorremos nuestra lista con un For 
        for (Articulo a : Articulos) {
            ///Asignamos el producto con su id gracias a que mediante el ciclo obtenemos el id de ese Articulo
            Producto p = dao.LeerProducto(a.getIdArticulo());
            ///El total que viene de toda la cantidad de los articulos por el precio de los productos
            ///que el id de la lista articulos nos trae el articulo
            total += a.getCantidad() * p.getPrecio();
%>

<center>
    <div class="caja">
    <form method="get" action="../DeleteCart">
        <input type="hidden" name="idCarrito" value="<%=p.getIdProducto()%>">
        <strong><%=p.getProducto()%></strong>
        <p><%=p.getDescripcion()%></p>
        <!--Encontramos el total de un producto multiplicando su precio por la cantidad que el Articulo nos provee-->
        <p>Precio Total : $<%= Math.round(p.getPrecio() * a.getCantidad())%></p>
        <p>Cantidad : <%=a.getCantidad()%></p>
        <img  width="75px" height="50px "src="<%=p.getImg()%>">
        <button class="button2" type="submit">Eliminar del Carrito</button>
    </form>
        </div>
   
</center>
        
<br/>

<%}///Hacemos una validacion si el Carrito de Compras viene vacio%>
<center><h3>Total de la Compra $<%=total%></h3></center>
    <%} else {%>
<h3>Carrito de Compras Vacio...</h3>
<%}%>




<a href="javascript:window.history.go(-2)">Seguir Comprando</a>

<%@include file="../Down.jsp" %>
