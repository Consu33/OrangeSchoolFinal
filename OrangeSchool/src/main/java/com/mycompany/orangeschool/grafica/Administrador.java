package com.mycompany.orangeschool.grafica;

import com.mycompany.orangeschool.logica.ClaseAdministrador;
import com.mycompany.orangeschool.logica.ClaseAlumno;
import com.mycompany.orangeschool.logica.ClaseConexion;
import com.mycompany.orangeschool.logica.ClaseUsuarios;
import javax.swing.JTextField;


public class Administrador extends javax.swing.JFrame {

    
    public Administrador() {
        initComponents();
        TextFieldId.setEnabled(false);
        
        /*ClaseConexion CConexion = new ClaseConexion();
        CConexion .estableceConexion();*/
        
        ClaseAdministrador objetoAdministrador = new ClaseAdministrador();
        objetoAdministrador.MostrarAdministrador(TablaAdministrador);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BtnAdministradores = new javax.swing.JButton();
        BtnMenu = new javax.swing.JButton();
        BtnProfesores = new javax.swing.JButton();
        BtnCerrarSesion = new javax.swing.JButton();
        BtnAlumnos = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaAdministrador = new javax.swing.JTable();
        BtnAñadir = new javax.swing.JButton();
        BtnMostrar = new javax.swing.JButton();
        BtnEliminar = new javax.swing.JButton();
        BtnActualizar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        TextFieldNombre = new javax.swing.JTextField();
        TextFieldApellido = new javax.swing.JTextField();
        TextFieldCargo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        TextFieldId = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 51));

        BtnAdministradores.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BtnAdministradores.setText("Administradores");
        BtnAdministradores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAdministradoresActionPerformed(evt);
            }
        });

        BtnMenu.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BtnMenu.setText("Menu");
        BtnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMenuActionPerformed(evt);
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

        BtnAlumnos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BtnAlumnos.setText("Alumnos");
        BtnAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAlumnosActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Gestionar Administradores");

        jLabel3.setText("Gestiona la información de los administradores a cargo ");

        TablaAdministrador.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        TablaAdministrador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaAdministradorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaAdministrador);

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

        jLabel5.setText("Nombres : ");

        jLabel6.setText("Apellidos : ");

        jLabel7.setText("Cargo");

        TextFieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldNombreActionPerformed(evt);
            }
        });

        jLabel8.setText("Id:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BtnAlumnos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BtnMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BtnProfesores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BtnAdministradores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BtnCerrarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(BtnAñadir, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54)
                                .addComponent(BtnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(TextFieldCargo, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(TextFieldApellido, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(TextFieldId, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(TextFieldNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)))
                                .addContainerGap())))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(114, 114, 114)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(jLabel3)))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BtnAdministradores, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(BtnAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnProfesores, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(BtnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TextFieldApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TextFieldCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 25, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BtnAñadir)
                        .addComponent(BtnMostrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnActualizar)))
                .addGap(20, 20, 20))
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
        Menu menuu =  new Menu();
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

    private void BtnAdministradoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAdministradoresActionPerformed
        Administrador adm = new Administrador();
        adm.setVisible(true);
        adm.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_BtnAdministradoresActionPerformed

    private void BtnAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAñadirActionPerformed
        ClaseAdministrador objetoAdministrador = new ClaseAdministrador();
        objetoAdministrador.InsertarAdministrador(TextFieldNombre, TextFieldApellido, TextFieldCargo);
        objetoAdministrador.MostrarAdministrador(TablaAdministrador);
    }//GEN-LAST:event_BtnAñadirActionPerformed

    private void TextFieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldNombreActionPerformed

    private void BtnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMostrarActionPerformed
        ClaseAdministrador objetoAdministrador = new ClaseAdministrador();
        objetoAdministrador.MostrarAdministrador(TablaAdministrador);
    }//GEN-LAST:event_BtnMostrarActionPerformed

    private void TablaAdministradorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaAdministradorMouseClicked
        ClaseAdministrador objetoAdministrador = new ClaseAdministrador();
        objetoAdministrador.SeleccionarAdministrador(TablaAdministrador, TextFieldId ,TextFieldNombre, TextFieldApellido, TextFieldCargo);
    }//GEN-LAST:event_TablaAdministradorMouseClicked

    private void BtnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnActualizarActionPerformed
        ClaseAdministrador objetoAdministrador = new ClaseAdministrador();
        objetoAdministrador.ModificarAdministrador(TextFieldId, TextFieldNombre, TextFieldApellido, TextFieldCargo);
        objetoAdministrador.MostrarAdministrador(TablaAdministrador);
    }//GEN-LAST:event_BtnActualizarActionPerformed

    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarActionPerformed
        ClaseAdministrador objetoAdministrador = new ClaseAdministrador();
        objetoAdministrador.EliminarAdministrador(TextFieldId);
        objetoAdministrador.MostrarAdministrador(TablaAdministrador);
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
    private javax.swing.JTable TablaAdministrador;
    private javax.swing.JTextField TextFieldApellido;
    private javax.swing.JTextField TextFieldCargo;
    private javax.swing.JTextField TextFieldId;
    private javax.swing.JTextField TextFieldNombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
