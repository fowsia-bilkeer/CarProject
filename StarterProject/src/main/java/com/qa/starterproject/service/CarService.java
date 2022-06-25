package com.qa.starterproject.service;
import java.util.List;

import org.springframework.stereotype.Service;

import com.qa.starterproject.domain.Car;
import com.qa.starterproject.repo.CarRepo;
@Service
public class CarService {
	
	private CarRepo repo;
	
	public CarService(CarRepo repo) {
		this.repo = repo;
	}
	//create
	public Car create(Car car) {
		return this.repo.saveAndFlush(car);
	}
	//read
	public List<Car> read(){
		return this.repo.findAll();
	}
	public Car readById(Long id) throws Exception {
		return this.repo.findById(id).orElseThrow(Exception::new);
	}
	//update
	public Car update(int id, Car car) throws Exception {
		Car exists = this.repo.findById(id).orElseThrow(Exception::new);
		exists.setMake(car.getMake());
		exists.setModel(car.getModel());
		exists.setWheels(car.getWheels());
		return this.repo.saveAndFlush(exists);
	}
	public boolean delete(Long id) throws Exception {
		this.repo.findById(id).orElseThrow(Exception::new);
		this.repo.deleteById(id);
		return !this.repo.existsById(id);
	}

}
