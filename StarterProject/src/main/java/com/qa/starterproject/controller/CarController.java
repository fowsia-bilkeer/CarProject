package com.qa.starterproject.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.starterproject.domain.Car;
//import com.qa.starterproject.service.CarListService;
import com.qa.starterproject.service.CarService;
//import com.qa.starterproject.service.CarService1;


@RestController()
@RequestMapping("/car")
public class CarController {
	
	private CarService service;

	@Autowired
	public CarController(CarService service) {
		super();
		this.setService(service);
	}

	private void setService(CarService service2) {
		// TODO Auto-generated method stub
		
	}

	@PostMapping("/create")
	public ResponseEntity<Car> create(@RequestBody Car car) {
		return new ResponseEntity<Car>((Car) this.service.create(car), HttpStatus.CREATED);
	}

	@GetMapping("/readAll")
	public ResponseEntity<List<Car>> readAll() {
		return new ResponseEntity<List<Car>>(this.service.read(), HttpStatus.OK);

	}


	@GetMapping("/readID/{id}")
	public ResponseEntity<Car> readId(@PathVariable Long id) throws Exception {
		return new ResponseEntity<Car>( HttpStatus.OK);
	}

	@PutMapping("/update/{id}")
	public ResponseEntity<Car> update(@PathVariable  int id, @RequestBody Car car) throws Exception {
		return new ResponseEntity<Car>(this.service.update(id, car), HttpStatus.ACCEPTED);
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Boolean> delete(@PathVariable Long id) throws Exception {
		return this.service.delete(id) ? new ResponseEntity<>(HttpStatus.NO_CONTENT)
				: new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
				
	}


	}


