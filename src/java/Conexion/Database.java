/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author the wicks
 */
public class Database {

    ///Creamos los atributos que llevara nuestra conexion
    private Connection db; ///el que nos dara la conexion
    private ResultSet resultset; ///el que recorre las tablas de nuestra bd
    private Statement statement;///el que ejecuta consultas en nuestras tablas

    public Database() {
        String user = "root";
        String pass = "admin";
        String database = "Tienda";
        String url = "jdbc:mysql://localhost:3306/" + database + "?autoReconnect=true&useSSL=false";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            this.db = DriverManager.getConnection(url, user, pass);
            System.out.println("Conection success");
            this.statement = this.db.createStatement();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    ///Metodo para traer datos
    public ResultSet excuteQuery(String query) throws SQLException {
        this.resultset = this.statement.executeQuery(query);
        return this.resultset;
    }
    ///Metodo para insertar actualizar y eliminar
    public void excuteUpdate(String query) throws SQLException {
        this.statement.executeUpdate(query);
    }

    public static void main(String[] args) {
        Database db = new Database();
    }

}
