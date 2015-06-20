/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Combo;
import Model.Product;
import java.util.ArrayList;
import com.microsoft.sqlserver.jdbc.SQLServerDriver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author alulab14
 */
public class SQLServerDAOCombo implements DAOCombo{

    @Override
    public void add(Combo c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int update(Combo c) {
        return 0; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(int idCombo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Combo queryById(int idCombo){
        ArrayList<Product> plist = new ArrayList<Product>();
        SQLServerDAOProduct daop = new SQLServerDAOProduct();
        Combo c;
        Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Product p = null;
		try {
			//Paso 1: Registrar el Driver
			DriverManager.registerDriver(new SQLServerDriver());
			//Paso 2: Obtener la conexi�n
			conn = DriverManager.getConnection(DBConnection.URL_JDBC_SQLServer,
								DBConnection.user,
								DBConnection.password);
			//Paso 3: Preparar la sentencia
			String sql = "SELECT * FROM Combo"
					+ " WHERE idCombo = " + idCombo;
			pstmt = conn.prepareStatement(sql);
			//pstmt.setInt(1, idProduct);
			//Paso 4: Ejecutar la sentencia
			rs = pstmt.executeQuery();
			//Paso 5(opc.): Procesar los resultados
                        while (rs.next()){
				int idProducto = rs.getInt("IdProducto");
				int idTipo = rs.getInt("IdCombo");
                                
                                //LocalDate fechaIngreso = rs.getDate("FechaIngreso").toLocalDate();
				//LocalDate fechaDescontinuacion = rs.getDate("FechaDescontinuacion").toLocalDate();
                                p = daop.queryById(idProducto);
                                plist.add(p);
			}
                        p = daop.queryById(idCombo);
                        c = new Combo();
                        c.setId(idCombo);
                        c.setProductList(plist);
                        c.setBasePrice(p.getBasePrice());
                        c.setCantidadProductos(plist.size());
                        c.setDescription(p.getDescription());
                        c.setMarca(p.getMarca());
                        c.setMoneda(p.getMoneda());
                        c.setNombre(p.getNombre());
                        c.setStock(p.getStock());
                        c.setTipoProducto(p.getTipoProducto());
                        return c;
                        
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
    @Override
    public ArrayList<Combo> queryByPrice(double minPrice, double maxPrice){
        ArrayList<Combo> clist = new ArrayList<Combo>();
        ArrayList<Product> plist = new ArrayList<Product>();
        int codAnt = 0;
            Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Product p = null;
                Combo c = null;
		try {
			//Paso 1: Registrar el Driver
			DriverManager.registerDriver(new SQLServerDriver());
			//Paso 2: Obtener la conexi�n
			conn = DriverManager.getConnection(DBConnection.URL_JDBC_SQLServer,
								DBConnection.user,
								DBConnection.password);
			//Paso 3: Preparar la sentencia
			String sql = "select c.idCombo as idCombo, c.idProducto as idProducto from combo c "
                                + "inner join producto p on c.idCombo = p.IdProducto "
                                + "and p.IdTipo = 13 and p.Precio_Base between "
                                + minPrice + " and " + maxPrice + " " ;
			pstmt = conn.prepareStatement(sql);
			//pstmt.setInt(1, idProduct);
                        SQLServerDAOProduct daop = new SQLServerDAOProduct();
			//Paso 4: Ejecutar la sentencia
			rs = pstmt.executeQuery();
			//Paso 5(opc.): Procesar los resultados
			while (rs.next()){
				int codCombo = rs.getInt("idCombo");
                                //System.out.println("si entra monsefilo");
                                if(codCombo!=codAnt){
                                    if(c!= null){
                                        System.out.println("ñaslkdjf");
                                        c.setProductList(plist);
                                        c.setCantidadProductos(plist.size());
                                        clist.add(c);
                                        plist = new ArrayList<Product>();
                                        
                                    }
                                    int idProd = rs.getInt("idProducto");
                                    p = daop.queryById(idProd);
                                    codAnt = codCombo;
                                    Product p2;
                                    p2 = daop.queryById(codCombo);
                                    c = new Combo();
                                    c.setBasePrice(p2.getBasePrice());
                                    c.setDescription(p2.getDescription());
                                    c.setMarca(p2.getMarca());
                                    c.setMoneda(p2.getMoneda());
                                    c.setNombre(p2.getNombre());
                                    c.setTipoProducto(p2.getTipoProducto());
                                  
                                    c.setId(p2.getId());
                                    plist.add(p);
                                }
                                else{
                                    int idProd = rs.getInt("idProducto");
                                    p = daop.queryById(idProd);
                                    plist.add(p);
                                }
			}
                        if(c!= null){
                                        System.out.println("ñaslkdjf");
                                        c.setProductList(plist);
                                        c.setCantidadProductos(plist.size());
                                        clist.add(c);
                                        plist = new ArrayList<Product>();
                                        
                                    }
                        pstmt.close();
                        conn.close();
                        return clist;
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
    
    @Override
    public ArrayList<Combo> queryAll(){
        ArrayList<Combo> clist = new ArrayList<Combo>();
        ArrayList<Product> plist = new ArrayList<Product>();
        int codAnt = 0;
            Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Product p = null;
                Combo c = null;
		try {
			//Paso 1: Registrar el Driver
			DriverManager.registerDriver(new SQLServerDriver());
			//Paso 2: Obtener la conexi�n
			conn = DriverManager.getConnection(DBConnection.URL_JDBC_SQLServer,
								DBConnection.user,
								DBConnection.password);
			//Paso 3: Preparar la sentencia
			String sql = "select c.idCombo, c.idProducto from Combo c inner join producto p "
                                + "on p.idTipo = 13 and c.idCombo = p.IdProducto";
			pstmt = conn.prepareStatement(sql);
			//pstmt.setInt(1, idProduct);
                        SQLServerDAOProduct daop = new SQLServerDAOProduct();
			//Paso 4: Ejecutar la sentencia
			rs = pstmt.executeQuery();
			//Paso 5(opc.): Procesar los resultados
			while (rs.next()){
				int codCombo = rs.getInt("idCombo");
                                //System.out.println("si entra monsefilo");
                                if(codCombo!=codAnt){
                                    if(c!= null){
                                        System.out.println("ñaslkdjf");
                                        c.setProductList(plist);
                                        c.setCantidadProductos(plist.size());
                                        clist.add(c);
                                        plist = new ArrayList<Product>();
                                        
                                    }
                                    int idProd = rs.getInt("idProducto");
                                    p = daop.queryById(idProd);
                                    codAnt = codCombo;
                                    Product p2;
                                    p2 = daop.queryById(codCombo);
                                    c = new Combo();
                                    c.setBasePrice(p2.getBasePrice());
                                    c.setDescription(p2.getDescription());
                                    c.setMarca(p2.getMarca());
                                    c.setMoneda(p2.getMoneda());
                                    c.setNombre(p2.getNombre());
                                    c.setTipoProducto(p2.getTipoProducto());
                                    c.setId(codCombo);
                                    plist.add(p);
                                }
                                else{
                                    int idProd = rs.getInt("idProducto");
                                    p = daop.queryById(idProd);
                                    plist.add(p);
                                }
			}
                        if(c!= null){
                                        System.out.println("ñaslkdjf");
                                        c.setProductList(plist);
                                        c.setCantidadProductos(plist.size());
                                        clist.add(c);
                                        plist = new ArrayList<Product>();
                                        
                                    }
                        pstmt.close();
                        conn.close();
                        return clist;
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
