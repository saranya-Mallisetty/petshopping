package com.example.pet.dto;

public class PurchaseRequestDto {
	private int userId;
	private int petId;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getPetId() {
		return petId;
	}
	public void setPetId(int petId) {
		this.petId = petId;
	}


}
