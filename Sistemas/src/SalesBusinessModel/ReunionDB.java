/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SalesBusinessModel;

import DAO.DAOReunion;
import DAO.DAOFactory;
import DAO.DBConnection;
import Model.Reunion;

import java.util.ArrayList;

/**
 *
 * @author goldfenrir
 */
public class ReunionDB {
    
    DAOFactory daoFactory = DAOFactory.getDAOFactory(DBConnection.dbType);
    DAOReunion daoReunion = daoFactory.getDAOReunion();
    
    public void add(Reunion c){
        daoReunion.add(c);
    }
    
    public void update(Reunion c){
        daoReunion.update(c);
    }
    
    public void delete(int idReunion){
        daoReunion.delete(idReunion);
    }   
    public ArrayList<Reunion> queryAll(){
        return daoReunion.queryAll();
    }
     public Reunion queryById(int idReunion){
        return daoReunion.queryById(idReunion);
    }
     public int reu(){
         //return 1;
         return daoReunion.idReunion();
     }
     public int acu(){
         //return 2;
         return daoReunion.idAcuerdo();
     }
}
