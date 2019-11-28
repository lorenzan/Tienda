<%@page import="Categoria.GetCategorias"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Categoria.Categoria"%>
<%@include file="Top.jsp" %>
<%
    ///Creamos una lista de categorias, la cual recibiran las categorias de la BD
    ArrayList<Categoria> cat = new ArrayList<Categoria>();
    GetCategorias traer = new GetCategorias();

    ///Las asignamos mediante el metodo de la clase GetCategorias
    cat = traer.getAllCategorias();
%>
<!--Recorremos la lista de las Categorias-->
<%for (int i = 0; i < cat.size(); i++) {%>
<!--Enviamos el id para mostrar las subcategorias -->
<center>
    <form method="get" action="<%=request.getContextPath()%>/Category">
        <input type="hidden" name="Categoria" value="<%=cat.get(i).getIdCategoria()%>">
        <button type="submit"><%=cat.get(i).getCategoria()%></button>
    </form>
</center>
<br>
<br>
<%}%>
<%@include file="Down.jsp" %>
