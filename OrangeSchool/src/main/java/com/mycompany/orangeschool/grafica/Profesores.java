package com.mycompany.orangeschool.grafica;

import com.mycompany.orangeschool.logica.ClaseAlumno;
import com.mycompany.orangeschool.logica.ClaseProfesor;
import com.mycompany.orangeschool.logica.ClaseConexion;
import com.mycompany.orangeschool.logica.ClaseUsuarios;
import javax.swing.JTextField;


public class Profesores extends javax.swing.JFrame {

    
    public Profesores() {
        initComponents();
        TextFieldId.setEnabled(false);
        
        /*ClaseConexion CConexion = new ClaseConexion();
        CConexion .estableceConexion();*/
    }
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        BtnAlumnos = new javax.swing.JButton();
        BtnProfesores = new javax.swing.JButton();
        BtnMenu = new javax.swing.JButton();
        BtnCerrarSesion = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaProfesores = new javax.swing.JTable();
        BtnActualizar = new javax.swing.JButton();
        BtnAñadir = new javax.swing.JButton();
        BtnMostrar = new javax.swing.JButton();
        BtnEliminar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        TextFieldNombre = new javax.swing.JTextField();
        TextFieldApellido = new javax.swing.JTextField();
        TextFieldAsignatura = new javax.swing.JTextField();
        TextFieldContrato = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        TextFieldId = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 51));

        jButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1.setText("Administradores");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        BtnAlumnos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BtnAlumnos.setText("Alumnos");
        BtnAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAlumnosActionPerformed(evt);
            }
        });

        BtnProfesores.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BtnProfesores.setText("Profesores");
        BtnProfesores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnProfesoresActionPerformed(evt);
            }
        });

        BtnMenu.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BtnMenu.setText("Menu");
        BtnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMenuActionPerformed(evt);
            }
        });

        BtnCerrarSesion.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BtnCerrarSesion.setText("Cerrar Sesión");
        BtnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCerrarSesionActionPerformed(evt);
            }
        });

        TablaProfesores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        TablaProfesores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaProfesoresMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaProfesores);

        BtnActualizar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        BtnActualizar.setText("Actualizar");
        BtnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnActualizarActionPerformed(evt);
            }
        });

        BtnAñadir.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        BtnAñadir.setText("Añadir");
        BtnAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAñadirActionPerformed(evt);
            }
        });

        BtnMostrar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        BtnMostrar.setText("Mostrar");
        BtnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMostrarActionPerformed(evt);
            }
        });

        BtnEliminar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        BtnEliminar.setText("Eliminar");
        BtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Profesores");

        jLabel3.setText("Ingreso datos docentes");

        jLabel4.setText("Nombres :");

        jLabel5.setText("Apellidos :");

        jLabel6.setText("Contrato : ");

        jLabel7.setText("Asignatura :");

        jLabel8.setText("Id:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BtnCerrarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(BtnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(BtnProfesores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(BtnAlumnos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(BtnAñadir, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BtnMostrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BtnEliminar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BtnActualizar))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextFieldNombre)
                            .addComponent(TextFieldApellido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                            .addComponent(TextFieldAsignatura, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                            .addComponent(TextFieldContrato, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                            .addComponent(TextFieldId))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(183, 183, 183)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(159, 159, 159)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BtnAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BtnProfesores, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addComponent(BtnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TextFieldApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(TextFieldAsignatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextFieldContrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BtnActualizar)
                        .addComponent(BtnAñadir)
                        .addComponent(BtnMostrar)
                        .addComponent(BtnEliminar)))
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMenuActionPerformed
        Menu menuu = new Menu();
        menuu.setVisible(true);
        menuu.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_BtnMenuActionPerformed

    private void BtnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCerrarSesionActionPerformed
        ClaseUsuarios Cu = new ClaseUsuarios();
        Cu.CerrarSesion();
        InicioSesion inicio = new InicioSesion();
        inicio.setVisible(true);
        inicio.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_BtnCerrarSesionActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Administrador admi = new Administrador();
        admi.setVisible(true);
        admi.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void BtnAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAlumnosActionPerformed
        Alumnos alm = new Alumnos();
        alm.setVisible(true);
        alm.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_BtnAlumnosActionPerformed

    private void BtnProfesoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnProfesoresActionPerformed
        Profesores pro = new Profesores();
        pro.setVisible(true);
        pro.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_BtnProfesoresActionPerformed

    private void BtnAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAñadirActionPerformed
        ClaseProfesor objetoProfesor = new ClaseProfesor();
        objetoProfesor.InsertarProfesor(TextFieldNombre, TextFieldApellido, TextFieldAsignatura);
        /*objetoProfesor.MostrarProfesor(TablaProfesores);*/
    }//GEN-LAST:event_BtnAñadirActionPerformed

    private void BtnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMostrarActionPerformed
       ClaseProfesor objetoProfesor = new ClaseProfesor();
       objetoProfesor.MostrarProfesor(TablaProfesores);
    }//GEN-LAST:event_BtnMostrarActionPerformed

    private void TablaProfesoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaProfesoresMouseClicked
       ClaseProfesor objetoProfesor = new ClaseProfesor();
       objetoProfesor.SeleccionarProfesor(TablaProfesores, TextFieldId, TextFieldNombre, TextFieldApellido, TextFieldAsignatura);
       objetoProfesor.MostrarProfesor(TablaProfesores);
       
    }//GEN-LAST:event_TablaProfesoresMouseClicked

    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarActionPerformed
        ClaseProfesor objetoProfesor = new ClaseProfesor();
        objetoProfesor.EliminarProfesor(TextFieldId);
        objetoProfesor.MostrarProfesor(TablaProfesores);
    }//GEN-LAST:event_BtnEliminarActionPerformed

    private void BtnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnActualizarActionPerformed
        ClaseProfesor objetoProfesor = new ClaseProfesor();
        objetoProfesor.ModificarProfesor(TextFieldId, TextFieldNombre, TextFieldApellido, TextFieldAsignatura);
        objetoProfesor.MostrarProfesor(TablaProfesores);
    }//GEN-LAST:event_BtnActualizarActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnActualizar;
    private javax.swing.JButton BtnAlumnos;
    private javax.swing.JButton BtnAñadir;
    private javax.swing.JButton BtnCerrarSesion;
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JButton BtnMenu;
    private javax.swing.JButton BtnMostrar;
    private javax.swing.JButton BtnProfesores;
    private javax.swing.JTable TablaProfesores;
    private javax.swing.JTextField TextFieldApellido;
    private javax.swing.JTextField TextFieldAsignatura;
    private javax.swing.JTextField TextFieldContrato;
    private javax.swing.JTextField TextFieldId;
    private javax.swing.JTextField TextFieldNombre;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
