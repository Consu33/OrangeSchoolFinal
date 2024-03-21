package com.mycompany.orangeschool.grafica;

import com.mycompany.orangeschool.logica.ClaseUsuarios;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class Menu extends javax.swing.JFrame {
    ClaseUsuarios CuSer = new ClaseUsuarios();
    String user = CuSer.getLogin();
    
    
   
    public Menu() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BtnAlumnos = new javax.swing.JButton();
        BtnAdministradores = new javax.swing.JButton();
        BtnCerrarSesion = new javax.swing.JButton();
        BtnMenu = new javax.swing.JButton();
        BtnProfesores = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(7, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 153, 51));

        BtnAlumnos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BtnAlumnos.setText("Alumnos");
        BtnAlumnos.setBorder(null);
        BtnAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAlumnosActionPerformed(evt);
            }
        });

        BtnAdministradores.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BtnAdministradores.setText("Administradores");
        BtnAdministradores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAdministradoresActionPerformed(evt);
            }
        });

        BtnCerrarSesion.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BtnCerrarSesion.setText("Cerrar Sesión");
        BtnCerrarSesion.setBorder(null);
        BtnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCerrarSesionActionPerformed(evt);
            }
        });

        BtnMenu.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BtnMenu.setText("Menu");
        BtnMenu.setBorder(null);
        BtnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMenuActionPerformed(evt);
            }
        });

        BtnProfesores.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BtnProfesores.setText("Profesores");
        BtnProfesores.setBorder(null);
        BtnProfesores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnProfesoresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnProfesores, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BtnAdministradores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BtnCerrarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BtnMenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BtnAlumnos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(19, 19, 19))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(BtnAdministradores, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnProfesores, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 70, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        Administrador admi = new Administrador();
        admi.setVisible(true);
        admi.setLocationRelativeTo(null);
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

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAdministradores;
    private javax.swing.JButton BtnAlumnos;
    private javax.swing.JButton BtnCerrarSesion;
    private javax.swing.JButton BtnMenu;
    private javax.swing.JButton BtnProfesores;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
