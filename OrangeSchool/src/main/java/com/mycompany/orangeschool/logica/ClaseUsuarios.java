package com.mycompany.orangeschool.logica;

import java.sql.CallableStatement;
/*import java.sql.PreparedStatement;
import java.sql.ResultSet;*/
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gonzalo
 */
public class ClaseUsuarios {
    int id;
    String nombre;
    String login;
    String contrasenia;
    String funcion;// este campo es para decir si es administrador, profesor o alumno
    
  

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getLogin() {
        return login;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public String getFuncion() {
        return funcion;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setContrasenia(String pass) {
        this.contrasenia = pass;
    }

    public void setFuncion(String funcion) {
        this.funcion = funcion;
    }
   


public void InsertarRegistro(JTextField paramNombre, JTextField paramLogin, JTextField paramPass, String paramFuncion){
    setNombre(paramNombre.getText());
    setLogin(paramLogin.getText());
    setContrasenia(paramPass.getText());
    setFuncion(paramFuncion);
    
    ClaseConexion CConexion = new ClaseConexion();
    
    String consulta="insert into usuario(nombre, login, contrasenia, funcion) value (?,?,?,?) ";
    
     try {
            
            CallableStatement cs = CConexion.estableceConexion().prepareCall(consulta);
            
            cs.setString(1, getNombre());
            cs.setString(2, getLogin());
            cs.setString(3, getContrasenia());
            cs.setString(4, getFuncion());
            
            cs.execute();
            
            JOptionPane.showMessageDialog(null, "Se inserto correctamente el administrador");
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No Se inserto correctamente el administrador, error: " + e.toString());
        }
}    
    public String IniciarSession(JTextField paramLogin, JTextField paramPass){
        String log =paramLogin.getText();
        String pas =paramPass.getText();
        setLogin(paramLogin.getText());
        setContrasenia(paramPass.getText());
        ClaseConexion CConexionS = new ClaseConexion();
        String valor="";

        
    String consultaS="select login, contrasenia from usuario where login = '"+log+"' and contrasenia = '"+pas+"' ";
    
    try {
        Statement statemen = CConexionS.estableceConexion().createStatement();
        ResultSet resulset = statemen.executeQuery(consultaS);
        
        Integer contador=0;
        while(resulset.next()){
            contador++;
        }
        if(contador>=1){
            valor="Si";
            JOptionPane.showMessageDialog(null, "login correcto, Bienvenido "+log);
        }else{
            valor="No";
            JOptionPane.showMessageDialog(null, "login o contraseña incorrecta ");
        }
            /*
            PreparedStatement cs = CConexionS.estableceConexion().prepareCall(consultaS);
            
            cs.setString(1, getLogin());
            cs.setString(2, getContrasenia());
            
            
            ResultSet rs = cs.executeQuery();
            
            if(rs.getRow()>=1){
                JOptionPane.showMessageDialog(null, "Login Correcto");
                valor="Si";
            }else{
                JOptionPane.showMessageDialog(null, "usuario o contraseña no validos "+rs.getRow());
                valor="No";
            }
            
            
         */   
        } catch (Exception e) {/*
            JOptionPane.showMessageDialog(null, "Registro no encontrado " + e.toString());
            valor="No";*/
        }
    return(valor);
    }
public void CerrarSesion(){
    setId(0);
    setNombre(null);
    setLogin(null);
    setContrasenia(null);
    setFuncion(null);
    
}
}
