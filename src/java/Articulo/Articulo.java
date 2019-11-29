/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Articulo;

/**
 *
 * @author César
 */
///Clase que nos servira para llenar nuestro carrito de Compra
public class Articulo {
    ///Atributos que que complementaran la Clase Articulo
    private int IdArticulo;
    private int Cantidad;

    ///Constructores de la clase
    public Articulo() {
    }

    public Articulo(int IdArticulo, int Cantidad) {
        this.IdArticulo = IdArticulo;
        this.Cantidad = Cantidad;
    }
    
    

    /**
     * @return the IdArticulo
     */
    public int getIdArticulo() {
        return IdArticulo;
    }

    /**
     * @param IdArticulo the IdArticulo to set
     */
    public void setIdArticulo(int IdArticulo) {
        this.IdArticulo = IdArticulo;
    }

    /**
     * @return the Cantidad
     */
    public int getCantidad() {
        return Cantidad;
    }

    /**
     * @param Cantidad the Cantidad to set
     */
    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }
    
}
