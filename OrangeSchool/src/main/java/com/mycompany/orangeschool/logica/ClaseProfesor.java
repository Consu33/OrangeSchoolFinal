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


public class ClaseProfesor {
    
    int Id;
    String NombresProfesor;
    String ApellidosProfesor;
    String Asignatura;

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNombresProfesor() {
        return NombresProfesor;
    }

    public void setNombresProfesor(String NombresProfesor) {
        this.NombresProfesor = NombresProfesor;
    }

    public String getApellidosProfesor() {
        return ApellidosProfesor;
    }

    public void setApellidosProfesor(String ApellidosProfesor) {
        this.ApellidosProfesor = ApellidosProfesor;
    }

    public String getAsignatura() {
        return Asignatura;
    }

    public void setAsignatura(String Asignatura) {
        this.Asignatura = Asignatura;
    }
    
    public void InsertarProfesor(JTextField paramNombresProfesor, JTextField paramApellidosProfesor, JTextField paramAsignatura){
    
        setNombresProfesor(paramNombresProfesor.getText());
        setApellidosProfesor(paramApellidosProfesor.getText());
        setAsignatura(paramAsignatura.getText());
        
        ClaseConexion CConexion = new ClaseConexion();
        
        String consulta = ("insert into Profesor( nombres, apellidos, Asignatura) values (?, ?, ?);");
        
        try {
            
            CallableStatement cs = CConexion.estableceConexion().prepareCall(consulta);
            
            cs.setString(1, getNombresProfesor());
            cs.setString(2, getApellidosProfesor());
            cs.setString(3, getAsignatura());
                        
            cs.execute();
            
            JOptionPane.showMessageDialog(null, "Se inserto correctamente el alumno");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No Se inserto correctamente el alumno, error: " + e.toString());
        }
        
    }
    
    public void MostrarProfesor(JTable paramTablaProfesores){
        
        ClaseConexion CConexion = new ClaseConexion();
        
        DefaultTableModel modelo = new DefaultTableModel();
        /*ordenar tabla alfabeticamente */
        TableRowSorter <TableModel> OrdenarTabla = new TableRowSorter<TableModel>(modelo);
        paramTablaProfesores.setRowSorter(OrdenarTabla);
        
        String sql = "";
        
        modelo.addColumn("id");
        modelo.addColumn("Nombres");
        modelo.addColumn("Apellidos");
        modelo.addColumn("Asignatura");
        
        paramTablaProfesores.setModel(modelo);
        
        sql = ("select * from Profesor;");
        
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
            
            paramTablaProfesores.setModel(modelo);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo mostrar los registros, error: " + e.toString());
        }
          
    }
    
    public void SeleccionarProfesor(JTable paramTablaProfesores, JTextField paramId, JTextField paramNombres, JTextField paramApellidos, JTextField paramAsignatura){
    
        try {
            int fila = paramTablaProfesores.getSelectedRow();
            
            if (fila >= 0){
                
                paramId.setText((paramTablaProfesores.getValueAt(fila, 0).toString()));
                paramNombres.setText((paramTablaProfesores.getValueAt(fila, 1).toString()));
                paramApellidos.setText(paramTablaProfesores.getValueAt(fila, 2).toString());
                paramAsignatura.setText(paramTablaProfesores.getValueAt(fila, 3).toString());              
                
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Fila no seleccionada");
            }
        } catch (Exception e) {
            
                JOptionPane.showMessageDialog(null, "Error de selección, error: " + e.toString());
            
        }
        
    }
    
    public void ModificarProfesor(JTextField paramId, JTextField paramNombres, JTextField paramApellidos, JTextField paramAsignatura){
    
        setId(Integer.parseInt(paramId.getText()));
        setNombresProfesor(paramNombres.getText());
        setApellidosProfesor(paramApellidos.getText());
        setAsignatura(paramAsignatura.getText());
        
        
        ClaseConexion CConexion = new ClaseConexion();
        
        String consulta = ("Update Profesor set profesor.nombres = '?', profesor.apellidos = '?', profesor.asignatura = '?' WHERE profesor.id = ?");
        
        try {
            
            CallableStatement cs = CConexion.estableceConexion().prepareCall(consulta);
            
            cs.setString(1, getNombresProfesor());
            cs.setString(2, getApellidosProfesor());
            cs.setString(3, getAsignatura());
            cs.setInt(4, getId());
            
            cs.execute();
            
            JOptionPane.showMessageDialog(null, "Modificación exitosa");
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "No se modifico, error: " + e.toString());
        }
        
    }    
    
    public void EliminarProfesor(JTextField paramId){
    
        setId(Integer.parseInt(paramId.getText()));
        
        ClaseConexion CConexion = new ClaseConexion();
        
        String consulta = ("DELETE FROM Profesor WHERE profesor.id = ?;") ;
        
        try {
            
            CallableStatement cs = CConexion.estableceConexion().prepareCall(consulta);
            cs.setInt(1, getId());
            
            cs.execute();
            
            JOptionPane.showMessageDialog(null, "Se elimino correctamente el profesor: ");
            
        } catch (Exception e) {
            
             JOptionPane.showMessageDialog(null, "No se pudo eliminar, error: " + e.toString());
        }
        
    }
}
