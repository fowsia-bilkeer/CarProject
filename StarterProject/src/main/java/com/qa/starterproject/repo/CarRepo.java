package com.qa.starterproject.repo;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.qa.starterproject.domain.Car;

@Repository
public interface CarRepo extends JpaRepository<Car, Long> {

	List<Car> findAll();

	Optional<Car> findById(int id);

	


}
