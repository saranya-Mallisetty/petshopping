package com.example.pet.model;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import com.example.pet.enumpac.Status;

public class Pet {
	
	private int petId;
	private String petName;
	private double petPrice;
	private String description;
	@Enumerated(value = EnumType.STRING)
	private Status status;
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public int getPetId() {
		return petId;
	}
	public void setPetId(int petId) {
		this.petId = petId;
	}
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

	

}