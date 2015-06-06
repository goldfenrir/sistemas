package DAO;

import Model.Sales;
import Model.SalesDetail;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;

import javax.sql.rowset.serial.SerialBlob;

import com.microsoft.sqlserver.jdbc.SQLServerDriver;


public class SQLServerDAOSales implements DAOSales{

        
	@Override
	public void add(Sales s) {
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
		String sql = "INSERT INTO Sales "
				+ "(IdVenta, IdCampanha, IdMoneda, Total, FechaDia)"
				+ "VALUES (?,?,?,?,?)";
		pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, s.getId());
		pstmt.setInt(2, s.getCampanha().getId());
		pstmt.setInt(3, s.getMoneda().getId());
		pstmt.setDouble(4, s.getTotal());
		pstmt.setDate(5, java.sql.Date.valueOf(s.getFechaDia()));
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
		for(int i = 0; i<s.getDetails().size();i++){
			SQLServerDAOSalesDetail.add(s, s.getDetails().get(i));
		}
	}

	@Override
	public void update(Sales s) {
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
			String sql = "SELECT * FROM Sales";
			pstmt = conn.prepareStatement(sql);
			//Paso 4: Ejecutar la sentencia
			rs = pstmt.executeQuery();
			//Paso 5(opc.): Procesar los resultados
			while (rs.next()){
				int id = rs.getInt("id");
				if(id == s.getId()){
					delete(id);
					add(s);
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

	@Override
	public void delete(int idSales) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		SQLServerDAOSalesDetail.delete(idSales);
		try{
		//Paso 1: Registrar el Driver
			DriverManager.registerDriver(new SQLServerDriver());
		//Paso 2: Obtener la conexi�n
			conn = DriverManager.getConnection(DBConnection.URL_JDBC_SQLServer,
							DBConnection.user,
							DBConnection.password);
		//Paso 3: Preparar la sentencia
		String sql = "DELETE FROM Sales "
				+ "WHERE id = ?";
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

	@Override
	public ArrayList<Sales> queryAll() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<Sales> arr = new ArrayList<Sales>();
		try {
			//Paso 1: Registrar el Driver
			DriverManager.registerDriver(new SQLServerDriver());
			//Paso 2: Obtener la conexi�n
			conn = DriverManager.getConnection(DBConnection.URL_JDBC_SQLServer,
								DBConnection.user,
								DBConnection.password);
			//Paso 3: Preparar la sentencia
			String sql = "SELECT * FROM Sales";
			pstmt = conn.prepareStatement(sql);
			//Paso 4: Ejecutar la sentencia
			rs = pstmt.executeQuery();
			//Paso 5(opc.): Procesar los resultados
			while (rs.next()){
				int idVenta = rs.getInt("IdVenta");
				int idCampanha = rs.getInt("IdCampanha");
				int idMoneda = rs.getInt("IdMoneda");
				double total = rs.getDouble("Total");
				LocalDate date = rs.getDate("FechaDia").toLocalDate();
				Sales p = new Sales();
				p.setId(idVenta);
                                p.setFechaDia(date);
                                p.setTotal(total);
                               //Falta campaña y moneda
				ArrayList<SalesDetail> arrDetail = SQLServerDAOSalesDetail.queryBySalesId(idVenta);
				p.setDetails(arrDetail);
				arr.add(p);
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

	@Override
	public Sales queryById(int idSales) {
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
			String sql = "SELECT * FROM Sales";
			pstmt = conn.prepareStatement(sql);
			//Paso 4: Ejecutar la sentencia
			rs = pstmt.executeQuery();
			//Paso 5(opc.): Procesar los resultados
			while (rs.next()){
				int id = rs.getInt("id");
				if(id == idSales){
                                    int idVenta = rs.getInt("IdVenta");
                                    int idCampanha = rs.getInt("IdCampanha");
                                    int idMoneda = rs.getInt("IdMoneda");
                                    double total = rs.getDouble("Total");
                                    LocalDate date = rs.getDate("FechaDia").toLocalDate();
                                    Sales p = new Sales();
                                    p.setId(idVenta);
                                    p.setFechaDia(date);
                                    p.setTotal(total);
                                   //Falta campaña y moneda
                                    ArrayList<SalesDetail> arrDetail = SQLServerDAOSalesDetail.queryBySalesId(idVenta);
                                    p.setDetails(arrDetail);
                                    pstmt.close();
                                    conn.close();
                                    return p;
				}
				//arr.add(p);
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

    @Override
    public int ventaMarca(String marca, int mes, int anho, int unidad) {
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
                         String sql=null;
			//Paso 3: Preparar la sentencia
                        if (unidad==1){
                            sql = "select sum(d.cantidad) as suma from ventas v inner join detalleventa d on v.idventa=d.idventa join producto p on d.idproducto=p.idproducto where  "
                                + "marca='"+marca+"'"
                                + "and month(v.fechadia)="+mes
                                + "and year(v.fechadia)="+anho; 
                        }else{
                            sql = "select sum(d.subtotal) as sumafrom ventas v inner join detalleventa d on v.idventa=d.idventa join producto p on d.idproducto=p.idproducto where  "
                                + "marca='"+marca+"'"
                                + "and month(v.fechadia)="+mes
                                + "and year(v.fechadia)="+anho; 
                        }
			                               ;
			pstmt = conn.prepareStatement(sql);
			//Paso 4: Ejecutar la sentencia
			rs = pstmt.executeQuery();
			//Paso 5(opc.): Procesar los resultados
			while (rs.next()){
				int suma = rs.getInt("suma");
				return suma;
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

		
        return 0;
    }

}
