package DAO;

import Model.Product;
import java.util.ArrayList;

public interface DAOProduct {
	void add(Product p);
	void update(Product p);
	void delete (int idProduct);
	ArrayList<Product> queryAll();
	Product queryById(int idProduct);
}
