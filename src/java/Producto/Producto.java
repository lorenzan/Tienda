/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Producto;

/**
 *
 * @author César
 */
///Clase entidad para nuestros productos
public class Producto {
    private int idProducto;
    private String producto;
    private double precio;
    private String descripcion;
    private String Img;

    public Producto() {
    }

    public Producto(int idProducto, String producto, double precio, String descripcion, String Img) {
        this.idProducto = idProducto;
        this.producto = producto;
        this.precio = precio;
        this.descripcion = descripcion;
        this.Img = Img;
    }

    
    
    /**
     * @return the idProducto
     */
    public int getIdProducto() {
        return idProducto;
    }

    /**
     * @param idProducto the idProducto to set
     */
    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    /**
     * @return the producto
     */
    public String getProducto() {
        return producto;
    }

    /**
     * @param producto the producto to set
     */
    public void setProducto(String producto) {
        this.producto = producto;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the Img
     */
    public String getImg() {
        return Img;
    }

    /**
     * @param Img the Img to set
     */
    public void setImg(String Img) {
        this.Img = Img;
    }
            
}
