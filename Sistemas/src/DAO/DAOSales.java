package DAO;

import Model.Sales;
import java.util.ArrayList;


public interface DAOSales {
	void add(Sales p);
	void update(Sales p);
	void delete (int id);
	ArrayList<Sales> queryAll();
	Sales queryById(int id);
        int ventaMarca(String marca,int mes,int anho,int unidad);
}
