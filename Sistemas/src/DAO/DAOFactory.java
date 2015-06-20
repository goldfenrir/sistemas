package DAO;

public abstract class DAOFactory {
	public static DAOFactory getDAOFactory(int dbType){
		switch (dbType) {
			case DBConnection.SQL_SERVER:
				return new SQLServerDAOFactory();
			case DBConnection.MYSQL:
				return new MySQLDAOFactory();
		}
		return null;
	}
        
	public abstract DAOProduct getDAOProduct();
	
	public abstract DAOSales getDAOSales();
        
        public abstract DAOCombo getDAOCombo();
	
}
