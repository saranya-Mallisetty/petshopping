package com.example.pet.service;


import com.example.pet.dto.PetListResponseDto;

public interface PetService {


	public PetListResponseDto getPetsByPetName(String petName);
		
	

}
