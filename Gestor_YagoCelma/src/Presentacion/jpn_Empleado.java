package Presentacion;

import Dominio.DEmpleados;
import MetodosComunes.ImportarExportar;
import MetodosComunes.MetodosComunes;
import Transversal.Empleado;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class jpn_Empleado extends javax.swing.JPanel {

    MetodosComunes comunes = new MetodosComunes();

    public jpn_Empleado() throws SQLException {

        initComponents();

        DEmpleados empleados = new DEmpleados();

        empleados.listarEmpleados(tbl_empleados);
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
        jLabel9 = new javax.swing.JLabel();
        txt_idEmpresa = new javax.swing.JTextField();
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
        dch_fechaNacimiento = new com.toedter.calendar.JDateChooser();
        dch_fechaContratacion = new com.toedter.calendar.JDateChooser();
        jLabel20 = new javax.swing.JLabel();
        txt_idEmpleado = new javax.swing.JTextField();
        btn_exportar = new javax.swing.JButton();

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

        txt_idEmpresa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_idEmpresaKeyTyped(evt);
            }
        });

        tbl_empleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Empleado", "Nombre", "Apellido1", "Apellido2", "DNI", "Sueldo", "Puesto", "Calle", "Codigo postal", "Ciudad", "Provincia", "País", "ID Empresa", "Correo", "IBAN", "Fecha Nacimiento", "Departamento", "Fecha Contratación", "Activo"
            }
        ));
        tbl_empleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_empleadosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_empleados);

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

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("Correo:");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setText("Apellido 1:");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setText("Apellido 2");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setText("IBAN:");

        txt_iban.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_ibanKeyTyped(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setText("Fecha Nacimiento:");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel15.setText("Codigo postal:");

        txt_codigoPostal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_codigoPostalKeyTyped(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel16.setText("Ciudad:");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel17.setText("Provincia:");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel18.setText("País:");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel19.setText("Activo:");

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel20.setText("ID Empleado:");

        txt_idEmpleado.setEnabled(false);

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
                        .addComponent(txt_idEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                        .addComponent(dch_fechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(dch_fechaContratacion, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                                .addComponent(btn_upd)
                                .addGap(49, 49, 49)
                                .addComponent(btn_exportar))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel20)
                                    .addGap(18, 18, 18)
                                    .addComponent(txt_idEmpleado)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel5)
                                    .addGap(18, 18, 18)
                                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel11)
                                    .addGap(18, 18, 18)
                                    .addComponent(txt_apellido1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel12)
                                    .addGap(18, 18, 18)
                                    .addComponent(txt_apellido2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel2)
                                    .addGap(18, 18, 18)
                                    .addComponent(txt_dni, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                    .addComponent(txt_ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                    .addComponent(txt_apellido2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(txt_apellido1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel20)
                    .addComponent(txt_idEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(txt_idEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(rb_activo, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel7)
                                    .addComponent(txt_departamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel19)))
                            .addComponent(dch_fechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_new)
                            .addComponent(btn_add)
                            .addComponent(btn_del)
                            .addComponent(btn_upd)
                            .addComponent(btn_exportar))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(dch_fechaContratacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed

        String nombre = txt_nombre.getText();
        String apellido1 = txt_apellido1.getText();
        String apellido2 = txt_apellido2.getText();
        String dni = txt_dni.getText();
        String sueldoTexto = txt_sueldo.getText();
        String puesto = txt_puesto.getText();
        String calle = txt_calle.getText();
        String codigoPostal = txt_codigoPostal.getText();
        String ciudad = txt_ciudad.getText();
        String provincia = txt_provincia.getText();
        String pais = txt_pais.getText();
        String idEmpresaTexto = txt_idEmpresa.getText();
        String correo = txt_correo.getText();
        String iban = txt_iban.getText();
        Date fechaNacimiento = dch_fechaNacimiento.getDate();
        String departamento = txt_departamento.getText();
        Date fechaContratacion = dch_fechaContratacion.getDate();
        Boolean activo = rb_activo.isSelected();

        //comprobamos que ningun campo este vacio
        if (nombre.trim().isEmpty() || apellido1.trim().isEmpty() || dni.trim().isEmpty()
                || sueldoTexto.trim().isEmpty() || puesto.trim().isEmpty() || calle.trim().isEmpty()
                || codigoPostal.trim().isEmpty() || ciudad.trim().isEmpty() || provincia.trim().isEmpty()
                || pais.trim().isEmpty() || idEmpresaTexto.trim().isEmpty() || correo.trim().isEmpty()
                || iban.trim().isEmpty() || departamento.trim().isEmpty() || fechaNacimiento == null
                || fechaContratacion == null) {

            JOptionPane.showMessageDialog(null, "Ningun campo puede estar vacio", "Error ", JOptionPane.ERROR_MESSAGE);
            return;
        }

        double sueldo;

        //Parseo del sueldo para pasarlo de texto a double
        try {
            sueldo = Double.parseDouble(sueldoTexto);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "El sueldo debe ser valor numerico", "Error", JOptionPane.ERROR_MESSAGE);
            return; // Salimos si el formato es incorrecto
        }

        int idEmpresa;
        //Parseamos para que sea un int
        try {
            idEmpresa = Integer.parseInt(idEmpresaTexto);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "El ID Empresa debe ser valor numerico", "Error", JOptionPane.ERROR_MESSAGE);
            return; // Salimos si el formato es incorrecto
        }
        if (sueldo <= 0 || idEmpresa < 0) {
            JOptionPane.showMessageDialog(null, "El ID Empresa y el sueldo deben ser positivos", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!comunes.comprobarCorreo(correo)) {
            JOptionPane.showMessageDialog(null, "El formato de correo no es correcto", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!comunes.comprobarNif(dni)) {
            JOptionPane.showMessageDialog(null, "El DNI no tiene el formato correcto", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Empleado empleado = new Empleado();
        empleado.setNombre(nombre);
        empleado.setApellido1(apellido1);
        empleado.setApellido2(apellido2);
        empleado.setDni(dni);
        empleado.setSueldo(sueldo);
        empleado.setPuesto(puesto);
        empleado.setCalle(calle);
        empleado.setCodigoPostal(codigoPostal);
        empleado.setCiudad(ciudad);
        empleado.setProvincia(provincia);
        empleado.setPais(pais);
        empleado.setIdEmpresa(idEmpresa);
        empleado.setCorreo(correo);
        empleado.setIban(iban);
        empleado.setDepartamento(departamento);
        empleado.setFechaNacimiento(fechaNacimiento);
        empleado.setFechaContratacion(fechaContratacion);
        empleado.setActivo(activo);

        DEmpleados dempleado = new DEmpleados();

        try {
            dempleado.crearEmpleado(empleado);
            JOptionPane.showMessageDialog(null, "Empleado añadido", "Informacion", JOptionPane.INFORMATION_MESSAGE);
            limpiarCampos();
            dempleado.listarEmpleados(tbl_empleados);

        } catch (SQLException e) {
            System.out.println("Error en insert cliente: " + e.getMessage());
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al guardar en la base de datos" + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btn_addActionPerformed

    private void tbl_empleadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_empleadosMouseClicked

        DEmpleados empleado = new DEmpleados();
        empleado.seleccionarEmpleado(tbl_empleados, txt_idEmpleado, txt_nombre, txt_apellido1, txt_apellido2, txt_dni, txt_sueldo, txt_puesto, txt_calle, txt_codigoPostal, txt_ciudad, txt_provincia, txt_pais, txt_idEmpresa, txt_correo, txt_iban, dch_fechaNacimiento, txt_departamento, dch_fechaContratacion, rb_activo);
    }//GEN-LAST:event_tbl_empleadosMouseClicked

    private void btn_updActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updActionPerformed

        String nombre = txt_nombre.getText();
        String apellido1 = txt_apellido1.getText();
        String apellido2 = txt_apellido2.getText();
        String dni = txt_dni.getText();
        String sueldoTexto = txt_sueldo.getText();
        String puesto = txt_puesto.getText();
        String calle = txt_calle.getText();
        String codigoPostal = txt_codigoPostal.getText();
        String ciudad = txt_ciudad.getText();
        String provincia = txt_provincia.getText();
        String pais = txt_pais.getText();
        String idEmpresaTexto = txt_idEmpresa.getText();
        String correo = txt_correo.getText();
        String iban = txt_iban.getText();
        Date fechaNacimiento = dch_fechaNacimiento.getDate();
        String departamento = txt_departamento.getText();
        Date fechaContratacion = dch_fechaContratacion.getDate();
        Boolean activo = rb_activo.isSelected();

        //comprobamos que ningun campo este vacio
        if (nombre.trim().isEmpty() || apellido1.trim().isEmpty() || dni.trim().isEmpty()
                || sueldoTexto.trim().isEmpty() || puesto.trim().isEmpty() || calle.trim().isEmpty()
                || codigoPostal.trim().isEmpty() || ciudad.trim().isEmpty() || provincia.trim().isEmpty()
                || pais.trim().isEmpty() || idEmpresaTexto.trim().isEmpty() || correo.trim().isEmpty()
                || iban.trim().isEmpty() || departamento.trim().isEmpty() || fechaNacimiento == null
                || fechaContratacion == null) {

            JOptionPane.showMessageDialog(null, "Ningun campo puede estar vacio", "Error ", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // validamos el dni
        if (!comunes.comprobarNif(dni)) {
            JOptionPane.showMessageDialog(null, "El DNI no tiene el formato correcto", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // validamos el correo
        if (!comunes.comprobarCorreo(correo)) {
            JOptionPane.showMessageDialog(null, "El formato de correo no es correcto", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // parseamos el sueldo
        double sueldo;
        try {
            sueldo = Double.parseDouble(sueldoTexto);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error con el formato del sueldo", "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
            return; // ¡IMPORTANTE! Salir si el formato es incorrecto
        }
        //comprobamos que el sueldo sea positivo
        if (sueldo <= 0) {
            JOptionPane.showMessageDialog(null, "El sueldo tiene que ser positivo", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // comprobamos el ID de la empresa
        int idEmpresa;
        try {
            idEmpresa = Integer.parseInt(idEmpresaTexto);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "El ID Empresa tiene que ser numero entero positivo", "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
            return;
        }

        if (idEmpresa <= 0) {
            JOptionPane.showMessageDialog(null, "El ID Empresa no puede ser numero negativo", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Empleado empleado = new Empleado();
        empleado.setNombre(nombre);
        empleado.setApellido1(apellido1);
        empleado.setApellido2(apellido2);
        empleado.setDni(dni);
        empleado.setSueldo(sueldo);
        empleado.setPuesto(puesto);
        empleado.setCalle(calle);
        empleado.setCodigoPostal(codigoPostal);
        empleado.setCiudad(ciudad);
        empleado.setProvincia(provincia);
        empleado.setPais(pais);
        empleado.setIdEmpresa(idEmpresa);
        empleado.setCorreo(correo);
        empleado.setIban(iban);
        empleado.setFechaNacimiento(fechaNacimiento);
        empleado.setDepartamento(departamento);
        empleado.setFechaContratacion(fechaContratacion);
        empleado.setActivo(activo);

        DEmpleados emp = new DEmpleados();

        try {
            emp.modificarEmpleados(empleado);
            JOptionPane.showMessageDialog(null, "Empleado actualizado", "Informacion", JOptionPane.INFORMATION_MESSAGE);
            limpiarCampos();
            emp.listarEmpleados(tbl_empleados);

        } catch (SQLException ex) {
            System.out.println("Error al actualizar el cliente: " + ex.getMessage());
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al actualizar el cliente", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_updActionPerformed

    private void btn_newActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_newActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_btn_newActionPerformed

    private void btn_exportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exportarActionPerformed
        ImportarExportar.exportarCSV(tbl_empleados, this);
    }//GEN-LAST:event_btn_exportarActionPerformed

    private void txt_codigoPostalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_codigoPostalKeyTyped
        char c = evt.getKeyChar();
        String textoActual = txt_codigoPostal.getText();

        if (!Character.isDigit(c)) {
            evt.consume();
        }

        if (textoActual.length() >= 9) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_codigoPostalKeyTyped

    private void txt_ibanKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ibanKeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_ibanKeyTyped

    private void txt_idEmpresaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_idEmpresaKeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_idEmpresaKeyTyped

    public void limpiarCampos() {

        txt_idEmpleado.setText("");
        txt_nombre.setText("");
        txt_apellido1.setText("");
        txt_apellido2.setText("");
        txt_dni.setText("");
        txt_sueldo.setText("");
        txt_puesto.setText("");
        txt_calle.setText("");
        txt_codigoPostal.setText("");
        txt_ciudad.setText("");
        txt_provincia.setText("");
        txt_pais.setText("");
        txt_idEmpresa.setText("");
        txt_correo.setText("");
        txt_iban.setText("");
        txt_departamento.setText("");

        dch_fechaNacimiento.setDate(null);
        dch_fechaContratacion.setDate(null);

        rb_activo.setSelected(false);

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_del;
    private javax.swing.JButton btn_exportar;
    private javax.swing.JButton btn_new;
    private javax.swing.JButton btn_upd;
    private javax.swing.ButtonGroup buttonGroup1;
    private com.toedter.calendar.JDateChooser dch_fechaContratacion;
    private com.toedter.calendar.JDateChooser dch_fechaNacimiento;
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
    private javax.swing.JRadioButton rb_activo;
    private javax.swing.JTable tbl_empleados;
    private javax.swing.JTextField txt_apellido1;
    private javax.swing.JTextField txt_apellido2;
    private javax.swing.JTextField txt_calle;
    private javax.swing.JTextField txt_ciudad;
    private javax.swing.JTextField txt_codigoPostal;
    private javax.swing.JTextField txt_correo;
    private javax.swing.JTextField txt_departamento;
    private javax.swing.JTextField txt_dni;
    private javax.swing.JTextField txt_iban;
    private javax.swing.JTextField txt_idEmpleado;
    private javax.swing.JTextField txt_idEmpresa;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_pais;
    private javax.swing.JTextField txt_provincia;
    private javax.swing.JTextField txt_puesto;
    private javax.swing.JTextField txt_sueldo;
    // End of variables declaration//GEN-END:variables
}
