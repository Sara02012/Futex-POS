
package pos;
import javax.sql.*;
import java.sql.*;
import javax.swing.JOptionPane;




public class DatabaseConnection {

   private static Connection connection;
   private static String connectionString;
   private static String username;
   private static String password;
   
    public DatabaseConnection()
    {
        connection=null;
        connectionString="";
        username="";
        password="";
        
    }
    
    
    public static boolean isConnected()
    {
        try 
        {
            if(connection == null || connection.isClosed())
            {
                return false;
                
            }else{
                
                return true;
            }
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Fail to check if connected to database or not");
            return false;
            
        }
    }
    
    public static void backupDatabaseConfig()
    {
        
    }
    
    
    public static void setConnectionString(String UserName, String Password, String url, String databaseName, int port)
    {
        
        connectionString="jdbc:mysql:"+url+":"+port+"/"+databaseName;
        username=UserName;
        password=Password;
        
        
    }
    
    public static Connection getConnection()
    {
        if(isConnected())
        {
            return connection;
        }else{
            JOptionPane.showMessageDialog(null, "There is no connection to database");
            return null;
        }
    }
    
    public static String getUsername()
    {
        return username;
    }
    
    public static String getPassword()
    {
        return username;
    }
    public static boolean connectToDatabase(boolean promptErrorMessage)
    {
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            
        } catch (ClassNotFoundException ex) {
            
            if(promptErrorMessage)
            {
               JOptionPane.showMessageDialog(null, "Fail to load MySQL Drivere");
            }
            
            return false;
        }
        
        
        try {
            
            connection=DriverManager.getConnection(connectionString, username, password);
            
        } catch (SQLException ex) {
            
            if(promptErrorMessage)
            {
                JOptionPane.showMessageDialog(null, "Fail to connect to database");
            }
            
            return false;
        }
        
        return true;
    }
    
    
    
    
    public static boolean Disconnect(boolean promptErrorMessage)
    {
        try {
            
            connection.close();
            return true;
            
        } catch (SQLException ex) {
            
            if(promptErrorMessage)
            {
                JOptionPane.showMessageDialog(null, "Fail to disconnect the database");
            }
            return false;
            
        }catch (NullPointerException ex)
        {
            return false;
        }
        
    }
    
}
