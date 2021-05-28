package formularios;


import base_de_datos.conexionSQL;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import mostrar_adm.mostrar_registro;
import mostrar_adm.tabla_registro;



public class ingresar_1_1 extends javax.swing.JFrame {

    conexionSQL cc=new conexionSQL();
    Connection con=cc.conexion();
    PreparedStatement ps=null;
    ResultSet rs=null;
    Statement stmt=null ;
    
    
    public ingresar_1_1() {
        
        initComponents();
        this.setLocationRelativeTo(null);
       
  
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        contacto = new javax.swing.JTextField();
        distrito = new javax.swing.JTextField();
        fech = new javax.swing.JTextField();
        venta_alquiler = new javax.swing.JTextField();
        dato = new javax.swing.JTextField();
        buscar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        direcc = new javax.swing.JTextField();
        precio = new javax.swing.JTextField();
        provincia = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        codi = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        agregar1 = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        limpiar = new javax.swing.JButton();
        modificar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        salir = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descripcion = new javax.swing.JTextArea();
        lblfoto = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        no_imagen = new javax.swing.JTextField();
        seleccionar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        tabla = new javax.swing.JButton();
        historial = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();

        jTextField1.setText("jTextField1");

        javax.swing.GroupLayout jDesktopPane2Layout = new javax.swing.GroupLayout(jDesktopPane2);
        jDesktopPane2.setLayout(jDesktopPane2Layout);
        jDesktopPane2Layout.setHorizontalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane2Layout.setVerticalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel9.setText("jLabel9");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Administrador");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 606, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 606, -1));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 606, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 486, 606, -1));

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Nombre:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Correo:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Provincia:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Distrito:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Fecha:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Precio:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Venta o alquiler:");

        contacto.setBackground(new java.awt.Color(230, 230, 230));
        contacto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        contacto.setForeground(new java.awt.Color(0, 102, 102));
        contacto.setBorder(null);
        contacto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactoActionPerformed(evt);
            }
        });

        distrito.setBackground(new java.awt.Color(230, 230, 230));
        distrito.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        distrito.setForeground(new java.awt.Color(0, 102, 102));
        distrito.setBorder(null);

        fech.setBackground(new java.awt.Color(230, 230, 230));
        fech.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        fech.setForeground(new java.awt.Color(0, 102, 102));
        fech.setBorder(null);

        venta_alquiler.setBackground(new java.awt.Color(230, 230, 230));
        venta_alquiler.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        venta_alquiler.setForeground(new java.awt.Color(0, 102, 102));
        venta_alquiler.setBorder(null);

        dato.setBorder(null);

        buscar.setBackground(new java.awt.Color(204, 204, 204));
        buscar.setText("Buscar");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("Buscar por codigo :");

        direcc.setBackground(new java.awt.Color(230, 230, 230));
        direcc.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        direcc.setForeground(new java.awt.Color(0, 102, 102));
        direcc.setBorder(null);
        direcc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                direccActionPerformed(evt);
            }
        });

        precio.setBackground(new java.awt.Color(230, 230, 230));
        precio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        precio.setForeground(new java.awt.Color(0, 102, 102));
        precio.setBorder(null);

        provincia.setBackground(new java.awt.Color(230, 230, 230));
        provincia.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        provincia.setForeground(new java.awt.Color(0, 102, 102));
        provincia.setBorder(null);
        provincia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                provinciaActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("Codigo:");

        codi.setBackground(new java.awt.Color(230, 230, 230));
        codi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        codi.setForeground(new java.awt.Color(0, 102, 102));
        codi.setBorder(null);
        codi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codiActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("4 caracteres numericos");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 204, 204));
        jLabel15.setText("Registro nuevo");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(72, Short.MAX_VALUE)
                .addComponent(dato, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buscar)
                .addGap(14, 14, 14))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel11))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLabel7))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel10))))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(fech, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                                    .addComponent(distrito)
                                    .addComponent(venta_alquiler)
                                    .addComponent(precio))))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(codi, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(contacto, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(direcc, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(provincia, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel15)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dato, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscar))
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14))
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contacto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(direcc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(provincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(distrito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fech, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(venta_alquiler, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 290, 440));

        agregar1.setBackground(new java.awt.Color(0, 153, 153));
        agregar1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        agregar1.setText("Agregar");
        agregar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregar1ActionPerformed(evt);
            }
        });
        getContentPane().add(agregar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 370, 280, -1));

        eliminar.setBackground(new java.awt.Color(0, 153, 153));
        eliminar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        eliminar.setText("Eliminar");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });
        getContentPane().add(eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 370, 280, -1));

        limpiar.setBackground(new java.awt.Color(0, 153, 153));
        limpiar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        limpiar.setText("Limpiar");
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });
        getContentPane().add(limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 410, 280, 30));

        modificar.setBackground(new java.awt.Color(0, 153, 153));
        modificar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        modificar.setText("Modificar");
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });
        getContentPane().add(modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 410, 280, -1));

        jPanel4.setBackground(new java.awt.Color(0, 102, 102));

        salir.setBackground(new java.awt.Color(0, 153, 153));
        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/back-arrow_icon-icons.com_72866.png"))); // NOI18N
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 880, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 30));

        jPanel5.setBackground(new java.awt.Color(0, 102, 102));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 930, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 930, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 102));
        jLabel8.setText("Buscar imagen:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 40, -1, -1));

        descripcion.setBackground(new java.awt.Color(230, 230, 230));
        descripcion.setColumns(20);
        descripcion.setForeground(new java.awt.Color(0, 102, 102));
        descripcion.setLineWrap(true);
        descripcion.setRows(5);
        descripcion.setWrapStyleWord(true);
        descripcion.setBorder(null);
        descripcion.setDisabledTextColor(new java.awt.Color(6, 102, 102));
        jScrollPane1.setViewportView(descripcion);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, 310, 160));

        lblfoto.setBackground(new java.awt.Color(0, 153, 153));
        lblfoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)));
        getContentPane().add(lblfoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 60, 230, 160));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 102, 102));
        jLabel13.setText("Descripcion:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, -1, -1));

        no_imagen.setEnabled(false);
        getContentPane().add(no_imagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 220, 200, 30));

        seleccionar.setBackground(new java.awt.Color(0, 153, 153));
        seleccionar.setText("...");
        seleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleccionarActionPerformed(evt);
            }
        });
        getContentPane().add(seleccionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 220, 30, 30));

        jSeparator2.setBackground(new java.awt.Color(0, 153, 153));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 450, 380, 20));

        jSeparator3.setBackground(new java.awt.Color(0, 153, 153));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 360, 380, 20));

        tabla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/spreadsheet_table_document_page_5852.png"))); // NOI18N
        tabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tablaActionPerformed(evt);
            }
        });
        getContentPane().add(tabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 310, 50, -1));

        historial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Icon013_31243.png"))); // NOI18N
        historial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historialActionPerformed(evt);
            }
        });
        getContentPane().add(historial, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 310, 50, -1));

        jSeparator4.setBackground(new java.awt.Color(0, 153, 153));
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, 630, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

 //-----------------------------------------------------------------------------   
    public void  agregar_adm(){
        
        
    String SQL=("INSERT INTO ventas(codigo,nombre,correo,provincia,distrito,fecha,precio,venta_alquiler,descripcion,no_imagen,imagen) VALUES(?,?,?, ?,?,?, ?,?,?, ?,?)");
    FileInputStream  archivo_foto;
    
        try{
            PreparedStatement call=con.prepareStatement(SQL);
        
        
            call.setString(1,codi.getText());
            call.setString(2,contacto.getText());
            call.setString(3,direcc.getText());
            call.setString(4,provincia.getText());
            call.setString(5,distrito.getText());
            call.setString(6,fech.getText());
            call.setString(7,precio.getText());
            call.setString(8,venta_alquiler.getText());
            call.setString(9,descripcion.getText());
            call.setString(10,no_imagen.getText());
        
            archivo_foto = new FileInputStream(no_imagen.getText());
            call.setBinaryStream(11, archivo_foto);
        
      
        
            int i=call.executeUpdate();
            if(i>0){
            JOptionPane.showMessageDialog(null, "Se guardo correctamente");
            }
    
        }catch(Exception e){
        JOptionPane.showMessageDialog(null,"error de registro");
        }
    }
    
