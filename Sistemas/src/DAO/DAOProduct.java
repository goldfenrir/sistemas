package DAO;

import Model.Product;
import java.util.ArrayList;

public interface DAOProduct {
	void add(Product p);
	void update(Product p);
	void delete (int idProduct);
	ArrayList<Product> queryAll();
	Product queryById(int idProduct);
        ArrayList<Product> queryByBrand(String brand, int prodType);
        ArrayList<Product> queryByType(int prodType);
        ArrayList<Product> queryByName(String name);
        ArrayList<Product> queryByPrice(double minPrice, double maxPrice, String brand, int prodType);
        
}
