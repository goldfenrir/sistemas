package SalesBusinessModel;

import Model.Combo;
import Model.Product;
import Model.Reunion;
import Model.Sales;
import java.util.ArrayList;

public class SalesManager {
    private static ProductDB productDB = new ProductDB();
    private static SalesDB salesDB=new SalesDB();
    private static ComboDB comboDB=new ComboDB();
    private static ReunionDB reunionDB=new ReunionDB();
    //Combos
    public static void addCombo(Combo c){
        comboDB.add(c);
    }
    
    public static int updateCombo(Combo c){
        return comboDB.update(c);
    }
    
    public static void deleteCombo(int idCombo){
        comboDB.delete(idCombo);
    }
    
    
    
    ///////////
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
    
    public static ArrayList<Object> queryAllDailySales(int month, int year, int measure){
        return salesDB.queryAll(month, year, measure);
    }
    
    public static ArrayList<Product> queryProductByBrand(String brand, int type){
        return productDB.queryByBrand(brand, type);
    }
    
    public static ArrayList<Product> queryProductByType(int type){
        return productDB.queryByType(type);
    }
    
    public static ArrayList<Product> queryProductByName(String name){
        return productDB.queryByName(name);
    }
    
    public static ArrayList<Product> queryProductByPrice(double minPrice, double maxPrice, 
            String brand, int type){
        return productDB.queryByPrice(minPrice, maxPrice, brand, type);
    }
    
    
    
    
    //REUNIONES
    public static void addReunion(Reunion p){
        reunionDB.add(p);
    }
    public static void deleteReunion(int id){
        reunionDB.delete(id);
    }
    public static void updateReunion(Reunion p){
        reunionDB.update(p);
    }
    public static ArrayList<Reunion> queryAllReunion(){
        return reunionDB.queryAll();
    }
    public static Reunion queryReunionById(int idReunion){
        return reunionDB.queryById(idReunion);
    }
}
