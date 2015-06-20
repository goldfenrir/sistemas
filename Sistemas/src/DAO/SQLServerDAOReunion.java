/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;


import Model.Acuerdo;
import Model.Reunion;

import com.microsoft.sqlserver.jdbc.SQLServerDriver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author goldfenrir
 */
public class SQLServerDAOReunion implements DAOReunion{

    @Override
    public void add(Reunion p) {
        Connection conn = null;
		PreparedStatement pstmt = null;
		PreparedStatement pstmt2 = null;
		try {
			//Paso 1: Registrar el Driver
			DriverManager.registerDriver(new SQLServerDriver());
			//Paso 2: Obtener la conexi�n
			conn = DriverManager.getConnection(DBConnection.URL_JDBC_SQLServer,
								DBConnection.user,
								DBConnection.password);
			//Paso 3: Preparar la sentencia
			String sql = "INSERT INTO reunion "
					+ "VALUES (?,?,?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			//pstmt.setInt(1, p.getId());
			pstmt.setInt(1, p.getIdReunion());
			pstmt.setDate(2, java.sql.Date.valueOf(p.getFecha()));
			pstmt.setString(3, p.getTema());
			pstmt.setString(4, p.getDuracion());
			pstmt.setString(5, p.getAreaInvolucrada());
			pstmt.setInt(6, p.getCampanha());
                        
                        
                        
			//Paso 4: Ejecutar la sentencia
			pstmt.executeUpdate();
                        //ACUERDOS
                        for (int i=0;i<p.getAcuerdos().size();i++){
                            Acuerdo acu=p.getAcuerdos().get(i);
                            String sql2="INSERT INTO Acuerdos_de_reunion"
                                    + " values(?,?,?,?)";
                            pstmt2 = conn.prepareStatement(sql2);
                            pstmt2.setInt(1, acu.getIdAcuerdo());
                            pstmt2.setString(2, acu.getDescripcion());
                            pstmt2.setInt(3, p.getIdReunion());
                            pstmt2.setInt(4, p.getCampanha());
                            pstmt2.executeUpdate();
                        }
                            
                        //FINACUERDOS
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
    public void update(Reunion p) {
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
			String sql = "UPDATE reunion  set "
					+ "fecha=?,tema=?,duracion=?,AreaInvolucrada=?,IdCampanha=? where"
                                + "idReunion=?";
			pstmt = conn.prepareStatement(sql);
			//pstmt.setInt(1, p.getId());
			pstmt.setInt(6, p.getIdReunion());
			pstmt.setDate(1, java.sql.Date.valueOf(p.getFecha()));
			pstmt.setString(2, p.getTema());
			pstmt.setString(3, p.getDuracion());
			pstmt.setString(4, p.getAreaInvolucrada());
                    pstmt.setInt(5, p.getCampanha());
		
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
    public void delete(int idReunion) {
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
                        String sql2="DELETE from  Acuerdos_de_reunion where idReunion=?";
                        pstmt = conn.prepareStatement(sql2);
			pstmt.setInt(1, idReunion);
			
			pstmt.executeUpdate();
                        
			String sql = "DELETE  from  reunion   "
					+ " where "
                                + " idReunion=?";
			pstmt = conn.prepareStatement(sql);
			//pstmt.setInt(1, p.getId());
			pstmt.setInt(1, idReunion);
			
		
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
    public ArrayList<Reunion> queryAll() {
        Connection conn = null;
		PreparedStatement pstmt = null;
                PreparedStatement pstmt2 = null;
		ResultSet rs = null;
                ResultSet rs2 = null;
		ArrayList<Reunion> arr = new ArrayList<Reunion>();
		try {
			//Paso 1: Registrar el Driver
			DriverManager.registerDriver(new SQLServerDriver());
			//Paso 2: Obtener la conexi�n
			conn = DriverManager.getConnection(DBConnection.URL_JDBC_SQLServer,
								DBConnection.user,
								DBConnection.password);
			//Paso 3: Preparar la sentencia
			String sql = "SELECT * FROM Reunion";
			pstmt = conn.prepareStatement(sql);
			//Paso 4: Ejecutar la sentencia
			rs = pstmt.executeQuery();
			//Paso 5(opc.): Procesar los resultados
			while (rs.next()){
                            
				int idReunion = rs.getInt("idReunion");
				LocalDate fecha = rs.getDate("fecha").toLocalDate();
				String tema = rs.getString("tema");
                                String duracion = rs.getString("Duracion");
				String areaInvolucrada = rs.getString("areaInvolucrada");
				int idCampanha = rs.getInt("idCampanha");
                                
                                //LocalDate fechaIngreso = rs.getDate("FechaIngreso").toLocalDate();
				//LocalDate fechaDescontinuacion = rs.getDate("FechaDescontinuacion").toLocalDate();
                                
				Reunion p = new Reunion();
				p.setAreaInvolucrada(areaInvolucrada);
                                p.setCampanha(idCampanha);
                                p.setDuracion(duracion);
                                p.setFecha(fecha);
                                p.setIdReunion(idReunion);
                                p.setTema(tema);
                                //ACUERDOS
                                
                                    String sql2="select * from Acuerdos_de_reunion  "
                                            +   "  where idReunion=? and idCampanha=?";
                                    
                                    pstmt2 = conn.prepareStatement(sql2);
                                    pstmt2.setInt(1, idReunion);
                                    pstmt2.setInt(2, idCampanha);                                    
                                    rs2 = pstmt2.executeQuery();
                                    
                                    while (rs2.next()){
                                        Acuerdo newAcu=new Acuerdo();
                                        newAcu.setIdAcuerdo(rs2.getInt("idAcuerdo"));
                                        newAcu.setDescripcion(rs2.getString("descripcion"));
                                        p.getAcuerdos().add(newAcu);
                                    }
                                    
                                   
                                
                            
                        //FINACUERDOS
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
    public Reunion queryById(int idReunion) {
            Connection conn = null;
		PreparedStatement pstmt = null;
                PreparedStatement pstmt2 = null;
		ResultSet rs = null;
                ResultSet rs2 = null;
		ArrayList<Reunion> arr = new ArrayList<Reunion>();
		try {
			//Paso 1: Registrar el Driver
			DriverManager.registerDriver(new SQLServerDriver());
			//Paso 2: Obtener la conexi�n
			conn = DriverManager.getConnection(DBConnection.URL_JDBC_SQLServer,
								DBConnection.user,
								DBConnection.password);
			//Paso 3: Preparar la sentencia
			String sql = "SELECT * FROM Reunion where idReunion=?";
			pstmt = conn.prepareStatement(sql);
                        pstmt.setInt(1, idReunion);
			//Paso 4: Ejecutar la sentencia
			rs = pstmt.executeQuery();
			//Paso 5(opc.): Procesar los resultados
			while (rs.next()){
                            
				
				LocalDate fecha = rs.getDate("fecha").toLocalDate();
				String tema = rs.getString("tema");
                                String duracion = rs.getString("Duracion");
				String areaInvolucrada = rs.getString("areaInvolucrada");
				int idCampanha = rs.getInt("idCampanha");
                                
                                //LocalDate fechaIngreso = rs.getDate("FechaIngreso").toLocalDate();
				//LocalDate fechaDescontinuacion = rs.getDate("FechaDescontinuacion").toLocalDate();
                                
				Reunion p = new Reunion();
				p.setAreaInvolucrada(areaInvolucrada);
                                p.setCampanha(idCampanha);
                                p.setDuracion(duracion);
                                p.setFecha(fecha);
                                p.setIdReunion(idReunion);
                                p.setTema(tema);
                               //ACUERDOS
                                
                                    String sql2="select * from Acuerdos_de_reunion  "
                                            + "   where idReunion=? and idCampanha=?  ";
                                    
                                    pstmt2 = conn.prepareStatement(sql2);
                                    pstmt2.setInt(1, idReunion);
                                    pstmt2.setInt(2, idCampanha);                                    
                                    rs2 = pstmt2.executeQuery();
                                    
                                    while (rs2.next()){
                                        Acuerdo newAcu=new Acuerdo();
                                        newAcu.setIdAcuerdo(rs2.getInt("idAcuerdo"));
                                        newAcu.setDescripcion(rs2.getString("descripcion"));
                                        p.getAcuerdos().add(newAcu);
                                    }
                                    
                                   
                                
                            
                        //FINACUERDOS
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
                if (arr.size()>0){
                   return arr.get(0); 
                }
                return null;
		
    }

    @Override
    public int idReunion(){
        Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
                ResultSet rs2 = null;
		int   reu=0;;
		try {
			//Paso 1: Registrar el Driver
			DriverManager.registerDriver(new SQLServerDriver());
			//Paso 2: Obtener la conexi�n
			conn = DriverManager.getConnection(DBConnection.URL_JDBC_SQLServer,
								DBConnection.user,
								DBConnection.password);
			//Paso 3: Preparar la sentencia
			String sql = "select top 1 *  from reunion order by idReunion desc";
			pstmt = conn.prepareStatement(sql);
                        
			//Paso 4: Ejecutar la sentencia
			rs = pstmt.executeQuery();
			//Paso 5(opc.): Procesar los resultados
                      
			while (rs.next()){
                            reu=rs.getInt("idReunion");
				
				
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
		return reu;
    }

    @Override
    public int idAcuerdo() {
        Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
                ResultSet rs2 = null;
		int   reu=0;;
		try {
			//Paso 1: Registrar el Driver
			DriverManager.registerDriver(new SQLServerDriver());
			//Paso 2: Obtener la conexi�n
			conn = DriverManager.getConnection(DBConnection.URL_JDBC_SQLServer,
								DBConnection.user,
								DBConnection.password);
			//Paso 3: Preparar la sentencia
			String sql = "select top 1 *  from Acuerdos_de_reunion order by idAcuerdo desc";
			pstmt = conn.prepareStatement(sql);
                        
			//Paso 4: Ejecutar la sentencia
			rs = pstmt.executeQuery();
			//Paso 5(opc.): Procesar los resultados
                      
			while (rs.next()){
                            reu=rs.getInt("idAcuerdo");
				
				
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
		return reu;
    }
    
}
