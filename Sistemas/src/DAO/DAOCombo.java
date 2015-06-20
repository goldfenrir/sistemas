/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Combo;
import java.util.ArrayList;

/**
 *
 * @author alulab14
 */
public interface DAOCombo {
    void add(Combo c);
    int update(Combo c);
    void delete(int idCombo);
    Combo queryById(int idCombo);
    ArrayList<Combo> queryByPrice(double minP, double maxP);
    ArrayList<Combo> queryAll();
}