//------------------------------------------------------------------------------
    
    public void limpiar(){
        
            codi.setText("");
            contacto.setText("");
            direcc.setText("");
            provincia.setText("");
            distrito.setText("");
            fech.setText("");
            precio.setText("");
            venta_alquiler.setText("");
            descripcion.setText("");
            dato.setText("");
            no_imagen.setText("");
            lblfoto.setIcon(null);
            no_imagen.setText(null);
   
    }
    
//------------------------------------------------------------------------------
    
    void mostrar(){
            
        int cont=0;
        
                
 
            try {
                int cod=Integer.parseInt(dato.getText());
                String SQL = ("SELECT * FROM ventas where codigo ="+cod+"");
                Statement st=con.createStatement();
                ResultSet ss=st.executeQuery(SQL);
            
                while (ss.next()){
                    cont++;
                    
                 
                    String dat = ss.getString("codigo");
                    String conta = ss.getString("nombre");
                    String direc = ss.getString("Correo");
                    
                    String provi = ss.getString("Provincia");
                    String distri = ss.getString("distrito");
                    String fec = ss.getString("fecha");
                    
                    String preci = ss.getString("precio");
                    String venta = ss.getString("venta_alquiler");
                    String descri = ss.getString("descripcion");
                    
                    String direccion = ss.getString("no_imagen");
                    
                   Image foto = getToolkit().getImage(direccion);
                    foto= foto.getScaledInstance(229, 200, Image.SCALE_DEFAULT);
                    
                    
                    lblfoto.setIcon(new ImageIcon(foto));
                    codi.setText(dat);
                    contacto.setText(conta);
                    direcc.setText(direc);
                    provincia.setText(provi);
                    distrito.setText(distri);
                    fech.setText(fec);
                    precio.setText(preci);
                    venta_alquiler.setText(venta);
                    descripcion.setText(descri);
                    no_imagen.setText(direccion);
                    
                }
                
                
            } catch(Exception e){JOptionPane.showMessageDialog(null,"Ingrese un codido para buscar y mostrar registo.");}
            
   
    }
   
