
package forms;

import java.sql.Connection;
import java.sql.DriverManager;



public class Conexion {
    
    public static Connection getConexion(){
        Connection cn =null;
        try { 
                  
                   
                    String connectionUrl = "jdbc:sqlserver://192.168.50.190;databaseName=Ngarcia_SBD;user=Ngarcia_SQL;password=!HRvQw8E;";
                    cn= DriverManager.getConnection(connectionUrl);
                    System.out.println("ugu");
                    
               
                    
                    
                    }catch (Exception ex){
                        System.out.println("Error."+ ex.getMessage());
                    } 
        return cn;
    }
    
    
    
    
    
}
