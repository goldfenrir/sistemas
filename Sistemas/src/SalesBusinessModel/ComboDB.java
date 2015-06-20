/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SalesBusinessModel;

import DAO.DAOCombo;
import DAO.DAOFactory;
import DAO.DAOProduct;
import DAO.DBConnection;
import Model.Combo;
import Model.Product;
import java.util.ArrayList;

/**
 *
 * @author alulab14
 */
public class ComboDB {
    private ArrayList<Product> productList = new ArrayList<Product>();
    DAOFactory daoFactory = DAOFactory.getDAOFactory(DBConnection.dbType);
    DAOCombo daoCombo = daoFactory.getDAOCombo();
    
    public void add(Combo c){
        daoCombo.add(c);
    }
    
    public int update(Combo c){
        return daoCombo.update(c);
    }
    
    public void delete(int idCombo){
        daoCombo.delete(idCombo);
    }    
    
    
    
}