//------------------------------------------------------------------------------
    
     void eliminar(){
            
        int cont=0;
            
               
            try{
                int cod=Integer.parseInt(dato.getText());
               ps = con.prepareStatement("DELETE FROM ventas where codigo ="+cod);

                ps.executeUpdate();
                ps.close();
                con.close();
                
                JOptionPane.showMessageDialog(null,"Registro eliminado");

            }catch (Exception e){JOptionPane.showMessageDialog(null,"Ingrese un codigo para eliminar registro.");
            }

    }
     
//------------------------------------------------------------------------------     
     
     void modificar(){
         
        try{
            int cod=Integer.parseInt(dato.getText());
            String SQL=("UPDATE ventas SET codigo=?,nombre=?,correo=?,provincia=?,distrito=?,fecha=?,precio=?,venta_alquiler=?,descripcion=?,no_imagen=?,imagen=? WHERE codigo="+cod);
    
            PreparedStatement call=con.prepareStatement(SQL);
        
            call.setString(1,codi.getText());
            call.setString(2,contacto.getText());
            call.setString(3,direcc.getText());
            call.setString(4,provincia.getText());
            call.setString(5,distrito.getText());
            call.setString(6,fech.getText());
            call.setString(7,precio.getText());
            call.setString(8,venta_alquiler.getText());
            call.setString(9,descripcion.getText());
            call.setString(10,no_imagen.getText());
        
            FileInputStream archivo_foto1 = new FileInputStream(no_imagen.getText());
            call.setBinaryStream(11, archivo_foto1);
        
      
        
            int i=call.executeUpdate();
            if(i>0){
            JOptionPane.showMessageDialog(null, "Se guardo correctamente");
            }

            call.executeUpdate();
 
        }catch(Exception e){JOptionPane.showMessageDialog(null,"No hay datos que modificar.");
        }
}
     
