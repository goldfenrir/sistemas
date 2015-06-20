/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Product;
import Model.Reunion;
import java.util.ArrayList;

/**
 *
 * @author goldfenrir
 */
public interface DAOReunion {
    void add(Reunion p);
    void update(Reunion p);
    void delete (int idReunion);
    ArrayList<Reunion> queryAll();
    Reunion queryById(int idReunion);
}
