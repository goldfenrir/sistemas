package SalesBusinessModel;

import Model.Product;
import Model.Sales;
import java.util.ArrayList;

public class SalesManager {
    private static ProductDB productDB = new ProductDB();
    private static SalesDB salesDB=new SalesDB();
    
    public static void addSale(Sales s)
    {
    	salesDB.add(s);
    }
    public static void updateSale(Sales s)
    {
    	salesDB.update(s);
    }
    public static void deleteSale(int id)
    {
    	salesDB.delete(id);
    }
    public static ArrayList<Sales> queryAllSales()
    {
        return salesDB.queryAll();
    }
    public static Sales querySaleById(int id) {
        return salesDB.queryById(id);
    }

    /////
    public static void addProduct(Product p)
    {
        productDB.add(p);
    }
    public static void updateProduct(Product p)
    {
        productDB.update(p);
    }
    public static void deleteProduct(int idProduct)
    {
        productDB.delete(idProduct);
    }
    public static ArrayList<Product> queryAllProducts()
    {
        return productDB.queryAll();
    }
    public static Product queryProductById(int productId) {
        return productDB.queryById(productId);
    }
}
