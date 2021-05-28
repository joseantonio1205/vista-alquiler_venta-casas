package base_de_datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;



public class conexionSQL {

    Connection conectar=null;
    public PreparedStatement ps=null;
    public ResultSet rs=null;
    public Statement stmt = null;
    
    
    public Connection conexion(){

        try{
            Class.forName("org.gjt.mm.mysql.Driver");
            conectar = (Connection)DriverManager.getConnection("jdbc:mysql://localhost/empresa_vivienda","root","");
                
        }catch(Exception e){JOptionPane.showMessageDialog(null,"Error de conexion"+e.getMessage());}
            
        return conectar;
       
    }
    
}
