/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuario;

/**
 *
 * @author César
 */
public interface UsuarioCRUD {
    ///Metodo para registrar usuarios enviandole un usuario
    public void InsertarUsuario(Usuario usuario);
    ///Metodo para leer un usuario
     public Usuario leerUsuario(Usuario usuario);
}
