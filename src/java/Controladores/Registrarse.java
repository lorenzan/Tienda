/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Usuario.Usuario;
import Usuario.UsuarioDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author César
 */
@WebServlet(name = "Registrarse", urlPatterns = {"/Registrarse"})
public class Registrarse extends HttpServlet {

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
        try {
            ///Obtenemos todos estos parametros del registro
            String nombre = request.getParameter("txtName");
            String Numero = request.getParameter("txtNumber");
            String Email = request.getParameter("txtEmail");
            String pass = request.getParameter("txtPass");

            ///Instanciamos un Usuario para pasarle los parametros obtenidos
            Usuario usuario = new Usuario();
            ///Ingresamos los datos en el usuario
            usuario.setNombre(nombre);
            usuario.setNumero(Numero);
            usuario.setEmail(Email);
            usuario.setPass(pass);

            ///Instanciamos un usuarioDAO
            UsuarioDAO user = new UsuarioDAO();

            ///Le ingresamos el usuario a la base de datos
            user.InsertarUsuario(usuario);

            ///Creamos nuestra variable de sesion
            HttpSession session = request.getSession();
            session.setMaxInactiveInterval(-1);
            session.setAttribute("Usuario", usuario);

            ///redireccionamos a nuestra pagina principal
            response.sendRedirect(request.getContextPath() + "/index.jsp");
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
