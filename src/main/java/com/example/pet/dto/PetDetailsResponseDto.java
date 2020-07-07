package com.example.pet.dto;


import com.example.pet.enumpac.Status;

public class PetDetailsResponseDto {
	private String petName;
	private double petPrice;
	private String description;
	private Status status;
	
	public String getPetName() {
		return petName;
	}
	public void setPetName(String petName) {
		this.petName = petName;
	}
	public double getPetPrice() {
		return petPrice;
	}
	public void setPetPrice(double petPrice) {
		this.petPrice = petPrice;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}


}
