package SalesBusinessModel;

import DAO.DBConnection;
import Model.Catalogo;
import Model.Combo;
import Model.Product;
import Model.Reunion;
import Model.Sales;
import com.microsoft.sqlserver.jdbc.SQLServerDriver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
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
    
    public static Combo queryComboById(int id){
        return comboDB.queryById(id);
    }
    
    public static ArrayList<Combo> queryComboByPrice(double minPrice, double maxPrice){
        return comboDB.queryByPrice(minPrice, maxPrice);
    }
    
    public static ArrayList<Combo> queryAllCombos(){
        return comboDB.queryAll();
    
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
    public static int lastReu(){
        return reunionDB.reu();
    }
    public static int lastAcu(){
        return reunionDB.acu();
    }
    
    public static void addCatalogo(Catalogo c){
        		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			//Paso 1: Registrar el Driver
			DriverManager.registerDriver(new SQLServerDriver());
			//Paso 2: Obtener la conexi�n
			conn = DriverManager.getConnection(DBConnection.URL_JDBC_SQLServer,
								DBConnection.user,
								DBConnection.password);
			//Paso 3: Preparar la sentencia
			String sql = "INSERT INTO Catalogo1 "
					+ "(IdCampanha, FechaLanzamiento, TotalPaginas)"
					+ "VALUES (?,?,?)";
			pstmt = conn.prepareStatement(sql);
			//pstmt.setInt(1, p.getId());
			
			pstmt.setInt(1, c.getIdCamp());
			pstmt.setDate(2,java.sql.Date.valueOf(LocalDate.now()));
			pstmt.setInt(3, c.getTotalPags());
			//Paso 4: Ejecutar la sentencia
			pstmt.executeUpdate();
			//Paso 5(opc.): Procesar los resultados			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			//Paso 6(OJO): Cerrar la conexi�n
			try { if (pstmt!= null) pstmt.close();} 
				catch (Exception e){e.printStackTrace();};
			try { if (conn!= null) conn.close();} 
				catch (Exception e){e.printStackTrace();};						
		}
    }
    public static void AddColors(int idCat,int idCamp,int idCol){
       		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			//Paso 1: Registrar el Driver
			DriverManager.registerDriver(new SQLServerDriver());
			//Paso 2: Obtener la conexi�n
			conn = DriverManager.getConnection(DBConnection.URL_JDBC_SQLServer,
								DBConnection.user,
								DBConnection.password);
			//Paso 3: Preparar la sentencia
			String sql = "INSERT INTO Catalogo_Color1 "
					+ "(IdCatalogo, IdCampanha, IdColor)"
					+ "VALUES (?,?,?)";
			pstmt = conn.prepareStatement(sql);
			//pstmt.setInt(1, p.getId());
			pstmt.setInt(1, idCat);
			pstmt.setInt(2, idCamp);
			pstmt.setInt(3,idCol);

			//Paso 4: Ejecutar la sentencia
			pstmt.executeUpdate();
			//Paso 5(opc.): Procesar los resultados			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			//Paso 6(OJO): Cerrar la conexi�n
			try { if (pstmt!= null) pstmt.close();} 
				catch (Exception e){e.printStackTrace();};
			try { if (conn!= null) conn.close();} 
				catch (Exception e){e.printStackTrace();};						
		}        
    }
    
    public static void AddPagina(int idPag,int idCat,int idCamp, ArrayList<Integer> prods,ArrayList<Integer> nivel){
       		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			//Paso 1: Registrar el Driver
			DriverManager.registerDriver(new SQLServerDriver());
			//Paso 2: Obtener la conexi�n
			conn = DriverManager.getConnection(DBConnection.URL_JDBC_SQLServer,
								DBConnection.user,
								DBConnection.password);
			//Paso 3: Preparar la sentencia
			String sql = "INSERT INTO Pagina1 "
					+ "( IdCatalogo, IdCampanha)"
					+ "VALUES (?,?)";
			pstmt = conn.prepareStatement(sql);
			//pstmt.setInt(1, p.getId());
			//pstmt.setInt(1, idPag);
			pstmt.setInt(1, idCat);
			pstmt.setInt(2,idCamp);
                        for(int i=0;i<prods.size();i++){
                            AddPaginaProducto(idPag,prods.get(i),idCat,idCamp,nivel.get(i));
                        }
			//Paso 4: Ejecutar la sentencia
			pstmt.executeUpdate();
			//Paso 5(opc.): Procesar los resultados			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			//Paso 6(OJO): Cerrar la conexi�n
			try { if (pstmt!= null) pstmt.close();} 
				catch (Exception e){e.printStackTrace();};
			try { if (conn!= null) conn.close();} 
				catch (Exception e){e.printStackTrace();};						
		}        
    }
    public static void AddPaginaProducto(int idPag,int idProd,int idCat,int idCamp,int nivel){
       		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			//Paso 1: Registrar el Driver
			DriverManager.registerDriver(new SQLServerDriver());
			//Paso 2: Obtener la conexi�n
			conn = DriverManager.getConnection(DBConnection.URL_JDBC_SQLServer,
								DBConnection.user,
								DBConnection.password);
			//Paso 3: Preparar la sentencia
			String sql = "INSERT INTO Pagina_Producto1 "
					+ "(IdPagina,IdProducto, IdCatalogo, IdCampanha,NivelExposicion)"
					+ "VALUES (?,?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			//pstmt.setInt(1, p.getId());
			pstmt.setInt(1, idPag);
			pstmt.setInt(3, idCat);
			pstmt.setInt(4,idCamp);
                        pstmt.setInt(2,idProd);
                        pstmt.setInt(5,nivel);

			//Paso 4: Ejecutar la sentencia
			pstmt.executeUpdate();
			//Paso 5(opc.): Procesar los resultados			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			//Paso 6(OJO): Cerrar la conexi�n
			try { if (pstmt!= null) pstmt.close();} 
				catch (Exception e){e.printStackTrace();};
			try { if (conn!= null) conn.close();} 
				catch (Exception e){e.printStackTrace();};						
		}        
    }        
    
}
