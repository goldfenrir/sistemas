package SalesBusinessModel;

import Model.Product;
import Model.Sales;
import java.util.ArrayList;

public class SalesManager {
    private static ProductDB productDB = new ProductDB();
    private static SalesDB salesDB=new SalesDB();
    
    public static int ventaMarca(String marca, int mes, int anho, int unidad){//1 unidades 2 usd
        return salesDB.ventaMarca(marca, mes, anho, unidad);
    }
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
    
    public static ArrayList<Object> queryDailySalesByProduct(int prodId, int month, int year, int measure){
        return salesDB.queryByProduct(prodId, month, year, measure);
    }
    
    public static ArrayList<Object> queryDailySalesByBrand(String brand, int month, int year, int measure){
        return salesDB.queryByBrand(brand, month, year, measure);
    }
    
    public static ArrayList<Object> queryDailySalesByProdType(int typeId, int month, int year, int measure){
        return salesDB.queryByProdType(typeId, month, year, measure);
    }
}
