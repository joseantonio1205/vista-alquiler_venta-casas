
package formularios;

import java.sql.Connection;
import base_de_datos.conexionSQL;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;





public class registrarse_2 extends javax.swing.JFrame {

    conexionSQL cc=new conexionSQL();
    Connection con=cc.conexion();
    
    public registrarse_2() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        back = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        registrar = new javax.swing.JButton();
        nombre = new javax.swing.JTextField();
        apellido = new javax.swing.JTextField();
        nomb_usuario = new javax.swing.JTextField();
        fech_nac = new javax.swing.JTextField();
        correo = new javax.swing.JTextField();
        contra1 = new javax.swing.JPasswordField();
        contra2 = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Registrarse");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        back.setBackground(new java.awt.Color(0, 153, 153));
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/back-arrow_icon-icons.com_72866.png"))); // NOI18N
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
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 457, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 30, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 495, 30));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 495, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 404, 495, -1));

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Nos alegra tenerte");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("usuario.");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("como un nuevo ");

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/folder_type_log_opened_icon_129902.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 170, 380));

        jLabel1.setText("Nombre:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, -1, -1));

        jLabel2.setText("Apellido:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, -1, -1));

        jLabel3.setText("Nombre de usuario:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, -1, -1));

        jLabel4.setText("Fecha de nacimiento:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, -1, -1));

        jLabel5.setText("Corrreo:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, -1, -1));

        jLabel6.setText("Contraseña:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, -1, -1));

        jLabel7.setText("Introduzca contraseña nuevamente:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, -1, -1));

        registrar.setBackground(new java.awt.Color(0, 153, 153));
        registrar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        registrar.setText("Registrarse");
        registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarActionPerformed(evt);
            }
        });
        getContentPane().add(registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 340, -1, -1));

        nombre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nombre.setForeground(new java.awt.Color(0, 102, 102));
        nombre.setBorder(null);
        getContentPane().add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, 130, -1));

        apellido.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        apellido.setForeground(new java.awt.Color(0, 102, 102));
        apellido.setBorder(null);
        getContentPane().add(apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 130, -1));

        nomb_usuario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nomb_usuario.setForeground(new java.awt.Color(0, 102, 102));
        nomb_usuario.setBorder(null);
        getContentPane().add(nomb_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, 130, -1));

        fech_nac.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        fech_nac.setForeground(new java.awt.Color(0, 102, 102));
        fech_nac.setBorder(null);
        getContentPane().add(fech_nac, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, 130, -1));

        correo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        correo.setForeground(new java.awt.Color(0, 102, 102));
        correo.setBorder(null);
        getContentPane().add(correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 130, -1));

        contra1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        contra1.setForeground(new java.awt.Color(0, 102, 102));
        contra1.setBorder(null);
        getContentPane().add(contra1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, 130, -1));

        contra2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        contra2.setForeground(new java.awt.Color(0, 102, 102));
        contra2.setBorder(null);
        getContentPane().add(contra2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 300, 130, -1));

        jSeparator1.setBackground(new java.awt.Color(0, 153, 153));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 300, 10));

        jSeparator2.setBackground(new java.awt.Color(0, 153, 153));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 380, 300, 10));

        jLabel12.setText("Ejm: 2015-01-20");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 150, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    public void  agregar(){
    String SQL=("INSERT INTO usuarios(nombre,apellido,nombre_usuario,fecha_nacimiento,correo,contraseña) VALUES(?,?,?,?,?,?)");
    
    String pass1=String.valueOf(contra1.getPassword());
    String pass2=String.valueOf(contra2.getPassword());
   
    
    
    if (pass1.equals(pass2)){
        
        try{
        PreparedStatement call=con.prepareStatement(SQL);
        
        call.setString(1,nombre.getText());
        call.setString(2,apellido.getText());
        call.setString(3,nomb_usuario.getText());
        call.setString(4,fech_nac.getText());
        call.setString(5,correo.getText());
        call.setString(6,pass1);
        
        call.executeUpdate();
        JOptionPane.showMessageDialog(null,"proceso exitoso");
        
        
        
        
        loggin_1 estado1= new loggin_1();
        estado1.setVisible(true);
        dispose();
        System.gc();
        
        
    }catch(Exception e){
        JOptionPane.showMessageDialog(null,"error de registro"+e.getMessage());
    }
    }else{
        JOptionPane.showMessageDialog(null,"erro en contraseña. Vuelva a intentarlo");
    }
    
    }
    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarActionPerformed

        agregar();
        
    }//GEN-LAST:event_registrarActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        loggin_1 camb=new loggin_1();
        camb.setVisible(true);
        dispose();
        System.gc();
    }//GEN-LAST:event_backActionPerformed

    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registrarse_2().setVisible(true);
                System.gc();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellido;
    private javax.swing.JButton back;
    private javax.swing.JPasswordField contra1;
    private javax.swing.JPasswordField contra2;
    private javax.swing.JTextField correo;
    private javax.swing.JTextField fech_nac;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField nomb_usuario;
    private javax.swing.JTextField nombre;
    private javax.swing.JButton registrar;
    // End of variables declaration//GEN-END:variables
}
