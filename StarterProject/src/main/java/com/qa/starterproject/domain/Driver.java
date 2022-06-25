package com.qa.starterproject.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Entity
@Component 
public class Driver {
	
	private double hands;
	private double feet;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	public Driver () {
		System.out.println("Driver created");
	}
	public void driving() {
		System.out.println("Driving my car");
	}
	public double getHands() {
		return hands;
	}
	public void setHands(double hands) {
		this.hands = hands;
	}
	public double getFeet() {
		return feet;
	}
	public void setFeet(double feet) {
		this.feet = feet;
	}
}
