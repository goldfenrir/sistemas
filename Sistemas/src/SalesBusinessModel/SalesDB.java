package SalesBusinessModel;

import DAO.DAOFactory;
import DAO.DAOSales;
import DAO.DBConnection;
import Model.Sales;
import Model.SalesDetail;
import java.util.ArrayList;



public class SalesDB {
	 private ArrayList<Sales> salesList = new ArrayList<Sales>();
	 DAOFactory daoFactory = DAOFactory.getDAOFactory(DBConnection.dbType);
	 DAOSales daoSales = daoFactory.getDAOSales(); // POLIMORFISMO
	
	public void add(Sales s) {
		daoSales.add(s);
	 }
        public int ventaMarca(String marca, int mes, int anho, int unidad){
            return daoSales.ventaMarca(marca, mes, anho, unidad);
        }
	 
	 public void update(Sales s) {
		 daoSales.update(s);
	 }
	 
	 public void delete(int id){
		 daoSales.delete(id);
	 }
	 
	 public ArrayList<Sales> queryAll(){
		 salesList=daoSales.queryAll();
		 return salesList;
	 }
	 
	 public Sales queryById(int id){
		 return daoSales.queryById(id);
	 }
	 //////////
         
         public ArrayList<Object> queryByProduct(int prodId, int month, int year, int measure){
             return daoSales.queryByProduct(prodId, month, year, measure);
         }
         
         public ArrayList<Object> queryByBrand(String brand, int month, int year, int measure){
             return daoSales.queryByBrand(brand, month, year, measure);
         }
         
         public ArrayList<Object> queryByProdType(int typeId, int month, int year, int measure){
             return daoSales.queryByProdType(typeId, month, year, measure);
         }
         
         public ArrayList<Object> queryAll(int month, int year, int measure){
             return daoSales.queryAll(month, year, measure);
         }
         
}
