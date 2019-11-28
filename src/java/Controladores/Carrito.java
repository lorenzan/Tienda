/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Articulo.Articulo;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author César
 */
public class Carrito extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try {
            ///Este sera el Servlet que creare nuestro carrito de compra

        ///Recibimos el parametro que envia nuestro formulario
        int id = Integer.parseInt(request.getParameter("idP"));
        int Cantidad = Integer.parseInt(request.getParameter("cantidad"));

        ///Para el uso de nuestro carrito usaremos variables de sesion
        ///Para que el carrito pase intacto en nuestra estadia en el navegador
        HttpSession sesion = request.getSession(true);
        ///Para que la sesion jamas se acabe
        sesion.setMaxInactiveInterval(-1);
        ///La siguiente linea de codigo dice lo siguiente
        ///Si actualmente nuestra variable de session carrito viene vacia que cree un nuevo arrayList de Articulos
        ///Pero si trae algo en su interior que solamente aumente nuestras Lista de Articulos
        /// ? = entonces
        //// : = sino que 
        ArrayList<Articulo> ListaArtic = sesion.getAttribute("carrito") == null ? new ArrayList<Articulo>() : (ArrayList) sesion.getAttribute("carrito");

        
        ///Una variable que nos servira para verificar si la cantidad es nueva o se esta añadiendo
        boolean Flag = false;
        
        ///Si viene algo en la lista
        if(ListaArtic.size() >0){
            ///La recorremos
            for(int i =0;i<ListaArtic.size();i++){
                ///verificamos si viene un id ya existente
                if(id == ListaArtic.get(i).getIdArticulo()){
                    ///Si existe un i solamente sobreescribimos y añadimos la cantidad que viene de nuestro
                        ///Formulario a la cantidad que traemos en la lista de Articulos obviamente
                            ///de un determinado Articulo
                    ListaArtic.get(i).setCantidad(ListaArtic.get(i).getCantidad() + Cantidad);
                    Flag = true;
                    break;
                }
            }
        }
        /// Si no trae un id existence creamos un nuevo Articulo
        if(!Flag){
            ListaArtic.add(new Articulo(id,Cantidad));
        }
        ///Al finalizar todo solamente seteamos nuestra variable de sesion con la lista de arrticulos
        sesion.setAttribute("carrito", ListaArtic);
        
        response.sendRedirect("./Carrito/");
        } catch (Exception e) {
            System.err.println(e);
        }
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
