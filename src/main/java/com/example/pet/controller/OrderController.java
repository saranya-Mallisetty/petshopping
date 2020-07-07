package com.example.pet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pet.dto.PurchaseRequestDto;
import com.example.pet.dto.PurchaseResponseDto;
import com.example.pet.service.PurchaseService;

@RestController
public class OrderController {
	@Autowired
	PurchaseService purchaseService;

	@PostMapping("/users/{userId}/orders")
	public ResponseEntity<PurchaseResponseDto> orderPets(@PathVariable("userId") int userId,
			PurchaseRequestDto orderRequestDto) {

		 PurchaseResponseDto orderResponseDto = purchaseService.purchasePetsByPetId(userId,orderRequestDto.getPetId());


		        return new ResponseEntity<PurchaseResponseDto>(orderResponseDto, HttpStatus.OK);


		    }


		}
		 



