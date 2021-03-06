package DAO;

import Model.Product;
import Model.TipoProducto;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.rowset.serial.SerialBlob;

import com.microsoft.sqlserver.jdbc.SQLServerBlob;
import com.microsoft.sqlserver.jdbc.SQLServerDriver;
import java.time.LocalDate;

public class SQLServerDAOProduct implements DAOProduct{

	@Override
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

	@Override
	public void update(Product p) {
//		Connection conn = null;
//		PreparedStatement pstmt = null;
//		
//		try {
//			//Paso 1: Registrar el Driver
//			DriverManager.registerDriver(new SQLServerDriver());
//			//Paso 2: Obtener la conexi�n
//			conn = DriverManager.getConnection(DBConnection.URL_JDBC_SQLServer,
//								DBConnection.user,
//								DBConnection.password);
//			//Paso 3: Preparar la sentencia
//			String sql = "UPDATE Product_2015_1_2011 "
//					+ "SET name=?, description=?, price=?, stock=? "
//					+ "WHERE id=?";
//			pstmt = conn.prepareStatement(sql);
//			//
//			pstmt.setString(1, p.getName());
//			pstmt.setString(2, p.getDescription());
//			pstmt.setDouble(3, p.getPrice());
//			pstmt.setInt(4, p.getStock());
//			pstmt.setInt(5, p.getId());
//			//Paso 4: Ejecutar la sentencia
//			pstmt.executeUpdate();
//			//Paso 5(opc.): Procesar los resultados			
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} finally {
//			//Paso 6(OJO): Cerrar la conexi�n
//			try { if (pstmt!= null) pstmt.close();} 
//				catch (Exception e){e.printStackTrace();};
//			try { if (conn!= null) conn.close();} 
//				catch (Exception e){e.printStackTrace();};						
//		}		
	}

