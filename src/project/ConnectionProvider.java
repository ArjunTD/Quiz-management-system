

package project;
import java.sql.*;
/**
 *
 * @author arjun
 */
public class ConnectionProvider {
    public static Connection getCon()
    {
        
        
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/qems","arjun","arjunrockstar1@");
            return con;
        }
            catch(Exception e)
            {
                return null;
            }
                
    }
    
}
        

