package com.example.pet.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.pet.model.User;


@Repository
public interface UserDao extends CrudRepository<User, Integer> {

	/**
	 * This method is used to authenticate User
	 * 
	 * @param userName
	 * @param password
	 * @return
	 */
	public User findByUserNameAndPassword(String userName, String password);
}
