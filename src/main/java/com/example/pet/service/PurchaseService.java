package com.example.pet.service;

import com.example.pet.dto.PurchaseResponseDto;

public interface PurchaseService {

	PurchaseResponseDto purchasePetsByPetId(int userId, int petId);
	

}
