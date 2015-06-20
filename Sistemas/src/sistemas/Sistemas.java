/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemas;

import SalesBusinessModel.SalesManager;
import javax.swing.UIManager;
import com.jgoodies.looks.plastic.PlasticLookAndFeel;
import com.jgoodies.looks.plastic.theme.DesertBlue;
import java.util.ArrayList;
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
          //  UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel"); 
            PlasticLookAndFeel.setPlasticTheme(new DesertBlue());
            UIManager.setLookAndFeel(new PlasticLookAndFeel());
        } catch (Exception ex) { 
            ex.printStackTrace(); 
        }
        Login  prin = new Login();
        prin.setVisible(true);
        //try { Utils.chartExcel(); } catch (Exception e){}
        /*ArrayList<Object> list = SalesManager.queryDailySalesByProduct(6, 9, 2015, 1);
       for(int i = 0; i<list.size();i++)
           System.out.println("cantidad de producto " + i + " :" + (Integer)list.get(i));*/
    }
    
}
