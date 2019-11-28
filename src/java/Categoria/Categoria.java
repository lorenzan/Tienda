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
 * @author César
 */
///Clase dedicada para mostrar nuestras categorias
public class Categoria {

    private int idCategoria;
    private String Categoria;
    private ArrayList<Subcategorias> subcategorias;

    public Categoria() {
    }

    public Categoria(int idCategoria, String Categoria) {
        this.idCategoria = idCategoria;
        this.Categoria = Categoria;
    }

    /**
     * @return the idCategoria
     */
    public int getIdCategoria() {
        return idCategoria;
    }

    /**
     * @param idCategoria the idCategoria to set
     */
    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    /**
     * @return the Categoria
     */
    public String getCategoria() {
        return Categoria;
    }

    /**
     * @param Categoria the Categoria to set
     */
    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    /**
     * @return the subcategorias
     */
    public ArrayList<Subcategorias> getSubcategorias() {
        return subcategorias;
    }

    /**
     * @param subcategorias the subcategorias to set
     */
    public void setSubcategorias(ArrayList<Subcategorias> subcategorias) {
        this.subcategorias = subcategorias;
    }

}
