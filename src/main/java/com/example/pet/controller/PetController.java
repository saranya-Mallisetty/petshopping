package com.example.pet.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.pet.dto.PetDetailsResponseDto;


@RestController
public class PetController {
	@GetMapping("/pet")
    public ResponseEntity<PetDetailsResponseDto> searchpetDetails(@RequestParam(required=false) String bookName,@RequestParam(required=false) String authorName,@RequestParam(required=false) String category) {
		System.out.println(bookName);
		System.out.println(authorName);
		System.out.println(category);


	//	if((!"null".equals(bookName)) && (authorName.equals(null)) || (authorName.equals(null)) && (category.equals(null))) {
		if(bookName!=null) {	
			System.out.println("hello");

			
		    List<BookDetailsResponseDto> bookDetailsResponseDto=bookService.getBookDetailsByBookName(bookName);
		    System.out.println(bookDetailsResponseDto);
	        return new ResponseEntity<List<BookDetailsResponseDto>>(bookDetailsResponseDto,HttpStatus.OK);

		}
	
	

}