	@Override
	public void delete(int idProduct) {
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
			String sql = "DELETE FROM Product_2015_1_2011 "
					+ "WHERE id=?";
			pstmt = conn.prepareStatement(sql);
			//
			pstmt.setInt(1, idProduct);
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
        
        private TipoProducto queryTypeById(int idTipo){
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
			String sql2 = "Select * from tipo_de_producto where IdTipo = " + idTipo;
                                pstmt = conn.prepareStatement(sql2);
			//Paso 4: Ejecutar la sentencia
                                rs = pstmt.executeQuery();
                                if(rs.next()){
                                    TipoProducto tprod = new TipoProducto();
                                    tprod.setId(idTipo);
                                    tprod.setNombre(rs.getString("Nombre"));
                                    tprod.setDescricpion(rs.getString("Descripcion"));
                                    pstmt.close();
                                    conn.close();
                                    return tprod;
                                            
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
	public ArrayList<Product> queryAll() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
                ResultSet rs2 = null;
		ArrayList<Product> arr = new ArrayList<Product>();
		try {
			//Paso 1: Registrar el Driver
			DriverManager.registerDriver(new SQLServerDriver());
			//Paso 2: Obtener la conexi�n
			conn = DriverManager.getConnection(DBConnection.URL_JDBC_SQLServer,
								DBConnection.user,
								DBConnection.password);
			//Paso 3: Preparar la sentencia
			String sql = "SELECT * FROM Producto";
			pstmt = conn.prepareStatement(sql);
			//Paso 4: Ejecutar la sentencia
			rs = pstmt.executeQuery();
			//Paso 5(opc.): Procesar los resultados
			while (rs.next()){
                            
				int idProducto = rs.getInt("IdProducto");
				int idTipo = rs.getInt("IdTipo");
				int idMoneda = rs.getInt("IdMoneda");
                                String nombre = rs.getString("Nombre");
				String descripcion = rs.getString("Descripcion");
				double precio_Base = rs.getDouble("Precio_Base");
                                String marca = rs.getString("Marca");
				int stock = rs.getInt("Stock");
				String estado = rs.getString("Estado");
                                //LocalDate fechaIngreso = rs.getDate("FechaIngreso").toLocalDate();
				//LocalDate fechaDescontinuacion = rs.getDate("FechaDescontinuacion").toLocalDate();
                                
				Product p = new Product();
				p.setBasePrice(precio_Base);
                                p.setDescription(descripcion);
                                p.setEstado(estado);
                                //p.setFechaDescontinuacion(fechaDescontinuacion);
                                //p.setFechaIngreso(fechaIngreso);
                                p.setId(idProducto);
                                p.setMarca(marca);
                                //p.setMoneda(null);
                                p.setNombre(nombre);
                                p.setStock(stock);
                                String sql2 = "Select * from tipo_de_producto where IdTipo = " + idTipo;
                                pstmt = conn.prepareStatement(sql2);
			//Paso 4: Ejecutar la sentencia
                                rs2 = pstmt.executeQuery();
                                if(rs2.next()){
                                    TipoProducto tprod = new TipoProducto();
                                    tprod.setId(idTipo);
                                    tprod.setNombre(rs2.getString("Nombre"));
                                    tprod.setDescricpion(rs2.getString("Descripcion"));
                                    p.setTipoProducto(tprod);
                                }
                                //p.setTipoProducto(null);
                                
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
	public Product queryById(int idProduct) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
                ResultSet rs2 = null;
		Product p = null;
		try {
			//Paso 1: Registrar el Driver
			DriverManager.registerDriver(new SQLServerDriver());
			//Paso 2: Obtener la conexi�n
			conn = DriverManager.getConnection(DBConnection.URL_JDBC_SQLServer,
								DBConnection.user,
								DBConnection.password);
			//Paso 3: Preparar la sentencia
			String sql = "SELECT * FROM Producto"
					+ " WHERE IdProducto = " + idProduct;
			pstmt = conn.prepareStatement(sql);
			//pstmt.setInt(1, idProduct);
			//Paso 4: Ejecutar la sentencia
			rs = pstmt.executeQuery();
			//Paso 5(opc.): Procesar los resultados
			if (rs.next()){
				int idProducto = rs.getInt("IdProducto");
				int idTipo = rs.getInt("IdTipo");
				int idMoneda = rs.getInt("IdMoneda");
                                String nombre = rs.getString("Nombre");
				String descripcion = rs.getString("Descripcion");
				double precio_Base = rs.getDouble("Precio_Base");
                                String marca = rs.getString("Marca");
				int stock = rs.getInt("Stock");
				String estado = rs.getString("Estado");
                                //LocalDate fechaIngreso = rs.getDate("FechaIngreso").toLocalDate();
				//LocalDate fechaDescontinuacion = rs.getDate("FechaDescontinuacion").toLocalDate();
                                
				p = new Product();
				p.setBasePrice(precio_Base);
                                p.setDescription(descripcion);
                                p.setEstado(estado);
                                //p.setFechaDescontinuacion(fechaDescontinuacion);
                                //p.setFechaIngreso(fechaIngreso);
                                p.setId(idProduct);
                                p.setMarca(marca);
                                //p.setMoneda(null);
                                p.setNombre(nombre);
                                p.setStock(stock);
                                String sql2 = "Select * from tipo_de_producto where IdTipo = " + idTipo;
                                pstmt = conn.prepareStatement(sql2);
			//Paso 4: Ejecutar la sentencia
                                rs2 = pstmt.executeQuery();
                                if(rs2.next()){
                                    TipoProducto tprod = new TipoProducto();
                                    tprod.setId(idTipo);
                                    tprod.setNombre(rs2.getString("Nombre"));
                                    tprod.setDescricpion(rs2.getString("Descripcion"));
                                    p.setTipoProducto(tprod);
                                }
                                //p.setTipoProducto(null);
                                
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
		return p;	
	}
        
        @Override
        public ArrayList<Product> queryByBrand(String brand, int type){
            ArrayList<Product> plist = new ArrayList<Product>();
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
			String sql = "SELECT * FROM Producto"
					+ " WHERE Marca like '%" + brand
                                + "%' ";
                        if(type > 0)
                            sql += "and IdTipo = " + type;
			pstmt = conn.prepareStatement(sql);
			//pstmt.setInt(1, idProduct);
			//Paso 4: Ejecutar la sentencia
			rs = pstmt.executeQuery();
			//Paso 5(opc.): Procesar los resultados
			while (rs.next()){
				int idProducto = rs.getInt("IdProducto");
				int idTipo = rs.getInt("IdTipo");
				int idMoneda = rs.getInt("IdMoneda");
                                String nombre = rs.getString("Nombre");
				String descripcion = rs.getString("Descripcion");
				double precio_Base = rs.getDouble("Precio_Base");
                                String marca = rs.getString("Marca");
				int stock = rs.getInt("Stock");
				String estado = rs.getString("Estado");
                                //LocalDate fechaIngreso = rs.getDate("FechaIngreso").toLocalDate();
				//LocalDate fechaDescontinuacion = rs.getDate("FechaDescontinuacion").toLocalDate();
                                
				p = new Product();
				p.setBasePrice(precio_Base);
                                p.setDescription(descripcion);
                                p.setEstado(estado);
                                //p.setFechaDescontinuacion(fechaDescontinuacion);
                                //p.setFechaIngreso(fechaIngreso);
                                p.setId(idProducto);
                                p.setMarca(marca);
                                //p.setMoneda(null);
                                p.setNombre(nombre);
                                p.setStock(stock);
                                p.setTipoProducto(queryTypeById(idTipo));
                                plist.add(p);
                                
			}
                        pstmt.close();
                        conn.close();
                        return plist;
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
        public ArrayList<Product> queryByType(int type){
            ArrayList<Product> plist = new ArrayList<Product>();
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
			String sql = "SELECT * FROM Producto"
					+ " WHERE IdTipo" + type;
			pstmt = conn.prepareStatement(sql);
			//pstmt.setInt(1, idProduct);
			//Paso 4: Ejecutar la sentencia
			rs = pstmt.executeQuery();
			//Paso 5(opc.): Procesar los resultados
			while (rs.next()){
				int idProducto = rs.getInt("IdProducto");
				int idTipo = rs.getInt("IdTipo");
				int idMoneda = rs.getInt("IdMoneda");
                                String nombre = rs.getString("Nombre");
				String descripcion = rs.getString("Descripcion");
				double precio_Base = rs.getDouble("Precio_Base");
                                String marca = rs.getString("Marca");
				int stock = rs.getInt("Stock");
				String estado = rs.getString("Estado");
                                //LocalDate fechaIngreso = rs.getDate("FechaIngreso").toLocalDate();
				//LocalDate fechaDescontinuacion = rs.getDate("FechaDescontinuacion").toLocalDate();
                                
				p = new Product();
				p.setBasePrice(precio_Base);
                                p.setDescription(descripcion);
                                p.setEstado(estado);
                                //p.setFechaDescontinuacion(fechaDescontinuacion);
                                //p.setFechaIngreso(fechaIngreso);
                                p.setId(idProducto);
                                p.setMarca(marca);
                                //p.setMoneda(null);
                                p.setNombre(nombre);
                                p.setStock(stock);
                                p.setTipoProducto(queryTypeById(idTipo));
                                plist.add(p);
                                
			}
                        pstmt.close();
                        conn.close();
                        return plist;
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
        public ArrayList<Product> queryByName(String name){
            ArrayList<Product> plist = new ArrayList<Product>();
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
			String sql = "SELECT * FROM Producto"
					+ " WHERE Nombre like '%" + name
                                + "%' ";
			pstmt = conn.prepareStatement(sql);
			//pstmt.setInt(1, idProduct);
			//Paso 4: Ejecutar la sentencia
			rs = pstmt.executeQuery();
			//Paso 5(opc.): Procesar los resultados
			while (rs.next()){
				int idProducto = rs.getInt("IdProducto");
				int idTipo = rs.getInt("IdTipo");
				int idMoneda = rs.getInt("IdMoneda");
                                String nombre = rs.getString("Nombre");
				String descripcion = rs.getString("Descripcion");
				double precio_Base = rs.getDouble("Precio_Base");
                                String marca = rs.getString("Marca");
				int stock = rs.getInt("Stock");
				String estado = rs.getString("Estado");
                                //LocalDate fechaIngreso = rs.getDate("FechaIngreso").toLocalDate();
				//LocalDate fechaDescontinuacion = rs.getDate("FechaDescontinuacion").toLocalDate();
                                
				p = new Product();
				p.setBasePrice(precio_Base);
                                p.setDescription(descripcion);
                                p.setEstado(estado);
                                //p.setFechaDescontinuacion(fechaDescontinuacion);
                                //p.setFechaIngreso(fechaIngreso);
                                p.setId(idProducto);
                                p.setMarca(marca);
                                //p.setMoneda(null);
                                p.setNombre(nombre);
                                p.setStock(stock);
                                p.setTipoProducto(queryTypeById(idTipo));
                                plist.add(p);
                                
			}
                        pstmt.close();
                        conn.close();
                        return plist;
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
    public ArrayList<Product> queryByPrice(double minPrice, double maxPrice, String brand, int prodType){
        ArrayList<Product> plist = new ArrayList<Product>();
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
			String sql = "SELECT * FROM Producto"
					+ " WHERE Precio_Base between " +
                                minPrice + " and " + maxPrice + " and "
                                + "Marca like '%" + brand + "%' ";
                        if(prodType>0)
                            sql += "and IdTipo = "+ prodType;
			pstmt = conn.prepareStatement(sql);
			//pstmt.setInt(1, idProduct);
			//Paso 4: Ejecutar la sentencia
			rs = pstmt.executeQuery();
			//Paso 5(opc.): Procesar los resultados
			while (rs.next()){
				int idProducto = rs.getInt("IdProducto");
				int idTipo = rs.getInt("IdTipo");
				int idMoneda = rs.getInt("IdMoneda");
                                String nombre = rs.getString("Nombre");
				String descripcion = rs.getString("Descripcion");
				double precio_Base = rs.getDouble("Precio_Base");
                                String marca = rs.getString("Marca");
				int stock = rs.getInt("Stock");
				String estado = rs.getString("Estado");
                                //LocalDate fechaIngreso = rs.getDate("FechaIngreso").toLocalDate();
				//LocalDate fechaDescontinuacion = rs.getDate("FechaDescontinuacion").toLocalDate();
                                
				p = new Product();
				p.setBasePrice(precio_Base);
                                p.setDescription(descripcion);
                                p.setEstado(estado);
                                //p.setFechaDescontinuacion(fechaDescontinuacion);
                                //p.setFechaIngreso(fechaIngreso);
                                p.setId(idProducto);
                                p.setMarca(marca);
                                //p.setMoneda(null);
                                p.setNombre(nombre);
                                p.setStock(stock);
                                p.setTipoProducto(queryTypeById(idTipo));
                                plist.add(p);
                                
			}
                        pstmt.close();
                        conn.close();
                        return plist;
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
