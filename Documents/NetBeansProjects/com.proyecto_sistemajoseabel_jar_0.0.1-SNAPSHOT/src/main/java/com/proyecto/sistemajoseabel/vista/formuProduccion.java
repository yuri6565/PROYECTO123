/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.proyecto.sistemajoseabel.vista;

import com.proyecto.sistemajoseabel.entidades.EstadoProduccion;
import com.proyecto.sistemajoseabel.entidades.Pedido;
import com.proyecto.sistemajoseabel.entidades.Produccion;
import com.proyecto.sistemajoseabel.servicios.ProduccionService;
import java.awt.Frame;

import java.time.LocalDate;
import java.time.ZoneId;
import javax.swing.JOptionPane;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;


public class formuProduccion extends javax.swing.JDialog {
@Autowired
ProduccionService serviciopro;
@Autowired
private ApplicationContext context; 

    /**
     * Creates new form formuProduccion
     */
    public formuProduccion(Frame parent, boolean modal, ProduccionService serviciopro) {
        super(parent, modal);
        setLocationRelativeTo(parent);
        this.serviciopro = serviciopro;
        initComponents();
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnGuardar = new rojeru_san.RSButtonRiple();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnCancelar = new rojeru_san.RSButtonRiple();
        jComboBoxPedido = new RSMaterialComponent.RSComboBoxMaterial();
        txtinicio = new com.toedter.calendar.JDateChooser();
        txtfinal = new com.toedter.calendar.JDateChooser();
        jLabel11 = new javax.swing.JLabel();
        txtnombre = new RSMaterialComponent.RSTextFieldMaterial();
        Boxestado1 = new RSMaterialComponent.RSComboBoxMaterial();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(46, 49, 82));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century751 BT", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Produccion");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 50));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel6.setText("fecha final:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        btnGuardar.setBackground(new java.awt.Color(46, 49, 82));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/plus (2).png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setFont(new java.awt.Font("Humnst777 BlkCn BT", 1, 18)); // NOI18N
        btnGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, 140, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel9.setText("Pedido:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel10.setText("fecha inicial:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, -1, -1));

        btnCancelar.setBackground(new java.awt.Color(46, 49, 82));
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/salida (1).png"))); // NOI18N
        btnCancelar.setText("Volver");
        btnCancelar.setFont(new java.awt.Font("Humnst777 BlkCn BT", 1, 18)); // NOI18N
        btnCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 140, -1));

        jComboBoxPedido.setForeground(new java.awt.Color(102, 102, 102));
        jComboBoxPedido.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar", "pendiente", "proceso", "finalizado" }));
        jComboBoxPedido.setFont(new java.awt.Font("Roboto Bold", 0, 14)); // NOI18N
        jComboBoxPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxPedidoActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBoxPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 210, -1));

        txtinicio.setBackground(new java.awt.Color(255, 255, 255));
        txtinicio.setForeground(new java.awt.Color(255, 255, 255));
        txtinicio.setDateFormatString("y-MM-d");
        txtinicio.setMaxSelectableDate(new java.util.Date(253370786472000L));
        jPanel1.add(txtinicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, 200, 30));

        txtfinal.setBackground(new java.awt.Color(255, 255, 255));
        txtfinal.setForeground(new java.awt.Color(255, 255, 255));
        txtfinal.setDateFormatString("y-MM-d");
        jPanel1.add(txtfinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 210, 30));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel11.setText("Nombre:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        txtnombre.setEditable(false);
        txtnombre.setBackground(new java.awt.Color(255, 255, 255));
        txtnombre.setForeground(new java.awt.Color(0, 0, 0));
        txtnombre.setColorMaterial(new java.awt.Color(0, 0, 0));
        txtnombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtnombre.setPhColor(new java.awt.Color(0, 0, 0));
        txtnombre.setPlaceholder("");
        txtnombre.setSelectionColor(new java.awt.Color(0, 0, 0));
        txtnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreActionPerformed(evt);
            }
        });
        jPanel1.add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 210, 30));

        Boxestado1.setForeground(new java.awt.Color(102, 102, 102));
        Boxestado1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar", "pendiente", "proceso", "finalizado" }));
        Boxestado1.setFont(new java.awt.Font("Roboto Bold", 0, 14)); // NOI18N
        Boxestado1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boxestado1ActionPerformed(evt);
            }
        });
        jPanel1.add(Boxestado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel12.setText("Estado:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
 
String nombre = txtnombre.getText().trim();

// Validar fechas
if (txtinicio.getDate() == null || txtfinal.getDate() == null) {
    JOptionPane.showMessageDialog(this, "Por favor seleccione ambas fechas.");
    return;
}

// Convertir fechas de java.util.Date a java.time.LocalDate
LocalDate fechaInicio = txtinicio.getDate().toInstant()
    .atZone(ZoneId.systemDefault())
    .toLocalDate();

LocalDate fechaFin = txtfinal.getDate().toInstant()
    .atZone(ZoneId.systemDefault())
    .toLocalDate();

// Validar selección de estado
String estadoStr = Boxestado1.getSelectedItem().toString();
if (estadoStr.equals("Seleccione estado")) {
    JOptionPane.showMessageDialog(this, "Por favor seleccione un estado válido.");
    return;
}

EstadoProduccion estadoProduccion;
try {
    estadoProduccion = EstadoProduccion.valueOf(estadoStr.toUpperCase()); // Asegúrate que coincida con los enum
} catch (IllegalArgumentException ex) {
    JOptionPane.showMessageDialog(this, "Estado no válido.");
    return;
}

// Validar selección de pedido
Pedido pedido = (Pedido) jComboBoxPedido.getSelectedItem();



// Crear objeto Producción
Produccion nuevaProduccion = new Produccion();
nuevaProduccion.setNombre(nombre);
nuevaProduccion.setFechaInicio(fechaInicio);
nuevaProduccion.setFechaFin(fechaFin);
nuevaProduccion.setEstado(estadoProduccion);
nuevaProduccion.setPedido(pedido);

// Guardar
try {
    serviciopro.guardar(nuevaProduccion);
    JOptionPane.showMessageDialog(this, "Producción guardada exitosamente.");
    dispose();
} catch (Exception e) {
    JOptionPane.showMessageDialog(this, "Error al guardar la producción: " + e.getMessage());
}


    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();

    }//GEN-LAST:event_btnCancelarActionPerformed

    private void jComboBoxPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxPedidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxPedidoActionPerformed

    private void txtnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreActionPerformed

    private void Boxestado1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boxestado1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Boxestado1ActionPerformed

    /**
     * @param context
     * @param args the command line arguments
     */
    public static void startFrm(ApplicationContext context) {
       java.awt.EventQueue.invokeLater(() -> {
        formuProduccion ventana = context.getBean(formuProduccion.class);
        ventana.setVisible(true);
    });
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RSMaterialComponent.RSComboBoxMaterial Boxestado1;
    private rojeru_san.RSButtonRiple btnCancelar;
    private rojeru_san.RSButtonRiple btnGuardar;
    private RSMaterialComponent.RSComboBoxMaterial jComboBoxPedido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private com.toedter.calendar.JDateChooser txtfinal;
    private com.toedter.calendar.JDateChooser txtinicio;
    private RSMaterialComponent.RSTextFieldMaterial txtnombre;
    // End of variables declaration//GEN-END:variables
}
