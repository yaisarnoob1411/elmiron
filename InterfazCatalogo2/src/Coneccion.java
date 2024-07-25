


//import com.sun.jdi.connect.spi.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;

public class Coneccion {
java.sql.Connection conectar =null;
  public java.sql.Connection conexion(){
  
  try{
  
  Class.forName("com.mysql.cj.jdbc.Driver");
      conectar=(java.sql.Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/casa", "root", "c_tromo1411");
      System.out.println("Conexion aceptada");
      
      
  }catch (Exception e){{
      
      
      JOptionPane.showMessageDialog(null, "problemas"+ e.toString());
  }
  return conectar;
  }
        return null;
    

    
    
}

}

