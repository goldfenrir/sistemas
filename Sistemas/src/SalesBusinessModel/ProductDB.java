package SalesBusinessModel;

import DAO.DAOFactory;
import DAO.DAOProduct;
import DAO.DBConnection;
import Model.Product;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;

public class ProductDB {	
    private ArrayList<Product> productList = new ArrayList<Product>();
    DAOFactory daoFactory = DAOFactory.getDAOFactory(DBConnection.dbType);
    DAOProduct daoProduct = daoFactory.getDAOProduct(); // POLIMORFISMO

    public ProductDB (){
        
    }
    
    public void add(Product p) {
    	daoProduct.add(p);
    }
    public void update(Product p) {
    	daoProduct.update(p);
    }
    public void delete(int idProduct) {
    	daoProduct.delete(idProduct);
    }
    public ArrayList<Product> queryAll()
    {
    	productList = daoProduct.queryAll();
        return productList;
    }
    public Product queryById(int productId) {
        return daoProduct.queryById(productId);
    }
    
    public ArrayList<Product> queryByBrand(String brand, int idtype){
        return daoProduct.queryByBrand(brand, idtype);
    }
    
    public ArrayList<Product> queryByType(int idtype){
        return daoProduct.queryByType(idtype);
    }
    
    public ArrayList<Product> queryByName(String name){
        return daoProduct.queryByName(name);
    }
    public ArrayList<Product> queryByPrice(double minPrice, double maxPrice, String brand, int idtype){
        return daoProduct.queryByPrice(minPrice, maxPrice, brand, idtype);
    }
}