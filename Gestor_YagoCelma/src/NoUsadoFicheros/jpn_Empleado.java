/*package NoUsadoFicheros;


import Presentacion.*;
import Dominio.Agenda;
import Transversal.Empleado;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class jpn_Empleado extends javax.swing.JPanel {


    public jpn_Empleado() {
        
        modelo = new DefaultTableModel();
        
        initComponents();
        
        this.tbl_empleados.setModel(modelo);
        
        modelo.addColumn("DNI");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido1");
        modelo.addColumn("Apellido2");
        modelo.addColumn("Sueldo");
        modelo.addColumn("Puesto");
        modelo.addColumn("Calle");
        modelo.addColumn("Codigo postal");
        modelo.addColumn("Ciudad");
        modelo.addColumn("Provincia");
        modelo.addColumn("País");
        modelo.addColumn("ID Empresa");
        modelo.addColumn("Correo");
        modelo.addColumn("IBAN");
        modelo.addColumn("Fecha Nacimiento");
        modelo.addColumn("Fecha Contratacion");
        modelo.addColumn("Departamento");
        modelo.addColumn("Activo");
        
        agenda = new Agenda();
        
        this.tbl_empleados.getSelectionModel().addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            @Override
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                // Se usa evt.getValueIsAdjusting() para ejecutar el código solo una vez por clic
                if (!evt.getValueIsAdjusting()) {

                    int filaSeleccionada = tbl_empleados.getSelectedRow();

                    if (filaSeleccionada != -1) {


                        txt_dni.setText((String) modelo.getValueAt(filaSeleccionada, 0));

                        txt_nombre.setText((String) modelo.getValueAt(filaSeleccionada, 1));
                        
                        txt_apellido1.setText((String) modelo.getValueAt(filaSeleccionada, 2));
                        
                        txt_apellido2.setText((String) modelo.getValueAt(filaSeleccionada, 3));

                        txt_sueldo.setText((String) modelo.getValueAt(filaSeleccionada, 4).toString());

                        txt_puesto.setText((String) modelo.getValueAt(filaSeleccionada, 5));
                        
                        txt_calle.setText((String) modelo.getValueAt(filaSeleccionada, 6));
                        
                        txt_codigoPostal.setText((String) modelo.getValueAt(filaSeleccionada, 7));
                        
                        txt_ciudad.setText((String) modelo.getValueAt(filaSeleccionada, 8));
                        
                        txt_provincia.setText((String) modelo.getValueAt(filaSeleccionada, 9));
                        
                        txt_pais.setText((String) modelo.getValueAt(filaSeleccionada, 10));
                        
                        txt_empresa.setText((String) modelo.getValueAt(filaSeleccionada, 11));
                        
                        txt_correo.setText((String) modelo.getValueAt(filaSeleccionada, 12));
                        
                        txt_iban.setText((String) modelo.getValueAt(filaSeleccionada, 13));
                        
                        txt_fechaNacimiento.setText((String) modelo.getValueAt(filaSeleccionada, 14));
                        
                        txt_contratacion.setText((String) modelo.getValueAt(filaSeleccionada, 15));
                        
                        txt_departamento.setText((String) modelo.getValueAt(filaSeleccionada, 16));
                        
                        rb_activo.setText((String) modelo.getValueAt(filaSeleccionada, 17));
                    }
                }
            }
        });
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        txt_dni = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_calle = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_puesto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_sueldo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_departamento = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_contratacion = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_empresa = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_empleados = new javax.swing.JTable();
        btn_new = new javax.swing.JButton();
        btn_add = new javax.swing.JButton();
        btn_del = new javax.swing.JButton();
        btn_upd = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txt_correo = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txt_apellido1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txt_apellido2 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txt_iban = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txt_fechaNacimiento = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txt_codigoPostal = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txt_ciudad = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txt_provincia = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txt_pais = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        rb_activo = new javax.swing.JRadioButton();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel1.setText("Gestión de Empleados");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("DNI:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Calle:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Puesto:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Nombre:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Sueldo:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Departamento:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Fecha Contratación:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("ID Empresa:");

        tbl_empleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Empleado", "DNI", "Nombre", "Apellido1", "Apellido2", "Sueldo", "Puesto", "Calle", "Codigo postal", "Ciudad", "Provincia", "País", "ID Empresa", "Correo", "IBAN", "Fecha Nacimiento", "Departamento", "Fecha Contratación", "Activo"
            }
        ));
        jScrollPane1.setViewportView(tbl_empleados);

        btn_new.setBackground(new java.awt.Color(4, 126, 203));
        btn_new.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_new.setForeground(new java.awt.Color(255, 255, 255));
        btn_new.setText("Nuevo");
        btn_new.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_newActionPerformed(evt);
            }
        });

        btn_add.setBackground(new java.awt.Color(71, 159, 52));
        btn_add.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_add.setForeground(new java.awt.Color(255, 255, 255));
        btn_add.setText("Añadir");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });

        btn_del.setBackground(new java.awt.Color(208, 50, 51));
        btn_del.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_del.setForeground(new java.awt.Color(255, 255, 255));
        btn_del.setText("Eliminar");
        btn_del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_delActionPerformed(evt);
            }
        });

        btn_upd.setBackground(new java.awt.Color(4, 126, 203));
        btn_upd.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_upd.setForeground(new java.awt.Color(255, 255, 255));
        btn_upd.setText("Actualizar");
        btn_upd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("Correo:");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setText("Apellido 1:");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setText("Apellido 2");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setText("IBAN:");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setText("Fecha Nacimiento:");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel15.setText("Codigo postal:");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel16.setText("Ciudad:");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel17.setText("Provincia:");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel18.setText("País:");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel19.setText("Activo:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addGap(18, 18, 18)
                        .addComponent(txt_provincia, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel18)
                        .addGap(18, 18, 18)
                        .addComponent(txt_pais)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(txt_empresa, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(txt_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addComponent(txt_iban, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)
                        .addComponent(txt_fechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(txt_contratacion, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(txt_departamento, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rb_activo)
                        .addGap(217, 217, 217))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_new)
                                .addGap(50, 50, 50)
                                .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addComponent(btn_del)
                                .addGap(51, 51, 51)
                                .addComponent(btn_upd))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_dni, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(txt_apellido1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(txt_apellido2, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(txt_sueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(txt_puesto, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(txt_calle, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_codigoPostal, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel16)
                                .addGap(18, 18, 18)
                                .addComponent(txt_ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_dni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txt_apellido1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(txt_apellido2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_sueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txt_puesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txt_calle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(txt_codigoPostal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(txt_ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txt_empresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txt_correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(txt_iban, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(txt_provincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(txt_pais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rb_activo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel14)
                        .addComponent(txt_fechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)
                        .addComponent(txt_departamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)
                        .addComponent(txt_contratacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel19)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_new)
                    .addComponent(btn_add)
                    .addComponent(btn_del)
                    .addComponent(btn_upd))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        
        String dni = txt_dni.getText();
        String nombre = txt_nombre.getText();
        String direccion = txt_calle.getText();
        String sueldo = txt_sueldo.getText();
        
        //Comprobamos el DNI
        if(!comprobarDni(dni)){
            JOptionPane.showMessageDialog(null, "Error al comprobar el DNI", "Error!!!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        //Pasamos el sueldo de String a double
        double sueldoNumero = 0;
        try{
            sueldoNumero = Double.parseDouble(sueldo);
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "No has escrito un sueldo numerico", "Error!!!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        
        String puesto = txt_puesto.getText();
        String departamento = txt_departamento.getText();
        String fechaContratacion = txt_contratacion.getText();
        String idEmpresa = txt_empresa.getText();
        String correo = txt_correo.getText();
        
        if(!correo.contains("@")){
            JOptionPane.showMessageDialog(null, "El correo no contiene @", "Atencion!!", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        Empleado e = new Empleado(dni, nombre, direccion, sueldoNumero, puesto, departamento, fechaContratacion, idEmpresa, correo);
        
        agenda.addEmpleado(e);
        
        rellenarTabla();
        
        txt_dni.setText("");
        txt_nombre.setText("");
        txt_calle.setText("");
        txt_sueldo.setText("");
        txt_puesto.setText("");
        txt_departamento.setText("");
        txt_contratacion.setText("");
        txt_empresa.setText("");
        txt_correo.setText("");
    }//GEN-LAST:event_btn_addActionPerformed

    private void btn_delActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_delActionPerformed
        
        int filaSeleccionada = this.tbl_empleados.getSelectedRow();
        
        if(filaSeleccionada == -1){
            JOptionPane.showMessageDialog(null, "No has seleccionado ningun empleado", "Atencion!!!", JOptionPane.ERROR_MESSAGE);
        }else{
            String nombre = (String) modelo.getValueAt(filaSeleccionada, 0);
            String dni = (String) modelo.getValueAt(filaSeleccionada, 1);
            String direccion = (String) modelo.getValueAt(filaSeleccionada, 2);
            double sueldo = (Double) modelo.getValueAt(filaSeleccionada, 3);
            String puesto = (String) modelo.getValueAt(filaSeleccionada, 4);
            String departamento = (String) modelo.getValueAt(filaSeleccionada, 5);
            String contratacion = (String) modelo.getValueAt(filaSeleccionada, 6);
            String empresa = (String) modelo.getValueAt(filaSeleccionada, 7);
            String correo = (String) modelo.getValueAt(filaSeleccionada, 8);
            
            Empleado aux = new Empleado(nombre, dni, direccion, sueldo, puesto, departamento, contratacion, empresa, correo);
            
            agenda.delEmpleado(aux);
            
            rellenarTabla();
        }
    }//GEN-LAST:event_btn_delActionPerformed

    private void btn_newActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_newActionPerformed
        
        txt_dni.setText("");
        txt_nombre.setText("");
        txt_calle.setText("");
        txt_sueldo.setText("");
        txt_puesto.setText("");
        txt_departamento.setText("");
        txt_contratacion.setText("");
        txt_empresa.setText("");
        txt_correo.setText("");
    }//GEN-LAST:event_btn_newActionPerformed

    private void btn_updActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updActionPerformed
        
        int filaSeleccionada = this.tbl_empleados.getSelectedRow();
        
        if(filaSeleccionada == -1){
            JOptionPane.showMessageDialog(null,"No has seleccionado ninguna fila", "Error!!!", JOptionPane.ERROR_MESSAGE);
            
            String dni = (String) modelo.getValueAt(filaSeleccionada, 0);
            
            Empleado empleadoViejo = agenda.encontrarEmpleado(dni);
            
            String nuevoDni = this.txt_dni.getText();
            String nuevoNombre = this.txt_nombre.getText();
            String nuevaDireccion = this.txt_calle.getText();
            String nuevoSueldo = this.txt_sueldo.getText();
            
            double nuevoSueldoNumero = 0;
            try{
                nuevoSueldoNumero = (Double) Double.parseDouble(nuevoSueldo);
            }catch(NumberFormatException e){
                System.out.println("Error: " + e.getMessage());
            }
            
            String nuevoPuesto = this.txt_puesto.getText();
            String nuevoDepartamento = this.txt_departamento.getText();
            String nuevoContratacion = this.txt_contratacion.getText();
            String nuevaEmpresa = this.txt_empresa.getText();
            String nuevoCorreo = this.txt_correo.getText();
            
            Empleado nuevoEmpleado = new Empleado(nuevoDni, nuevoNombre, nuevaDireccion, nuevoSueldoNumero, nuevoPuesto, nuevoDepartamento, nuevoContratacion, nuevaEmpresa, nuevoCorreo);
            
            if(nuevoEmpleado != null){
                
                agenda.actualizarEmpleado(empleadoViejo, nuevoEmpleado);
                
                rellenarTabla();
            }else{
                JOptionPane.showMessageDialog(null, "Ningun campo puede estat vacio", "Error!!!", JOptionPane.ERROR_MESSAGE);
            }
            
            
        }
    }//GEN-LAST:event_btn_updActionPerformed

    public void rellenarTabla(){
        
        modelo.setRowCount(0);
        
        Empleado empleados[] = agenda.getEmpleados();
        
        Object[] fila;
        
        for(int i = 0; i < empleados.length; i++){
            if(empleados[i] != null){
                
                fila = new Object[9];
                fila[0] = empleados[i].getDni();
                fila[1] = empleados[i].getNombre();
                fila[2] = empleados[i].getDireccion();
                fila[3] = empleados[i].getSueldo();
                fila[4] = empleados[i].getPuesto();
                fila[5] = empleados[i].getDepartamento();
                fila[6] = empleados[i].getFechaContratacion();
                fila[7] = empleados[i].getIdEmpresa();
                fila[8] = empleados[i].getCorreo();
                
                modelo.addRow(fila);
            }
        }
    }
    
    
    public boolean comprobarDni(String dni){
        
        try{
            // CORRECCIÓN: coger los 8 primeros dígitos
            String nifComprobado = dni.substring(0, 8);
            int nifNumerico = Integer.parseInt(nifComprobado);

            int resultado = nifNumerico % 23;

            //int resultadoFinal = nifNumerico - resultado;

            // CORRECCIÓN: coger el carácter final
                String letraNif = dni.substring(8); 

            if(!letrasDNI[resultado].equalsIgnoreCase(letraNif)){
                return false;
            }

        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "El NIF de persona debe tener 8 números seguidos de una letra.", "Atencion!!!", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
    
    public DefaultTableModel modelo;
    public Agenda agenda;
    private final String[] letrasDNI = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_del;
    private javax.swing.JButton btn_new;
    private javax.swing.JButton btn_upd;
    private javax.swing.ButtonGroup buttonGroup1;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rb_activo;
    private javax.swing.JTable tbl_empleados;
    private javax.swing.JTextField txt_apellido1;
    private javax.swing.JTextField txt_apellido2;
    private javax.swing.JTextField txt_calle;
    private javax.swing.JTextField txt_ciudad;
    private javax.swing.JTextField txt_codigoPostal;
    private javax.swing.JTextField txt_contratacion;
    private javax.swing.JTextField txt_correo;
    private javax.swing.JTextField txt_departamento;
    private javax.swing.JTextField txt_dni;
    private javax.swing.JTextField txt_empresa;
    private javax.swing.JTextField txt_fechaNacimiento;
    private javax.swing.JTextField txt_iban;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_pais;
    private javax.swing.JTextField txt_provincia;
    private javax.swing.JTextField txt_puesto;
    private javax.swing.JTextField txt_sueldo;
    // End of variables declaration//GEN-END:variables
}
*/
