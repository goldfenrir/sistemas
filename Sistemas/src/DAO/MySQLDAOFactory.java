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

    @Override
    public DAOCombo getDAOCombo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public DAOReunion getDAOReunion() {
        return null;
    }

}
