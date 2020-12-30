package com.pricechecker.model;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserInterface extends JpaRepository<product,Integer >{

	@Query("SELECT t FROM product t where t.category = ?1")
	List<product> findBycategory(String category);

	List<product> findAllBycategory(String category);

	@Query("SELECT t FROM product t where t.productName = ?1")
	product findbyproductName(String productName);

	@Query("SELECT t FROM product t where t.id = ?1")
	product findByIdnum(int id);
	

}
