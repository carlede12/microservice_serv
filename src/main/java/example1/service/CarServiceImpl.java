package example1.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import example1.model.Car;
import example1.repository.CarRepository;


@Service
public class CarServiceImpl implements CarService {
	
	@Autowired
	CarRepository repo;

	
	@Override
	public List<Car> recoverAllCars() {
		
		return repo.findAll();
	}

	

}
