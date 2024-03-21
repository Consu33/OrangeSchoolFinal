package com.mycompany.orangeschool.logica;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class ClaseConexion {
    
    Connection conectar = null;
    
    String usuario = "root";
    String contrasenia = "";
    String baseDatos = "bdescuela";
    String ip = "localhost";
    String puerto = "3306";
    
    String cadena = "jdbc:mysql://" + ip + ":" + puerto + "/" + baseDatos;
     
    public Connection estableceConexion(){
    
        try {
            // No es necesario cargar explícitamente el controlador en versiones recientes de JDBC
            conectar = DriverManager.getConnection(
                    "jdbc:mysql://" + ip + ":" + puerto + "/" + baseDatos,usuario,contrasenia);
            
            System.out.println("La conexión se ha realizado con éxito");

        } catch (SQLException e) {
            System.out.println("Error al conectarse a la base de datos: " + e.toString());
        }
        return conectar;
    }    
}
