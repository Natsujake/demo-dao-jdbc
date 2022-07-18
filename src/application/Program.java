package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellersDao;
import model.entities.Department;
import model.entities.Sellers;

public class Program {

	public static void main(String[] args) {
				
		SellersDao sellersDao = DaoFactory.createSellerDao();
		
		System.out.println("=== TEST 1: Sellers findById ===");
		Sellers sellers = sellersDao.findById(3);
		System.out.println(sellers);
		
		System.out.println("\n=== TEST 2: Sellers findByDepartment ===");
		Department department = new Department(2, null);
		List<Sellers> list = sellersDao.findByDepartment(department);
		
		for (Sellers obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== TEST 3: Sellers findAll ===");
			list = sellersDao.findAll();
		
		for (Sellers obj : list) {
			System.out.println(obj);
		}
	}

}
