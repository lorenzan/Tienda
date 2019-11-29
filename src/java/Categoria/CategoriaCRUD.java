/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Categoria;

import Subcategorias.Subcategorias;
import java.util.ArrayList;

/**
 *
 * @author the wicks
 */
public interface CategoriaCRUD {
    ///Metodo que nos traera todas las categorias
   ArrayList<Categoria> TraerCategorias();
   ///Metodo que nos traera las Subcategorias
   ArrayList<Subcategorias> TraerSubCategorias(int id);
}
