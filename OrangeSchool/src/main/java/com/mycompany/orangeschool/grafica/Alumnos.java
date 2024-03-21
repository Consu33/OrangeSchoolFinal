package com.mycompany.orangeschool.grafica;

import com.mycompany.orangeschool.logica.ClaseAlumno;
import com.mycompany.orangeschool.logica.ClaseConexion;
import com.mycompany.orangeschool.logica.ClaseUsuarios;
import javax.swing.JTextField;


public class Alumnos extends javax.swing.JFrame {

    
    public Alumnos() {
        initComponents();
        TextFieldId.setEnabled(false);
        
        
        /*ClaseConexion CConexion = new ClaseConexion();
        CConexion .estableceConexion();*/
        
        ClaseAlumno objetoAlumno = new ClaseAlumno();
        objetoAlumno.MostrarAlumno(TablaAlumnos); 
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BtnAdministradores = new javax.swing.JButton();
        BtnAlumnos = new javax.swing.JButton();
        BtnProfesores = new javax.swing.JButton();
        BtnCerrarSesion = new javax.swing.JButton();
        BtnMenu = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaAlumnos = new javax.swing.JTable();
        BtnAñadir = new javax.swing.JButton();
        BtnMostrar = new javax.swing.JButton();
        BtnEliminar = new javax.swing.JButton();
        BtnActualizar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        TextFieldNombre = new javax.swing.JTextField();
        TextFieldApellido = new javax.swing.JTextField();
        TextFieldRamo = new javax.swing.JTextField();
        TextFieldNota = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        TextFieldId = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 51));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\consu\\OneDrive\\Imágenes\\OrangeSchool\\logoOrangeSchool2.png")); // NOI18N

        BtnAdministradores.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BtnAdministradores.setText("Administradores");
        BtnAdministradores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAdministradoresActionPerformed(evt);
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

        BtnCerrarSesion.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BtnCerrarSesion.setText("Cerrar Sesión");
        BtnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCerrarSesionActionPerformed(evt);
            }
        });

        BtnMenu.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BtnMenu.setText("Menu");
        BtnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMenuActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("Ingreso de notas alumnos");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText(" Alumnos");

        TablaAlumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        TablaAlumnos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaAlumnosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaAlumnos);

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

        BtnActualizar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        BtnActualizar.setText("Modificar");
        BtnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnActualizarActionPerformed(evt);
            }
        });

        jLabel5.setText("Apellidos :");

        jLabel6.setText("Nombres :");

        jLabel7.setText("Ramo :");

        jLabel8.setText("Nota :");

        jLabel9.setText("Id:");

        TextFieldId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldIdActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Importante, favor de hacer ingreso de notas sin comas");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BtnAdministradores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnCerrarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnProfesores, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(28, 28, 28)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(BtnAñadir, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BtnMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(59, 59, 59)
                                        .addComponent(BtnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(BtnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel8))
                                        .addGap(8, 8, 8)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(TextFieldNota)
                                            .addComponent(TextFieldRamo)
                                            .addComponent(TextFieldApellido, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(8, 8, 8)
                                                .addComponent(TextFieldNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(TextFieldId, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE))))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(135, 135, 135)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(184, 184, 184)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(BtnAdministradores, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnProfesores, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(3, 3, 3)
                        .addComponent(BtnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(TextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(TextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TextFieldApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(TextFieldRamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TextFieldNota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BtnAñadir)
                        .addComponent(BtnMostrar)
                        .addComponent(BtnEliminar)
                        .addComponent(BtnActualizar)))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMenuActionPerformed
        Menu menuu = new Menu();
        menuu.setVisible(true);
        menuu.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_BtnMenuActionPerformed

    private void BtnAdministradoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAdministradoresActionPerformed
        Administrador adm = new Administrador();
        adm.setVisible(true);
        adm.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_BtnAdministradoresActionPerformed

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

    private void BtnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCerrarSesionActionPerformed
        ClaseUsuarios Cu = new ClaseUsuarios();
        Cu.CerrarSesion();
        InicioSesion inicio = new InicioSesion();
        inicio.setVisible(true);
        inicio.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_BtnCerrarSesionActionPerformed

    private void BtnAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAñadirActionPerformed
        ClaseAlumno objetoAlumno = new ClaseAlumno();
        objetoAlumno.InsertarAlumno(TextFieldNombre, TextFieldApellido, TextFieldRamo, TextFieldNota);
        objetoAlumno.MostrarAlumno(TablaAlumnos);
    }//GEN-LAST:event_BtnAñadirActionPerformed

    private void TablaAlumnosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaAlumnosMouseClicked
        ClaseAlumno objetoAlumno = new ClaseAlumno();
        objetoAlumno.SeleccionarAlumno(TablaAlumnos, TextFieldId, TextFieldNombre, TextFieldApellido, TextFieldRamo, TextFieldNota);
        objetoAlumno.MostrarAlumno(TablaAlumnos);
    }//GEN-LAST:event_TablaAlumnosMouseClicked

    private void BtnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnActualizarActionPerformed
        ClaseAlumno objetoAlumno = new ClaseAlumno();
        objetoAlumno.ModificarAlumno(TextFieldId, TextFieldNombre, TextFieldApellido, TextFieldRamo, TextFieldNota);
        objetoAlumno.MostrarAlumno(TablaAlumnos);
    }//GEN-LAST:event_BtnActualizarActionPerformed

    private void TextFieldIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldIdActionPerformed

    private void BtnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMostrarActionPerformed
        ClaseAlumno objetoAlumno = new ClaseAlumno();
        objetoAlumno.MostrarAlumno(TablaAlumnos);
        
    }//GEN-LAST:event_BtnMostrarActionPerformed

    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarActionPerformed
        ClaseAlumno objetoAlumno = new ClaseAlumno();
        objetoAlumno.EliminarAlumno(TextFieldId);
        objetoAlumno.MostrarAlumno(TablaAlumnos);
    }//GEN-LAST:event_BtnEliminarActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnActualizar;
    private javax.swing.JButton BtnAdministradores;
    private javax.swing.JButton BtnAlumnos;
    private javax.swing.JButton BtnAñadir;
    private javax.swing.JButton BtnCerrarSesion;
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JButton BtnMenu;
    private javax.swing.JButton BtnMostrar;
    private javax.swing.JButton BtnProfesores;
    private javax.swing.JTable TablaAlumnos;
    private javax.swing.JTextField TextFieldApellido;
    private javax.swing.JTextField TextFieldId;
    private javax.swing.JTextField TextFieldNombre;
    private javax.swing.JTextField TextFieldNota;
    private javax.swing.JTextField TextFieldRamo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
