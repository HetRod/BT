/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;
import controlador.Controlador;
import java.awt.Image;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import modelo.Modelo;
import vista.Menu;
import vista.Vista;


public class Principal {
    
    public static void main(String[] args) throws SQLException{
        
        try{
            
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
            Modelo m = new Modelo();
            /*Vista v = new Vista();*/
            Menu menu = new Menu();
         
            
            menu.setTitle("Fideicomisos");
            menu.setVisible(true);
           /* Controlador c = new Controlador(m,v);
            c.iniciar();*/
    }
            
    
}
