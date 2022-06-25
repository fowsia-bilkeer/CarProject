package com.qa.starterproject.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Car {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(length = 2)
	private String model;
	
	private String make;
	
	private int wheels;
	
	
	
	public Car () {
	super();
	System.out.println("Car created");
	
	}



	public Car(Long i, String model, String make, int wheels) {
		super();
		this.id = i;
		this.model = model;
		this.make = make;
		this.wheels = wheels;
		System.out.println("Car created");
	}
	



	public Car get() {
		return this;
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getModel() {
		return model;
	}



	public void setModel(String model) {
		this.model = model;
	}



	public String getMake() {
		return make;
	}



	public void setMake(String make) {
		this.make = make;
	}



	public int getWheels() {
		return wheels;
	}



	public void setWheels(int wheels) {
		this.wheels = wheels;
	}



	
}
