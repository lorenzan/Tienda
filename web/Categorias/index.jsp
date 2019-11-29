<%@page import="Subcategorias.Subcategorias"%>
<%@page import="java.util.ArrayList"%>
<%@include file="../Top.jsp" %>

<%
    ///La lista que recibira lo que estamos mandando desde el servlet
    ArrayList<Subcategorias> list = new ArrayList<Subcategorias>();
    //la asignacion y conversion ya que el request trae objetos
    //y hay que convertirlo a lo que queremos
    list = (ArrayList<Subcategorias>) request.getAttribute("SubsList");
%>
<h2>SUBCATEGORIAS</h2>
<!--Recorremos la lista y mostramos las subcategorias-->
<%for (int i = 0; i < list.size(); i++) {%>
<center>
    <form method="get" action="./Productos">
        <!--Enviamos el id de la subCategoria-->
        <input type="hidden" name="idsub" value="<%=list.get(i).getIdSub()%>">
        <label><%=list.get(i).getSubcategoria()%></label><br>
        <button type="submit">Ver Productos</button>
    </form>
    <br>
    <br>
</center>
<%}%>
<a href="./index.jsp">Regresar al Inicio</a>



<%@include file="../Down.jsp" %>
