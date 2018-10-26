/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelilusion.vistas;

import hotelilusion.modelo.Huesped;
import hotelilusion.modelo.HuespedData;
import hotelilusion.modelo.Conexion;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class frmhuesped extends javax.swing.JFrame {
private HuespedData huespedData;
private Conexion conexion;
    
    public frmhuesped() {
        initComponents();
        try {
            
            conexion = new Conexion("jdbc:mysql://localhost/holtelilusion", "root", "");
            huespedData = new HuespedData(conexion);
        } catch (ClassNotFoundException ex) {
        Logger.getLogger(frmhuesped.class.getName()).log(Level.SEVERE, null, ex);
    }
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1huesped = new javax.swing.JLabel();
        jLabelnombre = new javax.swing.JLabel();
        txtnombre_apellido = new javax.swing.JTextField();
        jLabeldni = new javax.swing.JLabel();
        txtdocumento = new javax.swing.JTextField();
        jLabeldireccion = new javax.swing.JLabel();
        jLabeltelefono = new javax.swing.JLabel();
        txtdire = new javax.swing.JTextField();
        txttel = new javax.swing.JTextField();
        jLabelcorreo = new javax.swing.JLabel();
        txtmail = new javax.swing.JTextField();
        jButtonactualizar = new javax.swing.JButton();
        jButtonguardar = new javax.swing.JButton();
        jButtonborrar = new javax.swing.JButton();
        jButtonbuscar = new javax.swing.JButton();
        txtid_huesped = new javax.swing.JTextField();
        btLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1huesped.setFont(new java.awt.Font("Viner Hand ITC", 1, 18)); // NOI18N
        jLabel1huesped.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1huesped.setText(" HUÉSPED");
        jLabel1huesped.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 51)));

        jLabelnombre.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelnombre.setText("Nombre y Apellido");
        jLabelnombre.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtnombre_apellido.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        jLabeldni.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabeldni.setText("Número Documento");
        jLabeldni.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtdocumento.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        jLabeldireccion.setBackground(new java.awt.Color(255, 204, 204));
        jLabeldireccion.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabeldireccion.setText("Dirección");
        jLabeldireccion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabeltelefono.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabeltelefono.setText("Teléfono");
        jLabeltelefono.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtdire.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        txttel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        jLabelcorreo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelcorreo.setText("E-mail");
        jLabelcorreo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtmail.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        jButtonactualizar.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jButtonactualizar.setForeground(new java.awt.Color(255, 0, 0));
        jButtonactualizar.setText("Actualizar");
        jButtonactualizar.setActionCommand("");
        jButtonactualizar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonactualizarActionPerformed(evt);
            }
        });

        jButtonguardar.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jButtonguardar.setForeground(new java.awt.Color(255, 51, 0));
        jButtonguardar.setText("Guardar");
        jButtonguardar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonguardarActionPerformed(evt);
            }
        });

        jButtonborrar.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jButtonborrar.setForeground(new java.awt.Color(255, 0, 0));
        jButtonborrar.setText("Borrar");
        jButtonborrar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonborrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonborrarActionPerformed(evt);
            }
        });

        jButtonbuscar.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jButtonbuscar.setForeground(new java.awt.Color(255, 0, 51));
        jButtonbuscar.setText("Buscar");
        jButtonbuscar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonbuscarActionPerformed(evt);
            }
        });

        txtid_huesped.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtid_huespedActionPerformed(evt);
            }
        });

        btLimpiar.setText("Limpiar");
        btLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(244, 244, 244)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtnombre_apellido)
                            .addComponent(txtdocumento)
                            .addComponent(txtdire)
                            .addComponent(txttel)
                            .addComponent(txtmail, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtid_huesped, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                        .addGap(114, 114, 114)))
                .addComponent(jButtonbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonborrar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jButtonactualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btLimpiar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelcorreo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabeltelefono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabeldireccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabeldni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelnombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(79, 79, 79)
                        .addComponent(jLabel1huesped, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1huesped)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtid_huesped, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonbuscar))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnombre_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelnombre))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabeldni)
                    .addComponent(txtdocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabeldireccion)
                    .addComponent(txtdire, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabeltelefono)
                    .addComponent(txttel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelcorreo)
                    .addComponent(txtmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonborrar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonactualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btLimpiar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonguardarActionPerformed
        // configuro boton guardar:
        String nombre_apellido = jLabelnombre.getText();
        int numero_documento = Integer.parseInt(jLabeldni.getText()+"");
        String direccion = jLabeldireccion.getText();
        long telefono = Integer.parseInt(jLabeltelefono.getText());
        String email = jLabelcorreo.getText();
        
        Huesped huesped = new Huesped(nombre_apellido, numero_documento, direccion, telefono, email);
        huespedData.guardarHuesped(huesped);
        
       txtid_huesped.setText(huesped.getId_huesped()+ "");
    }//GEN-LAST:event_jButtonguardarActionPerformed

    private void jButtonactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonactualizarActionPerformed
        // configuro boton actualizar:
        if (txtid_huesped.getText()!=null) {
          String nombre_apellido = jLabelnombre.getText();
          int numero_documento = Integer.parseInt(jLabeldni.getText());
          String direccion = jLabeldireccion.getText();
          int telefono = Integer.parseInt(jLabeltelefono.getText());
          String email = jLabelcorreo.getText();
          
          Huesped huesped = new Huesped(nombre_apellido, numero_documento, direccion, telefono, email);
        huespedData.actualizarHuesped(huesped);
          
               }
        
    }//GEN-LAST:event_jButtonactualizarActionPerformed

    private void jButtonborrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonborrarActionPerformed
        // configuro el boton borrar:
        int id=Integer.parseInt(txtid_huesped.getText());
        huespedData.borrarHuesped(id);
        
    }//GEN-LAST:event_jButtonborrarActionPerformed

    private void jButtonbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonbuscarActionPerformed
        // TODO add your handling code here:
        int id_huesped = Integer.parseInt(txtid_huesped.getText());
        huespedData.buscarHuesped(id_huesped);
        Huesped huesped = huespedData.buscarHuesped(id_huesped);
        if(null!= huesped) {
        txtid_huesped.setText(huesped.getId_huesped() + "");
        jLabelnombre.setText(huesped.getId_huesped() + "");
        jLabeldni.setText(huesped.getNumero_documento() + "");
        jLabeldireccion.setText(huesped.getDireccion() + "");
        jLabeltelefono.setText(huesped.getTelefono() + "");
        jLabelcorreo.setText(huesped.getEmail() + "");
    }
    }//GEN-LAST:event_jButtonbuscarActionPerformed

    private void txtid_huespedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtid_huespedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtid_huespedActionPerformed

    private void btLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimpiarActionPerformed
        // TODO add your handling code here:
        limpiar();
    }//GEN-LAST:event_btLimpiarActionPerformed
public void limpiar(){

    txtid_huesped.setText("");
    txtnombre_apellido.setText("");
    txtdocumento.setText("");
    txtdire.setText("");
    txttel.setText("");
    txtmail.setText("");}
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmhuesped.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmhuesped.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmhuesped.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmhuesped.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new frmhuesped().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btLimpiar;
    private javax.swing.JButton jButtonactualizar;
    private javax.swing.JButton jButtonborrar;
    private javax.swing.JButton jButtonbuscar;
    private javax.swing.JButton jButtonguardar;
    private javax.swing.JLabel jLabel1huesped;
    private javax.swing.JLabel jLabelcorreo;
    private javax.swing.JLabel jLabeldireccion;
    private javax.swing.JLabel jLabeldni;
    private javax.swing.JLabel jLabelnombre;
    private javax.swing.JLabel jLabeltelefono;
    private javax.swing.JTextField txtdire;
    private javax.swing.JTextField txtdocumento;
    private javax.swing.JTextField txtid_huesped;
    private javax.swing.JTextField txtmail;
    private javax.swing.JTextField txtnombre_apellido;
    private javax.swing.JTextField txttel;
    // End of variables declaration//GEN-END:variables

    
    }
