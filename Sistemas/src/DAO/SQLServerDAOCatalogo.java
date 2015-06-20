/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Product;
import com.microsoft.sqlserver.jdbc.SQLServerDriver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author alulab14
 */
public class SQLServerDAOCatalogo {
    	public void add(Product p) {		
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
			String sql = "INSERT INTO Product_2015_1_2011 "
					+ "(IdProducto, IdTipo, IdMoneda, Nombre, Descripcion,Precio_Base,Marca,Stock,Estado,FechaIngreso,FechaDescontinuacion)"
					+ "VALUES (?,?,?,?,?,?,?,?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			//pstmt.setInt(1, p.getId());
			pstmt.setInt(1, p.getId());
			pstmt.setInt(2, p.getTipoProducto().getId());
			pstmt.setInt(3, p.getMoneda().getId());
			pstmt.setString(4, p.getNombre());
			pstmt.setString(5, p.getDescription());
			pstmt.setDouble(6, p.getBasePrice());
			pstmt.setString(7, p.getMarca());
			pstmt.setInt(8, p.getStock());
			pstmt.setString(9, p.getEstado());
			pstmt.setDate(10, java.sql.Date.valueOf(p.getFechaIngreso()));
			pstmt.setDate(11, java.sql.Date.valueOf(p.getFechaDescontinuacion()));
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
