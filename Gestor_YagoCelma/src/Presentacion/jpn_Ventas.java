package Presentacion;

import Dominio.DVentas;
import MetodosComunes.ImportarExportar;
import Transversal.Ventas;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.JOptionPane;

public class jpn_Ventas extends javax.swing.JPanel {

    public jpn_Ventas() throws SQLException {
        initComponents();

        DVentas venta = new DVentas();

        tbl_ventas.setDefaultEditor(Object.class, null);

        venta.listarVentas(tbl_ventas);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_idCliente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_ventas = new javax.swing.JTable();
        btn_add = new javax.swing.JButton();
        btn_upd = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btn_new = new javax.swing.JButton();
        cbx_tipoPago = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        dch_fechaEntrega = new com.toedter.calendar.JDateChooser();
        cbx_estado = new javax.swing.JComboBox<>();
        dch_fechaCompra = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        txt_idVenta = new javax.swing.JTextField();
        btn_exportar = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel1.setText("Gestión de Ventas");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("ID Cliente:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Fecha Compra:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Tipo Pago:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Estado:");

        tbl_ventas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Ventas", "ID Cliente", "Fecha Compra", "Tipo Pago", "Fecha Entrega", "Estado", "Numero Factura"
            }
        ));
        tbl_ventas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_ventasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_ventas);

        btn_add.setBackground(new java.awt.Color(71, 159, 52));
        btn_add.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_add.setForeground(new java.awt.Color(255, 255, 255));
        btn_add.setText("Añadir");
        btn_add.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });

        btn_upd.setBackground(new java.awt.Color(4, 126, 203));
        btn_upd.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_upd.setForeground(new java.awt.Color(255, 255, 255));
        btn_upd.setText("Actualizar");
        btn_upd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_upd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(208, 50, 51));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Eliminar");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btn_new.setBackground(new java.awt.Color(4, 126, 203));
        btn_new.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_new.setForeground(new java.awt.Color(255, 255, 255));
        btn_new.setText("Limpiar");
        btn_new.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_new.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_newActionPerformed(evt);
            }
        });

        cbx_tipoPago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elige una opcion", "Efectivo", "Tarjeta", "Transferencia" }));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Fecha Entrega:");

        cbx_estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elige una opcion", "Pedido", "Facturado", "Anulado" }));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("ID Venta:");

        txt_idVenta.setEnabled(false);

        btn_exportar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_exportar.setText("Exportar");
        btn_exportar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_exportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exportarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 661, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btn_upd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_add, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_new, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_exportar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(cbx_tipoPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(dch_fechaEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(cbx_estado, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(txt_idVenta)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txt_idCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(dch_fechaCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(674, 674, 674))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txt_idCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel7)
                        .addComponent(txt_idVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(dch_fechaCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jLabel6)
                        .addComponent(cbx_estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(cbx_tipoPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(dch_fechaEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(btn_add)
                        .addGap(18, 18, 18)
                        .addComponent(btn_upd)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(btn_new)
                        .addGap(18, 18, 18)
                        .addComponent(btn_exportar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed

        String idClienteTexto = txt_idCliente.getText().trim();
        Date fechaCompra = dch_fechaCompra.getDate();
        String tipoPago = (String) cbx_tipoPago.getSelectedItem();
        Date fechaEntrega = dch_fechaEntrega.getDate();
        String estado = (String) cbx_estado.getSelectedItem();

        //que no haya ningun campo nulo
        if (idClienteTexto.isEmpty() || fechaCompra == null || tipoPago.isEmpty() || fechaEntrega == null || estado.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No puede quedar ningun campo vacio", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int idCliente;
        try {
            //Parseo el idCliente
            idCliente = Integer.parseInt(idClienteTexto);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "El ID Cliente tiene que ser numero entero", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (idCliente <= 0) {
            JOptionPane.showMessageDialog(null, "El ID Cliente tiene que ser un numero positivo", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Ventas venta = new Ventas();
        venta.setIdCliente(idCliente);
        venta.setFechaCompra(fechaCompra);
        venta.setTipoPago(tipoPago);
        venta.setFechaEntrega(fechaEntrega);
        venta.setEstado(estado);

        DVentas dventa = new DVentas();

        try {
            dventa.crearVenta(venta);
            limpiarCampos();
            JOptionPane.showMessageDialog(null, "Venta creada", "Informacion", JOptionPane.INFORMATION_MESSAGE);
            dventa.listarVentas(tbl_ventas);
        } catch (SQLException e) {
            System.out.println("Error en insert producto: " + e.getMessage());
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al guardar la venta: " + e.getMessage(), "Error SQL", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_addActionPerformed

    private void tbl_ventasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_ventasMouseClicked

        DVentas ventas = new DVentas();
        ventas.seleccionarVenta(tbl_ventas, txt_idVenta, txt_idCliente, dch_fechaCompra, cbx_tipoPago, dch_fechaEntrega, cbx_estado);
        
        String idVentasTexto = txt_idVenta.getText().trim();
        String idClienteTexto = txt_idCliente.getText().trim();
        Date fechaCompra = dch_fechaCompra.getDate();
        String tipoPago = (String) cbx_tipoPago.getSelectedItem();
        Date fechaEntrega = dch_fechaEntrega.getDate();
        String estado = (String) cbx_estado.getSelectedItem();

        if (evt.getClickCount() == 2 && tbl_ventas.getSelectedRow() != -1) {
            
            try {
                frmPrincipal.instancia.Inicio(5);
                jpn_DetallesVentas.instanciar.colocarDatos(idVentasTexto, idClienteTexto, fechaCompra, tipoPago, fechaEntrega, estado);
                jpn_DetallesVentas.instanciar.listarDetalles(idVentasTexto);
            } catch (SQLException ex) {
                System.getLogger(jpn_Ventas.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
            }
        }


    }//GEN-LAST:event_tbl_ventasMouseClicked

    private void btn_updActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updActionPerformed

        String idVentaTexto = txt_idVenta.getText().trim();
        String idClienteTexto = txt_idCliente.getText().trim();
        Date fechaCompra = dch_fechaCompra.getDate();
        String tipoPago = (String) cbx_tipoPago.getSelectedItem();
        Date fechaEntrega = dch_fechaEntrega.getDate();
        String estado = (String) cbx_estado.getSelectedItem();

        //validar que no haya ningun campo vacio
        if (idClienteTexto.isEmpty() || fechaCompra == null || tipoPago.isEmpty() || fechaEntrega == null || estado.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No puede quedar ningun campo vacio", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int idCliente;
        int idVenta;
        try {
            //Parseo el idCliente
            idCliente = Integer.parseInt(idClienteTexto);
            idVenta = Integer.parseInt(idVentaTexto);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "El ID Cliente tiene que ser numero entero", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (idCliente <= 0) {
            JOptionPane.showMessageDialog(null, "El ID Cliente tiene que ser un numero positivo", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Ventas venta = new Ventas();
        venta.setIdVenta(idVenta);
        venta.setIdCliente(idCliente);
        venta.setFechaCompra(fechaCompra);
        venta.setTipoPago(tipoPago);
        venta.setFechaEntrega(fechaEntrega);
        venta.setEstado(estado);

        DVentas dventas = new DVentas();

        try {
            dventas.modificarVentas(venta);
            limpiarCampos();
            dventas.listarVentas(tbl_ventas);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar la venta", "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_updActionPerformed

    private void btn_newActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_newActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_btn_newActionPerformed

    private void btn_exportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exportarActionPerformed
        ImportarExportar.exportarCSV(tbl_ventas, this);
    }//GEN-LAST:event_btn_exportarActionPerformed

    public void limpiarCampos(){
        txt_idVenta.setText("");
        txt_idCliente.setText("");
        dch_fechaCompra.setDate(null);
        dch_fechaEntrega.setDate(null);
        if (cbx_tipoPago.getItemCount() > 0) {
            cbx_tipoPago.setSelectedIndex(0);
        }
        if (cbx_estado.getItemCount() > 0) {
            cbx_estado.setSelectedIndex(0);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_exportar;
    private javax.swing.JButton btn_new;
    private javax.swing.JButton btn_upd;
    private javax.swing.JComboBox<String> cbx_estado;
    private javax.swing.JComboBox<String> cbx_tipoPago;
    private com.toedter.calendar.JDateChooser dch_fechaCompra;
    private com.toedter.calendar.JDateChooser dch_fechaEntrega;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_ventas;
    private javax.swing.JTextField txt_idCliente;
    private javax.swing.JTextField txt_idVenta;
    // End of variables declaration//GEN-END:variables

}
