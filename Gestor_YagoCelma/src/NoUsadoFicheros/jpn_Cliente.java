/*package NoUsadoFicheros;


import Presentacion.*;
import Dominio.Agenda;
import Transversal.Cliente;
import java.io.File;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;


public class jpn_Cliente extends javax.swing.JPanel {


    public jpn_Cliente() {
        
        modelo = new DefaultTableModel();
        
        initComponents();
        
        this.tbl_cln.setModel(modelo);
        
        modelo.addColumn("Nombre");
        modelo.addColumn("Razon Comercial");
        modelo.addColumn("NIF");
        modelo.addColumn("Correo");
        modelo.addColumn("Telefono");
        modelo.addColumn("Tipo Pago");
        modelo.addColumn("Direccion facturación");
        modelo.addColumn("Direccion envio");
        
        
        agenda = new Agenda();
        
        this.tbl_cln.getSelectionModel().addListSelectionListener(new javax.swing.event.ListSelectionListener() {
        @Override
        public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
            // Se usa evt.getValueIsAdjusting() para ejecutar el código solo una vez por clic
            if (!evt.getValueIsAdjusting()) {
                
                int filaSeleccionada = tbl_cln.getSelectedRow();
                
                if (filaSeleccionada != -1) {
                    
                    
                    txt_nombre.setText((String) modelo.getValueAt(filaSeleccionada, 0));
               
                    txt_dir.setText((String) modelo.getValueAt(filaSeleccionada, 1));
                  
                    txt_nif.setText((String) modelo.getValueAt(filaSeleccionada, 2));
                  
                    txt_tlf.setText((String) modelo.getValueAt(filaSeleccionada, 3));
                   
                    txt_mail.setText((String) modelo.getValueAt(filaSeleccionada, 4));
                }
            }
        }
    });
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
        txt_dir = new javax.swing.JTextField();
        txt_nif = new javax.swing.JTextField();
        txt_tlf = new javax.swing.JTextField();
        txt_mail = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_cln = new javax.swing.JTable();
        btn_add = new javax.swing.JButton();
        btn_del = new javax.swing.JButton();
        btn_upd = new javax.swing.JButton();
        btn_imp = new javax.swing.JButton();
        btn_exp = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        cbx_tipoPago = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        txt_direccionFacturacion = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_direccion_envio = new javax.swing.JTextField();

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Razon Comercial:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("NIF:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Télefono:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Correo:");

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
        jScrollPane1.setViewportView(tbl_cln);

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

        btn_imp.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_imp.setText("Importar");
        btn_imp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_impActionPerformed(evt);
            }
        });

        btn_exp.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_exp.setText("Exportar");
        btn_exp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_expActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel1.setText("Gestión de Clientes");

        jButton1.setBackground(new java.awt.Color(4, 126, 203));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Nuevo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Tipo pago:");

        cbx_tipoPago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elige una opción", "Efectivo", "Tarjeta", "Transferencia" }));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Dirección facturación:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("Dirección envio");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txt_dir, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(txt_nif, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(txt_direccionFacturacion))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(txt_mail, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_tlf, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(cbx_tipoPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(txt_direccion_envio, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_upd)
                        .addGap(18, 18, 18)
                        .addComponent(btn_del)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(btn_imp)
                        .addGap(18, 18, 18)
                        .addComponent(btn_exp))
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 951, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_dir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txt_nif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_mail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txt_tlf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(cbx_tipoPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txt_direccionFacturacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txt_direccion_envio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_add)
                    .addComponent(btn_upd)
                    .addComponent(btn_del)
                    .addComponent(jButton1)
                    .addComponent(btn_imp)
                    .addComponent(btn_exp))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_updActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updActionPerformed
                
        int filaSeleccionada = this.tbl_cln.getSelectedRow();
        
        if(filaSeleccionada == -1){
            JOptionPane.showMessageDialog(null, "No has seleccionado ninguna fila", "Atencion!!!", JOptionPane.ERROR_MESSAGE);
        }else{
            
            
            String nombreAntiguo = (String) modelo.getValueAt(filaSeleccionada, 0);
            
            Cliente clienteAntiguo = agenda.encontrarCliente(nombreAntiguo);
            
            String nombreNuevo = this.txt_nombre.getText();
            String direccionNuevo = this.txt_dir.getText();
            String nifNuevo = this.txt_nif.getText();
            String telefonoNuevo = this.txt_tlf.getText();
            String correoNuevo = this.txt_mail.getText();
            
            if(nombreNuevo != null && direccionNuevo != null && nifNuevo != null && telefonoNuevo != null && correoNuevo != null){
                
                Cliente clienteNuevo = new Cliente(nombreNuevo, direccionNuevo, nifNuevo, telefonoNuevo, correoNuevo);
                
                agenda.actualizarCliente(clienteNuevo, clienteAntiguo);
                
                rellenarTabla();
                
                JOptionPane.showMessageDialog(null, "Cliente actualizado con exito", "Mensaje Informativo", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "Ningun campo puede estar vacio", "Error!!!", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btn_updActionPerformed

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        
        String nombre = this.txt_nombre.getText();
        String direccion = this.txt_dir.getText();
        // Limpieza y validación de longitud al inicio
        String nif = this.txt_nif.getText().toUpperCase().trim(); 
        
        if (nif.length() != 9) {
             JOptionPane.showMessageDialog(null, "El NIF/CIF debe tener 9 caracteres.", "Error!!!", JOptionPane.ERROR_MESSAGE);
             return;
        }
        
        char primerDigito = nif.charAt(0);
        
        // Validación NIF/DNI de persona (Empieza por dígito)
        if(Character.isDigit(primerDigito)){
            
            try{
                // CORRECCIÓN: coger los 8 primeros dígitos
                String nifComprobado = nif.substring(0, 8);
                int nifNumerico = Integer.parseInt(nifComprobado);

                int resultado = nifNumerico % 23;

                //int resultadoFinal = nifNumerico - resultado;

                // CORRECCIÓN: coger el carácter final
                String letraNif = nif.substring(8); 

                if(!letrasDNI[resultado].equalsIgnoreCase(letraNif)){
                    JOptionPane.showMessageDialog(null, "No coincide la letra del NIF con los números.", "Error!!!", JOptionPane.ERROR_MESSAGE);
                    return;
                }

            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "El NIF de persona debe tener 8 números seguidos de una letra.", "Atencion!!!", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
        // Validación CIF de empresa (Empieza por letra)
        }else if(Character.isLetter(primerDigito)){
            
            try{
                
                if(!comprobarNif(nif)){
                    JOptionPane.showMessageDialog(null, "El CIF de empresa es inválido.", "Error!!!", JOptionPane.ERROR_MESSAGE);
                    return;
                }

            }catch(Exception e){
                
                JOptionPane.showMessageDialog(null, "Error interno al validar el CIF. Revise el formato.", "Error Crítico", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace(); // Imprime el stack trace para depuración
                return;
            }
            
        } else {
             JOptionPane.showMessageDialog(null, "El NIF/CIF debe empezar por número o letra válida.", "Error!!!", JOptionPane.ERROR_MESSAGE);
             return;
        }

        String telefono = this.txt_tlf.getText();
        String correo = this.txt_mail.getText();
        
        if(!correo.contains("@")){
            JOptionPane.showMessageDialog(null, "El correo no contiene ningun @", "Error!!!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Cliente c = new Cliente(nombre, direccion, nif, telefono, correo);
        
        agenda.addCliente(c);
        
        txt_nombre.setText("");
        txt_dir.setText("");
        txt_nif.setText("");
        txt_tlf.setText("");
        txt_mail.setText("");
        
        rellenarTabla();
        
    }//GEN-LAST:event_btn_addActionPerformed

    private void btn_delActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_delActionPerformed
                
        int filaSeleccionada = this.tbl_cln.getSelectedRow();
        
        if(filaSeleccionada == -1){
            JOptionPane.showMessageDialog(null, "No ha seleccionado ninguna fila", "CUIDADO!!!", JOptionPane.WARNING_MESSAGE);
        }else{
            
            String nombre = (String) modelo.getValueAt(filaSeleccionada, 0);
            String direccion = (String) modelo.getValueAt(filaSeleccionada, 1);
            String nif = (String) modelo.getValueAt(filaSeleccionada, 2);
            String telefono = (String) modelo.getValueAt(filaSeleccionada, 3);
            String correo = (String) modelo.getValueAt(filaSeleccionada, 4);
            
            Cliente aux = new Cliente(nombre, direccion, nif, telefono, correo);
            
            agenda.delCliente(aux);
            
            rellenarTabla();
        }
    }//GEN-LAST:event_btn_delActionPerformed

    private void btn_impActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_impActionPerformed
        
        JFileChooser fc = new JFileChooser();
        
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("*.dat", "dat");
        
        fc.setFileFilter(filtro);
        
        int seleccion = fc.showOpenDialog(this);
        
        if(seleccion == JFileChooser.APPROVE_OPTION){
            try{
                File fichero = fc.getSelectedFile();
                
                agenda.importarClientes(fichero.getAbsolutePath());
                
                rellenarTabla();
                JOptionPane.showMessageDialog(this, "Clientes importados con éxito.", "Información", JOptionPane.INFORMATION_MESSAGE);
            }catch(IOException ex){
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btn_impActionPerformed

    private void btn_expActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_expActionPerformed
        
        JFileChooser fc = new JFileChooser();
        
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("*.dat", "dat");
        
        fc.setFileFilter(filtro);
        
        int seleccion = fc.showOpenDialog(this);
        
        if(seleccion == JFileChooser.APPROVE_OPTION){
            
            File fichero = fc.getSelectedFile();
            
            agenda.exportarContactos(fichero.getAbsolutePath());
            
            rellenarTabla();
        }
    }//GEN-LAST:event_btn_expActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        txt_nombre.setText("");
        txt_dir.setText("");
        txt_nif.setText("");
        txt_tlf.setText("");
        txt_mail.setText("");
        
    }//GEN-LAST:event_jButton1ActionPerformed
        public void rellenarTabla(){
        
        modelo.setRowCount(0);
        
        Cliente clientes[] = agenda.getClientes();
        
        Object fila[];
        
        for(int i = 0; i < clientes.length; i++){
           
            if(clientes[i] != null){
                
            fila = new Object[5];
            fila[0] = clientes[i].getNombre();
            fila[1] = clientes[i].getDireccion();
            fila[2] = clientes[i].getNif();
            fila[3] = clientes[i].getTelefono();
            fila[4] = clientes[i].getCorreo();
            
            modelo.addRow(fila);
            }
        }
    }
        
    
        // Función que aplica la regla del doble dígito (si el resultado es >= 10, sumas sus cifras)
    private int sumarCifrasSiEsDoble(int numero) {
        // Si el número es 10 o más (dos cifras), suma sus dígitos.
        if (numero >= 10) {
            return (numero % 10) + (numero / 10);
        } else {
            return numero;
        }
    }
    
    private boolean comprobarNif(String nif){

        if(nif == null || nif.length() != 9){
            return false;
        }

        nif = nif.toUpperCase().trim();
        try{
            char prefijo = nif.charAt(0);
            char ultimoCaracter = nif.charAt(8);

            String nifTexto = nif.substring(1, 8);

            // Cambiamos solo esta parte: aseguramos que son números
            if (!nifTexto.matches("\\d{7}")) {
                return false;
            }

            // Para coger el caracter correcto del numero total
            char Cimpar1 = nifTexto.charAt(0);
            char Cpar1 = nifTexto.charAt(1);
            char Cimpar2 = nifTexto.charAt(2);
            char Cpar2 = nifTexto.charAt(3);
            char Cimpar3 = nifTexto.charAt(4);
            char Cpar3 = nifTexto.charAt(5);
            char Cimpar4 = nifTexto.charAt(6);

            // Parsear a número
            int impar1 = Character.getNumericValue(Cimpar1);
            int par1 = Character.getNumericValue(Cpar1);
            int impar2 = Character.getNumericValue(Cimpar2);
            int par2 = Character.getNumericValue(Cpar2);
            int impar3 = Character.getNumericValue(Cimpar3);
            int par3 = Character.getNumericValue(Cpar3);
            int impar4 = Character.getNumericValue(Cimpar4);

            //los impares se multiplican por 2
            int impar1Corregido = sumarCifrasSiEsDoble(impar1 * 2);
            int impar2Corregido = sumarCifrasSiEsDoble(impar2 * 2);
            int impar3Corregido = sumarCifrasSiEsDoble(impar3 * 2);
            int impar4Corregido = sumarCifrasSiEsDoble(impar4 * 2);

            //los pares se suman tal cual
            int sumaImpares = impar1Corregido + impar2Corregido + impar3Corregido + impar4Corregido;
            int sumaPares = par1 + par2 + par3;

            int sumaTotal = sumaImpares + sumaPares;
            int modulo10 = sumaTotal % 10;
            int dcn = 10 - modulo10;
            if (dcn == 10){
                dcn = 0;
            }

            String letrasControl = "JABCDEFGHI";

            if("ABEH".indexOf(prefijo) != -1){
                char dcnChar = Character.forDigit(dcn, 10);
                return dcnChar == ultimoCaracter;
            }else if("KPQSW".indexOf(prefijo) != -1){
                char letraCalculada = letrasControl.charAt(dcn);
                return letraCalculada == ultimoCaracter;
            }else{
                char dcnChar = Character.forDigit(dcn, 10);
                char letraCalculada = letrasControl.charAt(dcn);
                return (dcnChar == ultimoCaracter || letraCalculada == ultimoCaracter);
            }

        }catch(Exception e){
            System.out.print(e.getMessage());
            return false;
        }
    }

        
    private DefaultTableModel modelo;
    private Agenda agenda;
    private final String[] letrasDNI = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_del;
    private javax.swing.JButton btn_exp;
    private javax.swing.JButton btn_imp;
    private javax.swing.JButton btn_upd;
    private javax.swing.JComboBox<String> cbx_tipoPago;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JTextField txt_dir;
    private javax.swing.JTextField txt_direccionFacturacion;
    private javax.swing.JTextField txt_direccion_envio;
    private javax.swing.JTextField txt_mail;
    private javax.swing.JTextField txt_nif;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_tlf;
    // End of variables declaration//GEN-END:variables
}
*/
