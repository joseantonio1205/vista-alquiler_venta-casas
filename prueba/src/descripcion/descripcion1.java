package descripcion;

import base_de_datos.conexionSQL;
import venta_alquiler.alquiler;
import formularios.ingresar_1_1;
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static venta_alquiler.venta.busqueda_codigo1;



public class descripcion1 extends javax.swing.JFrame {

    conexionSQL cc=new conexionSQL();
    Connection con=cc.conexion();
    PreparedStatement ps=null;
    ResultSet rs=null;
    Statement stmt=null ;
   
    
    public descripcion1() {
        initComponents();
        
        descripcion1();
        
        this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        foto_descrip = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descip = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        regresar = new javax.swing.JButton();
        venta_alquiler2 = new javax.swing.JLabel();
        corr = new javax.swing.JLabel();
        prov = new javax.swing.JLabel();
        distr = new javax.swing.JLabel();
        co_v = new javax.swing.JLabel();
        vend = new javax.swing.JLabel();
        fechaa = new javax.swing.JLabel();
        precio1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Descripcion");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 832, -1));

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        foto_descrip.setBackground(new java.awt.Color(0, 153, 153));
        foto_descrip.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)));
        jPanel3.add(foto_descrip, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 380, 380));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 420, 540));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("Descripcion:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 440, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(0, 153, 153));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, 380, 20));

        jPanel4.setBackground(new java.awt.Color(0, 102, 102));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 570, 830, 40));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("Descripcion:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 40, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("Codigo de venta:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 102));
        jLabel5.setText("Vendedor:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 130, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setText("Correo:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 170, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 102));
        jLabel7.setText("Provincia:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 220, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 102));
        jLabel8.setText("Distrito:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 260, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 102));
        jLabel9.setText("Fecha:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 300, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 102));
        jLabel10.setText("Precio:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 350, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 102));
        jLabel11.setText("Estado:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 400, -1, -1));

        descip.setEditable(false);
        descip.setBackground(new java.awt.Color(240, 240, 240));
        descip.setColumns(20);
        descip.setForeground(new java.awt.Color(0, 102, 102));
        descip.setLineWrap(true);
        descip.setRows(5);
        descip.setWrapStyleWord(true);
        jScrollPane1.setViewportView(descip);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 450, 220, 110));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        regresar.setBackground(new java.awt.Color(0, 153, 153));
        regresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/back-arrow_icon-icons.com_72866.png"))); // NOI18N
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 793, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 30));

        venta_alquiler2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(venta_alquiler2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 400, 170, 20));

        corr.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(corr, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 170, 170, 20));

        prov.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(prov, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 220, 170, 20));

        distr.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(distr, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 260, 170, 20));

        co_v.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(co_v, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 90, 170, 20));

        vend.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(vend, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 130, 170, 20));

        fechaa.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(fechaa, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 300, 170, 20));

        precio1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(precio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 350, 170, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents
  
     
     
    void descripcion1 (){
        
        int cont3=0;
        int cod2= Integer.parseInt(busqueda_codigo1.getText());
        String SQL = ("SELECT * FROM ventas where codigo ="+cod2);
            
            
            try {
            
                Statement st=con.createStatement();
                ResultSet ss=st.executeQuery(SQL);
            
                    while (ss.next()){
                        cont3++;
                    
                 
                        String datt = ss.getString("codigo");
                        String contaa = ss.getString("nombre");
                        String direcc = ss.getString("Correo");
                        String provii = ss.getString("Provincia");
                        String distrii = ss.getString("distrito");
                        String fecc = ss.getString("fecha");
                        String precii = ss.getString("precio");
                        String ventaa = ss.getString("venta_alquiler");
                        String descrii = ss.getString("descripcion");
                        String direccion = ss.getString("no_imagen");
                    
                        Image foto = getToolkit().getImage(direccion);
                        foto= foto.getScaledInstance(450, 450, Image.SCALE_DEFAULT);
                    
                    
                        foto_descrip.setIcon(new ImageIcon(foto));
                        co_v.setText(datt);
                        vend.setText(contaa);
                        corr.setText(direcc);
                        prov.setText(provii);
                        distr.setText(distrii);
                        fechaa.setText(fecc);
                        precio1.setText(precii);
                        venta_alquiler2.setText(ventaa);
                        descip.setText(descrii);
                    }
                   
            } catch (SQLException ex) {
            Logger.getLogger(ingresar_1_1.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"no existe este registro."+ex.getMessage());
            }
    }
     
    
    
    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        alquiler con1= new alquiler();
        con1.setVisible(true);
        dispose();
        System.gc();
    }//GEN-LAST:event_regresarActionPerformed

    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new descripcion1().setVisible(true);
            }
        });
    }

     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel co_v;
    private javax.swing.JLabel corr;
    private javax.swing.JTextArea descip;
    private javax.swing.JLabel distr;
    private javax.swing.JLabel fechaa;
    private javax.swing.JLabel foto_descrip;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel precio1;
    private javax.swing.JLabel prov;
    private javax.swing.JButton regresar;
    private javax.swing.JLabel vend;
    private javax.swing.JLabel venta_alquiler2;
    // End of variables declaration//GEN-END:variables

    
}
