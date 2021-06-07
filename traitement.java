/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applicationcovid;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Traitementcommande {
   public ResultSet rs = null;
   
   public void addcom (String m1, String m , int ic ,String m2){
       
       try {
           connectBD cb = new connectBD();
           cb.connect();
           
           String req = "insert into localites(Region,Nomlocalite,NbCas,Date) values('"+m1+"','"+m+"','"+ic+"','"+m2+"')";
           
           
           cb.st.executeUpdate(req);
          
       } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "enregistrement effectuer");
           Logger.getLogger(Traitementcommande.class.getName()).log(Level.SEVERE, null, ex);
           JOptionPane.showMessageDialog(null, "erreur syntaxe  enregistrement requete");
       }
        }
       
       //modifier commande
       
       public void modifycom(String t1 , String p1, Integer n1 , String m1){
       try {
           connectBD cb = new connectBD();
           cb.connect();
           String req = "Update localites set txtnomlocalite ='"+p1+"' "
                   + ", txtNbCas ='"+n1+"', txtdate = '"+m1+"' where txtregion  ='"+t1+"'";
           
           cb.st.executeUpdate(req);
           
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "modification effectuer");
           Logger.getLogger(Traitementcommande.class.getName()).log(Level.SEVERE, null, ex);
           //JOptionPane.showMessageDialog(null, "erreur de Syntaxe update ");
           
           
           
           
           
           
       }
          }   
           
           //supprimer commande
       
       
           public void delecom( int n){
       try {
           connectBD cb = new connectBD();
           cb.connect();
           String req ="delete from localites where txtNbCas ='"+n+"'";
           
           cb.st.executeUpdate(req);
           
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "suppression effectuer");
           Logger.getLogger(Traitementcommande.class.getName()).log(Level.SEVERE, null, ex);
           JOptionPane.showMessageDialog(null, "supprimé");
       }
               
               
               
           }
           
           //affiche 
           public void list(){
       try {
           connectBD cb = new connectBD();
           cb.connect();
           
           String reqt = " SELECT * FROM  localites ";
           
           rs=cb.st.executeQuery(reqt);
          
          
           
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, " erreur au niveau de public void list");
           JOptionPane.showMessageDialog(null, "erreur selection");
           Logger.getLogger(Traitementcommande.class.getName()).log(Level.SEVERE, null, ex);
       }
           }

    

 
           
           
           
           
           
       
   }
    
    
  
    

