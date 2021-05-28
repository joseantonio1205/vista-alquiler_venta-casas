package mostrar_adm;

import base_de_datos.conexionSQL;
import formularios.ingresar_1_1;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class tabla_registro extends javax.swing.JFrame {

            conexionSQL cc=new conexionSQL();
            Connection con=cc.conexion();
    public tabla_registro() {
        initComponents();
        this.setLocationRelativeTo(null);
        mostrar_tabla0();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        back = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla_adm = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Registros - propiedades");
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
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 865, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 30, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 30));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 418, 900, -1));

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 27, 120, 400));

        tabla_adm.setAutoCreateRowSorter(true);
        tabla_adm.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Correo", "Provincia", "Distrito", "Fecha", "Precio", "Alquiler o venta", "descripcion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tabla_adm);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 780, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mostrar_tabla0(){
            
            int cont=0;
            String SQL = ("SELECT codigo,nombre,correo,provincia,distrito,fecha,precio,venta_alquiler,descripcion FROM ventas");
        try {
            
            Statement st=con.createStatement();
            ResultSet ss=st.executeQuery(SQL);
            
            DefaultTableModel modelo = new DefaultTableModel();
            tabla_adm.setModel(modelo);
            
            ResultSetMetaData rsmd = ss.getMetaData();
            int cant_colum = rsmd.getColumnCount();
            
            
            modelo.addColumn("Codigo");
            modelo.addColumn("Nombre");
            modelo.addColumn("Correo");
            modelo.addColumn("Provincia");
            modelo.addColumn("Distrito");
            modelo.addColumn("Fecha");
            modelo.addColumn("Precio");
            modelo.addColumn("Alquiler o venta");
            modelo.addColumn("Descripcion");
            
             
            
                    
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
        ingresar_1_1 conect = new ingresar_1_1();
        conect.setVisible(true);
        dispose();
        System.gc();
    }//GEN-LAST:event_backActionPerformed


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tabla_registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabla_adm;
    // End of variables declaration//GEN-END:variables
}
