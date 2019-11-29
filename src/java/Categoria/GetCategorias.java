/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Categoria;

import java.util.ArrayList;

/**
 *
 * @author the wicks
 */
///Clase que nos traera las Categorias para imprimirlas en el index
public class GetCategorias {

    private ArrayList<Categoria> listaCategorias;
    private CategoriaDAO categoriaDao;

    public GetCategorias() {
        this.listaCategorias = new ArrayList<>();
        this.categoriaDao = new CategoriaDAO();
    }

    public ArrayList<Categoria> getAllCategorias() {
        this.listaCategorias = categoriaDao.TraerCategorias();
        return this.listaCategorias;
    }
}
