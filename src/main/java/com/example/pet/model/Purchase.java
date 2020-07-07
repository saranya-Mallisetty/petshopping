package com.example.pet.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Purchase {
	 @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private int orderId;
	    private int userId;
	    private int petId;
	    private LocalDate orderDate;
	    public int getOrderId() {
	        return orderId;
	    }
	    public void setOrderId(int orderId) {
	        this.orderId = orderId;
	    }
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
	    public LocalDate getOrderDate() {
	        return orderDate;
	    }
	    public void setOrderDate(LocalDate orderDate) {
	        this.orderDate = orderDate;
	    }
	    

	 

	}
	 


