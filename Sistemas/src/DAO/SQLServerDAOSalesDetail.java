package DAO;

import Model.Product;
import Model.Sales;
import Model.SalesDetail;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.microsoft.sqlserver.jdbc.SQLServerDriver;


public class SQLServerDAOSalesDetail {
	public static void add(Sales s, SalesDetail sd){
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
			String sql = "INSERT INTO Salesdetail "
					+ "(IdVenta, IdCampanha, IdTipo, IdProducto,IdMoneda,Cantidad,Subtotal)"
					+ "VALUES (?,?,?,?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, s.getId());
			pstmt.setInt(2, s.getCampanha().getId());
			pstmt.setInt(3, sd.getProduct().getTipoProducto().getId());
			pstmt.setDouble(4, sd.getProduct().getId());
			pstmt.setDouble(5, s.getMoneda().getId());
			pstmt.setDouble(6, sd.getQuantity());
			pstmt.setDouble(7, sd.getSubTotal());
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
	
	public static void update(int idSales, SalesDetail sd){
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			//Paso 1: Registrar el Driver
			DriverManager.registerDriver(new SQLServerDriver());
			//Paso 2: Obtener la conexi�n
			conn = DriverManager.getConnection(DBConnection.URL_JDBC_SQLServer,
								DBConnection.user,
								DBConnection.password);
			//Paso 3: Preparar la sentencia
			String sql = "SELECT * FROM SalesDetail";
			pstmt = conn.prepareStatement(sql);
			//Paso 4: Ejecutar la sentencia
			rs = pstmt.executeQuery();
			//Paso 5(opc.): Procesar los resultados
			while (rs.next()){
				int idS = rs.getInt("idSales");
				int idP = rs.getInt("idProduct");
				if(idS == idSales && idP == sd.getProduct().getId()){
					delete(idSales, sd.getProduct().getId());
//					add(idSales, sd);
					break;
				}
			}
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
	
	public static void delete(int idSales){
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try{
		//Paso 1: Registrar el Driver
			DriverManager.registerDriver(new SQLServerDriver());
		//Paso 2: Obtener la conexi�n
			conn = DriverManager.getConnection(DBConnection.URL_JDBC_SQLServer,
							DBConnection.user,
							DBConnection.password);
		//Paso 3: Preparar la sentencia
		String sql = "DELETE FROM SalesDetail "
				+ "WHERE idSales = ?";
		pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, idSales);
		//Paso 4: Ejecutar la sentencia
		//pstmt.
		pstmt.execute();
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
	
	public static void delete(int idSales, int idProduct){
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try{
		//Paso 1: Registrar el Driver
			DriverManager.registerDriver(new SQLServerDriver());
		//Paso 2: Obtener la conexi�n
			conn = DriverManager.getConnection(DBConnection.URL_JDBC_SQLServer,
							DBConnection.user,
							DBConnection.password);
		//Paso 3: Preparar la sentencia
		String sql = "DELETE FROM Person "
				+ "WHERE idSales = ? and idProduct = ? ";
		pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, idSales);
		pstmt.setInt(2, idProduct);
		//Paso 4: Ejecutar la sentencia
		//pstmt.
		pstmt.execute();
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
	
	
	public static ArrayList<SalesDetail> queryBySalesId(int salesId){
		ArrayList<SalesDetail> arr = new ArrayList<SalesDetail>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			//Paso 1: Registrar el Driver
			DriverManager.registerDriver(new SQLServerDriver());
			//Paso 2: Obtener la conexi�n
			conn = DriverManager.getConnection(DBConnection.URL_JDBC_SQLServer,
								DBConnection.user,
								DBConnection.password);
			//Paso 3: Preparar la sentencia
			String sql = "SELECT * FROM SalesDetail";
			pstmt = conn.prepareStatement(sql);
			//Paso 4: Ejecutar la sentencia
			rs = pstmt.executeQuery();
			//Paso 5(opc.): Procesar los resultados
			while (rs.next()){
				int id = rs.getInt("idSales");
				if(id == salesId){
					int idP = rs.getInt("idProduct");
					double subt = rs.getDouble("subtotal");
					int quantity = rs.getInt("quantity");
					SalesDetail sd = new SalesDetail();
					sd.setQuantity(quantity);
					sd.setSubTotal(subt);
					MySQLDAOProduct daop = new MySQLDAOProduct();
					Product p = daop.queryById(idP);
					sd.setProduct(p);
					arr.add(sd);
				}
			}
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

		return arr;
	}

	
	public static SalesDetail queryBySalesAndProduct (int sId, int pId){
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			//Paso 1: Registrar el Driver
			DriverManager.registerDriver(new SQLServerDriver());
			//Paso 2: Obtener la conexi�n
			conn = DriverManager.getConnection(DBConnection.URL_JDBC_SQLServer,
								DBConnection.user,
								DBConnection.password);
			//Paso 3: Preparar la sentencia
			String sql = "SELECT * FROM SalesDetail";
			pstmt = conn.prepareStatement(sql);
			//Paso 4: Ejecutar la sentencia
			rs = pstmt.executeQuery();
			//Paso 5(opc.): Procesar los resultados
			while (rs.next()){
				int id = rs.getInt("idSales");
				int idP = rs.getInt("idProduct");
				if(id == sId && idP == pId){
					double subt = rs.getDouble("subtotal");
					int quantity = rs.getInt("quantity");
					SalesDetail sd = new SalesDetail();
					sd.setQuantity(quantity);
					sd.setSubTotal(subt);
					MySQLDAOProduct daop = new MySQLDAOProduct();
					Product p = daop.queryById(idP);
					sd.setProduct(p);
					pstmt.close();
					conn.close();
					return sd;
				}
			}
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
		return null;
	}
	
	
	
	
}
