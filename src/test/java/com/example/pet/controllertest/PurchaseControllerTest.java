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

import com.example.pet.controller.OrderController;
import com.example.pet.dto.PurchaseRequestDto;
import com.example.pet.dto.PurchaseResponseDto;
import com.example.pet.service.PurchaseService;


@ExtendWith(MockitoExtension.class)
public class PurchaseControllerTest {

		@InjectMocks
		OrderController orderController;

		@Mock
		PurchaseService purchaseService;
		
		@Test
		public void bookingDetails() {
			PurchaseRequestDto booking = new PurchaseRequestDto();
			booking.setUserId(1);
			booking.setPetId(1);
			
			PurchaseResponseDto book = new PurchaseResponseDto();

			Mockito.when(purchaseService.purchasePetsByPetId(1, 1)).thenReturn(book);

			ResponseEntity<PurchaseResponseDto> responsebusdetailsdto = orderController.orderPets(1, booking);
			assertEquals(HttpStatus.OK, responsebusdetailsdto.getStatusCode());

		}
		
		

}
