package DAO;

public class SQLServerDAOFactory extends DAOFactory {

	@Override
	public DAOProduct getDAOProduct() {
		return new SQLServerDAOProduct();
	}

    @Override
    public DAOSales getDAOSales() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}



