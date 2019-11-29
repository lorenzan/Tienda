/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuario;

import Conexion.Database;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author César
 */
public class UsuarioDAO implements UsuarioCRUD {

    ///Atributo que obtiene la conexion a la base de datos
    private Database database;

    ///cada vez que instaciemos a nuestra base de datos, esta se conectara
    public UsuarioDAO() {
        this.database = new Database();
    }

    ///Aqui insertaremos los usuarios cada vez que se registren
    @Override
    public void InsertarUsuario(Usuario usuario) {
        String nombre = usuario.getNombre();
        String numero = usuario.getNumero();
        String email = usuario.getEmail();
        String pass = usuario.getPass();
        ///Nuestro String de consulta
        String sql = "insert into Usuarios(nombre,numeroTelefono,email,pass) values('" + nombre + "','" + numero + "','" + email + "','" + pass + "');";
        try {
            ///hacemos nuestra consulta e ingresamos los datos 
            this.database.excuteUpdate(sql);
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    ///Leeremos un usuario por su correo y contraseña
    ///Esto nos servira en nuestro LOGIN
    @Override
    public Usuario leerUsuario(Usuario usuario) {
        ResultSet rs = null;
        Usuario user = new Usuario();
        try {
            ///Resulset es un puntero que trae datos de nuestra BD
            rs = this.database.excuteQuery("select * from Usuarios where email='" + usuario.getEmail() + "' and "
                    + "pass='" + usuario.getPass() + "'");
            while (rs.next()) {
                user.setNombre(rs.getString("nombre"));
                user.setEmail(rs.getString("email"));
                user.setPass(rs.getString("pass"));
                user.setNumero(rs.getString("numeroTelefono"));
                user.setIdUsuario(rs.getInt("idUsuario"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return user;
    }

}
