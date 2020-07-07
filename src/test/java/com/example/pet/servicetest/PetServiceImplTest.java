
package com.example.pet.servicetest;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.example.pet.dao.PetDao;
import com.example.pet.dto.PetDetailsResponseDto;
import com.example.pet.model.Pet;
import com.example.pet.serviceimpl.PetServiceImpl;

@ExtendWith(MockitoExtension.class)
public class PetServiceImplTest {
	Pet pet;

	@Mock
	PetDao petdao;

	@InjectMocks
	PetServiceImpl petServiceImpl;

	@BeforeEach
	public void setUp() {
		PetDetailsResponseDto pet = new PetDetailsResponseDto();
		pet.setPetId(1);
		pet.setDescription("barks");
		pet.setPetPrice(50000);

	}

	@Test
	public void getPetDetailsByPetName() { 
		// given
		when(petdao.findAllByPetName("petname")).thenReturn(null);

		// when
		petServiceImpl.getPetsByPetName("petName");

		// then
		verify(petdao).findAllByPetName("petname");

	}

}
