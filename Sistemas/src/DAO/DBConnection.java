package DAO;

public class DBConnection {
	public static final int SQL_SERVER = 1;
	public static final int MYSQL = 2;
	public static final int ORACLE = 3;
	public static final int XML = 4;
	
	public static String URL_JDBC_SQLServer = 
	"jdbc:sqlserver://inti.lab.inf.pucp.edu.pe:1433;databaseName=inf282";
	public static String user = "inf282";
	public static String password = "inf282db";
	public static int dbType = SQL_SERVER;
	
	public static String URL_JDBC_MYSQL = 
			"jdbc:mysql://quilla.lab.inf.pucp.edu.pe:3306/inf282";
}

