package DAO;

public class SQLServerDAOFactory extends DAOFactory {

	@Override
	public DAOProduct getDAOProduct() {
		return new SQLServerDAOProduct();
	}

    @Override
    public DAOSales getDAOSales() {
        return new SQLServerDAOSales();//To change body of generated methods, choose Tools | Templates.
    }

}



