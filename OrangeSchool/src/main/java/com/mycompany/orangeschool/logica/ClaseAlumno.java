package com.mycompany.orangeschool.logica;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;


public class ClaseAlumno {
    
    int Id;
    String NombresAlumno;
    String ApellidosAlumno;
    String Ramo;
    String Nota;

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNombresAlumno() {
        return NombresAlumno;
    }

    public void setNombresAlumno(String NombresAlumno) {
        this.NombresAlumno = NombresAlumno;
    }

    public String getApellidosAlumno() {
        return ApellidosAlumno;
    }

    public void setApellidosAlumno(String ApellidosAlumno) {
        this.ApellidosAlumno = ApellidosAlumno;
    }

    public String getRamo() {
        return Ramo;
    }

    public void setRamo(String Ramo) {
        this.Ramo = Ramo;
    }

    public String getNota() {
        return Nota;
    }

    public void setNota(String Nota) {
        this.Nota = Nota;
    }
    
    public void InsertarAlumno(JTextField paramNombres, JTextField paramApellidos, JTextField paramRamo, JTextField paramNota){
    
        setNombresAlumno(paramNombres.getText());
        setApellidosAlumno(paramApellidos.getText());
        setRamo(paramRamo.getText());
        setNota(paramNota.getText());
        
        ClaseConexion CConexion = new ClaseConexion();
        
        String consulta = ("insert into Alumno( nombres, apellidos, ramo, nota) values (?, ?, ?, ?);");
        
        try {
            
            CallableStatement cs = CConexion.estableceConexion().prepareCall(consulta);
            
            cs.setString(1, getNombresAlumno());
            cs.setString(2, getApellidosAlumno());
            cs.setString(3, getRamo());
            cs.setString(4, getNota());
            
            cs.execute();
            
            JOptionPane.showMessageDialog(null, "Se inserto correctamente el alumno");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No Se inserto correctamente el alumno, error: " + e.toString());
        }
        
    }
    
    public void MostrarAlumno(JTable paramTablaTotalAlumnos){
        
        ClaseConexion CConexion = new ClaseConexion();
    
        DefaultTableModel modelo = new DefaultTableModel();
        /*ordenar tabla alfabeticamente */
        TableRowSorter <TableModel> OrdenarTabla = new TableRowSorter<TableModel>(modelo);
        paramTablaTotalAlumnos.setRowSorter(OrdenarTabla);
        
        String sql = "";
        
        modelo.addColumn("id");
        modelo.addColumn("Nombres");
        modelo.addColumn("Apellidos");
        modelo.addColumn("Ramo");
        modelo.addColumn("Nota");
        
        paramTablaTotalAlumnos.setModel(modelo);
        
        sql = ("select * from Alumno;");
        
        String[] datos = new String[5];
        Statement st;
        
        try {
            st = CConexion.estableceConexion().createStatement();
            
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                
                modelo.addRow(datos);
                
            }
            
            paramTablaTotalAlumnos.setModel(modelo);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo mostrar los registros, error: " + e.toString());
        }
        
    }
    
    public void SeleccionarAlumno(JTable paramTablaAlumnos, JTextField paramId, JTextField paramNombres, JTextField paramApellidos, JTextField paramRamo, JTextField paramNota){
    
        try {
            int fila = paramTablaAlumnos.getSelectedRow();
            
            if (fila >= 0){
                
                paramId.setText((paramTablaAlumnos.getValueAt(fila, 0).toString()));
                paramNombres.setText((paramTablaAlumnos.getValueAt(fila, 1).toString()));
                paramApellidos.setText(paramTablaAlumnos.getValueAt(fila, 2).toString());
                paramRamo.setText(paramTablaAlumnos.getValueAt(fila, 3).toString());
                paramNota.setText(paramTablaAlumnos.getValueAt(fila, 4).toString());             
                
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Fila no seleccionada");
            }
        } catch (Exception e) {
            
                JOptionPane.showMessageDialog(null, "Error de selección, error: " + e.toString());
            
        }
        
    }
    
    public void ModificarAlumno(JTextField paramId, JTextField paramNombres, JTextField paramApellidos, JTextField paramRamo, JTextField paramNota ){
    
        setId(Integer.parseInt(paramId.getText()));
        setNombresAlumno(paramNombres.getText());
        setApellidosAlumno(paramApellidos.getText());
        setRamo(paramRamo.getText());
        setNota(paramNota.getText());
        
        ClaseConexion CConexion = new ClaseConexion();
        
        String consulta = ("Update Alumno set alumno.nombres = ?, alumno.apellidos = ?, alumno.ramo = ?, alumno.nota = ? WHERE alumno.id = ?;");
        
        try {
            
            CallableStatement cs = CConexion.estableceConexion().prepareCall(consulta);
            
            cs.setString(1, getNombresAlumno());
            cs.setString(2, getApellidosAlumno());
            cs.setString(3, getRamo());
            cs.setString(4, getNota());
            cs.setInt(5, getId());
            
            cs.execute();
            
            JOptionPane.showMessageDialog(null, "Modificación exitosa");
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "No se modifico, error: " + e.toString());
        }
    }
    
    public void EliminarAlumno(JTextField paramId){
    
        setId(Integer.parseInt(paramId.getText()));
        
        ClaseConexion CConexion = new ClaseConexion();
        
        String consulta = "DELETE FROM Alumno WHERE alumno.id = ?;" ;
        
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
