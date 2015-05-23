/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemas;

import javax.swing.UIManager;

/**
 *
 * @author alulab14
 */
public class Sistemas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //MantenerPromocion mant = new MantenerPromocion();
        //mant.setVisible(true);
        try { 
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel"); 
           // UIManager.setLookAndFeel(new Plastic3DLookAndFeel());
        } catch (Exception ex) { 
            ex.printStackTrace(); 
        }
        Login  prin = new Login();
        prin.setVisible(true);
    }
    
}
