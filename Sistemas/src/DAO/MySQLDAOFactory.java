package DAO;

public class MySQLDAOFactory extends DAOFactory{

	@Override
	public DAOProduct getDAOProduct() {
		// TODO Auto-generated method stub
		return new MySQLDAOProduct();
	}

	@Override
	public DAOSales getDAOSales() {
		// TODO Auto-generated method stub
		return null;
	}

}
