/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applicationcovid;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author HP
 */
public class connectBD {

    String driver="com.mysql.jdbc.Driver";
    String url="jdbc:mysql://localhost/projetcovid";
    String user="root";
    String passwd="";
    Connection co=null;
    public Statement st=null;
    public ResultSet stat;
    public void connect(){
        