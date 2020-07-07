package com.example.pet.controllertest;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.example.pet.controller.PetController;
import com.example.pet.dto.PetDetailsResponseDto;
import com.example.pet.dto.PetListResponseDto;
import com.example.pet.service.PetService;



@ExtendWith(MockitoExtension.class)
public class PetControllerTest {
	@InjectMocks
	PetController petController;

	@Mock
	PetService petService;

	@Test
	public void findHotelDetails() {

		PetDetailsResponseDto pet = new PetDetailsResponseDto();
		pet.setPetId(1);
		pet.setDescription("barks");
		pet.setPetPrice(50000);

		

		Mockito.when(petService.getPetsByPetName("petName")).thenReturn(null);

		ResponseEntity<PetListResponseDto> responsebusdetailsdto = petController.searchPets("petName");
		assertEquals(HttpStatus.OK, responsebusdetailsdto.getStatusCode());

	}

	

}
