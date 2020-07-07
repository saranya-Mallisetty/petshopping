package com.example.pet.exception;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;



@ControllerAdvice
public class ExceptionController   {
	

	@ExceptionHandler(value = InvalidCredentialsException.class)
	public ResponseEntity<ErrorResponse> exception(InvalidCredentialsException exception) {
		ErrorResponse errorResponse = new ErrorResponse();
		errorResponse.setStatusMessage(exception.getMessage());
		errorResponse.setStatusCode(HttpStatus.NOT_FOUND.value());
		
		return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
	}
}