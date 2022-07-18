package model.dao;

import model.dao.impl.SellersDaoJDBC;

public class DaoFactory {

	public static SellersDao createSellerDao() {
		return new SellersDaoJDBC();
	}
	
}
