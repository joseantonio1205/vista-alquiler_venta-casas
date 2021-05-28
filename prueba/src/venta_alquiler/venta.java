
package venta_alquiler;

import formularios.*;
import base_de_datos.conexionSQL;
import descripcion.descripcion1;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;




public class venta extends javax.swing.JFrame {
        conexionSQL cc=new conexionSQL();
    Connection con=cc.conexion();
    
    
    PreparedStatement ps=null;
    ResultSet rs=null;
    Statement stmt=null ;
    
    
    
    public venta() {
        initComponents();
        mostrar_tabla();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        back = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ok = new javax.swing.JButton();
        rango1 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        enviar_cod = new javax.swing.JButton();
        busqueda_codigo1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Arrendadora-casas/apartamentos en venta");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        back.setBackground(new java.awt.Color(0, 153, 153));
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/back-arrow_icon-icons.com_72866.png"))); // NOI18N
        back.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(back)
                .addGap(0, 1025, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, -1));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1060, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 474, 1060, -1));

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Ofertas:");

        jTextArea1.setBackground(new java.awt.Color(0, 153, 153));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(204, 204, 204));
        jTextArea1.setRows(5);
        jTextArea1.setText("Aprovecha los precios\nen alquiler en cualquiera \nde estas casas.\nsolo valido este mes.");
        jScrollPane1.setViewportView(jTextArea1);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/forsale_87646.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Rango de precios 500-9000:");

        ok.setBackground(new java.awt.Color(0, 153, 153));
        ok.setText("OK");
        ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(rango1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGap(27, 27, 27)
                                    .addComponent(jLabel1))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel6))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGap(70, 70, 70)
                                    .addComponent(jLabel4))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(ok)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rango1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ok)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 270, 450));

        jSeparator1.setBackground(new java.awt.Color(0, 153, 153));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 750, 20));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cod.Casa", "Vendedor", "Precio", "Imagen"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tabla);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("Ingrese Cod.Casa para mas informacion:");

        enviar_cod.setBackground(new java.awt.Color(0, 153, 153));
        enviar_cod.setText("Mostrar");
        enviar_cod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviar_codActionPerformed(evt);
            }
        });

        busqueda_codigo1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        busqueda_codigo1.setForeground(new java.awt.Color(0, 102, 102));
        busqueda_codigo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busqueda_codigo1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(6, 6, 6)
                .addComponent(busqueda_codigo1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(enviar_cod)
                .addContainerGap(292, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(busqueda_codigo1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(enviar_cod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, 790, 370));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("En Venta");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
     void mostrar_tabla(){
         
    int cont=0;       
    String SQL = ("SELECT codigo,nombre,precio,no_imagen,imagen FROM ventas WHERE venta_alquiler ='venta'");
    
    
   try {
            
            Statement st=con.createStatement();
            ResultSet ss=st.executeQuery(SQL);
            
            DefaultTableModel modelo = new DefaultTableModel();
            tabla.setModel(modelo);
            
            ResultSetMetaData rsmd = ss.getMetaData();
            int cant_colum = rsmd.getColumnCount();
            
            
            modelo.addColumn("Cod.casa");
            modelo.addColumn("vendedor");
            modelo.addColumn("precio");
            
             
            
                    
                            while (ss.next()){
                                cont++;
                    
                                Object[] filas = new Object[cant_colum];
                    
                                for(int i= 0;i<cant_colum;i++){
                                filas[i]= ss.getObject(i+1);
                                
                            }

                    
                    modelo.addRow(filas);
                    
                    
                }
        }catch (SQLException ex) {
            Logger.getLogger(ingresar_1_1.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"no existe este registro."+ex.getMessage());
            }
    
}
    
     
     
      void mostrar_tabla12(){
            int cont=0;       
            int cod3= Integer.parseInt(rango1.getText());
            
            String SQL = ("SELECT codigo,nombre,precio,no_imagen,imagen FROM ventas WHERE venta_alquiler ='venta' AND precio <='"+cod3+"'");

            
    
    
            try {
            
            Statement st=con.createStatement();
            ResultSet ss=st.executeQuery(SQL);
            
            DefaultTableModel modelo = new DefaultTableModel();
            tabla.setModel(modelo);
            
            ResultSetMetaData rsmd = ss.getMetaData();
            int cant_colum = rsmd.getColumnCount();
            
            
            modelo.addColumn("Cod.casa");
            modelo.addColumn("vendedor");
            modelo.addColumn("precio");
            
             
            
                    
                            while (ss.next()){
                                cont++;
                    
                                Object[] filas = new Object[cant_colum];
                    
                                for(int i= 0;i<cant_colum;i++){
                                filas[i]= ss.getObject(i+1);
                                
                            }

                    
                    modelo.addRow(filas);
                    
                    
                }
        }catch (SQLException ex) {
            Logger.getLogger(ingresar_1_1.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"no existe este registro."+ex.getMessage());
            }
    
}
     
     
    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        home_3 conect=new home_3();
        conect.setVisible(true);
        System.gc();
        dispose();
    }//GEN-LAST:event_backActionPerformed

    private void enviar_codActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviar_codActionPerformed
        busqueda_codigo1.getText();
        descripcion1 conec = new descripcion1();
        conec.setVisible(true);
        dispose();
    }//GEN-LAST:event_enviar_codActionPerformed

    private void okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okActionPerformed
        mostrar_tabla12();
    }//GEN-LAST:event_okActionPerformed

    private void busqueda_codigo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busqueda_codigo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_busqueda_codigo1ActionPerformed

    
    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new venta().setVisible(true);
            }
        });
    }
    
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    public static javax.swing.JTextField busqueda_codigo1;
    private javax.swing.JButton enviar_cod;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton ok;
    private javax.swing.JTextField rango1;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables

    

    

    

    
}
