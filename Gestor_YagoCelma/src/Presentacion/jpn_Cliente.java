package Presentacion;

import Dominio.DClientes;
import MetodosComunes.ImportarExportar;
import MetodosComunes.MetodosComunes;
import Transversal.Cliente;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

public class jpn_Cliente extends javax.swing.JPanel {

    MetodosComunes comunes = new MetodosComunes();

    public jpn_Cliente() throws SQLException {

        initComponents();

        DClientes cliente = new DClientes();

        cliente.listarClientes(tbl_cln);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        txt_razonComercial = new javax.swing.JTextField();
        txt_nif = new javax.swing.JTextField();
        txt_telefono = new javax.swing.JTextField();
        txt_correo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_cln = new javax.swing.JTable();
        btn_add = new javax.swing.JButton();
        btn_del = new javax.swing.JButton();
        btn_upd = new javax.swing.JButton();
        btn_exp = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btn_limpiar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        cbx_tipoPago = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        txt_direccionFacturacion = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_direccionEnvio = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_idCliente = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(1350, 559));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Nombre:");
        jLabel2.setPreferredSize(new java.awt.Dimension(70, 16));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Razon Comercial:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("NIF:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Télefono:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Correo:");

        txt_telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_telefonoKeyTyped(evt);
            }
        });

        tbl_cln.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Cliente", "Nombre", "Razon comercial", "NIF", "Correo", "Telefono", "Tipo pago", "Dirección facturación", "Dirección envio"
            }
        ));
        tbl_cln.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_clnMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_cln);

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

        btn_del.setBackground(new java.awt.Color(208, 50, 51));
        btn_del.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_del.setForeground(new java.awt.Color(255, 255, 255));
        btn_del.setText("Eliminar");
        btn_del.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

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

        btn_exp.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_exp.setText("Exportar");
        btn_exp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_exp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_expActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel1.setText("Gestión de Clientes");

        btn_limpiar.setBackground(new java.awt.Color(4, 126, 203));
        btn_limpiar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_limpiar.setForeground(new java.awt.Color(255, 255, 255));
        btn_limpiar.setText("Limpiar");
        btn_limpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Tipo pago:");

        cbx_tipoPago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elige una opcion\t", "Efectivo", "Tarjeta", "Trasferencia" }));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Dirección facturación:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("Dirección envio");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("ID Cliente");

        txt_idCliente.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_idCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txt_razonComercial, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbx_tipoPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(txt_direccionFacturacion, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(txt_direccionEnvio, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(txt_nif, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(65, 65, 65)
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(txt_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_upd)
                                .addGap(18, 18, 18)
                                .addComponent(btn_del)
                                .addGap(18, 18, 18)
                                .addComponent(btn_limpiar)
                                .addGap(44, 44, 44)
                                .addComponent(btn_exp))
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 951, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 380, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_razonComercial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txt_idCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(txt_nif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)
                        .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cbx_tipoPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txt_direccionFacturacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(txt_direccionEnvio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_add)
                    .addComponent(btn_upd)
                    .addComponent(btn_del)
                    .addComponent(btn_limpiar)
                    .addComponent(btn_exp))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed

        String nombre = txt_nombre.getText().trim();
        String razonComercial = txt_razonComercial.getText().trim();
        String nif = txt_nif.getText().trim();
        String correo = txt_correo.getText().trim();
        String telefono = txt_telefono.getText().trim();
        String tipoPago = (String) cbx_tipoPago.getSelectedItem();
        String direccionFacturacion = txt_direccionFacturacion.getText().trim();
        String direccionEnvio = txt_direccionEnvio.getText().trim();

        if (nombre.isEmpty() || razonComercial.isEmpty() || nif.isEmpty() || correo.isEmpty() || telefono.isEmpty() || tipoPago.isEmpty() || direccionFacturacion.isEmpty() || direccionEnvio.isEmpty()) {

            JOptionPane.showMessageDialog(null, "Ningún campo puede estar vacío", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Validamos el NIF
        if (!comunes.comprobarNif(nif)) {
            JOptionPane.showMessageDialog(null, "Error en el fomato NIF", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        //comprobar el formato del correo
        if (!comunes.comprobarCorreo(correo)) {
            JOptionPane.showMessageDialog(null, "Error en el fomato del correo", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Cliente cliente = new Cliente();
        cliente.setNombre(nombre);
        cliente.setRazonComercial(razonComercial);
        cliente.setNif(nif);
        cliente.setCorreo(correo);
        cliente.setTelefono(telefono);
        cliente.setTipoPago(tipoPago);
        cliente.setDireccionFacturacion(direccionFacturacion);
        cliente.setDireccionEnvio(direccionEnvio);

        DClientes cli = new DClientes();

        try {
            if (cli.existeNif(nif)) {
                JOptionPane.showMessageDialog(null, "Ya existe ese nif", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            cli.crearClientes(cliente);
            JOptionPane.showMessageDialog(null, "Cliente creado correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            limpiarCampos();
            cli.listarClientes(tbl_cln);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al guardar el cliente: " + ex.getMessage(), "Error SQL", JOptionPane.ERROR_MESSAGE);
            System.getLogger(jpn_Cliente.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }

    }//GEN-LAST:event_btn_addActionPerformed

    private void tbl_clnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_clnMouseClicked

        DClientes cliente = new DClientes();

        cliente.seleccionarCliente(tbl_cln, txt_idCliente, txt_nombre, txt_razonComercial, txt_nif, txt_correo, txt_telefono, cbx_tipoPago, txt_direccionFacturacion, txt_direccionEnvio);
    }//GEN-LAST:event_tbl_clnMouseClicked

    private void btn_updActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updActionPerformed

        String nombre = txt_nombre.getText().trim();
        String razonComercial = txt_razonComercial.getText().trim();
        String nif = txt_nif.getText().trim();
        String correo = txt_correo.getText().trim();
        String telefono = txt_telefono.getText().trim();
        String tipoPago = (String) cbx_tipoPago.getSelectedItem();
        String direccionFacturacion = txt_direccionFacturacion.getText().trim();
        String direccionEnvio = txt_direccionEnvio.getText().trim();

        if (nombre.isEmpty() || razonComercial.isEmpty() || nif.isEmpty() || correo.isEmpty() || telefono.isEmpty() || tipoPago.isEmpty()
                || direccionFacturacion.isEmpty() || direccionEnvio.isEmpty()) {

            JOptionPane.showMessageDialog(null, "Ningún campo puede estar vacío", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        //comprobamos el formato del nif
        if (!comunes.comprobarNif(nif)) {
            JOptionPane.showMessageDialog(null, "Error en el formato NIF", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        //comprobamos el formato del correo
        if (!comunes.comprobarCorreo(correo)) {
            JOptionPane.showMessageDialog(null, "Error en el formato del Correo", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Cliente cliente = new Cliente();
        cliente.setNombre(nombre);
        cliente.setRazonComercial(razonComercial);
        cliente.setNif(nif);
        cliente.setCorreo(correo);
        cliente.setTelefono(telefono);
        cliente.setTipoPago(tipoPago);
        cliente.setDireccionFacturacion(direccionFacturacion);
        cliente.setDireccionEnvio(direccionEnvio);

        String idClienteTexto = txt_idCliente.getText();
        int idCliente = Integer.parseInt(idClienteTexto);
        cliente.setIdCliente(idCliente);

        DClientes cli = new DClientes();

        try {

            if (cli.existeNif(nif)) {
                JOptionPane.showMessageDialog(null, "Ya existe ese nif", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            cli.modificarClientes(cliente);
            JOptionPane.showMessageDialog(null, "Cliente actualizado correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            limpiarCampos();
            cli.listarClientes(tbl_cln);

        } catch (SQLException ex) {
            System.getLogger(jpn_Cliente.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
            JOptionPane.showMessageDialog(null, "Error al actualizar el cliente: " + ex.getMessage(), "Error SQL", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_updActionPerformed

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed

        limpiarCampos();
    }//GEN-LAST:event_btn_limpiarActionPerformed

    private void btn_expActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_expActionPerformed
        ImportarExportar.exportarCSV(tbl_cln, this);
    }//GEN-LAST:event_btn_expActionPerformed

    private void txt_telefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_telefonoKeyTyped
        char c = evt.getKeyChar();
        String textoActual = txt_telefono.getText(); 

        //para que solo acepte numeros
        if (!Character.isDigit(c) && c != '+') {
            evt.consume();
        }
        //que solo acepte 15 digitos
        if (textoActual.length() >= 15) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_telefonoKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_del;
    private javax.swing.JButton btn_exp;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JButton btn_upd;
    private javax.swing.JComboBox<String> cbx_tipoPago;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_cln;
    private javax.swing.JTextField txt_correo;
    private javax.swing.JTextField txt_direccionEnvio;
    private javax.swing.JTextField txt_direccionFacturacion;
    private javax.swing.JTextField txt_idCliente;
    private javax.swing.JTextField txt_nif;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_razonComercial;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables
    public void limpiarCampos() {
        txt_idCliente.setText("");
        txt_nombre.setText("");
        txt_razonComercial.setText("");
        txt_nif.setText("");
        txt_correo.setText("");
        txt_telefono.setText("");
        txt_direccionFacturacion.setText("");
        txt_direccionEnvio.setText("");
        if (cbx_tipoPago.getItemCount() > 0) {
            cbx_tipoPago.setSelectedIndex(0);
        }
    }

}
