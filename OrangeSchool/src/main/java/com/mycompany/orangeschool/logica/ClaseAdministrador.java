package com.mycompany.orangeschool.logica;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;


public class ClaseAdministrador {
    
    int Id;
    String NombresAdministrador;
    String ApellidosAdministrador;
    String Cargo;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        this.Id = id;
    }

    public String getNombresAdministrador() {
        return NombresAdministrador;
    }

    public void setNombresAdministrador(String Nombres) {
        this.NombresAdministrador = Nombres;
    }

    public String getApellidosAdministrador() {
        return ApellidosAdministrador;
    }

    public void setApellidosAdministrador(String Apellidos) {
        this.ApellidosAdministrador = Apellidos;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }
    
    public void InsertarAdministrador(JTextField paramNombresAdministrador, JTextField paramApellidosAdministrador, JTextField paramCargo){
        
        setNombresAdministrador(paramNombresAdministrador.getText());
        setApellidosAdministrador(paramApellidosAdministrador.getText());
        setCargo(paramCargo.getText());
        
        ClaseConexion CConexion = new ClaseConexion();
        
        String consulta = ("insert into Administrador( nombres, apellidos, cargo) values (?, ?, ?);");
        
        try {
            
            CallableStatement cs = CConexion.estableceConexion().prepareCall(consulta);
            
            cs.setString(1, getNombresAdministrador());
            cs.setString(2, getApellidosAdministrador());
            cs.setString(3, getCargo());
            
            cs.execute();
            
            JOptionPane.showMessageDialog(null, "Se inserto correctamente el administrador");
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No Se inserto correctamente el administrador, error: " + e.toString());
        }
    
    }
    
    public void MostrarAdministrador(JTable paramTablaAdministrador){
        
        ClaseConexion CConexion = new ClaseConexion();
        
        DefaultTableModel modelo = new DefaultTableModel();
        /*ordenar tabla alfabeticamente */
        TableRowSorter <TableModel> OrdenarTabla = new TableRowSorter<TableModel>(modelo);
        paramTablaAdministrador.setRowSorter(OrdenarTabla);
        
        String sql = "";
        
        modelo.addColumn("id");
        modelo.addColumn("Nombres");
        modelo.addColumn("Apellidos");
        modelo.addColumn("Cargo");
        
        paramTablaAdministrador.setModel(modelo);
       
        sql = ("select * from Administrador;");
        
        String[] datos = new String[4];
        Statement st;
        
        try {
            st = CConexion.estableceConexion().createStatement();
            
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                
                modelo.addRow(datos);
                
            }
            
            paramTablaAdministrador.setModel(modelo);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo mostrar los registros, error: " + e.toString());
        }
        
    }
    
    public void SeleccionarAdministrador(JTable paramTablaAdministrador, JTextField paramId, JTextField paramNombresAdministrador, JTextField paramApellidosAdministrador, JTextField paramCargo){
    
        try {
            int fila = paramTablaAdministrador.getSelectedRow();
            
            if (fila >= 0){
                
                paramId.setText((paramTablaAdministrador.getValueAt(fila, 0).toString()));
                paramNombresAdministrador.setText((paramTablaAdministrador.getValueAt(fila, 1).toString()));
                paramApellidosAdministrador.setText((paramTablaAdministrador.getValueAt(fila, 2).toString()));
                paramCargo.setText(paramTablaAdministrador.getValueAt(fila, 3).toString());              
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Fila no seleccionada");
            }
        } catch (Exception e) {
            
                JOptionPane.showMessageDialog(null, "Error de selección, error: " + e.toString());
            
        }
    
    }
    
    public void ModificarAdministrador(JTextField paramId, JTextField paramNombresAdministrador, JTextField paramApellidosAdministrador, JTextField paramCargo){
    
        setId(Integer.parseInt(paramId.getText()));
        setNombresAdministrador(paramNombresAdministrador.getText());
        setApellidosAdministrador(paramApellidosAdministrador.getText());
        setCargo(paramCargo.getText());
        
        ClaseConexion CConexion = new ClaseConexion();
        
        String consulta = ("Update Administrador set administrador.nombres = ?, administrador.apellidos = ?, administrador.cargo = ? WHERE administrador.id = ? ;");
        
        try {
            
            CallableStatement cs = CConexion.estableceConexion().prepareCall(consulta);
            
            cs.setString(1, getNombresAdministrador());
            cs.setString(2, getApellidosAdministrador());
            cs.setString(3, getCargo());
            cs.setInt(4, getId());
            
            cs.execute();
            
            JOptionPane.showMessageDialog(null, "Modificación exitosa");
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "No se modifico, error: " + e.toString());
        }
    }
    
    public void EliminarAdministrador(JTextField paramId){
    
        setId(Integer.parseInt(paramId.getText()));
        
        ClaseConexion CConexion = new ClaseConexion();
        
        String consulta = ("DELETE FROM Administrador WHERE administrador.id = ?;") ;
        
        try {
            
            CallableStatement cs = CConexion.estableceConexion().prepareCall(consulta);
            cs.setInt(1, getId());
            
            cs.execute();
            
            JOptionPane.showMessageDialog(null, "Se elimino correctamente el alumno: ");
            
        } catch (Exception e) {
            
             JOptionPane.showMessageDialog(null, "No se pudo eliminar, error: " + e.toString());
        }
    }
}


