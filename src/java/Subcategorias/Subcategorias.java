/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Subcategorias;

/**
 *
 * @author César
 */
///Clase entidad para nuestras subCategorias
public class Subcategorias {
    private int idSub;
    private String Subcategoria;

    public Subcategorias() {
    }

    public Subcategorias(int idSub, String Subcategoria) {
        this.idSub = idSub;
        this.Subcategoria = Subcategoria;
    }
    
    

    /**
     * @return the idSub
     */
    public int getIdSub() {
        return idSub;
    }

    /**
     * @param idSub the idSub to set
     */
    public void setIdSub(int idSub) {
        this.idSub = idSub;
    }

    /**
     * @return the Subcategoria
     */
    public String getSubcategoria() {
        return Subcategoria;
    }

    /**
     * @param Subcategoria the Subcategoria to set
     */
    public void setSubcategoria(String Subcategoria) {
        this.Subcategoria = Subcategoria;
    }
    
    
}