//------------------------------------------------------------------------------
     
    
    
    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
    
    eliminar();
    limpiar();
    
    }//GEN-LAST:event_eliminarActionPerformed

    
    
    private void agregar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregar1ActionPerformed
        
        agregar_adm();
         limpiar();
    }//GEN-LAST:event_agregar1ActionPerformed

    
    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        
        home_3 estado1= new home_3();
        estado1.setVisible(true);
        dispose();
        System.gc();  
    }//GEN-LAST:event_salirActionPerformed

    
    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
       
        modificar();
    }//GEN-LAST:event_modificarActionPerformed

    
    
    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        
        limpiar();
        
    }//GEN-LAST:event_limpiarActionPerformed

    private void direccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_direccActionPerformed
        
    }//GEN-LAST:event_direccActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        
        mostrar();

    }//GEN-LAST:event_buscarActionPerformed

    
    
    private void contactoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contactoActionPerformed

    private void provinciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_provinciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_provinciaActionPerformed

    private void codiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codiActionPerformed

    
    
    
    private void seleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seleccionarActionPerformed
        
        
        JFileChooser archivo = new JFileChooser();
        //Si deseamos crear filtros para la selecion de archivos
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Formatos de Archivos JPEG(*.JPG;*.JPEG)", "jpg","jpeg");
        
        //Si deseas que se muestre primero los filtros usa la linea q esta abajo de esta.
        //archivo.setFileFilter(filtro);
        // Agregamos el Filtro pero cuidado se mostrara despues de todos los archivos
        archivo.addChoosableFileFilter(filtro);
        
        // Colocamos titulo a nuestra ventana de Seleccion
        archivo.setDialogTitle("Buscador de archivos");
        //Si deseamos que muestre una carpeta predetermina usa la siguiente linea
        File ruta = new File("D:/Documentos");
        //Le implementamos a nuestro ventana de seleccion
         archivo.setCurrentDirectory(ruta);
         
         //Abrimos nuestra Ventana de Selccion
        int ventana = archivo.showOpenDialog(null);
        //hacemos comparacion en caso de aprete el boton abrir
        if(ventana == JFileChooser.APPROVE_OPTION)
        {
            //Obtenemos la ruta de nuestra imagen seleccionada
            File file = archivo.getSelectedFile();
            //Lo imprimimos en una caja de texto para ver su ruta
            no_imagen.setText(String.valueOf(file));
            
            //de cierto modo necesitamos tener la imagen para ello debemos conocer la ruta de dicha imagen
            Image foto= getToolkit().getImage(no_imagen.getText());
            //Le damos dimension a nuestro label que tendra la imagen
            foto= foto.getScaledInstance(229, 200, Image.SCALE_DEFAULT);
            //Imprimimos la imagen en el label
            lblfoto.setIcon(new ImageIcon(foto));
        }
    }//GEN-LAST:event_seleccionarActionPerformed

    private void tablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tablaActionPerformed
        tabla_registro conect=new tabla_registro();
        conect.setVisible(true);
        dispose();
        System.gc();
    }//GEN-LAST:event_tablaActionPerformed

    private void historialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historialActionPerformed
        mostrar_registro conect=new mostrar_registro();
        conect.setVisible(true);
        dispose();
        System.gc();
    }//GEN-LAST:event_historialActionPerformed

 
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ingresar_1_1().setVisible(true);
                System.gc();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregar1;
    private javax.swing.JButton buscar;
    private javax.swing.JTextField codi;
    private javax.swing.JTextField contacto;
    private javax.swing.JTextField dato;
    private javax.swing.JTextArea descripcion;
    private javax.swing.JTextField direcc;
    private javax.swing.JTextField distrito;
    private javax.swing.JButton eliminar;
    private javax.swing.JTextField fech;
    private javax.swing.JButton historial;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblfoto;
    private javax.swing.JButton limpiar;
    private javax.swing.JButton modificar;
    private javax.swing.JTextField no_imagen;
    private javax.swing.JTextField precio;
    private javax.swing.JTextField provincia;
    private javax.swing.JButton salir;
    private javax.swing.JButton seleccionar;
    private javax.swing.JButton tabla;
    private javax.swing.JTextField venta_alquiler;
    // End of variables declaration//GEN-END:variables

    

   
}
