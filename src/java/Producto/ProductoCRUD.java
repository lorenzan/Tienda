/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Producto;

import java.util.ArrayList;

/**
 *
 * @author César
 */
public interface ProductoCRUD {
    
    ///Metodos que nos devuelven productos segun la operacion
    ArrayList<Producto> TraerProductos();
    ArrayList<Producto> ProductosCat(int id);
    Producto LeerProducto(int id);
}
