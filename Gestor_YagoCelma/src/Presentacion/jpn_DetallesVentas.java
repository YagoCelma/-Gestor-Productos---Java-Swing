package Presentacion;

import Dominio.DDetallesVentas;
import MetodosComunes.ImportarExportar;
import Transversal.DetallesVentas;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class jpn_DetallesVentas extends javax.swing.JPanel {

    public static jpn_DetallesVentas instanciar;

    public jpn_DetallesVentas() throws SQLException {

        instanciar = this;

        initComponents();

        DDetallesVentas detalle = new DDetallesVentas();
        detalle.listarDetallesVentas(tbl_detalles);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_detalles = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txt_idVenta = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_idProducto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_cantidad = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_precioUnitario = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cbx_iva = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        rb_descuento = new javax.swing.JRadioButton();
        btn_add = new javax.swing.JButton();
        btn_upd = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        pnl_panelDesglose = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txt_iva0 = new javax.swing.JTextField();
        txt_iva4 = new javax.swing.JTextField();
        txt_iva10 = new javax.swing.JTextField();
        txt_iva21 = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel20 = new javax.swing.JLabel();
        txt_totalPagar = new javax.swing.JTextField();
        txt_subtotal = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cbx_tipoPago = new javax.swing.JComboBox<>();
        txt_idCliente = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        dch_fechaEntrega = new com.toedter.calendar.JDateChooser();
        jLabel13 = new javax.swing.JLabel();
        cbx_estado = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txt_idVenta1 = new javax.swing.JTextField();
        dch_fechaCompra = new com.toedter.calendar.JDateChooser();
        btn_desglose = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btn_exportar = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel1.setText("Gestión Ventas");

        tbl_detalles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID Venta", "ID Producto", "Cantidad", "Precio Unitario", "IVA", "Descuento"
            }
        ));
        tbl_detalles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_detallesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_detalles);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("ID Venta:");

        txt_idVenta.setEnabled(false);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("ID Producto:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Cantidad:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Precio unitario:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("IVA:");

        cbx_iva.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elige una opcion", "0", "4", "10", "21" }));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Descuento:");

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

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Subtotal:");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel16.setText("IVA 0%");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel17.setText("IVA 4%");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel18.setText("IVA 10%");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel19.setText("IVA 21%");

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel20.setText("Total a pagar:");

        javax.swing.GroupLayout pnl_panelDesgloseLayout = new javax.swing.GroupLayout(pnl_panelDesglose);
        pnl_panelDesglose.setLayout(pnl_panelDesgloseLayout);
        pnl_panelDesgloseLayout.setHorizontalGroup(
            pnl_panelDesgloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_panelDesgloseLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(pnl_panelDesgloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnl_panelDesgloseLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(34, 34, 34)
                        .addComponent(txt_subtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnl_panelDesgloseLayout.createSequentialGroup()
                        .addGroup(pnl_panelDesgloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19)
                            .addComponent(jLabel17))
                        .addGap(32, 32, 32)
                        .addGroup(pnl_panelDesgloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_iva0)
                            .addComponent(txt_iva4)
                            .addComponent(txt_iva10)
                            .addComponent(txt_iva21))))
                .addGap(43, 43, 43))
            .addGroup(pnl_panelDesgloseLayout.createSequentialGroup()
                .addGroup(pnl_panelDesgloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnl_panelDesgloseLayout.createSequentialGroup()
                        .addGroup(pnl_panelDesgloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl_panelDesgloseLayout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(jLabel20)
                                .addGap(18, 18, 18)
                                .addComponent(txt_totalPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnl_panelDesgloseLayout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(10, 10, 10)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_panelDesgloseLayout.setVerticalGroup(
            pnl_panelDesgloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_panelDesgloseLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(pnl_panelDesgloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txt_subtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnl_panelDesgloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txt_iva0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnl_panelDesgloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txt_iva4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnl_panelDesgloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txt_iva10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnl_panelDesgloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(txt_iva21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnl_panelDesgloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(txt_totalPagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel9.setText("Gestión Detalles de Ventas");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("ID Cliente:");

        cbx_tipoPago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elige una opcion", "Efectivo", "Tarjeta", "Transferencia" }));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setText("Fecha Entrega:");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setText("Fecha Compra:");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setText("Tipo Pago:");

        cbx_estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elige una opcion", "Pedido", "Facturado", "Anulado" }));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setText("Estado:");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel15.setText("ID Venta:");

        txt_idVenta1.setEnabled(false);

        btn_desglose.setBackground(new java.awt.Color(4, 126, 203));
        btn_desglose.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_desglose.setForeground(new java.awt.Color(255, 255, 255));
        btn_desglose.setText("Desglose IVA");
        btn_desglose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_desglose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_desgloseActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(4, 126, 203));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Limpiar");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

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
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(18, 18, 18)
                                .addComponent(cbx_tipoPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(dch_fechaEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel14)
                                .addGap(18, 18, 18)
                                .addComponent(cbx_estado, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGap(18, 18, 18)
                                .addComponent(txt_idVenta1)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(txt_idCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(dch_fechaCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnl_panelDesglose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(txt_idVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(txt_idProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(txt_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(86, 86, 86))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 624, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(40, 40, 40)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btn_desglose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_exportar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_precioUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(cbx_iva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(rb_descuento))
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btn_upd)
                                .addGap(53, 53, 53))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnl_panelDesglose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_upd)
                            .addComponent(btn_desglose))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jButton3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(btn_exportar)))
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(9, 9, 9))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel10)
                                .addComponent(txt_idCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel12)
                                .addComponent(jLabel15)
                                .addComponent(txt_idVenta1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(dch_fechaCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel14)
                                .addComponent(jLabel11)
                                .addComponent(cbx_estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel13)
                                .addComponent(cbx_tipoPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(dch_fechaEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txt_idVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(txt_idProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(txt_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txt_precioUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(cbx_iva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(rb_descuento))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16))
        );
    }// </editor-fold>//GEN-END:initComponents

    //Meterle caja negra, sobre todo a los numeros
    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed

        String idVentaTexto = txt_idVenta.getText().trim();
        String idProductoTexto = txt_idProducto.getText().trim();
        String cantidadTexto = txt_cantidad.getText().trim();
        String precioUnitarioTexto = txt_precioUnitario.getText().trim();
        String ivaTexto = (String) cbx_iva.getSelectedItem();

        if (idVentaTexto.isEmpty() || idProductoTexto.isEmpty() || cantidadTexto.isEmpty() || precioUnitarioTexto.isEmpty() || ivaTexto == null || ivaTexto.isEmpty()) {

            JOptionPane.showMessageDialog(this, "Rellene todos los campos", "Campos Vacíos", JOptionPane.WARNING_MESSAGE);
            return;
        }

        int idProducto;
        int cantidad;
        try {
            idProducto = Integer.parseInt(idProductoTexto);
            cantidad = Integer.parseInt(cantidadTexto);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "El numero del ID Producto y la cantidad tienen que ser numeros enteros", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        double precioUnitario;
        try {
            precioUnitario = Double.parseDouble(precioUnitarioTexto);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "El formato del numero precio unitario no es correcto", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (idProducto <= 0 || precioUnitario < 0 || cantidad < 0) {
            JOptionPane.showMessageDialog(null, "El valor del ID Producto, la cantidad y el precio unitario deben ser valores positivos", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            DetallesVentas detalles = new DetallesVentas();

            detalles.setIdVenta(Integer.parseInt(idVentaTexto));
            detalles.setIdProducto(idProducto);
            detalles.setCantidad(cantidad);
            detalles.setPrecioUnitario(precioUnitario);
            detalles.setIva(Integer.parseInt(ivaTexto));

            detalles.setDescuento(rb_descuento.isSelected());

            DDetallesVentas ddetalles = new DDetallesVentas();

            ddetalles.crearDetallesVenta(detalles);
            limpiarCampos();
            ddetalles.listarDetallesVentas(tbl_detalles);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ingrese solo números válidos", "Error de Formato", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error en Base de Datos:\n" + e.getMessage(), "Error SQL", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btn_addActionPerformed

    private void btn_updActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updActionPerformed

        String idVentaTexto = txt_idVenta.getText().trim();
        String idProductoTexto = txt_idProducto.getText().trim();
        String cantidadTexto = txt_cantidad.getText().trim();
        String precioUnitarioTexto = txt_precioUnitario.getText().trim();
        String ivaTexto = (String) cbx_iva.getSelectedItem();

        if (idVentaTexto.isEmpty() || idProductoTexto.isEmpty() || cantidadTexto.isEmpty() || precioUnitarioTexto.isEmpty() || ivaTexto == null || ivaTexto.isEmpty()) {

            JOptionPane.showMessageDialog(this, "Rellene los campos", "Campos Vacios", JOptionPane.WARNING_MESSAGE);
            return;
        }

        int idProducto;
        int cantidad;
        try {
            idProducto = Integer.parseInt(idVentaTexto);
            cantidad = Integer.parseInt(cantidadTexto);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "El numero del ID Producto y la cantidad tienen que ser numeros enteros", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        double precioUnitario;
        try {
            precioUnitario = Double.parseDouble(precioUnitarioTexto);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "El formato del numero precio unitario no es correcto", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (idProducto <= 0 || precioUnitario < 0 || cantidad < 0) {
            JOptionPane.showMessageDialog(null, "El valor del ID Producto, la cantidad y el precio unitario deben ser valores positivos", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            DetallesVentas detalles = new DetallesVentas();

            detalles.setIdVenta(Integer.parseInt(idVentaTexto));
            detalles.setIdProducto(idProducto);
            detalles.setCantidad(cantidad);
            detalles.setPrecioUnitario(precioUnitario);
            detalles.setIva(Integer.parseInt(ivaTexto));
            detalles.setDescuento(rb_descuento.isSelected());

            DDetallesVentas ddetalles = new DDetallesVentas();

            ddetalles.modificarDetalles(detalles);
            
            limpiarCampos();

            JOptionPane.showMessageDialog(this, "Modificado correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);

            ddetalles.listarDetallesVentas(tbl_detalles);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ingrese numeros validos", "Error de Formato", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al actualizar en Base de Datos:\n" + e.getMessage(), "Error SQL", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_updActionPerformed

    private void tbl_detallesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_detallesMouseClicked

        DDetallesVentas detalle = new DDetallesVentas();

        detalle.seleccionarDetalles(tbl_detalles, txt_idVenta, txt_idProducto, txt_cantidad, txt_precioUnitario, cbx_iva, rb_descuento);
    }//GEN-LAST:event_tbl_detallesMouseClicked

    private void btn_desgloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_desgloseActionPerformed

        double subtotal = 0;
        double montoIva0 = 0;
        double montoIva4 = 0;
        double montoIva10 = 0;
        double montoIva21 = 0;
        double totalPagar = 0;

        DefaultTableModel model = (DefaultTableModel) tbl_detalles.getModel();
        int numFilas = model.getRowCount();

        for (int i = 0; i < numFilas; i++) {
            try {

                int cantidad = Integer.parseInt(model.getValueAt(i, 2).toString());
                double precio = Double.parseDouble(model.getValueAt(i, 3).toString());
                double ivaPorcentaje = Double.parseDouble(model.getValueAt(i, 4).toString());

                double subtotalFila = cantidad * precio;
                double ivaCalculadoFila = subtotalFila * (ivaPorcentaje / 100.0);

                subtotal += subtotalFila;

                switch (ivaPorcentaje) {
                    case 0.0: //lo pongo asi con el .0 porque lo tengo como un double y sino me da error
                        montoIva0 += subtotalFila;
                        break;
                    case 4.0:
                        montoIva4 += ivaCalculadoFila;
                        break;
                    case 10.0:
                        montoIva10 += ivaCalculadoFila;
                        break;
                    case 21.0:
                        montoIva21 += ivaCalculadoFila;
                        break;
                    default:
                        break;
                }

            } catch (NumberFormatException e) {
                System.err.println("Error al leer la fila " + i + ": " + e.getMessage());
                javax.swing.JOptionPane.showMessageDialog(this, "Error en los datos de la fila " + (i + 1), "Error de Datos", JOptionPane.ERROR_MESSAGE);
                return; // Detenemos el cálculo si hay un error
            }
        }

        totalPagar = subtotal + montoIva4 + montoIva10 + montoIva21;

        txt_subtotal.setText(String.format("%.2f", subtotal));
        txt_iva0.setText(String.format("%.2f", montoIva0));
        txt_iva4.setText(String.format("%.2f", montoIva4));
        txt_iva10.setText(String.format("%.2f", montoIva10));
        txt_iva21.setText(String.format("%.2f", montoIva21));
        txt_totalPagar.setText(String.format("%.2f", totalPagar));

    }//GEN-LAST:event_btn_desgloseActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        limpiarCampos();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_exportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exportarActionPerformed
        ImportarExportar.exportarCSV(tbl_detalles, this);
    }//GEN-LAST:event_btn_exportarActionPerformed

    public void limpiarCampos(){
        txt_idVenta.setText("");
        txt_idProducto.setText("");
        txt_cantidad.setText("");
        txt_precioUnitario.setText("");

        if (cbx_iva.getItemCount() > 0) {
            cbx_iva.setSelectedIndex(0); 
        }

        rb_descuento.setSelected(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_desglose;
    private javax.swing.JButton btn_exportar;
    private javax.swing.JButton btn_upd;
    private javax.swing.JComboBox<String> cbx_estado;
    private javax.swing.JComboBox<String> cbx_iva;
    private javax.swing.JComboBox<String> cbx_tipoPago;
    private com.toedter.calendar.JDateChooser dch_fechaCompra;
    private com.toedter.calendar.JDateChooser dch_fechaEntrega;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel pnl_panelDesglose;
    private javax.swing.JRadioButton rb_descuento;
    private javax.swing.JTable tbl_detalles;
    private javax.swing.JTextField txt_cantidad;
    private javax.swing.JTextField txt_idCliente;
    private javax.swing.JTextField txt_idProducto;
    private javax.swing.JTextField txt_idVenta;
    private javax.swing.JTextField txt_idVenta1;
    private javax.swing.JTextField txt_iva0;
    private javax.swing.JTextField txt_iva10;
    private javax.swing.JTextField txt_iva21;
    private javax.swing.JTextField txt_iva4;
    private javax.swing.JTextField txt_precioUnitario;
    private javax.swing.JTextField txt_subtotal;
    private javax.swing.JTextField txt_totalPagar;
    // End of variables declaration//GEN-END:variables

    public void colocarDatos(String idVenta, String idCliente, Date fechaCompra, String tipoPago, Date fechaEntrega, String estado) {

        txt_idVenta.setText(idVenta);
        txt_idVenta1.setText(idVenta);
        txt_idCliente.setText(idCliente);
        dch_fechaCompra.setDate(fechaCompra);
        cbx_tipoPago.setSelectedItem(tipoPago);
        dch_fechaEntrega.setDate(fechaEntrega);
        cbx_estado.setSelectedItem(estado);

    }

    public void listarDetalles(String idVentaTexto) throws SQLException {

        DDetallesVentas detalle = new DDetallesVentas();

        int idVenta = 0;

        try {
            idVenta = Integer.parseInt(idVentaTexto);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }

        detalle.listarDetalles(tbl_detalles, idVenta);
    }
}
