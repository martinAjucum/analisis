/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package INTERFACES;

/**
 *
 * @author DAVID
 */
public class principal extends javax.swing.JFrame {

    /**
     * Creates new form principal
     */
    public principal() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        clientes = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pagos = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        Empleados = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        Cobros = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        proveedores = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        VentasContado = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        ventascredito = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        reportes = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        TipoPagos = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        productos = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        vehiculos = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        Rutas = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        Pedidos = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        compras = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        anulacion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MEJORES PRECIOS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, -1));

        clientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/1496194054_Customer_Male_Light.png"))); // NOI18N
        clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientesActionPerformed(evt);
            }
        });
        jPanel1.add(clientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 80, 70));

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Pagos");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 90, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Rutas");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 290, 80, -1));

        pagos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/1496194600_money.png"))); // NOI18N
        pagos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pagosActionPerformed(evt);
            }
        });
        jPanel1.add(pagos, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 80, 70));

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Empleados");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 90, -1));

        Empleados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/1496194156_Manager.png"))); // NOI18N
        Empleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmpleadosActionPerformed(evt);
            }
        });
        jPanel1.add(Empleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 80, 70));

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Clientes");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 70, -1));

        Cobros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/1496195542_Money-Graph.png"))); // NOI18N
        Cobros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CobrosActionPerformed(evt);
            }
        });
        jPanel1.add(Cobros, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 80, 70));

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Cobros");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 70, -1));

        proveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/1496195796_provider.png"))); // NOI18N
        proveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proveedoresActionPerformed(evt);
            }
        });
        jPanel1.add(proveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 80, 70));

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Tipo de Pagos");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 290, 100, -1));

        VentasContado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/1496196151_money.png"))); // NOI18N
        VentasContado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VentasContadoActionPerformed(evt);
            }
        });
        jPanel1.add(VentasContado, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, 80, 70));

        jLabel8.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Facturas");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 90, -1));

        ventascredito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/1496196450_Visa.png"))); // NOI18N
        ventascredito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ventascreditoActionPerformed(evt);
            }
        });
        jPanel1.add(ventascredito, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 80, 70));

        jLabel9.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Proveedores");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 100, -1));

        reportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/1496213856_custom-reports.png"))); // NOI18N
        reportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportesActionPerformed(evt);
            }
        });
        jPanel1.add(reportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 80, 70));

        jLabel10.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Reportes");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, 100, -1));

        TipoPagos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/1496215151_document-02.png"))); // NOI18N
        TipoPagos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipoPagosActionPerformed(evt);
            }
        });
        jPanel1.add(TipoPagos, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 320, 80, 70));

        jLabel11.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Ventas Crédito");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, 130, -1));

        productos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/1496215439_Cart_2.png"))); // NOI18N
        productos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productosActionPerformed(evt);
            }
        });
        jPanel1.add(productos, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 90, 80, 70));

        jLabel12.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Anulación");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 290, 80, -1));

        vehiculos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/1496215427_car.png"))); // NOI18N
        vehiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vehiculosActionPerformed(evt);
            }
        });
        jPanel1.add(vehiculos, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 200, 80, 70));

        jLabel13.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Vehiculos");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 170, 80, -1));

        Rutas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/1496215696_road.png"))); // NOI18N
        Rutas.setToolTipText("");
        Rutas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RutasActionPerformed(evt);
            }
        });
        jPanel1.add(Rutas, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 320, 80, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Productos");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 70, 80, -1));

        Pedidos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/1496215802_interface-45.png"))); // NOI18N
        Pedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PedidosActionPerformed(evt);
            }
        });
        jPanel1.add(Pedidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 90, 70, 70));

        jLabel15.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Pedidos");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 70, 80, -1));

        compras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/1496216127_icon-68.png"))); // NOI18N
        compras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprasActionPerformed(evt);
            }
        });
        jPanel1.add(compras, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 200, 70, 70));

        jLabel16.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Compras");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 170, 80, -1));

        anulacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/1496216568_delete.png"))); // NOI18N
        anulacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anulacionActionPerformed(evt);
            }
        });
        jPanel1.add(anulacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 320, 80, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 740, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientesActionPerformed
        // TODO add your handling code here:
        Clientes c = new Clientes();
        c.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_clientesActionPerformed

    private void pagosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pagosActionPerformed
        // TODO add your handling code here:
        FormaPagos p = new FormaPagos();
        p.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_pagosActionPerformed

    private void EmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmpleadosActionPerformed
        // TODO add your handling code here:
        Empleados e = new Empleados();
        e.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_EmpleadosActionPerformed

    private void CobrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CobrosActionPerformed
        // TODO add your handling code here:
        Cobros c = new Cobros();
        c.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CobrosActionPerformed

    private void proveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proveedoresActionPerformed
        // TODO add your handling code here:
        Proveedor p = new Proveedor();
        p.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_proveedoresActionPerformed

    private void VentasContadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VentasContadoActionPerformed
        // TODO add your handling code here:
        Facturas vc = new Facturas();
        vc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_VentasContadoActionPerformed

    private void ventascreditoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ventascreditoActionPerformed
        // TODO add your handling code here:
        ventas_credito vc = new ventas_credito();
        vc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ventascreditoActionPerformed

    private void reportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportesActionPerformed
        // TODO add your handling code here:
        Reportes r = new Reportes();
        r.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_reportesActionPerformed

    private void TipoPagosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TipoPagosActionPerformed
        // TODO add your handling code here:
        TipoPagos tp = new TipoPagos();
        tp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_TipoPagosActionPerformed

    private void productosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productosActionPerformed
        // TODO add your handling code here:
        Productos p = new Productos ();
        p.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_productosActionPerformed

    private void vehiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vehiculosActionPerformed
        // TODO add your handling code here:
        vehiculos v = new vehiculos();
        v.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_vehiculosActionPerformed

    private void RutasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RutasActionPerformed
        // TODO add your handling code here:
        rutas r = new rutas();
        r.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_RutasActionPerformed

    private void PedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PedidosActionPerformed
        // TODO add your handling code here:
        Pedido p = new Pedido();
        p.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_PedidosActionPerformed

    private void comprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprasActionPerformed
        // TODO add your handling code here:
        Compras c = new Compras();
        c.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_comprasActionPerformed

    private void anulacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anulacionActionPerformed
        // TODO add your handling code here:
        Anulacion a = new Anulacion ();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_anulacionActionPerformed

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
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cobros;
    private javax.swing.JButton Empleados;
    private javax.swing.JButton Pedidos;
    private javax.swing.JButton Rutas;
    private javax.swing.JButton TipoPagos;
    private javax.swing.JButton VentasContado;
    private javax.swing.JButton anulacion;
    private javax.swing.JButton clientes;
    private javax.swing.JButton compras;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton pagos;
    private javax.swing.JButton productos;
    private javax.swing.JButton proveedores;
    private javax.swing.JButton reportes;
    private javax.swing.JButton vehiculos;
    private javax.swing.JButton ventascredito;
    // End of variables declaration//GEN-END:variables
}
