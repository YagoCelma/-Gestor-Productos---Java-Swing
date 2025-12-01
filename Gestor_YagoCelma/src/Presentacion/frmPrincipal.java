package Presentacion;

//import NoUsadoFicheros.jpn_Usuario;
import java.awt.BorderLayout;
import java.awt.Color;
import java.sql.SQLException;
import javax.swing.JPanel;

public class frmPrincipal extends javax.swing.JFrame {

    private final Color COLOR_ACTIVO = new Color(164, 209, 144);
    private final Color COLOR_NORMAL = new Color(240, 240, 240);

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(frmPrincipal.class.getName());

    public static frmPrincipal instancia;

    public frmPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);

        instancia = this;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpn_fondo = new javax.swing.JPanel();
        jpn_MnVertical = new javax.swing.JPanel();
        btn_clientes = new javax.swing.JButton();
        btn_empleados = new javax.swing.JButton();
        btn_pedidos = new javax.swing.JButton();
        btn_productos = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jpn_MnHorizontal = new javax.swing.JPanel();
        jpn_Contenido = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpn_fondo.setBackground(new java.awt.Color(255, 255, 255));
        jpn_fondo.setPreferredSize(new java.awt.Dimension(1220, 1024));
        jpn_fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpn_MnVertical.setBackground(new java.awt.Color(48, 80, 67));

        btn_clientes.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_clientes.setText("Clientes");
        btn_clientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clientesActionPerformed(evt);
            }
        });

        btn_empleados.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_empleados.setText("Empleados");
        btn_empleados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_empleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_empleadosActionPerformed(evt);
            }
        });

        btn_pedidos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_pedidos.setText("Ventas");
        btn_pedidos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_pedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pedidosActionPerformed(evt);
            }
        });

        btn_productos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_productos.setText("Productos");
        btn_productos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_productos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_productosActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/LogoEmpresa.png"))); // NOI18N
        jLabel2.setRequestFocusEnabled(false);

        javax.swing.GroupLayout jpn_MnVerticalLayout = new javax.swing.GroupLayout(jpn_MnVertical);
        jpn_MnVertical.setLayout(jpn_MnVerticalLayout);
        jpn_MnVerticalLayout.setHorizontalGroup(
            jpn_MnVerticalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpn_MnVerticalLayout.createSequentialGroup()
                .addGroup(jpn_MnVerticalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpn_MnVerticalLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel2))
                    .addGroup(jpn_MnVerticalLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(btn_clientes, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpn_MnVerticalLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(btn_empleados, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpn_MnVerticalLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(btn_pedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(4, 6, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpn_MnVerticalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_productos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpn_MnVerticalLayout.setVerticalGroup(
            jpn_MnVerticalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpn_MnVerticalLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addGap(213, 213, 213)
                .addComponent(btn_clientes, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btn_empleados, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btn_pedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btn_productos, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jpn_fondo.add(jpn_MnVertical, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 1164));

        jpn_MnHorizontal.setBackground(new java.awt.Color(153, 255, 153));

        javax.swing.GroupLayout jpn_MnHorizontalLayout = new javax.swing.GroupLayout(jpn_MnHorizontal);
        jpn_MnHorizontal.setLayout(jpn_MnHorizontalLayout);
        jpn_MnHorizontalLayout.setHorizontalGroup(
            jpn_MnHorizontalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jpn_MnHorizontalLayout.setVerticalGroup(
            jpn_MnHorizontalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );

        jpn_fondo.add(jpn_MnHorizontal, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 2390, -1));

        jpn_Contenido.setPreferredSize(new java.awt.Dimension(1350, 730));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("PANTALLA DE INICIO");

        javax.swing.GroupLayout jpn_ContenidoLayout = new javax.swing.GroupLayout(jpn_Contenido);
        jpn_Contenido.setLayout(jpn_ContenidoLayout);
        jpn_ContenidoLayout.setHorizontalGroup(
            jpn_ContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpn_ContenidoLayout.createSequentialGroup()
                .addGap(379, 379, 379)
                .addComponent(jLabel1))
        );
        jpn_ContenidoLayout.setVerticalGroup(
            jpn_ContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpn_ContenidoLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1))
        );

        jpn_fondo.add(jpn_Contenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 89, 1320, 1075));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpn_fondo, javax.swing.GroupLayout.DEFAULT_SIZE, 2550, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpn_fondo, javax.swing.GroupLayout.DEFAULT_SIZE, 1164, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_clientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clientesActionPerformed
        try {
            Inicio(2);
            resetearColoresBotones();
            btn_clientes.setBackground(COLOR_ACTIVO);
        } catch (SQLException ex) {
            System.getLogger(frmPrincipal.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }//GEN-LAST:event_btn_clientesActionPerformed

    private void btn_empleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_empleadosActionPerformed
        try {
            Inicio(3);
            resetearColoresBotones();
            btn_empleados.setBackground(COLOR_ACTIVO);
        } catch (SQLException ex) {
            System.getLogger(frmPrincipal.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }//GEN-LAST:event_btn_empleadosActionPerformed

    private void btn_pedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pedidosActionPerformed
        try {
            Inicio(4);
            resetearColoresBotones();
            btn_pedidos.setBackground(COLOR_ACTIVO);
        } catch (SQLException ex) {
            System.getLogger(frmPrincipal.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }//GEN-LAST:event_btn_pedidosActionPerformed

    private void btn_productosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_productosActionPerformed
        try {
            Inicio(6);
            resetearColoresBotones();
            btn_productos.setBackground(COLOR_ACTIVO);
        } catch (SQLException ex) {
            System.getLogger(frmPrincipal.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }//GEN-LAST:event_btn_productosActionPerformed

    public void Inicio(int opcion) throws SQLException {

        //jpn_Usuario pl_user = new jpn_Usuario();
        jpn_Cliente pl_cliente = new jpn_Cliente();
        jpn_Ventas pl_ventas = new jpn_Ventas();
        jpn_Empleado pl_empleado = new jpn_Empleado();
        jpn_DetallesVentas pl_detallesVentas = new jpn_DetallesVentas();
        jpn_Productos pl_productos = new jpn_Productos();

        switch (opcion) {
            /*case 1:{
                Compartido(pl_user);
                break;
            }*/
            case 2: {
                Compartido(pl_cliente);
                break;
            }
            case 3: {
                Compartido(pl_empleado);
                break;
            }
            case 4: {
                Compartido(pl_ventas);
                break;
            }
            case 5: {
                Compartido(pl_detallesVentas);
                break;

            }
            case 6: {
                Compartido(pl_productos);
                break;
            }

        }

    }

    public void Compartido(JPanel panelCargar) {

        panelCargar.setLocation(0, 0); //define la posicion
        panelCargar.setSize(1150, 600); //establece el tamaño del nuevo panel

        jpn_Contenido.removeAll(); //esconde la pantalla jpn_Contenido para que no se amontonen
        jpn_Contenido.add(panelCargar, BorderLayout.CENTER); //añade una nueva pantalla
        jpn_Contenido.revalidate(); //recalcula el tamaño y posicion de todos los componentes
        jpn_Contenido.repaint(); //crea por completo la nueva ventana
    }

    private void resetearColoresBotones() {
        btn_clientes.setBackground(COLOR_NORMAL);
        btn_empleados.setBackground(COLOR_NORMAL);
        btn_pedidos.setBackground(COLOR_NORMAL);
        btn_productos.setBackground(COLOR_NORMAL);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_clientes;
    private javax.swing.JButton btn_empleados;
    private javax.swing.JButton btn_pedidos;
    private javax.swing.JButton btn_productos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jpn_Contenido;
    private javax.swing.JPanel jpn_MnHorizontal;
    private javax.swing.JPanel jpn_MnVertical;
    private javax.swing.JPanel jpn_fondo;
    // End of variables declaration//GEN-END:variables

}
