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
import java.sql.Statement;


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
    
    @Override
     public ArrayList<Object> queryByProduct(int prodId, int month, int year, int measureType){
         ArrayList<SalesDetail> salesList = new ArrayList<SalesDetail>();
         ArrayList<Object> cants = new ArrayList<Object>();
         ArrayList<Object> subs = new ArrayList<Object>();
          for(int i = 0; i<32;i++){
            int cero = 0;
            double cero1 = 0.0;
             cants.add(cero);
             subs.add(cero1);
         }
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
			/*String sql = "select sum(subtotal) as subtotal, sum(cantidad) as cantidad, detalleventa.IdVenta, detalleventa.IdProducto, ventas.FechaDia" +
                        "from detalleventa, ventas WHERE detalleventa.IdProducto = " + prodId
                        +" and month(ventas.FechaDia)= " + month + " and year(ventas.FechaDia) = "
                        + year + " and detalleventas.IdVenta = ventas.IdVenta \n" +
                        "group by detalleventa.IdVenta, detalleventa.IdProducto, ventas.FechaDia " +
                        "ORDER BY ventas.FechaDia ";*/
                        String sql = "select sum(subtotal) as subtotal, sum(cantidad) as cantidad, "
                                + "v.FechaDia\n from detalleventa d inner join ventas v on "
                                + "d.IdVenta = v.IdVenta and d.IdProducto = " + prodId 
                                + " and month(v.FechaDia) = " + month + " and year(v.FechaDia) = "
                                + year + " group by v.FechaDia\n" +
                                    "order by v.FechaDia";
                        System.out.println(sql);
			pstmt = conn.prepareStatement(sql);
                        //pstmt = conn.createStatement();
                        //pstmt.execute(sql);
                        //rs = pstmt.getResultSet();
			//Paso 4: Ejecutar la sentencia
			rs = pstmt.executeQuery();
                        //rs = pstmt.execute();
			//Paso 5(opc.): Procesar los resultados
                        SQLServerDAOProduct daop = new SQLServerDAOProduct();
			while (rs.next()){
				//int id = rs.getInt("id");
                                    //int idVenta = rs.getInt("IdVenta");
                                    //int idCampanha = rs.getInt("IdProducto");
                                    double subtotal = rs.getDouble("Subtotal");
                                    int cantidad = rs.getInt("Cantidad");
                                    int dia = rs.getDate("FechaDia").toLocalDate().getDayOfMonth();
                                    if(measureType == 1)
                                        cants.set(dia-1,cantidad);
                                    else
                                        subs.set(dia-1,subtotal);
                                    //LocalDate date = rs.getDate("FechaDia").toLocalDate();
                                    SalesDetail det = new SalesDetail();
                                    det.setProduct(daop.queryById(prodId));
                                    det.setQuantity(cantidad);
                                    det.setSubTotal(subtotal);
                                    det.setSale(null);
                                   //Falta campaña y moneda
                                    salesList.add(det);
				//arr.add(p);
			}
                        pstmt.close();
                                    conn.close();
                                    if(measureType == 1)
                                        return cants;
                                    else
                                        return subs;
                                            
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
    public ArrayList<Object> queryByBrand(String brand, int month, int year, int measureType){
        ArrayList<SalesDetail> salesList = new ArrayList<SalesDetail>();
         ArrayList<Object> cants = new ArrayList<Object>();
         ArrayList<Object> subs = new ArrayList<Object>();
          for(int i = 0; i<32;i++){
            int cero = 0;
            double cero1 = 0.0;
             cants.add(cero);
             subs.add(cero1);
         }
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
			String sql = "select sum(subtotal) as subtotal, sum(cantidad) as cantidad, "
                                + "v.FechaDia from detalleventa d inner join Producto pr on "
                                + "pr.Marca like '"+ brand + "' and d.idProducto = pr.IdProducto inner join"
                                + " ventas v on month(v.FechaDia)= " + month + " and year(v.FechaDia)= "
                                + year + " and d.IdVenta = v.IdVenta " +
                                    " group by v.FechaDia " +
                                    "order by v.FechaDia ";
			pstmt = conn.prepareStatement(sql);
			//Paso 4: Ejecutar la sentencia
			rs = pstmt.executeQuery();
			//Paso 5(opc.): Procesar los resultados
                        SQLServerDAOProduct daop = new SQLServerDAOProduct();
			while (rs.next()){
				//int id = rs.getInt("id");
                                    //int idVenta = rs.getInt("IdVenta");
                                    //int idCampanha = rs.getInt("IdProducto");
                                    double subtotal = rs.getDouble("Subtotal");
                                    int cantidad = rs.getInt("Cantidad");
                                    int dia = rs.getDate("FechaDia").toLocalDate().getDayOfMonth();
                                    if(measureType == 1)
                                        cants.set(dia-1,cantidad);
                                    else
                                        subs.set(dia-1, subtotal);
                                    //LocalDate date = rs.getDate("FechaDia").toLocalDate();
                                   //Falta campaña y moneda
				//arr.add(p);
			}
                        pstmt.close();
                                    conn.close();
                                    if(measureType == 1)
                                        return cants;
                                    else
                                        return subs;
                                            
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
    public ArrayList<Object> queryByProdType(int typeId, int month, int year, int measureType){
       ArrayList<Object> cants = new ArrayList<Object>();
         ArrayList<Object> subs = new ArrayList<Object>();
         
         for(int i = 0; i<32;i++){
            int cero = 0;
            double cero1 = 0.0;
             cants.add(cero);
             subs.add(cero1);
         }
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
			String sql = "select sum(subtotal) as subtotal, sum(cantidad) as cantidad, "
                                + "v.FechaDia from detalleventa d inner join Producto pr "
                                + "on pr.IdTipo = " + typeId + " and d.idProducto = pr.IdProducto inner join "
                                + "ventas v on month(v.FechaDia)= " + month + " and year(v.FechaDia)= "
                                + year + " and d.IdVenta = v.IdVenta group by v.FechaDia " +
                                    " order by v.FechaDia ";
			pstmt = conn.prepareStatement(sql);
			//Paso 4: Ejecutar la sentencia
			rs = pstmt.executeQuery();
			//Paso 5(opc.): Procesar los resultados
                        //SQLServerDAOProduct daop = new SQLServerDAOProduct();
                        int i = 0;
			while (rs.next()){
				//int id = rs.getInt("id");
                                    //int idVenta = rs.getInt("IdVenta");
                                    //int idCampanha = rs.getInt("IdProducto");
                                    double subtotal = rs.getDouble("Subtotal");
                                    int cantidad = rs.getInt("Cantidad");
                                    int dia = rs.getDate("FechaDia").toLocalDate().getDayOfMonth();
                                    System.out.println("" + dia);
                                    if(measureType == 1)
                                        cants.set(dia-1, cantidad);
                                        //cants.add(cantidad);
                                    else 
                                        subs.set(dia-1, subtotal);
                                        //subs.add(subtotal);
                                    //LocalDate date = rs.getDate("FechaDia").toLocalDate();
                                   //Falta campaña y moneda
				//arr.add(p);
			}
                        pstmt.close();
                                    conn.close();
                                    if(measureType == 1)
                                        return cants;
                                    else
                                        return subs;
                                            
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
    public ArrayList<Object> queryAll(int month, int year, int measureType){
        ArrayList<Object> cants = new ArrayList<Object>();
         ArrayList<Object> subs = new ArrayList<Object>();
         
         for(int i = 0; i<32;i++){
            int cero = 0;
            double cero1 = 0.0;
             cants.add(cero);
             subs.add(cero1);
         }
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
			String sql = "select sum(subtotal) as subtotal, sum(cantidad) as cantidad, "
                                + "v.FechaDia from detalleventa d inner join "
                                + "ventas v on month(v.FechaDia)= " + month + " and year(v.FechaDia)= "
                                + year + " and d.IdVenta = v.IdVenta group by v.FechaDia " +
                                    " order by v.FechaDia ";
			pstmt = conn.prepareStatement(sql);
			//Paso 4: Ejecutar la sentencia
			rs = pstmt.executeQuery();
			//Paso 5(opc.): Procesar los resultados
                        //SQLServerDAOProduct daop = new SQLServerDAOProduct();
                        int i = 0;
			while (rs.next()){
				//int id = rs.getInt("id");
                                    //int idVenta = rs.getInt("IdVenta");
                                    //int idCampanha = rs.getInt("IdProducto");
                                    double subtotal = rs.getDouble("Subtotal");
                                    int cantidad = rs.getInt("Cantidad");
                                    int dia = rs.getDate("FechaDia").toLocalDate().getDayOfMonth();
                                    System.out.println("" + dia);
                                    if(measureType == 1)
                                        cants.set(dia-1, cantidad);
                                        //cants.add(cantidad);
                                    else 
                                        subs.set(dia-1, subtotal);
                                        //subs.add(subtotal);
                                    //LocalDate date = rs.getDate("FechaDia").toLocalDate();
                                   //Falta campaña y moneda
				//arr.add(p);
			}
                        pstmt.close();
                                    conn.close();
                                    if(measureType == 1)
                                        return cants;
                                    else
                                        return subs;
                                            
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
