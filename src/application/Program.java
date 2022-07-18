package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellersDao;
import model.entities.Department;
import model.entities.Sellers;

public class Program {

	public static void main(String[] args) {
				
		SellersDao sellersDao = DaoFactory.createSellerDao();

		Sellers sellers = sellersDao.findById(3);
		System.out.println(sellers);
	}

}
