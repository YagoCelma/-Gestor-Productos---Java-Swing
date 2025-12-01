package Presentacion;

import Dominio.DProducto;
import MetodosComunes.ImportarExportar;
import Transversal.Productos;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class jpn_Productos extends javax.swing.JPanel {

    public jpn_Productos() throws SQLException {
        initComponents();

        DProducto producto = new DProducto();
        producto.listarProductos(jTable1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        txt_descripcion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_marca = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_codigoSku = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_codigoBarras = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_stock = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_stockMax = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txt_stockMin = new javax.swing.JTextField();
        cbx_estado = new javax.swing.JComboBox<>();
        btn_add = new javax.swing.JButton();
        btn_upd = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txt_precioUnidad = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txt_idProducto = new javax.swing.JTextField();
        btn_limpiar = new javax.swing.JButton();
        btn_exportar = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel1.setText("Gestión de Productos");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Producto", "Nombre", "Descripción", "Marca", "Precio unitario", "Código SKU", "Código barras", "Estado", "Stock", "Stock max", "Stock min"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Descripción:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Marca:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Codigo SKU:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Codigo Barras:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Estado:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("Stock:");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("Stock max:");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setText("Stock min:");

        cbx_estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elige una opción", "Activo", "Inactivo", "Descatalogado" }));

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

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Precio unidad:");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setText("ID Producto:");

        txt_idProducto.setEnabled(false);

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
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(btn_upd)
                                .addGap(35, 35, 35)
                                .addComponent(btn_limpiar)
                                .addGap(40, 40, 40)
                                .addComponent(btn_exportar))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1045, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(txt_idProducto)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(txt_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(txt_marca, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(txt_codigoSku, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(txt_codigoBarras, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(cbx_estado, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(txt_stock, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(txt_stockMax, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel11)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_precioUnidad, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                            .addComponent(txt_stockMin))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txt_marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txt_precioUnidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(txt_idProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_codigoBarras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(txt_stock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txt_stockMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txt_stockMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbx_estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_codigoSku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_add)
                    .addComponent(btn_upd)
                    .addComponent(btn_limpiar)
                    .addComponent(btn_exportar))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed

        String descripcion = txt_descripcion.getText().trim();
        String marca = txt_marca.getText().trim();
        String precioUnidadTexto = txt_precioUnidad.getText().trim();
        String codigoSku = txt_codigoSku.getText().trim();
        String codigoBarras = txt_codigoBarras.getText().trim();
        String stockTexto = txt_stock.getText().trim();
        String stockMaxTexto = txt_stockMax.getText().trim();
        String stockMinTexto = txt_stockMin.getText().trim();
        String estado = (String) cbx_estado.getSelectedItem();

        if (descripcion.isEmpty() || marca.isEmpty() || precioUnidadTexto.isEmpty() || codigoSku.isEmpty() || codigoBarras.isEmpty() || stockTexto.isEmpty() || stockMaxTexto.isEmpty() || stockMinTexto.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No puede quedar ningun campo vacio", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        double precioUnidad;
        try {
            precioUnidad = Double.parseDouble(precioUnidadTexto);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "El Precio debe ser un valor numérico.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (precioUnidad < 0) {
            JOptionPane.showMessageDialog(null, "El precio debe ser un número positivo.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int stock;
        int stockMax;
        int stockMin;
        try {
            stock = Integer.parseInt(stockTexto);
            stockMax = Integer.parseInt(stockMaxTexto);
            stockMin = Integer.parseInt(stockMinTexto);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Los valores de Stock deben ser numéricos.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (stock <= 0 || stockMax < 0 || stockMin <= 0) {
            JOptionPane.showMessageDialog(null, "Los stocks deben ser numeros positivos.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (stockMax < stockMin) {
            JOptionPane.showMessageDialog(null, "El Stock Maximo no puede ser menor al Minimo.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Productos producto = new Productos();
        producto.setDescripcion(descripcion);
        producto.setMarca(marca);
        producto.setCodigoSku(codigoSku);
        producto.setCodigoBarras(codigoBarras);
        producto.setEstado(estado);
        producto.setPrecioUnitario(precioUnidad);
        producto.setStock(stock);
        producto.setStockMax(stockMax);
        producto.setStockMin(stockMin);

        DProducto dproducto = new DProducto();

        try {
            dproducto.crearProducto(producto);
            JOptionPane.showMessageDialog(null, "Producto creado", "Informacion", JOptionPane.INFORMATION_MESSAGE);
            limpiarCampos();
            dproducto.listarProductos(jTable1);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al guardar en la base de datos: " + e.getMessage(), "Error SQL", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_addActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        DProducto producto = new DProducto();

        producto.seleccionarProducto(jTable1, txt_idProducto, txt_descripcion, txt_marca, txt_precioUnidad, txt_codigoSku, txt_codigoBarras, cbx_estado, txt_stock, txt_stockMax, txt_stockMin);
    }//GEN-LAST:event_jTable1MouseClicked

    private void btn_updActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updActionPerformed

        String descripcion = txt_descripcion.getText().trim();
        String marca = txt_marca.getText();
        String precioUnitarioTexto = txt_precioUnidad.getText();
        String codigoSku = txt_codigoSku.getText().trim();
        String codigoBarras = txt_codigoBarras.getText().trim();
        String estado = (String) cbx_estado.getSelectedItem();
        String stockTexto = txt_stock.getText();
        String stockMaxTexto = txt_stockMax.getText();
        String stockMinTexto = txt_stockMin.getText();
        String idProductoTexto = txt_idProducto.getText();

        //Comprobamos que ningun campo esta vacio
        if (descripcion.isEmpty() || marca.isEmpty() || precioUnitarioTexto.isEmpty() || codigoSku.isEmpty() || codigoBarras.isEmpty() || estado.isEmpty() || stockTexto.isEmpty() || stockMaxTexto.isEmpty() || stockMinTexto.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ningun campo puede estar vacio", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        //parseamos el double del precio unidad
        double precioUnitario;
        try {
            precioUnitario = Double.parseDouble(precioUnitarioTexto);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error con el formato del precio unitario", "Error", JOptionPane.ERROR_MESSAGE);
            return; // Salimos si el formato es incorrecto
        }

        //parseamos los int de los stocks
        int stock;
        int stockMax;
        int stockMin;

        try {
            stock = Integer.parseInt(stockTexto);
            stockMax = Integer.parseInt(stockMaxTexto);
            stockMin = Integer.parseInt(stockMinTexto);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error con el formato del stock", "Error", JOptionPane.ERROR_MESSAGE);
            return; // Salimos si el formato es incorrecto
        }

        //no aseguramos que no hay ningun valor negativo
        if (stock <= 0 || stockMax < 0 || stockMin <= 0) {
            JOptionPane.showMessageDialog(null, "Los stocks deben ser numeros positivos.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // aseguramos que el stock minimo no sea mayor que el maximo
        if (stockMax < stockMin) {
            JOptionPane.showMessageDialog(null, "El Stock Maximo no puede ser menor al Minimo.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        //comprobamos que el precio unitario no sea negativo
        if (precioUnitario < 0) {
            JOptionPane.showMessageDialog(null, "El precio unitario no puede ser negativo", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        //parseamos el int de idProducto sin el try catch porque es serial y no se puede modificar el JTextField
        int idProducto = Integer.parseInt(idProductoTexto);

        Productos producto = new Productos();

        producto.setDescripcion(descripcion);
        producto.setMarca(marca);
        producto.setPrecioUnitario(precioUnitario);
        producto.setCodigoSku(codigoSku);
        producto.setCodigoBarras(codigoBarras);
        producto.setEstado(estado);
        producto.setStock(stock);
        producto.setStockMax(stockMax);
        producto.setStockMin(stockMin);
        producto.setIdProducto(idProducto);

        DProducto pro = new DProducto();

        try {
            pro.modificarProducto(producto);
            JOptionPane.showMessageDialog(null, "Producto actualizado", "Informacion", JOptionPane.INFORMATION_MESSAGE);
            limpiarCampos();
            pro.listarProductos(jTable1);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar el cliente", "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_updActionPerformed

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
        
        limpiarCampos();
    }//GEN-LAST:event_btn_limpiarActionPerformed

    private void btn_exportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exportarActionPerformed
        ImportarExportar.exportarCSV(jTable1, this);
    }//GEN-LAST:event_btn_exportarActionPerformed

    public void limpiarCampos(){
        txt_idProducto.setText("");
        txt_descripcion.setText("");
        txt_marca.setText("");
        txt_precioUnidad.setText("");
        txt_codigoSku.setText("");
        txt_codigoBarras.setText("");
        txt_stock.setText("");
        txt_stockMax.setText("");
        txt_stockMin.setText("");
        
        if (cbx_estado.getItemCount() > 0) {
            cbx_estado.setSelectedIndex(0);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_exportar;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JButton btn_upd;
    private javax.swing.JComboBox<String> cbx_estado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txt_codigoBarras;
    private javax.swing.JTextField txt_codigoSku;
    private javax.swing.JTextField txt_descripcion;
    private javax.swing.JTextField txt_idProducto;
    private javax.swing.JTextField txt_marca;
    private javax.swing.JTextField txt_precioUnidad;
    private javax.swing.JTextField txt_stock;
    private javax.swing.JTextField txt_stockMax;
    private javax.swing.JTextField txt_stockMin;
    // End of variables declaration//GEN-END:variables
}
