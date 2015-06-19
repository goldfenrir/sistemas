package DAO;

import Model.Sales;
import Model.SalesDetail;
import java.util.ArrayList;


public interface DAOSales {
	void add(Sales p);
	void update(Sales p);
	void delete (int id);
	ArrayList<Sales> queryAll();
	Sales queryById(int id);
        int ventaMarca(String marca,int mes,int anho,int unidad);
        ArrayList<Object> queryByProduct(int prodId, int month, int year, int measureType);
         
        ArrayList<Object> queryByBrand(String brand, int month, int year, int measureType);
         
        ArrayList<Object> queryByProdType(int typeId, int month, int year, int measureType);
}
