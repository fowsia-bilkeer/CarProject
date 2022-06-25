package com.qa.starterproject.service;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.qa.starterproject.domain.Car;

@Service 
public class CarListService {
	public List<Car> cars = new ArrayList<Car>();
	
	
	
	//create 
	public Car create(Car car) {
		this.cars.add(car);
		return this.cars.get(this.cars.size()-1);
	}
	
	//read
	public List<Car> readAll() {
		return this.cars;
		
	}
	
	//update
	public Car update(int id, Car car) {
		this.cars.remove(id);
		this.cars.add(id, car);
		return this.cars.get(id);
		}
	
	
	public Car readId(int id) {
		return this.cars.get(id);
	}
	
	
	public boolean delete(int id) {
		return this.cars.remove(id) != null;
	}

//	public Object read() {
//		// TODO Auto-generated method stub
//		return this.read();
//	}

	

}
