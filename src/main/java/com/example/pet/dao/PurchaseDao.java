package com.example.pet.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.pet.model.Purchase;
@Repository
public interface PurchaseDao extends CrudRepository<Purchase, Integer>  {

		
	

}
