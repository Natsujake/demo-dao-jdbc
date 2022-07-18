package model.dao;

import java.util.List;

import model.entities.Sellers;


public interface SellersDao {

	void insert(Sellers obj);
	void update(Sellers obj);
	void deleteById(Integer id);
	Sellers findById(Integer id);
	List<Sellers> findAll();
}
