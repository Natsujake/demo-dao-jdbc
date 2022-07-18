package model.dao;

import db.DB;
import model.dao.impl.SellersDaoJDBC;

public class DaoFactory {

	public static SellersDao createSellerDao() {
		return new SellersDaoJDBC(DB.getConnection());
	}
	
}
