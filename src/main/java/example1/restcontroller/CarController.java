package example1.restcontroller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import example1.model.Car;
import example1.service.CarService;

@RestController
@RequestMapping("/api")
public class CarController {
	
	@Autowired
	CarService serv;
	
	
 
			@GetMapping("/carstock") 
			public ResponseEntity<List<Car>> getStockCar() {
				HttpHeaders httpHeaders=new HttpHeaders();
				httpHeaders.add("Method","getStockCar");
				return ResponseEntity
						.status(HttpStatus.OK) 
						.headers(httpHeaders)
						.body(serv.recoverAllCars()); 
			}
			
			@GetMapping("/carstock/available")
			public ResponseEntity<List<Car>> getStockCarAvailable() {
				List<Car> stockcars=serv.recoverAllCars();
				HttpHeaders httpHeaders=new HttpHeaders();
				httpHeaders.add("Method","getStockCarAvailable");
				return ResponseEntity
						.status(HttpStatus.OK) 
						.headers(httpHeaders)
						.body(stockcars.stream().filter(c->c.isAvailable()==true).collect(Collectors.toList()));
			}
			
			
			
}
