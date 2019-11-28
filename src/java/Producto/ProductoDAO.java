/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Producto;

import Conexion.Database;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author César
 */
public class ProductoDAO implements ProductoCRUD {

    private Database data;

    public ProductoDAO() {
        ///Instanciamos la conexion que nos servira para traer usuarios
        this.data = new Database();
    }

    @Override
    ///Metodo que nos traera todos los productos
    public ArrayList<Producto> TraerProductos() {
        ///Creamos el arreglo donde guardaremos los resultados
        ArrayList<Producto> List = new ArrayList<Producto>();
        ResultSet rs = null;
        ///String de nuestra consulta
        String sql = "Select * from Productos;";
        try {
            ///Realizamos la consulta
            rs = this.data.excuteQuery(sql);
            while (rs.next()) {
                ///Recorremos la tabla y asignamos a un nuevo producto para que agregue a la lista
                Producto p = new Producto();
                p.setIdProducto(rs.getInt("idProducto"));
                p.setProducto(rs.getString("nombre"));
                p.setPrecio(rs.getDouble("precio"));
                p.setDescripcion(rs.getString("Descripcion"));
                p.setImg(rs.getString("Img"));
                List.add(p);
            }

        } catch (Exception e) {
        }
        return List;
    }

    @Override
    public ArrayList<Producto> ProductosCat(int id) {
        ///Creamos el arreglo donde guardaremos los resultados
        ArrayList<Producto> List = new ArrayList<Producto>();
        ResultSet rs = null;
        ///String de nuestra consulta pero esta vez validando si el id de subcategoria se asigna
        String sql = "Select * from Productos where idSubCategoria = " + id + "";
        try {
            ///Realizamos la consulta
            rs = this.data.excuteQuery(sql);
            while (rs.next()) {
                ///Recorremos la tabla y asignamos a un nuevo producto para que agregue a la lista
                Producto p = new Producto();
                p.setIdProducto(rs.getInt("idProducto"));
                p.setProducto(rs.getString("nombre"));
                p.setPrecio(rs.getDouble("precio"));
                p.setDescripcion(rs.getString("Descripcion"));
                p.setImg(rs.getString("Img"));
                List.add(p);
            }

        } catch (Exception e) {
        }
        return List;
    }

    ///Este metodo busca entre los articulos su id para asi solo devolver uno
    @Override
    public Producto LeerProducto(int id) {
        Producto p = new Producto();
        ResultSet rs = null;///Recibimos el parametro id para asi ir a la bd y buscar ese producto
        String sql = "select * from Productos where idProducto="+id+"";
        try {
            ///Traemos datos cuando ejecutamos la consulta
            rs = this.data.excuteQuery(sql);
              while (rs.next()) {
                ///Recorremos la tabla y asignamos a un nuevo producto los datos que vienen de la consulta
                p.setIdProducto(rs.getInt("idProducto"));
                p.setProducto(rs.getString("nombre"));
                p.setPrecio(rs.getDouble("precio"));
                p.setDescripcion(rs.getString("Descripcion"));
                p.setImg(rs.getString("Img"));        
            }
        } catch (Exception e) {
        }
        return p;
    }

}
