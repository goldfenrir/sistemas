package SalesBusinessModel;

import DAO.DAOFactory;
import DAO.DAOSales;
import DAO.DBConnection;
import Model.Sales;
import java.util.ArrayList;



public class SalesDB {
	 private ArrayList<Sales> salesList = new ArrayList<Sales>();
	 DAOFactory daoFactory = DAOFactory.getDAOFactory(DBConnection.dbType);
	 DAOSales daoSales = daoFactory.getDAOSales(); // POLIMORFISMO
	
	public void add(Sales s) {
		daoSales.add(s);
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
	 
}
