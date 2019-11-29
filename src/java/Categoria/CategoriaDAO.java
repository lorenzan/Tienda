/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Categoria;

import Conexion.Database;
import Subcategorias.Subcategorias;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author the wicks
 */
public class CategoriaDAO implements CategoriaCRUD {

    ///Instanciamos un elemento de nuestra conexion
    private Database db;

    ///Decimos que en nuestro constructor vendra la conexion ya instanciada
    public CategoriaDAO() {
        this.db = new Database();
    }

    @Override
    public ArrayList<Categoria> TraerCategorias() {
        ///Inicializamos un arreglo donde guardaremos lo que la consulta nos traiga
        ArrayList<Categoria> list = new ArrayList<Categoria>();
        ///El puntero que recorrera la tabla con la consulta
        ResultSet rs = null;
        ///String de la consulta
        String sql = "Select * from Categorias;";
        try {
            ///Mandamos la consulta a la BD
            rs = this.db.excuteQuery(sql);
            ///si hay algo en rs que lo asgine
            while (rs.next()) {
                ///Instanciamos la Categoria para poderle definir datos
                Categoria cat = new Categoria();
                cat.setIdCategoria(rs.getInt("idCategoria"));
                cat.setCategoria(rs.getString("nombre"));
                list.add(cat);
            }
        } catch (Exception e) {
        }
        ///y que alfinal devuelva todo
        return list;
    }

    @Override
    public ArrayList<Subcategorias> TraerSubCategorias(int id) {
        ///Inicializamos un arreglo donde guardaremos lo que la consulta nos traiga
        ArrayList<Subcategorias> list = new ArrayList<Subcategorias>();
        ///El puntero que recorrera la tabla con la consulta
        ResultSet rs = null;
        ///String de la consulta
        String sql = "select * from subcategorias where idCategoria = " + id + ";";
        try {
            ///Mandamos la consulta a la BD
            rs = this.db.excuteQuery(sql);
            ///si hay algo en rs que lo asgine
            while (rs.next()) {
                ///Instanciamos la Categoria para poderle definir datos
                Subcategorias sub = new Subcategorias();
                sub.setIdSub(rs.getInt("idsubCategoria"));
                sub.setSubcategoria(rs.getString("nombre"));
                list.add(sub);
            }
        } catch (Exception e) {
        }
        ///y que alfinal devuelva todo
        return list;
    }

}
