
package applicationcovid;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;



public class connectBD {

    String driver="com.mysql.jdbc.Driver";
    String url="jdbc:mysql://localhost/projetcovid";
    String user="root";
    String passwd="";
    Connection co=null;
    public Statement st=null;
    public ResultSet stat;
    public void connect(){
        
      
        try {
            Class.forName(driver);
            
            co=DriverManager.getConnection(url, user,passwd);
            
            st=co.createStatement();
        } catch (Exception ex) {
            Logger.getLogger(connectBD.class.getName()).log(Level.SEVERE, null, ex);
        
        
        JOptionPane.showMessageDialog(null, "erreur connection");
        }
        
        
        }
        
        }
        
    
    