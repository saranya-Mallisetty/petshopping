package com.example.pet.serviceimpl;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.example.pet.dao.PurchaseDao;
import com.example.pet.dao.UserDao;
import com.example.pet.dto.PurchaseResponseDto;
import com.example.pet.exception.InvalidCredentialsException;
import com.example.pet.model.Purchase;
import com.example.pet.model.User;
import com.example.pet.service.PurchaseService;
@Service
public class PurchaseServiceImpl implements PurchaseService {

	
		 @Autowired
		    UserDao userDao;
		 
		    @Autowired
		    PurchaseDao purchaseDao;
		    @Autowired
		    PetServiceImpl petServiceImpl;

	@Override
	public PurchaseResponseDto purchasePetsByPetId(int userId, int petId) {

		Purchase orderPets = new Purchase();
		PurchaseResponseDto orderResponseDto = new PurchaseResponseDto();
		Optional<User> user = userDao.findAllByUserId(userId);
		if (!user.isPresent()) {
			throw new InvalidCredentialsException("UserId is not correct,give correct one");

		}
		orderPets.setUserId(userId);
		orderPets.setPetId(petId);
		orderPets.setOrderDate(LocalDate.now());
		purchaseDao.save(orderPets);
		petServiceImpl.updatePetStatus(petId);
		orderResponseDto.setMessage("PetOrderSuccessfully");
		orderResponseDto.setStatusCode(HttpStatus.OK.value());
		return orderResponseDto;

	}

	



}
