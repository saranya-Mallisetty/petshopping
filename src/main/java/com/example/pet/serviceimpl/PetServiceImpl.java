package com.example.pet.serviceimpl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.example.pet.dao.PetDao;
import com.example.pet.dto.PetDetailsResponseDto;
import com.example.pet.dto.PetListResponseDto;
import com.example.pet.enumpac.Status;
import com.example.pet.exception.InvalidCredentialsException;
import com.example.pet.model.Pet;
import com.example.pet.service.PetService;

@Service
public class PetServiceImpl implements PetService {
	@Autowired
	PetDao petDao;

	 @Override
	    public PetListResponseDto getPetsByPetName(String petName) {
	       PetListResponseDto petListResponseDto = new PetListResponseDto();
	        Optional<List<Pet>> petDetails=petDao.findAllByPetName(petName);
	        if (!petDetails.isPresent()) {
	            
	            throw new InvalidCredentialsException("No dogs there match your search");
	        }
	      
	         List<PetDetailsResponseDto> petList= petDetails.get().stream().map(pet -> getPetDetailsResponseDto(pet)).collect(Collectors.toList());
	         petListResponseDto.setMessage("plese find list of available dogs");
	           petListResponseDto.setStatusCode(HttpStatus.OK.value());
	          petListResponseDto.setPetDetailsResponseDto(petList);
	            return petListResponseDto;
	            
	       
	         
	    }
	    private PetDetailsResponseDto getPetDetailsResponseDto(Pet pet) {
	        
	        PetDetailsResponseDto petDetailsResponse=new PetDetailsResponseDto();
	        BeanUtils.copyProperties(pet, petDetailsResponse);
	        return petDetailsResponse;
	    }
		public void updatePetStatus(int petId) {
			  Pet pet = petDao.findAllByPetId(petId);
		        pet.setStatus(Status.purchased);
		        petDao.save(pet);
		    }
			
		}


	 
	


