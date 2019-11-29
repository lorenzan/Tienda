<%@page import="Producto.Producto"%>
<%@page import="java.util.ArrayList"%>
<%@include file="../Top.jsp" %>

<%
    ///Instanciamos y recibimos lo enviado desde el servlet y lo convertimos en la lista de productos
    ArrayList<Producto> lstP = new ArrayList<Producto>();
    lstP = (ArrayList<Producto>) request.getAttribute("Productos");
%>

<!--Traemos los datos del producto dependiendo del id de subCategoria y enviamos el id del producto
para ver sus detalles
Ademas verificamos si la lista viene con datos o vacia-->
<%if (lstP.isEmpty()) {%>
<h2>No se encontraron Productos</h2>
<%} else {%>
<%for (int i = 0; i < lstP.size(); i++) {%>
<center>
    <!--En este formulario de forma escondida enviamos el id, para asi
    poder mostrar los detalles del producto actual-->
    <form method="get" action="./DetailProduct">
        <h3><%=lstP.get(i).getProducto()%></h3>
        <input type="hidden" name="idProducto" value="<%=lstP.get(i).getIdProducto()%>">
        <h3><button type="submit">Ver Detalles</button></h3>
        <img width="100px" height="80px" style="object-fit: cover" src="<%=lstP.get(i).getImg()%>">     
        <br/>
    </form>
</center>
<%}
    }%>
<!--Funcion de javascript que redirecciona a una pagina dependiendo del historial-->
<a href="javascript:window.history.go(-1)">Regresar</a>
<%@include file="../Down.jsp" %>
